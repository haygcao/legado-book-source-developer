// Source: /app/src/main/java/io/legado/app/lib/dialogs/SelectItem.kt
文件名：SelectItem.kt
文件大小：194 字节
================================================================================
文件内容：
package io.legado.app.lib.dialogs

@Suppress("unused")
data class SelectItem<T>(
    val title: String,
    val value: T
) {

    override fun toString(): String {
        return title
    }

}

