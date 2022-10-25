package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：SkillInno VO
 * @date ：2022/10/22 9:48
 */
public class SIVo {
    private String project;
    private String type;
    private String leader;
    private String member;
    private String status;
    private String statusDate;
    private String award;
    private String uploadList;

    public SIVo() {
    }

    @Override
    public String toString() {
        return "QIVo{" +
                "project='" + project + '\'' +
                ", type='" + type + '\'' +
                ", leader='" + leader + '\'' +
                ", member='" + member + '\'' +
                ", status='" + status + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", award='" + award + '\'' +
                ", uploadList='" + uploadList + '\'' +
                '}';
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getUploadList() {
        return uploadList;
    }

    public void setUploadList(String uploadList) {
        this.uploadList = uploadList;
    }
}
