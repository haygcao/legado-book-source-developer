// Source: /app/src/main/java/io/legado/app/utils/canvasrecorder/pools/RenderNodePool.kt
文件名：RenderNodePool.kt
文件大小：487 字节
================================================================================
文件内容：
package io.legado.app.utils.canvasrecorder.pools

import android.graphics.RenderNode
import android.os.Build
import androidx.annotation.RequiresApi
import io.legado.app.utils.objectpool.BaseObjectPool

@RequiresApi(Build.VERSION_CODES.Q)
class RenderNodePool : BaseObjectPool<RenderNode>(64) {

    override fun recycle(target: RenderNode) {
        target.discardDisplayList()
        super.recycle(target)
    }

    override fun create(): RenderNode = RenderNode("CanvasRecorder")

}

