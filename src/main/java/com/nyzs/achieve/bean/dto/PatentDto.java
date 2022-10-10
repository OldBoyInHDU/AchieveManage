package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：专利dto
 * @date ：2022/10/9 13:51
 */
public class PatentDto {
    private Integer id;
    private String patentName;
    private String inventor;
    private String patentType;
    private String project;
    private String status;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date statusDate;
    private String application;
    private String techFile;
    private String cert;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public PatentDto() {
    }

    public PatentDto(String patentName, String inventor, String patentType, String project, String status, Date statusDate, String application, String techFile, String cert) {
        this.patentName = patentName;
        this.inventor = inventor;
        this.patentType = patentType;
        this.project = project;
        this.status = status;
        this.statusDate = statusDate;
        this.application = application;
        this.techFile = techFile;
        this.cert = cert;
    }

    @Override
    public String toString() {
        return "PatentDto{" +
                "id=" + id +
                ", patentName='" + patentName + '\'' +
                ", inventor='" + inventor + '\'' +
                ", patentType='" + patentType + '\'' +
                ", project='" + project + '\'' +
                ", status='" + status + '\'' +
                ", statusDate=" + statusDate +
                ", application='" + application + '\'' +
                ", techFile='" + techFile + '\'' +
                ", cert='" + cert + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTechFile() {
        return techFile;
    }

    public void setTechFile(String techFile) {
        this.techFile = techFile;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
