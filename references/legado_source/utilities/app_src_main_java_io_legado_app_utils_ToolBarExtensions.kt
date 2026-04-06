// Source: /app/src/main/java/io/legado/app/utils/ToolBarExtensions.kt
文件名：ToolBarExtensions.kt
文件大小：691 字节
================================================================================
文件内容：
@file:Suppress("unused")

package io.legado.app.utils

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Build
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import io.legado.app.R

/**
 * 设置toolBar更多图标颜色
 */
@SuppressLint("ObsoleteSdkInt")
fun Toolbar.setMoreIconColor(color: Int) {
    val moreIcon = ContextCompat.getDrawable(context, R.drawable.ic_more)
    if (moreIcon != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        moreIcon.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        overflowIcon = moreIcon
    }
}

