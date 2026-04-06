// Source: /app/src/main/java/io/legado/app/help/PaintPool.kt
文件名：PaintPool.kt
文件大小：361 字节
================================================================================
文件内容：
package io.legado.app.help

import android.graphics.Paint
import io.legado.app.utils.objectpool.BaseSafeObjectPool

object PaintPool : BaseSafeObjectPool<Paint>(8) {

    private val emptyPaint = Paint()

    override fun create(): Paint = Paint()

    override fun recycle(target: Paint) {
        target.set(emptyPaint)
        super.recycle(target)
    }

}

