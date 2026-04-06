// Source: /app/src/main/java/io/legado/app/utils/MutableLiveDataExtensions.kt
文件名：MutableLiveDataExtensions.kt
文件大小：309 字节
================================================================================
文件内容：
package io.legado.app.utils

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData

private val mainHandler by lazy { Handler(Looper.getMainLooper()) }

fun <T> MutableLiveData<T>.sendValue(value: T) {
    mainHandler.post {
        this@sendValue.value = value
    }
}

