// Source: /modules/rhino/src/main/java/com/script/rhino/ProtectedNativeJavaClass.kt
文件名：ProtectedNativeJavaClass.kt
文件大小：992 字节
================================================================================
文件内容：
package com.script.rhino

import org.mozilla.javascript.NativeJavaClass
import org.mozilla.javascript.Scriptable

class ProtectedNativeJavaClass(
    scope: Scriptable,
    javaClass: Class<*>,
    private val protectedName: Set<String> = emptySet()
) : NativeJavaClass(scope, javaClass) {

    override fun has(
        name: String,
        start: Scriptable?
    ): Boolean {
        if (protectedName.contains(name)) {
            return false
        }
        return super.has(name, start)
    }

    override fun get(name: String, start: Scriptable?): Any? {
        if (protectedName.contains(name)) {
            return NOT_FOUND
        }
        return super.get(name, start)
    }

    override fun put(
        name: String,
        start: Scriptable?,
        value: Any?
    ) {
        if (protectedName.contains(name)) {
            return
        }
        super.put(name, start, value)
    }

    override fun unwrap(): Any? {
        return javaObject.toString()
    }

}

