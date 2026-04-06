// Source: /app/src/main/java/io/legado/app/help/book/BookChapterExtensions.kt
文件名：BookChapterExtensions.kt
文件大小：289 字节
================================================================================
文件内容：
@file:Suppress("unused")

package io.legado.app.help.book

import io.legado.app.data.entities.BookChapter
import io.legado.app.help.RuleBigDataHelp.getDanmakuFile

fun BookChapter.getDanmaku(): Any? { //读取弹幕数据
    return variableMap["danmaku"] ?: getDanmakuFile(bookUrl, url)
}

