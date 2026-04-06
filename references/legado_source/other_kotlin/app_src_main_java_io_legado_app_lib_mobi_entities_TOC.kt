// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/TOC.kt
文件名：TOC.kt
文件大小：140 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class TOC(
    val label: String,
    val href: String,
    val subitems: List<TOC>? = null
)

