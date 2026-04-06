// Source: /modules/book/src/main/java/me/ag2s/epublib/domain/LazyResourceProvider.java
文件名：LazyResourceProvider.java
文件大小：224 字节
================================================================================
文件内容：
package me.ag2s.epublib.domain;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jake
 */
public interface LazyResourceProvider {

    InputStream getResourceStream(String href) throws IOException;
}

