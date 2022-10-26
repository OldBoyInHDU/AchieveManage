package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/26 8:45
 */
public class TPDto {
    private Integer id;
    private String project;
    private String type;
    private String leader;
    private String member;
    private String status;
    private String startDate;
    private String endDate;
    private String award;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public TPDto() {
    }

    public TPDto(String project, String type, String leader, String member, String status, String startDate, String endDate, String award) {
        this.project = project;
        this.type = type;
        this.leader = leader;
        this.member = member;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.award = award;
    }

    @Override
    public String toString() {
        return "TPDto{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", type='" + type + '\'' +
                ", leader='" + leader + '\'' +
                ", member='" + member + '\'' +
                ", status='" + status + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", award='" + award + '\'' +
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
