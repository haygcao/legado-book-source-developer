// Source: /app/src/main/java/io/legado/app/utils/ConfigurationExtensions.kt
文件名：ConfigurationExtensions.kt
文件大小：383 字节
================================================================================
文件内容：
@file:Suppress("unused")

package io.legado.app.utils

import android.content.res.Configuration
import android.content.res.Resources

val sysConfiguration: Configuration = Resources.getSystem().configuration

val Configuration.isNightMode: Boolean
    get() {
        val mode = uiMode and Configuration.UI_MODE_NIGHT_MASK
        return mode == Configuration.UI_MODE_NIGHT_YES
    }

