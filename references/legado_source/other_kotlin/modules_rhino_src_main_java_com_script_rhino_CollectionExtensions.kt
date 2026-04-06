// Source: /modules/rhino/src/main/java/com/script/rhino/CollectionExtensions.kt
文件名：CollectionExtensions.kt
文件大小：498 字节
================================================================================
文件内容：
package com.script.rhino

inline fun <T> List<T>.fastBinarySearch(
    comparison: (T) -> Int
): Int {
    var low = 0
    var high = lastIndex

    while (low <= high) {
        val mid = (low + high).ushr(1) // safe from overflows
        val midVal = get(mid)
        val cmp = comparison(midVal)

        if (cmp < 0)
            low = mid + 1
        else if (cmp > 0)
            high = mid - 1
        else
            return mid // key found
    }
    return -(low + 1)  // key not found
}

