// Source: /app/src/main/java/io/legado/app/ui/book/manga/entities/MangaChapter.kt
文件名：MangaChapter.kt
文件大小：211 字节
================================================================================
文件内容：
package io.legado.app.ui.book.manga.entities

import io.legado.app.data.entities.BookChapter

data class MangaChapter(
    val chapter: BookChapter,
    val pages: List<BaseMangaPage>,
    val imageCount: Int
)

