package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：TPVO
 * @date ：2022/10/26 8:48
 */
public class TPVo {
    private String project;
    private String type;
    private String leader;
    private String member;
    private String status;
    private String startDate;
    private String endDate;
    private String award;
    private String uploadList;

    public TPVo() {
    }

    @Override
    public String toString() {
        return "TPVo{" +
                "project='" + project + '\'' +
                ", type='" + type + '\'' +
                ", leader='" + leader + '\'' +
                ", member='" + member + '\'' +
                ", status='" + status + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
