// Source: /app/src/main/java/io/legado/app/lib/mobi/utils/BitwiseExtensions.kt
文件名：BitwiseExtensions.kt
文件大小：232 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.utils

internal infix fun Byte.and(mask: Int): Int = toInt() and mask

internal infix fun Short.and(mask: Int): Int = toInt() and mask

internal infix fun Int.and(mask: Long): Long = toLong() and mask

