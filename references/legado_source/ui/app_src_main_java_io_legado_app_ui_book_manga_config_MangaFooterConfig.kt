// Source: /app/src/main/java/io/legado/app/ui/book/manga/config/MangaFooterConfig.kt
文件名：MangaFooterConfig.kt
文件大小：577 字节
================================================================================
文件内容：
package io.legado.app.ui.book.manga.config

import androidx.annotation.Keep
import io.legado.app.ui.widget.ReaderInfoBarView

@Keep
data class MangaFooterConfig(
    var hideChapterLabel: Boolean = false,
    var hideChapter: Boolean = false,
    var hidePageNumberLabel: Boolean = false,
    var hidePageNumber: Boolean = false,
    var hideProgressRatioLabel: Boolean = false,
    var hideProgressRatio: Boolean = false,
    var footerOrientation: Int = ReaderInfoBarView.ALIGN_LEFT,//默认靠左
    var hideFooter: Boolean = false,
    var hideChapterName:Boolean=false,
)

