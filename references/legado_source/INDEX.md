# Legado Source Code Index

Split from `阅读源码.txt` (397K lines, 1847 files) into categorized directories.

## Directory Structure

- `api/` — 6 files, 665 lines
- `book_source/` — 212 files, 29,371 lines
- `config/` — 628 files, 69,117 lines
- `data_models/` — 102 files, 15,947 lines
- `database/` — 89 files, 139,525 lines
- `network/` — 124 files, 18,597 lines
- `other_kotlin/` — 167 files, 17,168 lines
- `rule_engine/` — 12 files, 4,503 lines
- `ui/` — 307 files, 57,994 lines
- `utilities/` — 200 files, 31,170 lines

## Key Files for Book Source Development

### rule_engine/

- `/app/src/main/java/io/legado/app/model/analyzeRule/AnalyzeRule.kt` (975 lines)

### book_source/

- `/app/src/main/java/io/legado/app/data/entities/BookSource.kt` (320 lines)
- `/app/src/main/java/io/legado/app/data/entities/BookSourcePart.kt` (90 lines)

### data_models/

- `/app/src/main/java/io/legado/app/data/entities/BaseBook.kt` (58 lines)
- `/app/src/main/java/io/legado/app/data/entities/SearchBook.kt` (144 lines)
- `/app/src/main/java/io/legado/app/data/entities/BookChapter.kt` (206 lines)
- `/app/src/main/java/io/legado/app/data/entities/ReplaceRule.kt` (126 lines)

### network/

- `/app/src/main/java/io/legado/app/utils/NetworkUtils.kt` (304 lines)

## How to Search

```bash
# Search across all source files
grep -rn 'keyword' references/legado_source/

# Search in specific category
grep -rn 'AnalyzeRule' references/legado_source/rule_engine/

# Find a specific class
grep -rn 'class BookSource' references/legado_source/
```
