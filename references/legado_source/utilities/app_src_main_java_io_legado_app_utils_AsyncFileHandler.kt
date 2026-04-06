// Source: /app/src/main/java/io/legado/app/utils/AsyncFileHandler.kt
文件名：AsyncFileHandler.kt
文件大小：406 字节
================================================================================
文件内容：
package io.legado.app.utils

import io.legado.app.help.globalExecutor
import java.util.logging.FileHandler
import java.util.logging.LogRecord

class AsyncFileHandler(pattern: String) : FileHandler(pattern) {

    override fun publish(record: LogRecord?) {
        if (!isLoggable(record)) {
            return
        }
        globalExecutor.execute {
            super.publish(record)
        }
    }

}

