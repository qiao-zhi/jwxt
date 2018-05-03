package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Projectcheck {
    private String checkId;

    private String outgradesignapplyid;

    private String checkpeople;

    private String checkopinion;

    private String teachersign;

    private String checkresult;

    private Date applytime;

    private String remark;

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    public String getOutgradesignapplyid() {
        return outgradesignapplyid;
    }

    public void setOutgradesignapplyid(String outgradesignapplyid) {
        this.outgradesignapplyid = outgradesignapplyid == null ? null : outgradesignapplyid.trim();
    }

    public String getCheckpeople() {
        return checkpeople;
    }

    public void setCheckpeople(String checkpeople) {
        this.checkpeople = checkpeople == null ? null : checkpeople.trim();
    }

    public String getCheckopinion() {
        return checkopinion;
    }

    public void setCheckopinion(String checkopinion) {
        this.checkopinion = checkopinion == null ? null : checkopinion.trim();
    }

    public String getTeachersign() {
        return teachersign;
    }

    public void setTeachersign(String teachersign) {
        this.teachersign = teachersign == null ? null : teachersign.trim();
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}