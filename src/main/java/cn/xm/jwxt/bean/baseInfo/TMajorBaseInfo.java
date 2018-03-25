package cn.xm.jwxt.bean.baseInfo;

public class TMajorBaseInfo {
    private String majorid;

    private String majornum;

    private String collegeid;

    private String majorname;

    private String majorshortname;

    private String majorsort;

    private String majormanager;

    private String remark1;

    private String remark2;

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid == null ? null : collegeid.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajorshortname() {
        return majorshortname;
    }

    public void setMajorshortname(String majorshortname) {
        this.majorshortname = majorshortname == null ? null : majorshortname.trim();
    }

    public String getMajorsort() {
        return majorsort;
    }

    public void setMajorsort(String majorsort) {
        this.majorsort = majorsort == null ? null : majorsort.trim();
    }

    public String getMajormanager() {
        return majormanager;
    }

    public void setMajormanager(String majormanager) {
        this.majormanager = majormanager == null ? null : majormanager.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}