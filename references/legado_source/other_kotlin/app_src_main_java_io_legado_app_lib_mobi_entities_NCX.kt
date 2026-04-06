// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/NCX.kt
文件名：NCX.kt
文件大小：306 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class NCX(
    val index: Int,
    val offset: Int?,
    val size: Int?,
    val label: String,
    val headingLevel: Int?,
    val pos: List<Int>?,
    val parent: Int?,
    val firstChild: Int?,
    val lastChild: Int?,
    var children: List<NCX>? = null
)

