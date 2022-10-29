package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：合作交流 vo
 * @date ：2022/10/29 8:33
 */
public class CooperationVo {
    private Integer id;
    private String title;
    private String type;
    private String author;
    private String statusDate;
    private String content;

    public CooperationVo() {
    }

    @Override
    public String toString() {
        return "TrainingVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
