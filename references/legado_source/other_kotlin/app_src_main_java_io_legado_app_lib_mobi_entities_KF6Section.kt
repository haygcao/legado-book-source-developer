// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/KF6Section.kt
文件名：KF6Section.kt
文件大小：200 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class KF6Section(
    val index: Int,
    val start: Int,
    val end: Int,
    val length: Int,
    val href: String,
    var next: KF6Section? = null
)

