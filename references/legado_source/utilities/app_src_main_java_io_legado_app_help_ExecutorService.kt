// Source: /app/src/main/java/io/legado/app/help/ExecutorService.kt
文件名：ExecutorService.kt
文件大小：195 字节
================================================================================
文件内容：
package io.legado.app.help

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

val globalExecutor: ExecutorService by lazy { Executors.newSingleThreadExecutor() }

