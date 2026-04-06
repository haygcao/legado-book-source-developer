// Source: /modules/rhino/src/main/java/com/script/rhino/VMBridgeReflect.kt
文件名：VMBridgeReflect.kt
文件大小：502 字节
================================================================================
文件内容：
package com.script.rhino

import org.mozilla.javascript.VMBridge

object VMBridgeReflect {

    val instance: VMBridge by lazy {
        VMBridge::class.java.getDeclaredField("instance").apply {
            isAccessible = true
        }.get(null) as VMBridge
    }

    val contextLocal: ThreadLocal<Any> by lazy {
        @Suppress("UNCHECKED_CAST")
        instance::class.java.getDeclaredField("contextLocal").apply {
            isAccessible = true
        }.get(null) as ThreadLocal<Any>
    }

}

