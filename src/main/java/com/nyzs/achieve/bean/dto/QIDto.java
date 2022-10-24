package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/22 9:35
 */
public class QIDto {
    private Integer id;
    private String project;
    private String sort;
    private String type;
    private String leader;
    private String member;
    private String status;
    private String statusDate;
    private String award;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public QIDto() {
    }

    public QIDto(String project, String sort, String type, String leader, String member, String status, String statusDate, String award) {
        this.project = project;
        this.sort = sort;
        this.type = type;
        this.leader = leader;
        this.member = member;
        this.status = status;
        this.statusDate = statusDate;
        this.award = award;
    }

    @Override
    public String toString() {
        return "QIDto{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", sort='" + sort + '\'' +
                ", type='" + type + '\'' +
                ", leader='" + leader + '\'' +
                ", member='" + member + '\'' +
                ", status='" + status + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", award='" + award + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
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

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
