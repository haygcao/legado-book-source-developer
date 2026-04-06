// Source: /modules/rhino/src/main/java/com/script/rhino/JavaObjectWrapFactory.kt
文件名：JavaObjectWrapFactory.kt
文件大小：195 字节
================================================================================
文件内容：
package com.script.rhino

import org.mozilla.javascript.Scriptable

fun interface JavaObjectWrapFactory {

    fun wrap(scope: Scriptable?, javaObject: Any, staticType: Class<*>?): Scriptable

}

