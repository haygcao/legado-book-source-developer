// Source: /app/src/main/java/io/legado/app/ui/widget/dialog/WaitDialog.kt
文件名：WaitDialog.kt
文件大小：591 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.dialog

import android.app.Dialog
import android.content.Context
import io.legado.app.databinding.DialogWaitBinding


@Suppress("unused")
class WaitDialog(context: Context) : Dialog(context) {

    val binding = DialogWaitBinding.inflate(layoutInflater)

    init {
        setCanceledOnTouchOutside(false)
        setContentView(binding.root)
    }

    fun setText(text: String): WaitDialog {
        binding.tvMsg.text = text
        return this
    }

    fun setText(res: Int): WaitDialog {
        binding.tvMsg.setText(res)
        return this
    }

}

