// Source: /app/src/main/java/io/legado/app/lib/webdav/WebDavFile.kt
文件名：WebDavFile.kt
文件大小：657 字节
================================================================================
文件内容：
package io.legado.app.lib.webdav

/**
 * webDavFile
 */
@Suppress("unused")
class WebDavFile(
    urlStr: String,
    authorization: Authorization,
    val displayName: String,
    val urlName: String,
    val size: Long,
    val contentType: String,
    val resourceType: String,
    val lastModify: Long
) : WebDav(urlStr, authorization) {

    val isDir by lazy {
        isDir(contentType, resourceType)
    }

    companion object {
        fun isDir(contentType: String, resourceType: String): Boolean {
            return contentType == "httpd/unix-directory"
                    || resourceType.lowercase().contains("collection")
        }
    }

}

