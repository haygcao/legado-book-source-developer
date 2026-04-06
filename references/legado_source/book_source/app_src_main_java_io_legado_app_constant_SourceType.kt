// Source: /app/src/main/java/io/legado/app/constant/SourceType.kt
文件名：SourceType.kt
文件大小：306 字节
================================================================================
文件内容：
package io.legado.app.constant

import androidx.annotation.IntDef

@Suppress("ConstPropertyName")
object SourceType {

    const val book = 0
    const val rss = 1

    @Target(AnnotationTarget.VALUE_PARAMETER)
    @Retention(AnnotationRetention.SOURCE)
    @IntDef(book, rss)
    annotation class Type

}

