package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：简介DTO
 * @date ：2022/11/1 8:23
 */
public class ProfileDto {
    private Integer id;
    private String type;
    private String profile;
    private String profileStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public ProfileDto() {
    }

    @Override
    public String toString() {
        return "ProfileDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", profile='" + profile + '\'' +
                ", profileStoragePath='" + profileStoragePath + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfileStoragePath() {
        return profileStoragePath;
    }

    public void setProfileStoragePath(String profileStoragePath) {
        this.profileStoragePath = profileStoragePath;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
