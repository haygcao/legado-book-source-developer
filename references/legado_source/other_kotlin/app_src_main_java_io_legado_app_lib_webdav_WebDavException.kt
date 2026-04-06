// Source: /app/src/main/java/io/legado/app/lib/webdav/WebDavException.kt
文件名：WebDavException.kt
文件大小：238 字节
================================================================================
文件内容：
package io.legado.app.lib.webdav

open class WebDavException(msg: String) : Exception(msg) {

    override fun fillInStackTrace(): Throwable {
        return this
    }

}

class ObjectNotFoundException(msg: String) : WebDavException(msg)

