package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：奖励荣誉 DTO
 * @date ：2022/10/28 8:16
 */
public class AwardDto {
    private Integer id;
    private String type;
    private String level;
    private String sort;
    private String awardee;
    private String award;
    private String statusDate;
    private String cert;
    private String certStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public AwardDto() {
    }

    public AwardDto(Integer id, String type, String level, String sort, String awardee, String award, String statusDate, String cert, String certStoragePath) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.sort = sort;
        this.awardee = awardee;
        this.award = award;
        this.statusDate = statusDate;
        this.cert = cert;
        this.certStoragePath = certStoragePath;
    }

    @Override
    public String toString() {
        return "AwardDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", sort='" + sort + '\'' +
                ", awardee='" + awardee + '\'' +
                ", award='" + award + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", cert='" + cert + '\'' +
                ", certStoragePath='" + certStoragePath + '\'' +
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAwardee() {
        return awardee;
    }

    public void setAwardee(String awardee) {
        this.awardee = awardee;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getCertStoragePath() {
        return certStoragePath;
    }

    public void setCertStoragePath(String certStoragePath) {
        this.certStoragePath = certStoragePath;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
