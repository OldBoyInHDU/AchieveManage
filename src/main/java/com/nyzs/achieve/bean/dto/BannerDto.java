package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：轮播图 DTO
 * @date ：2022/11/2 10:17
 */
public class BannerDto {
    private Integer id;
    private String imgName;
    private String imgStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public BannerDto() {
    }

    @Override
    public String toString() {
        return "BannerDto{" +
                "id=" + id +
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
