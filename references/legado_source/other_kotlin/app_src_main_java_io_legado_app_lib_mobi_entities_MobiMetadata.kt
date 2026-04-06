// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/MobiMetadata.kt
文件名：MobiMetadata.kt
文件大小：312 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class MobiMetadata(
    val identifier: String,
    val title: String,
    val author: List<String>,
    val publisher: String,
    val language: String,
    val published: String,
    val description: String,
    val subject: List<String>,
    val rights: String
)

