package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;
/**
 * 教师毕业课题题目申请表
 */
public class Teachergredesigntitle {
    private String teachertitleid;

    private String gradesignid;

    private String teacherid;

    private String titlename;

    private String resulttype;

    private String projecttype;

    private String targetrequire;

    private String researchcontent;

    private String titleorigin;

    private String titletype;

    private Short reqirestudentnum;

    private String checkstatus;

    private Date gdTime;

    private String majorID;

    private Date applyTime;

    private String syear;

    public String getSyear() {
        return syear;
    }

    public void setSyear(String syear) {
        this.syear = syear;
    }

    public Date getGdTime() {
        return gdTime;
    }

    public void setGdTime(Date gdTime) {
        this.gdTime = gdTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public String getTeachertitleid() {
        return teachertitleid;
    }

    public void setTeachertitleid(String teachertitleid) {
        this.teachertitleid = teachertitleid == null ? null : teachertitleid.trim();
    }

    public String getGradesignid() {
        return gradesignid;
    }

    public void setGradesignid(String gradesignid) {
        this.gradesignid = gradesignid == null ? null : gradesignid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
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