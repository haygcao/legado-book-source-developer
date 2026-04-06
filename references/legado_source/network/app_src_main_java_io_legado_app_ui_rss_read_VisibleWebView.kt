// Source: /app/src/main/java/io/legado/app/ui/rss/read/VisibleWebView.kt
文件名：VisibleWebView.kt
文件大小：356 字节
================================================================================
文件内容：
package io.legado.app.ui.rss.read

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView

class VisibleWebView(
    context: Context,
    attrs: AttributeSet? = null
) : WebView(context, attrs) {

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(VISIBLE)
    }

}

