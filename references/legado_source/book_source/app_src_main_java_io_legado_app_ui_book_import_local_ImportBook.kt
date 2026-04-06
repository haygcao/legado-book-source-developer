// Source: /app/src/main/java/io/legado/app/ui/book/import/local/ImportBook.kt
文件名：ImportBook.kt
文件大小：404 字节
================================================================================
文件内容：
package io.legado.app.ui.book.import.local

import io.legado.app.model.localBook.LocalBook
import io.legado.app.utils.FileDoc

data class ImportBook(
    val file: FileDoc,
    var isOnBookShelf: Boolean = !file.isDir && LocalBook.isOnBookShelf(file.name)
) {
    val name get() = file.name
    val isDir get() = file.isDir
    val size get() = file.size
    val lastModified get() = file.lastModified
}

