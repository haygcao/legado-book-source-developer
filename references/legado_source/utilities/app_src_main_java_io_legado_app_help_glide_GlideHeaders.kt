// Source: /app/src/main/java/io/legado/app/help/glide/GlideHeaders.kt
文件名：GlideHeaders.kt
文件大小：252 字节
================================================================================
文件内容：
package io.legado.app.help.glide

import com.bumptech.glide.load.model.Headers

class GlideHeaders(private val headers: MutableMap<String, String>) : Headers {

    override fun getHeaders(): MutableMap<String, String> {
        return headers
    }

}

