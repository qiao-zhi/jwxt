package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

public class Plearesultsigninfo {
    private Integer plearesultsignid;

    private String signid;

    private Integer plearesultid;

    private Date plearesultsigntime;

    private String plearesultsigntype;

    private String remark;

    public Integer getPlearesultsignid() {
        return plearesultsignid;
    }

    public void setPlearesultsignid(Integer plearesultsignid) {
        this.plearesultsignid = plearesultsignid;
    }

    public String getSignid() {
        return signid;
    }

    public void setSignid(String signid) {
        this.signid = signid == null ? null : signid.trim();
    }

    public Integer getPlearesultid() {
        return plearesultid;
    }

    public void setPlearesultid(Integer plearesultid) {
        this.plearesultid = plearesultid;
    }

    public Date getPlearesultsigntime() {
        return plearesultsigntime;
    }

    public void setPlearesultsigntime(Date plearesultsigntime) {
        this.plearesultsigntime = plearesultsigntime;
    }

    public String getPlearesultsigntype() {
        return plearesultsigntype;
    }

    public void setPlearesultsigntype(String plearesultsigntype) {
        this.plearesultsigntype = plearesultsigntype == null ? null : plearesultsigntype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}