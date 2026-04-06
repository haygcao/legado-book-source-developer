// Source: /app/src/main/java/io/legado/app/ui/main/explore/ExploreDiffItemCallBack.kt
文件名：ExploreDiffItemCallBack.kt
文件大小：515 字节
================================================================================
文件内容：
package io.legado.app.ui.main.explore

import androidx.recyclerview.widget.DiffUtil
import io.legado.app.data.entities.BookSourcePart


class ExploreDiffItemCallBack : DiffUtil.ItemCallback<BookSourcePart>() {

    override fun areItemsTheSame(oldItem: BookSourcePart, newItem: BookSourcePart): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: BookSourcePart, newItem: BookSourcePart): Boolean {
        return oldItem.bookSourceName == newItem.bookSourceName
    }

}

