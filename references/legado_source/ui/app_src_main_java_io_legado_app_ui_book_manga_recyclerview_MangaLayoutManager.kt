// Source: /app/src/main/java/io/legado/app/ui/book/manga/recyclerview/MangaLayoutManager.kt
文件名：MangaLayoutManager.kt
文件大小：509 字节
================================================================================
文件内容：
package io.legado.app.ui.book.manga.recyclerview

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MangaLayoutManager(context: Context) :
    LinearLayoutManager(context) {

    private val extraLayoutSpace = context.resources.displayMetrics.heightPixels * 3 / 4

    @Deprecated("Deprecated in Java")
    override fun getExtraLayoutSpace(state: RecyclerView.State?): Int {
        return extraLayoutSpace
    }

}

