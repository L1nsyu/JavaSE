import os
import re

# 配置项
SRC_DIR = './src'           # 你的源码存放目录
OUTPUT_FILE = 'README.md'   # 生成的目录文件名

def get_github_anchor(title):
    """
    将提取到的标题转换为 GitHub 支持的 Markdown 锚点链接格式
    例如: "原码、反码、补码" -> "原码反码补码"
    """
    # 1. 转为小写，去掉首尾空白
    anchor = title.strip().lower()
    # 2. 将空格替换为连字符
    anchor = anchor.replace(' ', '-')
    # 3. 移除非字母、数字、汉字、下划线和连字符的其他所有符号（GitHub 锚点规则）
    anchor = re.sub(r'[^\w\-]', '', anchor)
    return anchor

def generate_toc():
    # 检查 src 目录是否存在
    if not os.path.exists(SRC_DIR):
        print(f"❌ 找不到目录 {SRC_DIR}，请确认你是在项目根目录下运行此脚本。")
        return

    # 初始化 README 文件的头部内容
    readme_lines = [
        "# JavaSE 学习笔记总目录",
        "",
        "> 本文档由脚本自动扫描生成。提取了所有 Markdown 文件中的 **二级标题 (##)**，点击对应标题即可快速跳转至原文件的具体位置。",
        "",
        "---"
    ]

    try:
        # 获取 src 下所有的子文件夹，并按名称排序
        items = os.listdir(SRC_DIR)
        folders = sorted([f for f in items if os.path.isdir(os.path.join(SRC_DIR, f))])
    except Exception as e:
        print(f"❌ 读取 {SRC_DIR} 目录失败: {e}")
        return

    # 遍历每一个类似于 a01, b17 等开头的大文件夹
    for folder in folders:
        # 正则匹配：只处理以 1个字母 + 至少2个数字 开头的文件夹 (例如 a01, b17)
        if not re.match(r'^[a-zA-Z]\d{2,}', folder):
            continue
            
        folder_path = os.path.join(SRC_DIR, folder)
        folder_content = [] # 用于临时存放当前大文件夹下收集到的 md 文件信息

        # 使用 os.walk 递归遍历该大文件夹下的所有子目录和文件
        for root, dirs, files in os.walk(folder_path):
            files.sort() # 让文件按照拼音/字母顺序排列，好看些
            
            for file in files:
                if file.endswith('.md'):
                    md_path = os.path.join(root, file)
                    
                    # 生成适用于 GitHub 的相对路径 (把 \ 替换为 /)
                    rel_md_path = md_path.replace('\\', '/')
                    if rel_md_path.startswith('./'):
                        rel_md_path = rel_md_path[2:] # 去掉开头的 ./
                    
                    # 组装完整的链接路径
                    link_path = f"./{rel_md_path}"
                    
                    file_lines = []
                    # 添加该 md 文件作为一级列表
                    file_lines.append(f"* **📄 [{file}]({link_path})**")
                    
                    # 打开并读取具体的 markdown 文件内容
                    try:
                        with open(md_path, 'r', encoding='utf-8') as f:
                            for line in f:
                                # 【核心】精准匹配二级标题：以 "## " 开头的行
                                match = re.match(r'^##\s+(.+)$', line)
                                if match:
                                    # 提取标题文字
                                    title = match.group(1).strip()
                                    # 生成对应的锚点
                                    anchor = get_github_anchor(title)
                                    # 缩进两个空格，作为 md 文件的子列表，并带上锚点跳转
                                    file_lines.append(f"  * [{title}]({link_path}#{anchor})")
                    except Exception as e:
                        print(f"⚠️ 读取文件失败: {md_path}, 错误: {e}")
                    
                    # 把这个文件的内容追加到当前大文件夹的收集中
                    folder_content.extend(file_lines)

        # 【核心】如果这个大文件夹里面确实解析到了 .md 文件（folder_content 不为空），才把大标题写进去
        if folder_content:
            readme_lines.append(f"\n## {folder}")
            readme_lines.extend(folder_content)

    # 最终写入 README.md
    with open(OUTPUT_FILE, 'w', encoding='utf-8') as f:
        f.write('\n'.join(readme_lines) + '\n')
    
    print(f"✅ 成功扫描并生成目录！请查看项目根目录下的 {OUTPUT_FILE} 文件。")

if __name__ == "__main__":
    generate_toc()