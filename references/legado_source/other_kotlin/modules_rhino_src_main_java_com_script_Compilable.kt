// Source: /modules/rhino/src/main/java/com/script/Compilable.kt
文件名：Compilable.kt
文件大小：274 字节
================================================================================
文件内容：
/*
 * Decompiled with CFR 0.152.
 */
package com.script

import java.io.Reader

interface Compilable {

    @Throws(ScriptException::class)
    fun compile(script: Reader): CompiledScript

    @Throws(ScriptException::class)
    fun compile(script: String): CompiledScript
}

