// Source: /app/src/main/java/io/legado/app/utils/ThrowableExtensions.kt
文件名：ThrowableExtensions.kt
文件大小：474 字节
================================================================================
文件内容：
package io.legado.app.utils

import java.io.IOException

val Throwable.stackTraceStr: String
    get() {
        val stackTrace = stackTraceToString()
        val lMsg = this.localizedMessage ?: "noErrorMsg"
        return when {
            stackTrace.isNotEmpty() -> stackTrace
            else -> lMsg
        }
    }

fun Throwable.asIOException(): IOException {
    val newException = IOException(this.message)
    newException.initCause(this)
    return newException
}

