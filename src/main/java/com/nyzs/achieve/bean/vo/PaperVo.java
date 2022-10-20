package com.nyzs.achieve.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/17 9:47
 */
public class PaperVo {
//    private Integer id;
    private String paperName;
    private String author;
    private String journal;
    private String project;
    private String statusDate;
    private String status;

    private String approval;
    private String approvalStoragePath;
    private String paperEng;
    private String paperEngStoragePath;
    private String paperChn;
    private String paperChnStoragePath;
    private String scanFile;
    private String scanFileStoragePath;
    private String searchProof;
    private String searchProofStoragePath;

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
//    private Date updateDate;


    public PaperVo() {
    }

    public PaperVo(String paperName, String author, String journal, String project, String statusDate, String status, String approval, String approvalStoragePath, String paperEng, String paperEngStoragePath, String paperChn, String paperChnStoragePath, String scanFile, String scanFileStoragePath, String searchProof, String searchProofStoragePath) {
        this.paperName = paperName;
        this.author = author;
        this.journal = journal;
        this.project = project;
        this.statusDate = statusDate;
        this.status = status;
        this.approval = approval;
        this.approvalStoragePath = approvalStoragePath;
        this.paperEng = paperEng;
        this.paperEngStoragePath = paperEngStoragePath;
        this.paperChn = paperChn;
        this.paperChnStoragePath = paperChnStoragePath;
        this.scanFile = scanFile;
        this.scanFileStoragePath = scanFileStoragePath;
        this.searchProof = searchProof;
        this.searchProofStoragePath = searchProofStoragePath;
    }

    @Override
    public String toString() {
        return "PaperVo{" +
                "paperName='" + paperName + '\'' +
                ", author='" + author + '\'' +
                ", journal='" + journal + '\'' +
                ", project='" + project + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", status='" + status + '\'' +
                ", approval='" + approval + '\'' +
                ", approvalStoragePath='" + approvalStoragePath + '\'' +
                ", paperEng='" + paperEng + '\'' +
                ", paperEngStoragePath='" + paperEngStoragePath + '\'' +
                ", paperChn='" + paperChn + '\'' +
                ", paperChnStoragePath='" + paperChnStoragePath + '\'' +
                ", scanFile='" + scanFile + '\'' +
                ", scanFileStoragePath='" + scanFileStoragePath + '\'' +
                ", searchProof='" + searchProof + '\'' +
                ", searchProofStoragePath='" + searchProofStoragePath + '\'' +
                '}';
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getjournal() {
        return journal;
    }

    public void setjournal(String journal) {
        this.journal = journal;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getApprovalStoragePath() {
        return approvalStoragePath;
    }

    public void setApprovalStoragePath(String approvalStoragePath) {
        this.approvalStoragePath = approvalStoragePath;
    }

    public String getPaperEng() {
        return paperEng;
    }

    public void setPaperEng(String paperEng) {
        this.paperEng = paperEng;
    }

    public String getPaperEngStoragePath() {
        return paperEngStoragePath;
    }

    public void setPaperEngStoragePath(String paperEngStoragePath) {
        this.paperEngStoragePath = paperEngStoragePath;
    }

    public String getPaperChn() {
        return paperChn;
    }

    public void setPaperChn(String paperChn) {
        this.paperChn = paperChn;
    }

    public String getPaperChnStoragePath() {
        return paperChnStoragePath;
    }

    public void setPaperChnStoragePath(String paperChnStoragePath) {
        this.paperChnStoragePath = paperChnStoragePath;
    }

    public String getScanFile() {
        return scanFile;
    }

    public void setScanFile(String scanFile) {
        this.scanFile = scanFile;
    }

    public String getScanFileStoragePath() {
        return scanFileStoragePath;
    }

    public void setScanFileStoragePath(String scanFileStoragePath) {
        this.scanFileStoragePath = scanFileStoragePath;
    }

    public String getSearchProof() {
        return searchProof;
    }

    public void setSearchProof(String searchProof) {
        this.searchProof = searchProof;
    }

    public String getSearchProofStoragePath() {
        return searchProofStoragePath;
    }

    public void setSearchProofStoragePath(String searchProofStoragePath) {
        this.searchProofStoragePath = searchProofStoragePath;
    }

//    public Date getUpdateDate() {
//        return updateDate;
//    }
//
//    public void setUpdateDate(Date updateDate) {
//        this.updateDate = updateDate;
//    }
}
