package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 教师毕设课题审核表
 */
public class TeachertitleFirstcheckinfo {
    /**教师课题审核ID*/
    private String checkID;
    /**教师题目ID*/
    private String teacherTitleID;
    /**审核时间*/
    private Date checkTime;
    /**审核人*/
    private String checkPerson;
    /**审核结果*/
    private String checkResult;
    /**描述*/
    private String checkDesc;

    public String getTeacherTitleID() {
        return teacherTitleID;
    }

    public void setTeacherTitleID(String teacherTitleID) {
        this.teacherTitleID = teacherTitleID;
    }

    public String getCheckID() {
        return checkID;
    }

    public void setCheckID(String checkID) {
        this.checkID = checkID;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc;
    }
}