// Source: /app/src/main/java/io/legado/app/help/crypto/Sign.kt
文件名：Sign.kt
文件大小：678 字节
================================================================================
文件内容：
package io.legado.app.help.crypto

import androidx.annotation.Keep
import cn.hutool.crypto.KeyUtil
import cn.hutool.crypto.asymmetric.Sign as HutoolSign

@Keep
@Suppress("unused")
class Sign(algorithm: String): HutoolSign(algorithm) {

    fun setPrivateKey(key: ByteArray): Sign {
        setPrivateKey(KeyUtil.generatePrivateKey(algorithm, key))
        return this
    }

    fun setPrivateKey(key: String): Sign = setPrivateKey(key.encodeToByteArray())

    fun setPublicKey(key: ByteArray): Sign {
        setPublicKey(KeyUtil.generatePublicKey(algorithm, key))
        return this
    }

    fun setPublicKey(key: String): Sign = setPublicKey(key.encodeToByteArray())

}


