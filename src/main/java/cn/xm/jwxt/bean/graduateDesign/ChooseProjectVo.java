package cn.xm.jwxt.bean.graduateDesign;
import java.util.Date;

/**
 * 教师毕业课题题目申请表
 */
public class ChooseProjectVo {

    private String teacherName;

    private String teacherTitleID;

    private String titlename;

    private String projectType;

    private String titleOrigin;

    private Short reqireStudentNum;

    private String isSubmit;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherTitleID() {
        return teacherTitleID;
    }

    public void setTeacherTitleID(String teacherTitleID) {
        this.teacherTitleID = teacherTitleID;
    }

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getTitleOrigin() {
        return titleOrigin;
    }

    public void setTitleOrigin(String titleOrigin) {
        this.titleOrigin = titleOrigin;
    }

    public Short getReqireStudentNum() {
        return reqireStudentNum;
    }

    public void setReqireStudentNum(Short reqireStudentNum) {
        this.reqireStudentNum = reqireStudentNum;
    }

    public String getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(String isSubmit) {
        this.isSubmit = isSubmit;
    }
}