// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/TagxHeader.kt
文件名：TagxHeader.kt
文件大小：139 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class TagxHeader(
    val magic: String,
    val length: Int,
    val numControlBytes: Int
)

