// Source: /app/src/main/java/io/legado/app/ui/widget/recycler/scroller/FastScrollStateChangeListener.kt
文件名：FastScrollStateChangeListener.kt
文件大小：315 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.recycler.scroller

interface FastScrollStateChangeListener {

    /**
     * Called when fast scrolling begins
     */
    fun onFastScrollStart(fastScroller: FastScroller)

    /**
     * Called when fast scrolling ends
     */
    fun onFastScrollStop(fastScroller: FastScroller)
}

