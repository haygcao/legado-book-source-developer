// Source: /app/src/main/java/io/legado/app/lib/webdav/Authorization.kt
文件名：Authorization.kt
文件大小：860 字节
================================================================================
文件内容：
package io.legado.app.lib.webdav

import io.legado.app.data.appDb
import io.legado.app.data.entities.Server.WebDavConfig
import okhttp3.Credentials
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

data class Authorization(
    val username: String,
    val password: String,
    val charset: Charset = StandardCharsets.ISO_8859_1
) {

    var name = "Authorization"
        private set

    var data: String = Credentials.basic(username, password, charset)
        private set

    override fun toString(): String {
        return "$username:$password"
    }

    constructor(serverID: Long) : this(
        appDb.serverDao.get(serverID)?.getWebDavConfig()
            ?: throw WebDavException("Unexpected WebDav Authorization")
    )

    constructor(webDavConfig: WebDavConfig) : this(webDavConfig.username, webDavConfig.password)

}

