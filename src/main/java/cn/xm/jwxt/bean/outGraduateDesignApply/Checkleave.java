package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Checkleave {
    private Integer checkleaveid;

    private Integer leaveid;

    private String checkpeople;

    private String checkopinion;

    private String teachersign;

    private String result;

    private Date applytime;

    public Integer getCheckleaveid() {
        return checkleaveid;
    }

    public void setCheckleaveid(Integer checkleaveid) {
        this.checkleaveid = checkleaveid;
    }

    public Integer getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(Integer leaveid) {
        this.leaveid = leaveid;
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
}