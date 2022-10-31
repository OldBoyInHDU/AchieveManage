package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/31 8:47
 */
public class RuleVo {
    private Integer id;
    private String type;
    private String rule;
    private String ruleStoragePath;

    public RuleVo() {
    }

    @Override
    public String toString() {
        return "RuleVo{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", rule='" + rule + '\'' +
                ", ruleStoragePath='" + ruleStoragePath + '\'' +
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
}
