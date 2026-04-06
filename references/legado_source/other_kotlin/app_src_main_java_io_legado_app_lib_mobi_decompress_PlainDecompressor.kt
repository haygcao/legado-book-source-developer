// Source: /app/src/main/java/io/legado/app/lib/mobi/decompress/PlainDecompressor.kt
文件名：PlainDecompressor.kt
文件大小：172 字节
================================================================================
文件内容：
package io.legado.app.lib.mobi.decompress

class PlainDecompressor : Decompressor {

    override fun decompress(data: ByteArray): ByteArray {
        return data
    }

}

