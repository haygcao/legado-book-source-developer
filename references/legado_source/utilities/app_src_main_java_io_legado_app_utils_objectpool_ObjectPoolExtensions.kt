// Source: /app/src/main/java/io/legado/app/utils/objectpool/ObjectPoolExtensions.kt
文件名：ObjectPoolExtensions.kt
文件大小：117 字节
================================================================================
文件内容：
package io.legado.app.utils.objectpool

fun <T> ObjectPool<T>.synchronized(): ObjectPool<T> = ObjectPoolLocked(this)

