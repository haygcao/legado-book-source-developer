// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/PalmDocHeader.kt
文件名：PalmDocHeader.kt
文件大小：173 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class PalmDocHeader(
    val compression: Int,
    val numTextRecords: Int,
    val recordSize: Int,
    val encryption: Int
)

