package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：Index 科技创新VO
 * @date ：2022/11/3 8:29
 */
public class IndexTechVo {
    private Integer id;
    private String project;
    private String content;
    private String imgName;
    private String imgStoragePath;

    public IndexTechVo() {
    }

    @Override
    public String toString() {
        return "IndexTechVo{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", content='" + content + '\'' +
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
