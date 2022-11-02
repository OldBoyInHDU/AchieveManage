package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：首页-奖励荣誉
 * @date ：2022/11/2 13:31
 */
public class IndexAwardDto {
    private Integer id;
    private String project;
    private String awardee;
    private String statusDate;
    private String award;
    private String imgName;
    private String imgStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public IndexAwardDto() {
    }

    @Override
    public String toString() {
        return "IndexAwardDto{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", awardee='" + awardee + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", award='" + award + '\'' +
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

    public String getAwardee() {
        return awardee;
    }

    public void setAwardee(String awardee) {
        this.awardee = awardee;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
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
