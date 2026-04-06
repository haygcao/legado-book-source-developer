// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/IndexData.kt
文件名：IndexData.kt
文件大小：165 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

import android.util.SparseArray

data class IndexData(
    val table: List<IndexEntry>,
    val cncx: SparseArray<String>
)

