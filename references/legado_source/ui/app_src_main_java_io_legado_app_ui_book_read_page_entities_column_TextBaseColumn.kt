// Source: /app/src/main/java/io/legado/app/ui/book/read/page/entities/column/TextBaseColumn.kt
文件名：TextBaseColumn.kt
文件大小：263 字节
================================================================================
文件内容：
package io.legado.app.ui.book.read.page.entities.column

/**
 * 文字基列
 */
interface TextBaseColumn : BaseColumn {
    override var start: Float
    override var end: Float
    val charData: String
    var selected: Boolean
    var isSearchResult: Boolean
}

