// Source: /app/src/main/java/io/legado/app/help/http/OkhttpUncaughtExceptionHandler.kt
文件名：OkhttpUncaughtExceptionHandler.kt
文件大小：307 字节
================================================================================
文件内容：
package io.legado.app.help.http

import io.legado.app.constant.AppLog

object OkhttpUncaughtExceptionHandler : Thread.UncaughtExceptionHandler {

    override fun uncaughtException(t: Thread, e: Throwable) {
        AppLog.put("Okhttp Dispatcher中的线程执行出错\n${e.localizedMessage}", e)
    }

}

