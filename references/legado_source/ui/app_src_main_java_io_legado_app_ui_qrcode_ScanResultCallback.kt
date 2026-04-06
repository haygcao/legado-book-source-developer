// Source: /app/src/main/java/io/legado/app/ui/qrcode/ScanResultCallback.kt
文件名：ScanResultCallback.kt
文件大小：145 字节
================================================================================
文件内容：
package io.legado.app.ui.qrcode

import com.google.zxing.Result

interface ScanResultCallback {

    fun onScanResultCallback(result: Result?)

}

