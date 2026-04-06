// Source: /app/src/main/java/io/legado/app/utils/canvasrecorder/BaseCanvasRecorder.kt
文件名：BaseCanvasRecorder.kt
文件大小：625 字节
================================================================================
文件内容：
package io.legado.app.utils.canvasrecorder

import androidx.annotation.CallSuper

abstract class BaseCanvasRecorder : CanvasRecorder {

    @JvmField
    protected var isDirty = true

    override fun invalidate() {
        isDirty = true
    }

    @CallSuper
    override fun recycle() {
        isDirty = true
    }

    @CallSuper
    override fun endRecording() {
        isDirty = false
    }

    override fun isDirty(): Boolean {
        return isDirty
    }

    override fun isLocked(): Boolean {
        return false
    }

    override fun needRecord(): Boolean {
        return isDirty() && !isLocked()
    }

}

