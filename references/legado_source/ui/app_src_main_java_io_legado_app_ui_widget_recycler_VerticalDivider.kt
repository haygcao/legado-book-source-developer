// Source: /app/src/main/java/io/legado/app/ui/widget/recycler/VerticalDivider.kt
文件名：VerticalDivider.kt
文件大小：419 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.recycler

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import io.legado.app.R

class VerticalDivider(context: Context) : DividerItemDecoration(context, VERTICAL) {

    init {
        ContextCompat.getDrawable(context, R.drawable.ic_divider)?.let {
            this.setDrawable(it)
        }
    }

}

