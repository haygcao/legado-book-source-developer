// Source: /modules/book/src/main/java/me/ag2s/epublib/browsersupport/NavigationEventListener.java
文件名：NavigationEventListener.java
文件大小：411 字节
================================================================================
文件内容：
package me.ag2s.epublib.browsersupport;

/**
 * Implemented by classes that want to be notified if the user moves to
 * another location in the book.
 *
 * @author paul
 */
public interface NavigationEventListener {

    /**
     * Called whenever the user navigates to another position in the book.
     *
     * @param navigationEvent f
     */
    void navigationPerformed(NavigationEvent navigationEvent);
}

