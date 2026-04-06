// Source: /app/src/main/java/io/legado/app/lib/permission/OnPermissionsResultCallback.kt
文件名：OnPermissionsResultCallback.kt
文件大小：207 字节
================================================================================
文件内容：
package io.legado.app.lib.permission

interface OnPermissionsResultCallback {

    fun onPermissionsGranted()

    fun onPermissionsDenied(deniedPermissions: Array<String>?)

    fun onError(e: Exception)

}

