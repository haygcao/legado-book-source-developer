// Source: /app/src/main/java/io/legado/app/utils/canvasrecorder/CanvasRecorder.kt
文件名：CanvasRecorder.kt
文件大小：387 字节
================================================================================
文件内容：
package io.legado.app.utils.canvasrecorder

import android.graphics.Canvas

interface CanvasRecorder {

    val width: Int

    val height: Int

    fun beginRecording(width: Int, height: Int): Canvas

    fun endRecording()

    fun draw(canvas: Canvas)

    fun invalidate()

    fun recycle()

    fun isDirty(): Boolean

    fun isLocked(): Boolean

    fun needRecord(): Boolean

}

