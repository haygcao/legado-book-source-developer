// Source: /modules/book/src/main/java/me/ag2s/epublib/epub/BookProcessor.java
文件名：BookProcessor.java
文件大小：412 字节
================================================================================
文件内容：
package me.ag2s.epublib.epub;

import me.ag2s.epublib.domain.EpubBook;

/**
 * Post-processes a book.
 * <p>
 * Can be used to clean up a book after reading or before writing.
 *
 * @author paul
 */
public interface BookProcessor {

    /**
     * A BookProcessor that returns the input book unchanged.
     */
    BookProcessor IDENTITY_BOOKPROCESSOR = book -> book;

    EpubBook processBook(EpubBook book);
}

