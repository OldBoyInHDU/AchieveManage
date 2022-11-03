package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：Index 科技创新DTO
 * @date ：2022/11/3 8:28
 */
public class IndexTechDto {
    private Integer id;
    private String project;
    private String content;
    private String imgName;
    private String imgStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public IndexTechDto() {
    }

    @Override
    public String toString() {
        return "IndexTechDto{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", content='" + content + '\'' +
                ", imgName='" + imgName + '\'' +
                ", imgStoragePath='" + imgStoragePath + '\'' +
                ", updateDate=" + updateDate +
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
