// Source: /modules/book/src/main/java/me/ag2s/epublib/domain/ManifestItemProperties.java
文件名：ManifestItemProperties.java
文件大小：471 字节
================================================================================
文件内容：
package me.ag2s.epublib.domain;

@SuppressWarnings("unused")
public enum ManifestItemProperties implements ManifestProperties {
    COVER_IMAGE("cover-image"),
    MATHML("mathml"),
    NAV("nav"),
    REMOTE_RESOURCES("remote-resources"),
    SCRIPTED("scripted"),
    SVG("svg"),
    SWITCH("switch");

    private final String name;

    ManifestItemProperties(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

