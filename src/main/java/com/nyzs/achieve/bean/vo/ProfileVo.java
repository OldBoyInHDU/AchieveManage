package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：简介VO
 * @date ：2022/11/1 8:23
 */
public class ProfileVo {
    private Integer id;
    private String type;
    private String profile;
    private String profileStoragePath;

    public ProfileVo() {
    }

    @Override
    public String toString() {
        return "ProfileVo{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", profile='" + profile + '\'' +
                ", profileStoragePath='" + profileStoragePath + '\'' +
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
}