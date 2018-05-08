package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Outsidegradesignagreemen {
    private String agreementid;

    private String outsideapplyid;

    private String agreementname;

    private String collegename;

    private String studentidcard;

    private String schoolsign;

    private Date schoolsigndate;

    private String studentsign;

    private Date studentsigndate;

    private String applystatus;

    private String remark;

    private Outgradesigninfo oGDInfo;

    public Outgradesigninfo getoGDInfo() {
        return oGDInfo;
    }

    public void setoGDInfo(Outgradesigninfo oGDInfo) {
        this.oGDInfo = oGDInfo;
    }

    public String getAgreementid() {
        return agreementid;
    }

    public void setAgreementid(String agreementid) {
        this.agreementid = agreementid == null ? null : agreementid.trim();
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getAgreementname() {
        return agreementname;
    }

    public void setAgreementname(String agreementname) {
        this.agreementname = agreementname == null ? null : agreementname.trim();
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }

    public String getStudentidcard() {
        return studentidcard;
    }

    public void setStudentidcard(String studentidcard) {
        this.studentidcard = studentidcard == null ? null : studentidcard.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}