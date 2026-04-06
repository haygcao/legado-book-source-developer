// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/KF8Header.kt
文件名：KF8Header.kt
文件大小：164 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

data class KF8Header(
    val fdst: Int,
    val numFdst: Int,
    val frag: Int,
    val skel: Int,
    val guide: Int,
)

