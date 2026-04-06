// Source: /app/src/main/java/io/legado/app/utils/canvasrecorder/pools/PicturePool.kt
文件名：PicturePool.kt
文件大小：237 字节
================================================================================
文件内容：
package io.legado.app.utils.canvasrecorder.pools

import android.graphics.Picture
import io.legado.app.utils.objectpool.BaseObjectPool

class PicturePool : BaseObjectPool<Picture>(64) {

    override fun create(): Picture = Picture()

}

