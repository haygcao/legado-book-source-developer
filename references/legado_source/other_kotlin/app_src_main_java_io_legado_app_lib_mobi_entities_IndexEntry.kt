// Source: /app/src/main/java/io/legado/app/lib/mobi/entities/IndexEntry.kt
文件名：IndexEntry.kt
文件大小：190 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.entities

import android.util.SparseArray

data class IndexEntry(
    val label: String,
    val tags: List<IndexTag>,
    val tagMap: SparseArray<IndexTag>
)

