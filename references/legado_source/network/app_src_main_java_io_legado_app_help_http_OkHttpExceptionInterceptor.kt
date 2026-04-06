// Source: /app/src/main/java/io/legado/app/help/http/OkHttpExceptionInterceptor.kt
文件名：OkHttpExceptionInterceptor.kt
文件大小：464 字节
================================================================================
文件内容：
package io.legado.app.help.http

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

object OkHttpExceptionInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        try {
            return chain.proceed(chain.request())
        } catch (e: IOException) {
            throw e
        } catch (e: Throwable) {
            throw IOException(e)
        }
    }

}

