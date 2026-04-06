// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/ExthRecordType.kt
文件名：ExthRecordType.kt
文件大小：155 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class ExthRecordType(
    val name: String,
    val type: String = "string",
    val many: Boolean = false
)

