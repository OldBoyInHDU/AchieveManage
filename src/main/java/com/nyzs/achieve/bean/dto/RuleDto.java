package com.nyzs.achieve.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：制度 DTO
 * @date ：2022/10/31 8:42
 */
public class RuleDto {
    private Integer id;
    private String type;
    private String rule;
    private String ruleStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateDate;

    public RuleDto() {
    }

    @Override
    public String toString() {
        return "RuleDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", rule='" + rule + '\'' +
                ", ruleStoragePath='" + ruleStoragePath + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRuleStoragePath() {
        return ruleStoragePath;
    }

    public void setRuleStoragePath(String ruleStoragePath) {
        this.ruleStoragePath = ruleStoragePath;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
