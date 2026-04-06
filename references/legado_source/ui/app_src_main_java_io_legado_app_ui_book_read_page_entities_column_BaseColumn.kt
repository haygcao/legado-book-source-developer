// Source: /app/src/main/java/io/legado/app/ui/book/read/page/entities/column/BaseColumn.kt
文件名：BaseColumn.kt
文件大小：447 字节
================================================================================
文件内容：
package io.legado.app.ui.book.read.page.entities.column

import android.graphics.Canvas
import io.legado.app.ui.book.read.page.ContentTextView
import io.legado.app.ui.book.read.page.entities.TextLine

/**
 * 列基类
 */
interface BaseColumn {
    var start: Float
    var end: Float
    var textLine: TextLine

    fun draw(view: ContentTextView, canvas: Canvas)

    fun isTouch(x: Float): Boolean {
        return x > start && x < end
    }

}

