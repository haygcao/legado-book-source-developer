// Source: /app/src/main/java/io/legado/app/utils/WindowInsetsExtensions.kt
文件名：WindowInsetsExtensions.kt
文件大小：310 字节
================================================================================
文件内容：
package io.legado.app.utils

import androidx.core.view.WindowInsetsCompat

val WindowInsetsCompat.navigationBarHeight
    get() = (getInsets(WindowInsetsCompat.Type.systemBars()).bottom - imeHeight).coerceAtLeast(0)

val WindowInsetsCompat.imeHeight
    get() = getInsets(WindowInsetsCompat.Type.ime()).bottom

