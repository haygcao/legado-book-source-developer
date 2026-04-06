// Source: /app/src/main/java/io/legado/app/help/book/BookContent.kt
文件名：BookContent.kt
文件大小：345 字节
================================================================================
文件内容：
package io.legado.app.help.book

import io.legado.app.data.entities.ReplaceRule

data class BookContent(
    val sameTitleRemoved: Boolean,
    val textList: List<String>,
    //起效的替换规则
    val effectiveReplaceRules: List<ReplaceRule>?
) {

    override fun toString(): String {
        return textList.joinToString("\n")
    }

}

