// Source: /app/src/main/java/io/legado/app/help/coroutine/ActivelyCancelException.kt
文件名：ActivelyCancelException.kt
文件大小：270 字节
================================================================================
文件内容：
package io.legado.app.help.coroutine

import kotlin.coroutines.cancellation.CancellationException

class ActivelyCancelException : CancellationException() {

    override fun fillInStackTrace(): Throwable {
        stackTrace = emptyArray()
        return this
    }

}

