package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

public class TeachertitleFirstCheckVo {

    /**课题名称*/
    private String titlename;
    /** 教师名称 */
    private String teacherName;
    /**审核时间*/
    private Date checkTime;
    /**审核人*/
    private String checkPerson;
    /**审核结果*/
    private String checkResult;
    /**描述*/
    private String checkDesc;

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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
