package cn.xm.jwxt.bean.graduateDesign;
import java.util.Date;

/**
 * 教师毕业课题题目申请表
 */
public class ChooseProjectVo {

    private String teacherName;

    private String teacherTitleID;

    private String titlename;

    private String projecttype;

    private String titleorigin;

    private Short reqirestudentnum;

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

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype;
    }

    public String getTitleorigin() {
        return titleorigin;
    }

    public void setTitleorigin(String titleorigin) {
        this.titleorigin = titleorigin;
    }

    public Short getReqirestudentnum() {
        return reqirestudentnum;
    }

    public void setReqirestudentnum(Short reqirestudentnum) {
        this.reqirestudentnum = reqirestudentnum;
    }
}