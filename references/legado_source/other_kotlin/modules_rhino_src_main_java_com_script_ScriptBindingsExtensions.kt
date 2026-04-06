// Source: /modules/rhino/src/main/java/com/script/ScriptBindingsExtensions.kt
文件名：ScriptBindingsExtensions.kt
文件大小：308 字节
================================================================================
文件内容：
package com.script

import org.mozilla.javascript.Context

inline fun buildScriptBindings(block: (bindings: ScriptBindings) -> Unit): ScriptBindings {
    val bindings = ScriptBindings()
    Context.enter()
    try {
        block(bindings)
    } finally {
        Context.exit()
    }
    return bindings
}

