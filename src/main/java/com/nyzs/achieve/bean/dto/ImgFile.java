package com.nyzs.achieve.bean.dto;

/**
 * @author ：RukiHuang
 * @description：Image DTO
 * @date ：2022/10/25 9:38
 */
public class ImgFile {
    private String url;
    private String alt;
    private String href;

    public ImgFile() {
    }

    public ImgFile(String url, String alt, String href) {
        this.url = url;
        this.alt = alt;
        this.href = href;
    }

    @Override
    public String toString() {
        return "ImgFile{" +
                "url='" + url + '\'' +
                ", alt='" + alt + '\'' +
                ", href='" + href + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
