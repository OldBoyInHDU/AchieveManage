package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：合作交流VO
 * @date ：2022/11/3 9:17
 */
public class IndexCoopeVo {
    private Integer id;
    private String title;
    private String content;
    private String statusDate;
    private String imgName;
    private String imgStoragePath;

    public IndexCoopeVo() {
    }

    @Override
    public String toString() {
        return "IndexCoopeVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", imgName='" + imgName + '\'' +
                ", imgStoragePath='" + imgStoragePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgStoragePath() {
        return imgStoragePath;
    }

    public void setImgStoragePath(String imgStoragePath) {
        this.imgStoragePath = imgStoragePath;
    }
}
