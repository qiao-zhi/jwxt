package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Outgradesignsurebook {
    private String sureid;

    private String outsideapplyid;

    private String surename;

    private String studentsignurl;

    private Date signtime;

    private String iscommit;

    private String remark;

    public String getSureid() {
        return sureid;
    }

    public void setSureid(String sureid) {
        this.sureid = sureid == null ? null : sureid.trim();
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename == null ? null : surename.trim();
    }

    public String getStudentsignurl() {
        return studentsignurl;
    }

    public void setStudentsignurl(String studentsignurl) {
        this.studentsignurl = studentsignurl == null ? null : studentsignurl.trim();
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getIscommit() {
        return iscommit;
    }

    public void setIscommit(String iscommit) {
        this.iscommit = iscommit == null ? null : iscommit.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}