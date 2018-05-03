package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Checkoutgradesigninfo {
    private String checkoutapplyid;

    private String outsideapplyid;

    private String checkpeople;

    private String checkadvice;

    private String teachersign;

    private String result;

    private Date applytime;

    private String remark;

    public String getCheckoutapplyid() {
        return checkoutapplyid;
    }

    public void setCheckoutapplyid(String checkoutapplyid) {
        this.checkoutapplyid = checkoutapplyid == null ? null : checkoutapplyid.trim();
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getCheckpeople() {
        return checkpeople;
    }

    public void setCheckpeople(String checkpeople) {
        this.checkpeople = checkpeople == null ? null : checkpeople.trim();
    }

    public String getCheckadvice() {
        return checkadvice;
    }

    public void setCheckadvice(String checkadvice) {
        this.checkadvice = checkadvice == null ? null : checkadvice.trim();
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