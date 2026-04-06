// Source: /modules/rhino/src/main/java/com/script/rhino/RhinoErrors.kt
文件名：RhinoErrors.kt
文件大小：166 字节
================================================================================
文件内容：
package com.script.rhino

class RhinoInterruptError(override val cause: Throwable) : Error()

class RhinoRecursionError(): Error("Maximum recursion depth exceeded.")

