// Source: /app/src/main/java/io/legado/app/utils/objectpool/ObjectPoolLocked.kt
文件名：ObjectPoolLocked.kt
文件大小：328 字节
================================================================================
文件内容：
package io.legado.app.utils.objectpool

class ObjectPoolLocked<T>(private val delegate: ObjectPool<T>) : ObjectPool<T> by delegate {

    @Synchronized
    override fun obtain(): T {
        return delegate.obtain()
    }

    @Synchronized
    override fun recycle(target: T) {
        return delegate.recycle(target)
    }

}

