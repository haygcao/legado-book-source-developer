// Source: /app/src/main/java/io/legado/app/data/entities/Cache.kt
文件名：Cache.kt
文件大小：328 字节
================================================================================
文件内容：
package io.legado.app.data.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "caches", indices = [(Index(value = ["key"], unique = true))])
data class Cache(
    @PrimaryKey
    val key: String = "",
    var value: String? = null,
    var deadline: Long = 0L
)

