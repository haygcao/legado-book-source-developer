// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/TagxTag.kt
文件名：TagxTag.kt
文件大小：153 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class TagxTag(
    val tag: Int,
    val numValues: Int,
    val bitmask: Int,
    val controlByte: Int,
)

