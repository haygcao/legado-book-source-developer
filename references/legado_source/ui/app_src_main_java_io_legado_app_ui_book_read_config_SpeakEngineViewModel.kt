// Source: /app/src/main/java/io/legado/app/ui/book/read/config/SpeakEngineViewModel.kt
文件名：SpeakEngineViewModel.kt
文件大小：572 字节
================================================================================
文件内容：
package io.legado.app.ui.book.read.config

import android.app.Application
import android.speech.tts.TextToSpeech
import io.legado.app.base.BaseViewModel
import io.legado.app.help.DefaultData

class SpeakEngineViewModel(application: Application) : BaseViewModel(application) {

    val sysEngines: List<TextToSpeech.EngineInfo> by lazy {
        val tts = TextToSpeech(context, null)
        val engines = tts.engines
        tts.shutdown()
        engines
    }

    fun importDefault() {
        execute {
            DefaultData.importDefaultHttpTTS()
        }
    }

}

