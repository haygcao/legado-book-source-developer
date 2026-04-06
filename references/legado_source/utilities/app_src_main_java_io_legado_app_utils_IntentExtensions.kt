// Source: /app/src/main/java/io/legado/app/utils/IntentExtensions.kt
文件名：IntentExtensions.kt
文件大小：507 字节
================================================================================
文件内容：
@file:Suppress("unused")

package io.legado.app.utils

import android.content.Intent

fun Intent.putJson(key: String, any: Any?) {
    any?.let {
        putExtra(key, GSON.toJson(any))
    }
}

inline fun <reified T> Intent.getJsonObject(key: String): T? {
    val value = getStringExtra(key)
    return GSON.fromJsonObject<T>(value).getOrNull()
}

inline fun <reified T> Intent.getJsonArray(key: String): List<T>? {
    val value = getStringExtra(key)
    return GSON.fromJsonArray<T>(value).getOrNull()
}

