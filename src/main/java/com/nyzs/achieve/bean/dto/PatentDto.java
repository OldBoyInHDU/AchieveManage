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

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String statusDate;

    private String application;
    private String appStoragePath;
    private String techFile;
    private String techFileStoragePath;
    private String cert;
    private String certStoragePath;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public PatentDto() {
    }

    public PatentDto(String patentName, String inventor, String patentType, String project, String status, String statusDate, String application, String appStoragePath, String techFile, String techFileStoragePath, String cert, String certStoragePath) {
        this.patentName = patentName;
        this.inventor = inventor;
        this.patentType = patentType;
        this.project = project;
        this.status = status;
        this.statusDate = statusDate;
        this.application = application;
        this.appStoragePath = appStoragePath;
        this.techFile = techFile;
        this.techFileStoragePath = techFileStoragePath;
        this.cert = cert;
        this.certStoragePath = certStoragePath;
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
                ", statusDate='" + statusDate + '\'' +
                ", application='" + application + '\'' +
                ", appStoragePath='" + appStoragePath + '\'' +
                ", techFile='" + techFile + '\'' +
                ", techFileStoragePath='" + techFileStoragePath + '\'' +
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

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAppStoragePath() {
        return appStoragePath;
    }

    public void setAppStoragePath(String appStoragePath) {
        this.appStoragePath = appStoragePath;
    }

    public String getTechFile() {
        return techFile;
    }

    public void setTechFile(String techFile) {
        this.techFile = techFile;
    }

    public String getTechFileStoragePath() {
        return techFileStoragePath;
    }

    public void setTechFileStoragePath(String techFileStoragePath) {
        this.techFileStoragePath = techFileStoragePath;
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
