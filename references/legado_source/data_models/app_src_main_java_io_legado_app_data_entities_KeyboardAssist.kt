// Source: /app/src/main/java/io/legado/app/data/entities/KeyboardAssist.kt
文件名：KeyboardAssist.kt
文件大小：520 字节
================================================================================
文件内容：
package io.legado.app.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "keyboardAssists", primaryKeys = ["type", "key"])
data class KeyboardAssist(
    @ColumnInfo(defaultValue = "0")
    var type: Int = 0,
    @ColumnInfo(defaultValue = "")
    var key: String,
    @ColumnInfo(defaultValue = "")
    var value: String,
    @ColumnInfo(defaultValue = "0")
    var serialNo: Int = 0
) : Parcelable

