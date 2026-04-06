// Source: /app/src/main/java/io/legado/app/utils/AnimationExtensions.kt
文件名：AnimationExtensions.kt
文件大小：444 字节
================================================================================
文件内容：
package io.legado.app.utils

import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.annotation.AnimRes
import io.legado.app.help.config.AppConfig

fun loadAnimation(context: Context, @AnimRes id: Int): Animation {
    val animation = AnimationUtils.loadAnimation(context, id)
    if (AppConfig.isEInkMode) {
        animation.duration = 0
    }
    return animation
}

