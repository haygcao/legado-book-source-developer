// Source: /app/src/main/java/io/legado/app/exception/NoBooksDirException.kt
文件名：NoBooksDirException.kt
文件大小：175 字节
================================================================================
文件内容：
package io.legado.app.exception

import io.legado.app.R
import splitties.init.appCtx

class NoBooksDirException: NoStackTraceException(appCtx.getString(R.string.no_books_dir))

