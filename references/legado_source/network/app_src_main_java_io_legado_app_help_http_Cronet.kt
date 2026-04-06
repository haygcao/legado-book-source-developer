// Source: /app/src/main/java/io/legado/app/help/http/Cronet.kt
文件名：Cronet.kt
文件大小：493 字节
================================================================================
文件内容：
package io.legado.app.help.http

import io.legado.app.lib.cronet.CronetInterceptor
import io.legado.app.lib.cronet.CronetLoader
import okhttp3.Interceptor

object Cronet {

    val loader: LoaderInterface? by lazy {
        CronetLoader
    }

    fun preDownload() {
        loader?.preDownload()
    }

    val interceptor: Interceptor? by lazy {
        CronetInterceptor(cookieJar)
    }

    interface LoaderInterface {

        fun install(): Boolean

        fun preDownload()

    }

}

