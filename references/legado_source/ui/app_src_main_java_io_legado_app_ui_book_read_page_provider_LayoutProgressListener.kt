// Source: /app/src/main/java/io/legado/app/ui/book/read/page/provider/LayoutProgressListener.kt
文件名：LayoutProgressListener.kt
文件大小：410 字节
================================================================================
文件内容：
package io.legado.app.ui.book.read.page.provider

import io.legado.app.ui.book.read.page.entities.TextPage

interface LayoutProgressListener {

    /**
     * 单页排版完成
     */
    fun onLayoutPageCompleted(index: Int, page: TextPage) {}

    /**
     * 全部排版完成
     */
    fun onLayoutCompleted() {}

    /**
     * 排版出现异常
     */
    fun onLayoutException(e: Throwable) {}

}

