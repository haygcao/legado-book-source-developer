// Source: /modules/rhino/src/main/java/com/script/ScriptException.kt
文件名：ScriptException.kt
文件大小：1344 字节
================================================================================
文件内容：
/*
 * Decompiled with CFR 0.152.
 */
package com.script

class ScriptException : Exception {
    var columnNumber: Int
        private set
    var fileName: String?
        private set
    var lineNumber: Int
        private set

    constructor(s: String?) : super(s) {
        fileName = null
        lineNumber = -1
        columnNumber = -1
    }

    constructor(e: Exception?) : super(e) {
        fileName = null
        lineNumber = -1
        columnNumber = -1
    }

    constructor(message: String?, fileName2: String?, lineNumber2: Int) : super(message) {
        fileName = fileName2
        lineNumber = lineNumber2
        columnNumber = -1
    }

    constructor(message: String?, fileName2: String?, lineNumber2: Int, columnNumber2: Int) : super(
        message
    ) {
        fileName = fileName2
        lineNumber = lineNumber2
        columnNumber = columnNumber2
    }

    override val message: String
        get() {
            val ret = super.message
            if (fileName == null) {
                return ret!!
            }
            var ret2 = "$ret in $fileName"
            if (lineNumber != -1) {
                ret2 = "$ret2 at line number $lineNumber"
            }
            return if (columnNumber != -1) {
                "$ret2 at column number $columnNumber"
            } else ret2
        }
}

