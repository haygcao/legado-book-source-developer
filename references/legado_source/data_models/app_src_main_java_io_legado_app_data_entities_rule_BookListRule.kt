// Source: /app/src/main/java/io/legado/app/data/entities/rule/BookListRule.kt
文件名：BookListRule.kt
文件大小：350 字节
================================================================================
文件内容：
package io.legado.app.data.entities.rule

/**
 * 书籍列表规则
 */
interface BookListRule {
    var bookList: String?
    var name: String?
    var author: String?
    var intro: String?
    var kind: String?
    var lastChapter: String?
    var updateTime: String?
    var bookUrl: String?
    var coverUrl: String?
    var wordCount: String?
}

