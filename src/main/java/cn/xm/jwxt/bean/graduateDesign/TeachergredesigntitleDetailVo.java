package cn.xm.jwxt.bean.graduateDesign;
import javax.swing.*;
import java.util.Date;

/**
 * 教师毕业课题题目申请表
 */
public class TeachergredesigntitleDetailVo {

    private Spring teachertitleid;

    private String teacherName;

    private String positionalTitle;//职称

    private String degree;

    private String titlename;

    private String resulttype;

    private String projecttype;

    private String targetrequire;

    private String researchcontent;

    private String titleorigin;

    private String titletype;

    private Short reqirestudentnum;

    private String checkstatus;

    private String checkFirstResult;

    private String checkFirstDesc;

    private String checkSecondResult;

    private String checkSecondDesc;

    private String gdTime;

    private String majorName;
    private String majorID;

    private Date applyTime;

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public Spring getTeachertitleid() {
        return teachertitleid;
    }

    public void setTeachertitleid(Spring teachertitleid) {
        this.teachertitleid = teachertitleid;
    }

    public String getGdTime() {
        return gdTime;
    }

    public void setGdTime(String gdTime) {
        this.gdTime = gdTime;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPositionalTitle() {
        return positionalTitle;
    }

    public void setPositionalTitle(String positionalTitle) {
        this.positionalTitle = positionalTitle;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCheckFirstResult() {
        return checkFirstResult;
    }

    public void setCheckFirstResult(String checkFirstResult) {
        this.checkFirstResult = checkFirstResult;
    }

    public String getCheckFirstDesc() {
        return checkFirstDesc;
    }

    public void setCheckFirstDesc(String checkFirstDesc) {
        this.checkFirstDesc = checkFirstDesc;
    }

    public String getCheckSecondResult() {
        return checkSecondResult;
    }

    public void setCheckSecondResult(String checkSecondResult) {
        this.checkSecondResult = checkSecondResult;
    }

    public String getCheckSecondDesc() {
        return checkSecondDesc;
    }

    public void setCheckSecondDesc(String checkSecondDesc) {
        this.checkSecondDesc = checkSecondDesc;
    }

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename == null ? null : titlename.trim();
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype == null ? null : resulttype.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public String getTargetrequire() {
        return targetrequire;
    }

    public void setTargetrequire(String targetrequire) {
        this.targetrequire = targetrequire == null ? null : targetrequire.trim();
    }

    public String getResearchcontent() {
        return researchcontent;
    }

    public void setResearchcontent(String researchcontent) {
        this.researchcontent = researchcontent == null ? null : researchcontent.trim();
    }

    public String getTitleorigin() {
        return titleorigin;
    }

    public void setTitleorigin(String titleorigin) {
        this.titleorigin = titleorigin == null ? null : titleorigin.trim();
    }

    public String getTitletype() {
        return titletype;
    }

    public void setTitletype(String titletype) {
        this.titletype = titletype == null ? null : titletype.trim();
    }

    public Short getReqirestudentnum() {
        return reqirestudentnum;
    }

    public void setReqirestudentnum(Short reqirestudentnum) {
        this.reqirestudentnum = reqirestudentnum;
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }
}