// Source: /app/src/main/java/io/legado/app/ui/book/manga/entities/MangaContent.kt
文件名：MangaContent.kt
文件大小：173 字节
================================================================================
文件内容：
package io.legado.app.ui.book.manga.entities

data class MangaContent(
    val pos: Int,
    val items: List<Any>,
    val curFinish: Boolean,
    val nextFinish: Boolean
)

