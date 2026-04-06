// Source: /app/src/main/java/io/legado/app/utils/InputStreamExtensions.kt
文件名：InputStreamExtensions.kt
文件大小：597 字节
================================================================================
文件内容：
package io.legado.app.utils

import java.io.InputStream
import java.util.*

fun InputStream?.isJson(): Boolean {
    this ?: return false
    this.use {
        val byteArray = ByteArray(128)
        it.read(byteArray)
        val a = String(byteArray).trim()
        it.skip(it.available() - 128L)
        it.read(byteArray)
        val b = String(byteArray).trim()
        return (a + b).isJson()
    }
}

fun InputStream?.contains(str: String): Boolean {
    this ?: return false
    this.use {
        val scanner = Scanner(it)
        return scanner.findWithinHorizon(str, 0) != null
    }
}

