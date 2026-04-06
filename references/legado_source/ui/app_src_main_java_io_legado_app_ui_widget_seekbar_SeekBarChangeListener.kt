// Source: /app/src/main/java/io/legado/app/ui/widget/seekbar/SeekBarChangeListener.kt
文件名：SeekBarChangeListener.kt
文件大小：370 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.seekbar

import android.widget.SeekBar

interface SeekBarChangeListener : SeekBar.OnSeekBarChangeListener {

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {

    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {

    }

}

