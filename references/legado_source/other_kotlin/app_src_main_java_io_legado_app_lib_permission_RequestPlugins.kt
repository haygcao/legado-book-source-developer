// Source: /app/src/main/java/io/legado/app/lib/permission/RequestPlugins.kt
文件名：RequestPlugins.kt
文件大小：488 字节
================================================================================
文件内容：
package io.legado.app.lib.permission

internal object RequestPlugins {

    @Volatile
    var sRequestCallback: OnRequestPermissionsResultCallback? = null

    @Volatile
    var sResultCallback: OnPermissionsResultCallback? = null

    fun setOnRequestPermissionsCallback(callback: OnRequestPermissionsResultCallback) {
        sRequestCallback = callback
    }

    fun setOnPermissionsResultCallback(callback: OnPermissionsResultCallback) {
        sResultCallback = callback
    }


}

