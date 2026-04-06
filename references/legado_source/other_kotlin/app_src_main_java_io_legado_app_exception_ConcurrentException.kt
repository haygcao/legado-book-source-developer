// Source: /app/src/main/java/io/legado/app/exception/ConcurrentException.kt
文件名：ConcurrentException.kt
文件大小：170 字节
================================================================================
文件内容：
@file:Suppress("unused")

package io.legado.app.exception

/**
 * 并发限制
 */
class ConcurrentException(msg: String, val waitTime: Long) : NoStackTraceException(msg)

