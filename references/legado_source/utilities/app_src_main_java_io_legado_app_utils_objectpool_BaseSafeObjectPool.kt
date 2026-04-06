// Source: /app/src/main/java/io/legado/app/utils/objectpool/BaseSafeObjectPool.kt
文件名：BaseSafeObjectPool.kt
文件大小：214 字节
================================================================================
文件内容：
package io.legado.app.utils.objectpool

import androidx.core.util.Pools

abstract class BaseSafeObjectPool<T : Any>(size: Int): BaseObjectPool<T>(size) {

    override val pool = Pools.SynchronizedPool<T>(size)

}

