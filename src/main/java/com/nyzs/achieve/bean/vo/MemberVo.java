package com.nyzs.achieve.bean.vo;

/**
 * @author ：RukiHuang
 * @description：成员VO
 * @date ：2022/10/31 14:08
 */
public class MemberVo {
    private Integer id;
    private String name;
    private String type;
    private String gender;
    private String birthday;
    private String academic;
    private String degree;
    private String skillName1;
    private String skillLevel1;
    private String skillName2;
    private String skillLevel2;
    private String techName;
    private String techLevel;

    public MemberVo() {
    }

    @Override
    public String toString() {
        return "MemberVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", academic='" + academic + '\'' +
                ", degree='" + degree + '\'' +
                ", skillName1='" + skillName1 + '\'' +
                ", skillLevel1='" + skillLevel1 + '\'' +
                ", skillName2='" + skillName2 + '\'' +
                ", skillLevel2='" + skillLevel2 + '\'' +
                ", techName='" + techName + '\'' +
                ", techLevel='" + techLevel + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSkillName1() {
        return skillName1;
    }

    public void setSkillName1(String skillName1) {
        this.skillName1 = skillName1;
    }

    public String getSkillLevel1() {
        return skillLevel1;
    }

    public void setSkillLevel1(String skillLevel1) {
        this.skillLevel1 = skillLevel1;
    }

    public String getSkillName2() {
        return skillName2;
    }

    public void setSkillName2(String skillName2) {
        this.skillName2 = skillName2;
    }

    public String getSkillLevel2() {
        return skillLevel2;
    }

    public void setSkillLevel2(String skillLevel2) {
        this.skillLevel2 = skillLevel2;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(String techLevel) {
        this.techLevel = techLevel;
    }
}
