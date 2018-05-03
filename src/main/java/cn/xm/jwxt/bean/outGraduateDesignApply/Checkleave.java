package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Checkleave {
    private String checkleaveid;

    private String leaveid;

    private String checkpeople;

    private String checkopinion;

    private String teachersign;

    private String result;

    private Date applytime;

    private String remark;

    public String getCheckleaveid() {
        return checkleaveid;
    }

    public void setCheckleaveid(String checkleaveid) {
        this.checkleaveid = checkleaveid == null ? null : checkleaveid.trim();
    }

    public String getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(String leaveid) {
        this.leaveid = leaveid == null ? null : leaveid.trim();
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
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