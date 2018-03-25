package cn.xm.jwxt.bean.baseInfo;

import java.util.Date;

public class Signinfo {
    private String signId;

    private String signerId;

    private String oriname;

    private String nowname;

    private Date uploaddate;

    private String signtype;

    private String signpassword;

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
    }

    public String getSignerId() {
        return signerId;
    }

    public void setSignerId(String signerId) {
        this.signerId = signerId == null ? null : signerId.trim();
    }

    public String getOriname() {
        return oriname;
    }

    public void setOriname(String oriname) {
        this.oriname = oriname == null ? null : oriname.trim();
    }

    public String getNowname() {
        return nowname;
    }

    public void setNowname(String nowname) {
        this.nowname = nowname == null ? null : nowname.trim();
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getSigntype() {
        return signtype;
    }

    public void setSigntype(String signtype) {
        this.signtype = signtype == null ? null : signtype.trim();
    }

    public String getSignpassword() {
        return signpassword;
    }

    public void setSignpassword(String signpassword) {
        this.signpassword = signpassword == null ? null : signpassword.trim();
    }
}