// Source: /app/src/main/java/io/legado/app/data/entities/BookChapterReview.kt
文件名：BookChapterReview.kt
文件大小：313 字节
================================================================================
文件内容：
package io.legado.app.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.parcelize.Parcelize

@Parcelize
class BookChapterReview(
    @ColumnInfo(defaultValue = "0")
    var bookId: Long = 0,
    var chapterId: Long = 0,
    var summaryUrl: String = "",
): Parcelable {

}

