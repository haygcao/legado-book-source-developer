// Source: /modules/rhino/src/main/java/com/script/Bindings.kt
文件名：Bindings.kt
文件大小：358 字节
================================================================================
文件内容：
/*
 * Decompiled with CFR 0.152.
 */
package com.script

interface Bindings : MutableMap<String, Any?> {

    override fun containsKey(key: String): Boolean

    override operator fun get(key: String): Any?

    override fun put(key: String, value: Any?): Any?

    override fun putAll(from: Map<out String, *>)

    override fun remove(key: String): Any?

}

