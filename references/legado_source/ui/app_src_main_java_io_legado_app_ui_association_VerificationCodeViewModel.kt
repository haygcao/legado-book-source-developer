// Source: /app/src/main/java/io/legado/app/ui/association/VerificationCodeViewModel.kt
文件名：VerificationCodeViewModel.kt
文件大小：1015 字节
================================================================================
文件内容：
package io.legado.app.ui.association

import android.app.Application
import android.os.Bundle
import io.legado.app.base.BaseViewModel
import io.legado.app.constant.SourceType
import io.legado.app.help.source.SourceHelp

class VerificationCodeViewModel(app: Application): BaseViewModel(app) {

    var sourceOrigin = ""
    var sourceName = ""
    private var sourceType = SourceType.book

    fun initData(arguments: Bundle) {
        sourceName = arguments.getString("sourceName") ?: ""
        sourceOrigin = arguments.getString("sourceOrigin") ?: ""
        sourceType = arguments.getInt("sourceType", SourceType.book)
    }

    fun disableSource(block: () -> Unit) {
        execute {
            SourceHelp.enableSource(sourceOrigin, sourceType, false)
        }.onSuccess {
            block.invoke()
        }
    }

    fun deleteSource(block: () -> Unit) {
        execute {
            SourceHelp.deleteSource(sourceOrigin, sourceType)
        }.onSuccess {
            block.invoke()
        }
    }

}

