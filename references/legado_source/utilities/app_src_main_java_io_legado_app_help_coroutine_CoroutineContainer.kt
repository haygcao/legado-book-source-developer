// Source: /app/src/main/java/io/legado/app/help/coroutine/CoroutineContainer.kt
文件名：CoroutineContainer.kt
文件大小：303 字节
================================================================================
文件内容：
package io.legado.app.help.coroutine

internal interface CoroutineContainer {

    fun add(coroutine: Coroutine<*>): Boolean

    fun addAll(vararg coroutines: Coroutine<*>): Boolean

    fun remove(coroutine: Coroutine<*>): Boolean

    fun delete(coroutine: Coroutine<*>): Boolean

    fun clear()

}

