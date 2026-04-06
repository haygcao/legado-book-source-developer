// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/IndxHeader.kt
文件名：IndxHeader.kt
文件大小：321 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class IndxHeader(
    val magic: String,
    val length: Int,
    val type: Int,
    val idxt: Int,
    val numRecords: Int,
    val encoding: Int,
    val language: Int,
    val total: Int,
    val ordt: Int,
    val ligt: Int,
    val numLigt: Int,
    val numCncx: Int,
)

