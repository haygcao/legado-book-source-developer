// Source: /app/src/main/java/io/legado/app/ui/widget/text/EditEntity.kt
文件名：EditEntity.kt
文件大小：481 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.text

import splitties.init.appCtx

data class EditEntity(
    var key: String,
    var value: String?,
    var hint: String,
    val viewType: Int = 0
) {

    constructor(
        key: String,
        value: String?,
        hint: Int,
        viewType: Int = 0
    ) : this(
        key,
        value,
        appCtx.getString(hint),
        viewType
    )

    @Suppress("unused")
    object ViewType {

        const val checkBox = 1

    }

}

