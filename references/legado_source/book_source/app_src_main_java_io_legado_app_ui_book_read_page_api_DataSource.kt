// Source: /app/src/main/java/io/legado/app/ui/book/read/page/api/DataSource.kt
文件名：DataSource.kt
文件大小：505 字节
================================================================================
文件内容：
package io.legado.app.ui.book.read.page.api

import io.legado.app.model.ReadBook
import io.legado.app.ui.book.read.page.entities.TextChapter

interface DataSource {

    val pageIndex: Int get() = ReadBook.durPageIndex

    val currentChapter: TextChapter?

    val nextChapter: TextChapter?

    val prevChapter: TextChapter?

    val isScroll: Boolean

    fun hasNextChapter(): Boolean

    fun hasPrevChapter(): Boolean

    fun upContent(relativePosition: Int = 0, resetPageOffset: Boolean = true)

}

