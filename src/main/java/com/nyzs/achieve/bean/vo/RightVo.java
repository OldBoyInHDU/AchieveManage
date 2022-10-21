package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：Right VO
 * @date ：2022/10/20 14:32
 */
public class RightVo {
    private Integer id;
    private String rightName;
    private String author;
    private String project;
    private String statusDate;
    private String status;

    private String application;
    private String appStoragePath;
    private String manual;
    private String manualStoragePath;
    private String codes;
    private String codesStoragePath;
    private String scanFile;
    private String scanFileStoragePath;

    public RightVo() {
    }

    public RightVo(Integer id, String rightName, String author, String project, String statusDate, String status, String application, String appStoragePath, String manual, String manualStoragePath, String codes, String codesStoragePath, String scanFile, String scanFileStoragePath) {
        this.id = id;
        this.rightName = rightName;
        this.author = author;
        this.project = project;
        this.statusDate = statusDate;
        this.status = status;
        this.application = application;
        this.appStoragePath = appStoragePath;
        this.manual = manual;
        this.manualStoragePath = manualStoragePath;
        this.codes = codes;
        this.codesStoragePath = codesStoragePath;
        this.scanFile = scanFile;
        this.scanFileStoragePath = scanFileStoragePath;
    }

    @Override
    public String toString() {
        return "RightVo{" +
                "id=" + id +
                ", rightName='" + rightName + '\'' +
                ", author='" + author + '\'' +
                ", project='" + project + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", status='" + status + '\'' +
                ", application='" + application + '\'' +
                ", appStoragePath='" + appStoragePath + '\'' +
                ", manual='" + manual + '\'' +
                ", manualStoragePath='" + manualStoragePath + '\'' +
                ", codes='" + codes + '\'' +
                ", codesStoragePath='" + codesStoragePath + '\'' +
                ", scanFile='" + scanFile + '\'' +
                ", scanFileStoragePath='" + scanFileStoragePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getManualStoragePath() {
        return manualStoragePath;
    }

    public void setManualStoragePath(String manualStoragePath) {
        this.manualStoragePath = manualStoragePath;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getCodesStoragePath() {
        return codesStoragePath;
    }

    public void setCodesStoragePath(String codesStoragePath) {
        this.codesStoragePath = codesStoragePath;
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
}
