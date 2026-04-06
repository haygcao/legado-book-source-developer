// Source: /app/src/main/java/io/legado/app/lib/cronet/CallbackResult.kt
文件名：CallbackResult.kt
文件大小：248 字节
================================================================================
文件内容：
package io.legado.app.lib.cronet

import org.chromium.net.CronetException

import java.nio.ByteBuffer


data class CallbackResult(
    val callbackStep: CallbackStep,
    val buffer: ByteBuffer? = null,
    val exception: CronetException? = null
)

