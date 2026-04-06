// Source: /app/src/main/java/io/legado/app/ui/book/manga/entities/MangaPage.kt
文件名：MangaPage.kt
文件大小：386 字节
================================================================================
文件内容：
package io.legado.app.ui.book.manga.entities

data class MangaPage(
    override val chapterIndex: Int = 0,//总章节位置
    val chapterSize: Int,//总章节数量
    val mImageUrl: String = "",//当前URL
    override val index: Int = 0,//当前章节位置
    var imageCount: Int = 0,//当前章节内容总数
    val mChapterName: String = "",//章节名称
) : BaseMangaPage

