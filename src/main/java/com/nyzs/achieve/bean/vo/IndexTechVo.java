package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：Index 科技创新VO
 * @date ：2022/11/3 8:29
 */
public class IndexTechVo {
    private Integer id;
    private String project;
    private String content;
    private String type;
    private String statusDate;
//    private String imgName;
//    private String imgStoragePath;

    public IndexTechVo() {
    }

    @Override
    public String toString() {
        return "IndexTechVo{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", statusDate='" + statusDate + '\'' +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }
}
