// Source: /app/src/main/java/io/legado/app/utils/objectpool/ObjectPool.kt
文件名：ObjectPool.kt
文件大小：139 字节
================================================================================
文件内容：
package io.legado.app.utils.objectpool

interface ObjectPool<T> {

    fun obtain(): T

    fun recycle(target: T)

    fun create(): T

}

