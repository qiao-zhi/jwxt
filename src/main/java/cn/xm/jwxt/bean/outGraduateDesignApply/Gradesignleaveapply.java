package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Gradesignleaveapply {
    private String leaveid;

    private String outsideapplyid;

    private String studentname;

    private String studentnum;

    private String major;

    private Date startdate;

    private Date enddate;

    private Integer leavedays;

    private String leaveaddress;

    private String studenttel;

    private String homeaddress;

    private String hometel;

    private String leavereason;

    private String checkstatus;

    private String isok;

    private String iscancel;

    public String getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(String leaveid) {
        this.leaveid = leaveid == null ? null : leaveid.trim();
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum == null ? null : studentnum.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getLeavedays() {
        return leavedays;
    }

    public void setLeavedays(Integer leavedays) {
        this.leavedays = leavedays;
    }

    public String getLeaveaddress() {
        return leaveaddress;
    }

    public void setLeaveaddress(String leaveaddress) {
        this.leaveaddress = leaveaddress == null ? null : leaveaddress.trim();
    }

    public String getStudenttel() {
        return studenttel;
    }

    public void setStudenttel(String studenttel) {
        this.studenttel = studenttel == null ? null : studenttel.trim();
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getHometel() {
        return hometel;
    }

    public void setHometel(String hometel) {
        this.hometel = hometel == null ? null : hometel.trim();
    }

    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason == null ? null : leavereason.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    public String getIscancel() {
        return iscancel;
    }

    public void setIscancel(String iscancel) {
        this.iscancel = iscancel == null ? null : iscancel.trim();
    }
}