package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Outsidegradesignagreemen {
    private Integer agreementid;

    private String outsideapplyid;

    private String schoolsign;

    private Date schoolsigndate;

    private String studentsign;

    private Date studentsigndate;

    private String applystatus;

    public Integer getAgreementid() {
        return agreementid;
    }

    public void setAgreementid(Integer agreementid) {
        this.agreementid = agreementid;
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getSchoolsign() {
        return schoolsign;
    }

    public void setSchoolsign(String schoolsign) {
        this.schoolsign = schoolsign == null ? null : schoolsign.trim();
    }

    public Date getSchoolsigndate() {
        return schoolsigndate;
    }

    public void setSchoolsigndate(Date schoolsigndate) {
        this.schoolsigndate = schoolsigndate;
    }

    public String getStudentsign() {
        return studentsign;
    }

    public void setStudentsign(String studentsign) {
        this.studentsign = studentsign == null ? null : studentsign.trim();
    }

    public Date getStudentsigndate() {
        return studentsigndate;
    }

    public void setStudentsigndate(Date studentsigndate) {
        this.studentsigndate = studentsigndate;
    }

    public String getApplystatus() {
        return applystatus;
    }

    public void setApplystatus(String applystatus) {
        this.applystatus = applystatus == null ? null : applystatus.trim();
    }
}