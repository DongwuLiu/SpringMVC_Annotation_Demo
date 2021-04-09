package com.dongwu.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author liudw
 * @date 2021/4/8 16:36
 * @effect
 */
public class User implements Serializable {
    private String userName;
    private String sex;
    private Integer age;
    private String password;
    private String individualSignature;
    private String personalDescription;
    private List<String> selectionCourse;
    private boolean userAgreement;
    private List<String> hobby;
    private List<String> education;
    private List<Dept> depts;
    private String result;
    private String size;
    private List<Attitude> attitudes;

    public User() {
        super();
    }

    public User(String userName, String sex, Integer age, String password, String individualSignature, String personalDescription, List<String> selectionCourse, boolean userAgreement, List<String> hobby, List<String> education, List<Dept> depts, String result, String size, List<Attitude> attitudes) {
        super();
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.password = password;
        this.individualSignature = individualSignature;
        this.personalDescription = personalDescription;
        this.selectionCourse = selectionCourse;
        this.userAgreement = userAgreement;
        this.hobby = hobby;
        this.education = education;
        this.depts = depts;
        this.result = result;
        this.size = size;
        this.attitudes = attitudes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIndividualSignature() {
        return individualSignature;
    }

    public void setIndividualSignature(String individualSignature) {
        this.individualSignature = individualSignature;
    }

    public String getPersonalDescription() {
        return personalDescription;
    }

    public void setPersonalDescription(String personalDescription) {
        this.personalDescription = personalDescription;
    }

    public List<String> getSelectionCourse() {
        return selectionCourse;
    }

    public void setSelectionCourse(List<String> selectionCourse) {
        this.selectionCourse = selectionCourse;
    }

    public boolean isUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(boolean userAgreement) {
        this.userAgreement = userAgreement;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public List<String> getEducation() {
        return education;
    }

    public void setEducation(List<String> education) {
        this.education = education;
    }

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<Attitude> getAttitudes() {
        return attitudes;
    }

    public void setAttitudes(List<Attitude> attitudes) {
        this.attitudes = attitudes;
    }

    @Override
    public String toString() {
        return "User[userName = " + userName + ", sex = " + sex + ", age = " + age + ", password = " + password + ", individualSignature = " + individualSignature + ", personalDescription = " + personalDescription + "]";
    }
}
