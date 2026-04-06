// Source: /app/src/main/java/io/legado/app/utils/MenuItemExtensions.kt
文件名：MenuItemExtensions.kt
文件大小：311 字节
================================================================================
文件内容：
package io.legado.app.utils

import android.view.MenuItem
import android.widget.ImageButton
import androidx.annotation.DrawableRes
import io.legado.app.R

fun MenuItem.setIconCompat(@DrawableRes iconRes: Int) {
    setIcon(iconRes)
    actionView?.findViewById<ImageButton>(R.id.item)?.setImageDrawable(icon)
}

