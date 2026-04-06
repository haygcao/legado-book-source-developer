// Source: /app/src/main/java/io/legado/app/lib/theme/view/ThemeProgressBar.kt
文件名：ThemeProgressBar.kt
文件大小：412 字节
================================================================================
文件内容：
package io.legado.app.lib.theme.view

import android.content.Context
import android.util.AttributeSet
import android.widget.ProgressBar
import io.legado.app.lib.theme.accentColor
import io.legado.app.utils.applyTint

class ThemeProgressBar(context: Context, attrs: AttributeSet) : ProgressBar(context, attrs) {

    init {
        if (!isInEditMode) {
            applyTint(context.accentColor)
        }
    }
}

