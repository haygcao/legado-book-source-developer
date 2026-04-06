// Source: /app/src/main/java/io/legado/app/utils/Throttle.kt
文件名：Throttle.kt
文件大小：380 字节
================================================================================
文件内容：
package io.legado.app.utils

@Suppress("unused")
class Throttle<T>(
    wait: Long = 0L,
    leading: Boolean = true,
    trailing: Boolean = true,
    func: () -> T
) : Debounce<T>(wait, wait, leading, trailing, func)

fun <T> throttle(
    wait: Long = 0L,
    leading: Boolean = true,
    trailing: Boolean = true,
    func: () -> T
) = Throttle(wait, leading, trailing, func)

