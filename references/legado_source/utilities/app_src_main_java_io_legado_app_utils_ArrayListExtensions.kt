// Source: /app/src/main/java/io/legado/app/utils/ArrayListExtensions.kt
文件名：ArrayListExtensions.kt
文件大小：267 字节
================================================================================
文件内容：
package io.legado.app.utils

fun <T> ArrayList<T>.indexOf(o: T, startIndex: Int): Int {
    if (startIndex >= this.size) {
        return -2
    }
    for (i in startIndex..<this.size) {
        if (o == this[i]) {
            return i
        }
    }
    return -1
}

