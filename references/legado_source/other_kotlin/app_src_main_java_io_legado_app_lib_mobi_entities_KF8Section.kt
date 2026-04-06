// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/KF8Section.kt
文件名：KF8Section.kt
文件大小：315 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class KF8Section(
    val index: Int,
    val skeleton: Skeleton,
    val frags: List<Fragment>,
    val fragEnd: Int,
    val length: Int,
    val totalLength: Int,
    val href: String,
    var next: KF8Section? = null
) {
    val linear get() = frags.isNotEmpty()
}

