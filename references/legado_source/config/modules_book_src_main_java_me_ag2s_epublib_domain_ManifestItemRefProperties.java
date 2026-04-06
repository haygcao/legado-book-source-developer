// Source: /modules/book/src/main/java/me/ag2s/epublib/domain/ManifestItemRefProperties.java
文件名：ManifestItemRefProperties.java
文件大小：387 字节
================================================================================
文件内容：
package me.ag2s.epublib.domain;

@SuppressWarnings("unused")
public enum ManifestItemRefProperties implements ManifestProperties {
    PAGE_SPREAD_LEFT("page-spread-left"),
    PAGE_SPREAD_RIGHT("page-spread-right");

    private final String name;

    ManifestItemRefProperties(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

