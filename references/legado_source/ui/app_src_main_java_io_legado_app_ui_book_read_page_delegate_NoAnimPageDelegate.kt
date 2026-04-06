// Source: /app/src/main/java/io/legado/app/ui/book/read/page/delegate/NoAnimPageDelegate.kt
文件名：NoAnimPageDelegate.kt
文件大小：555 字节
================================================================================
文件内容：
package io.legado.app.ui.book.read.page.delegate

import android.graphics.Canvas
import io.legado.app.ui.book.read.page.ReadView

class NoAnimPageDelegate(readView: ReadView) : HorizontalPageDelegate(readView) {

    override fun onAnimStart(animationSpeed: Int) {
        if (!isCancel) {
            readView.fillPage(mDirection)
        }
        stopScroll()
    }

    override fun setBitmap() {
        // nothing
    }

    override fun onDraw(canvas: Canvas) {
        // nothing
    }

    override fun onAnimStop() {
        // nothing
    }


}

