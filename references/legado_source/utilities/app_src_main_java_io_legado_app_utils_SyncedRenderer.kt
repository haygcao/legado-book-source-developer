// Source: /app/src/main/java/io/legado/app/utils/SyncedRenderer.kt
文件名：SyncedRenderer.kt
文件大小：690 字节
================================================================================
文件内容：
package io.legado.app.utils

import android.view.Choreographer

class SyncedRenderer(val doFrame: (frameTime: Double) -> Unit) {

    private var callback: (Long) -> Unit = {}

    fun start() {
        var currTime = System.nanoTime() / 1000000.0
        callback = {
            val currTimeMs = it / 1000000.0
            val frameTime = currTimeMs - currTime
            currTime = currTimeMs
            doFrame(frameTime)
            Choreographer.getInstance().postFrameCallback(callback)
        }
        Choreographer.getInstance().postFrameCallback(callback)
    }

    fun stop() {
        Choreographer.getInstance().removeFrameCallback(callback)
        callback = {}
    }
}

