// Source: /app/src/main/java/io/legado/app/utils/canvasrecorder/CanvasRecorderFactory.kt
文件名：CanvasRecorderFactory.kt
文件大小：778 字节
================================================================================
文件内容：
package io.legado.app.utils.canvasrecorder

import android.os.Build
import io.legado.app.help.config.AppConfig

object CanvasRecorderFactory {

    private val atLeastApi24 = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
    private val atLeastApi29 = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
    val isSupport = atLeastApi24

    // issue 3868
    fun create(locked: Boolean = false): CanvasRecorder {
        val impl = when {
            !AppConfig.optimizeRender -> CanvasRecorderImpl()
            atLeastApi29 -> CanvasRecorderApi29Impl()
            atLeastApi24 -> CanvasRecorderApi23Impl()
            else -> CanvasRecorderImpl()
        }
        return if (locked) {
            CanvasRecorderLocked(impl)
        } else {
            impl
        }
    }

}

