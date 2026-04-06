// Source: /app/src/main/java/io/legado/app/utils/BookChapterExtensions.kt
文件名：BookChapterExtensions.kt
文件大小：170 字节
================================================================================
文件内容：
package io.legado.app.utils

import io.legado.app.data.entities.BookChapter

fun BookChapter.internString() {
    title = title.intern()
    bookUrl = bookUrl.intern()
}

