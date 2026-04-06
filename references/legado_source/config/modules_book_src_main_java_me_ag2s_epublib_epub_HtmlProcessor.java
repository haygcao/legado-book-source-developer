// Source: /modules/book/src/main/java/me/ag2s/epublib/epub/HtmlProcessor.java
文件名：HtmlProcessor.java
文件大小：233 字节
================================================================================
文件内容：
package me.ag2s.epublib.epub;

import java.io.OutputStream;

import me.ag2s.epublib.domain.Resource;

@SuppressWarnings("unused")
public interface HtmlProcessor {

    void processHtmlResource(Resource resource, OutputStream out);
}

