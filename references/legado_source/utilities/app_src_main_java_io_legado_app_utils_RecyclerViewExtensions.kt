// Source: /app/src/main/java/io/legado/app/utils/RecyclerViewExtensions.kt
文件名：RecyclerViewExtensions.kt
文件大小：928 字节
================================================================================
文件内容：
package io.legado.app.utils

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.findCenterViewPosition(): Int {
    return getChildAdapterPosition(
        findChildViewUnder(width / 2f, height / 2f) ?: return RecyclerView.NO_POSITION
    )
}

fun RecyclerView.findViewPosition(x: Float, y: Float): Int {
    return getChildAdapterPosition(findChildViewUnder(x, y) ?: return RecyclerView.NO_POSITION)
}

fun RecyclerView.findFirstVisibleViewPosition(): Int {
    var pos = -1
    if (layoutManager is LinearLayoutManager) {
        pos = (layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
    }
    return pos
}

fun RecyclerView.findLastVisibleViewPosition(): Int {
    var pos = -1
    if (layoutManager is LinearLayoutManager) {
        pos = (layoutManager as LinearLayoutManager).findLastVisibleItemPosition()
    }
    return pos
}

