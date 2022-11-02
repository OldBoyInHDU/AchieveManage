package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：首页-奖励荣誉
 * @date ：2022/11/2 13:34
 */
public class IndexAwardVo {
    private Integer id;
    private String project;
    private String awardee;
    private String statusDate;
    private String award;
    private String imgName;
    private String imgStoragePath;

    public IndexAwardVo() {
    }

    @Override
    public String toString() {
        return "IndexAwardVo{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", awardee='" + awardee + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", award='" + award + '\'' +
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
}
