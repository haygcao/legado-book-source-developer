// Source: /app/src/main/java/io/legado/app/lib/permission/OnRequestPermissionsResultCallback.kt
文件名：OnRequestPermissionsResultCallback.kt
文件大小：241 字节
================================================================================
文件内容：
package io.legado.app.lib.permission

interface OnRequestPermissionsResultCallback {

    fun onRequestPermissionsResult(permissions: Array<String>, grantResults: IntArray)

    fun onSettingActivityResult()

    fun onError(e: Exception)
}

