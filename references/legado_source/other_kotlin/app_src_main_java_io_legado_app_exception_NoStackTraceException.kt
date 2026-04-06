// Source: /app/src/main/java/io/legado/app/exception/NoStackTraceException.kt
文件名：NoStackTraceException.kt
文件大小：355 字节
================================================================================
文件内容：
package io.legado.app.exception

/**
 * 不记录错误堆栈的报错
 */
open class NoStackTraceException(msg: String) : Exception(msg) {

    override fun fillInStackTrace(): Throwable {
        stackTrace = emptyStackTrace
        return this
    }

    companion object {
        private val emptyStackTrace = emptyArray<StackTraceElement>()
    }

}

