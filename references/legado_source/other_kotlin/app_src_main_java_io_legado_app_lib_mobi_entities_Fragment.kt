// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/Fragment.kt
文件名：Fragment.kt
文件大小：178 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class Fragment(
    val insertOffset: Int,
    val selector: String,
    val index: Int,
    val offset: Int,
    val length: Int
)

