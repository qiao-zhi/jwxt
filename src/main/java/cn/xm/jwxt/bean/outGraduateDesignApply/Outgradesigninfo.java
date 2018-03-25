package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Outgradesigninfo {
    private String outsideapplyid;

    private String studenttitleresultid;

    private String studentname;

    private String sex;

    private String majorclass;

    private String inteachername;

    private String receiveunit;

    private String applyreason;

    private Date applydate;

    private String stusignurl;

    private String status;

    private String iscommit;

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getStudenttitleresultid() {
        return studenttitleresultid;
    }

    public void setStudenttitleresultid(String studenttitleresultid) {
        this.studenttitleresultid = studenttitleresultid == null ? null : studenttitleresultid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMajorclass() {
        return majorclass;
    }

    public void setMajorclass(String majorclass) {
        this.majorclass = majorclass == null ? null : majorclass.trim();
    }

    public String getInteachername() {
        return inteachername;
    }

    public void setInteachername(String inteachername) {
        this.inteachername = inteachername == null ? null : inteachername.trim();
    }

    public String getReceiveunit() {
        return receiveunit;
    }

    public void setReceiveunit(String receiveunit) {
        this.receiveunit = receiveunit == null ? null : receiveunit.trim();
    }

    public String getApplyreason() {
        return applyreason;
    }

    public void setApplyreason(String applyreason) {
        this.applyreason = applyreason == null ? null : applyreason.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getStusignurl() {
        return stusignurl;
    }

    public void setStusignurl(String stusignurl) {
        this.stusignurl = stusignurl == null ? null : stusignurl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIscommit() {
        return iscommit;
    }

    public void setIscommit(String iscommit) {
        this.iscommit = iscommit == null ? null : iscommit.trim();
    }
}