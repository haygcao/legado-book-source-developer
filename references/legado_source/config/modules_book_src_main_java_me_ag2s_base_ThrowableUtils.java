// Source: /modules/book/src/main/java/me/ag2s/base/ThrowableUtils.java
文件名：ThrowableUtils.java
文件大小：350 字节
================================================================================
文件内容：
package me.ag2s.base;

import androidx.annotation.NonNull;

import java.io.IOException;

public class ThrowableUtils {


    public static @NonNull
    IOException rethrowAsIOException(Throwable throwable) throws IOException {
        IOException newException = new IOException(throwable.getMessage(), throwable);
        throw newException;
    }
}

