---
name: legado-book-source-developer
description: Legado (阅读) Android app book source development skill. Use when: creating book sources for novel/manga websites, debugging existing book source rules, querying Legado knowledge (CSS selectors, rule formats, POST requests), analyzing website HTML structure for book source development, or managing book source databases. Covers searchUrl, ruleSearch, ruleToc, ruleContent, ruleBookInfo configuration.
---

# Legado Book Source Developer

Complete toolkit for creating, debugging, and managing Legado book sources. Includes 25+ analysis tools, 134 real book source examples, and a comprehensive knowledge base built from 400K lines of Legado source code.

## Quick Start

```
1. Detect encoding → 2. Fetch real HTML → 3. Query knowledge base → 4. Analyze structure → 5. Create book source
```

**Core principle: All rules MUST be based on real HTML source analysis. No guessing.**

## Tools

### Knowledge Query
| Tool | Purpose |
|------|---------|
| `search_knowledge(query)` | Search knowledge base |
| `get_css_selector_rules()` | Complete CSS selector reference (paginated) |
| `get_real_book_source_examples(limit)` | 134 real book source analysis results |
| `get_book_source_templates(limit)` | Proven book source templates |
| `read_file_paginated(path, page)` | Read large files with pagination |
| `list_all_knowledge_files()` | List all knowledge files |

### HTML Analysis
| Tool | Purpose |
|------|---------|
| `smart_fetch_html(url, method, body, headers, charset)` | Fetch real HTML with encoding support |
| `smart_web_analyzer(html)` | Full page structure analysis |
| `smart_bookinfo_analyzer(html)` | Book info page analysis |
| `smart_toc_analyzer(html)` | Table of contents analysis |
| `smart_content_analyzer(html)` | Content page analysis |

### Book Source Management
| Tool | Purpose |
|------|---------|
| `edit_book_source(complete_source="JSON")` | Create/edit book source (call ONCE) |
| `validate_book_source.py` | Validate book source JSON (in `tools/`) |

### Analysis Scripts (in `tools/`)
| Script | Deps | Purpose |
|--------|------|---------|
| `analyze_url.py` | requests, bs4 | ⭐通用网站分析（编码+结构+搜索接口） |
| `analyze_url.sh` | curl | ⭐通用网站分析（无 Python 版） |
| `quick_analyze.py` | requests, bs4 | 快速网站分析（自动存储HTML） |
| `js_param_analyzer.py` | requests, bs4 | JS参数/端点分析 |
| `validate_book_source.py` | — | 书源JSON验证（零依赖） |
| `upload_book_source.py` | requests | 书源上传到图床 |

> **无 Python 环境？** 见 `references/no_python_workflow.md`，优先使用宿主系统已配置的 MCP 工具（浏览器/HTTP/代码执行）。

##
## 3-Phase Workflow

### Phase 1: Information Collection

**⚠️ DO NOT create book source in this phase!**

**Step 1: Query Knowledge Base**
```
search_knowledge("CSS选择器格式 提取类型 @text @html @href @src")
get_real_book_source_examples(limit=5)
get_book_source_templates(limit=3)
```

**Step 2: Detect Encoding (ONCE, at start)**
```
detect_charset(url="http://example.com")
```
- UTF-8 → omit charset (default)
- GBK/GB2312 → add `"charset":"gbk"` to all requests

**Step 3: Fetch Real HTML**
```
smart_fetch_html(url="http://example.com/search", charset="gbk")
smart_fetch_html(url="http://example.com/search", method="POST",
                 body="keyword={{key}}&t=1", charset="gbk")
```

**Step 4: Analyze Structure**
```
smart_web_analyzer(html="...")
smart_bookinfo_analyzer(html="...")
smart_toc_analyzer(html="...")
smart_content_analyzer(html="...")
```

### Phase 2: Strict Review

1. Write rules based on knowledge base + real HTML analysis
2. Validate CSS selectors, extraction types, regex format
3. Handle special cases (no cover, lazy loading, merged info)

**When uncertain → ASK the user.** Never guess.

### Phase 3: Create Book Source

1. Prepare complete JSON with all required fields
2. Call `edit_book_source(complete_source="完整JSON")` **ONCE**
3. Output as standard JSON array (no comments, no code blocks)

## Rule String Format

```
CSS选择器@提取类型##正则表达式##替换内容
```

**Extraction Types:**
- `@text` — text content (includes children)
- `@ownText` — element text only (excludes children)
- `@html` — HTML structure
- `@textNode` — text nodes
- `@href` — link URL
- `@src` — image source
- `@js` — JavaScript processing

**Numeric Indices:**
- `.0` = first, `.-1` = last (NOT `:first-child` / `:last-child`)

**Text Selection:**
- `text.关键词` (NOT `:contains()`)

## Common Patterns

**Standard list with cover:**
```json
{"bookList": ".book-list .item", "name": ".title@text", "bookUrl": "a@href", "coverUrl": "img@src"}
```

**No cover on search page:**
```json
{"coverUrl": ""}
```

**Lazy loading images:**
```json
{"coverUrl": "img@data-original||img@src"}
```

**nextContentUrl rule:** Chapter number changes → SET it. Page number only → LEAVE EMPTY.

## Critical Constraints

**Forbidden (confirmed nonexistent in Legado source):**
- NO `prevContentUrl`
- NO `:contains()` pseudo-class
- NO `:first-child` / `:last-child`

**Strictly Prohibited:**
- Creating book source without fetching real HTML
- Guessing rules without knowledge base query
- Detecting encoding more than once

**Required fields:** See `references/legado_data_structures.md` for complete field specs from BookSource.kt, SearchRule.kt, TocRule.kt, ContentRule.kt, BookInfoRule.kt.

## References

| File | Content |
|------|---------|
| `references/legado_development_guide.md` | Complete workflow, HTML patterns, encoding, regex, troubleshooting, advanced features |
| `references/legado_data_structures.md` | Source code analysis: data structures, rule engine, DB schema, WebSocket debug |
| `references/Legado书源开发完整指南.md` | Comprehensive development guide (14.6 MB) |
| `references/用户交互指南.md` | 8 common scenario interaction flows |
| `references/方法-JS扩展类.md` | JavaScript API documentation |
| `references/Legado书源编码处理指南.md` | Encoding handling guide |
| `references/knowledge_base/book_sources/` | 134 real book source analysis (MD) |
| `references/book_source_database/book_sources/` | Book source database (JSON) |
| `references/legado_source/` | Split Legado source code (1847 files, categorized) |

## Most Used Patterns (from 134 real sources)

**CSS Selectors:** `img`(40x), `h1`(30x), `div`(13x), `content`(12x), `intro`(11x), `h3`(9x)

**Extraction Types:** `@href`(81x), `@text`(72x), `src`(60x), `@html`(33x), `@js`(25x)
