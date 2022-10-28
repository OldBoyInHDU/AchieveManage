package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/28 8:17
 */
public class AwardVo {
    private Integer id;
    private String type;
    private String level;
    private String sort;
    private String awardee;
    private String award;
    private String statusDate;
    private String cert;
    private String certStoragePath;

    public AwardVo() {
    }

    @Override
    public String toString() {
        return "AwardVo{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", sort='" + sort + '\'' +
                ", awardee='" + awardee + '\'' +
                ", award='" + award + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", cert='" + cert + '\'' +
                ", certStoragePath='" + certStoragePath + '\'' +
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
}
