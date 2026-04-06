// Source: /app/src/main/java/io/legado/app/ui/book/manga/entities/ReaderLoading.kt
文件名：ReaderLoading.kt
文件大小：232 字节
================================================================================
文件内容：
package io.legado.app.ui.book.manga.entities

data class ReaderLoading(
    override val chapterIndex: Int = 0,
    override val index: Int = 0,
    val mMessage: String? = null,
    val isVolume: Boolean = false
) : BaseMangaPage


