// Source: /app/src/main/java/io/legado/app/help/glide/progress/OnProgressListener.kt
文件名：OnProgressListener.kt
文件大小：156 字节
================================================================================
文件内容：
package io.legado.app.help.glide.progress

typealias OnProgressListener = (isComplete: Boolean, percentage: Int, bytesRead: Long, totalBytes: Long) -> Unit

