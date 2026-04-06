// Source: /app/src/main/java/io/legado/app/data/entities/Cookie.kt
文件名：Cookie.kt
文件大小：299 字节
================================================================================
文件内容：
package io.legado.app.data.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "cookies", indices = [(Index(value = ["url"], unique = true))])
data class Cookie(
    @PrimaryKey
    var url: String = "",
    var cookie: String = ""
)

