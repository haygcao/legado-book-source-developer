// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/MobiEntryHeaders.kt
文件名：MobiEntryHeaders.kt
文件大小：186 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class MobiEntryHeaders(
    val palmdoc: PalmDocHeader,
    val mobi: MobiHeader,
    val exth: Map<String, Any>,
    val kf8: KF8Header?
)

