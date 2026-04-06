// Source: /app/src/main/java/io/legado/app/utils/CookieManagerExtensions.kt
文件名：CookieManagerExtensions.kt
文件大小：609 字节
================================================================================
文件内容：
@file:Suppress("UnusedReceiverParameter")

package io.legado.app.utils

import android.webkit.CookieManager


@Suppress("unused")
fun CookieManager.removeCookie(url: String) {
    val cm = CookieManager.getInstance()
    val domains = arrayOf(
        NetworkUtils.getDomain(url),
        NetworkUtils.getSubDomain(url)
    )
    domains.forEach { dm ->
        val cookieGlob: String? = cm.getCookie(dm)
        cookieGlob?.splitNotBlank(";")?.forEach {
            val cookieName = it.substringBefore("=")
            cm.setCookie(dm, "$cookieName=; Expires=Wed, 31 Dec 2000 23:59:59 GMT")
        }
    }
}

