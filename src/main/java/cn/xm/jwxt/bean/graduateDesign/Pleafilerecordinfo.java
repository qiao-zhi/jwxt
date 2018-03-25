package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

public class Pleafilerecordinfo {
    private Integer fileuprecoreid;

    private Integer arrangeid;

    private String fileupstatus;

    private Date uptime;

    private String upstatus;

    private String remark;

    public Integer getFileuprecoreid() {
        return fileuprecoreid;
    }

    public void setFileuprecoreid(Integer fileuprecoreid) {
        this.fileuprecoreid = fileuprecoreid;
    }

    public Integer getArrangeid() {
        return arrangeid;
    }

    public void setArrangeid(Integer arrangeid) {
        this.arrangeid = arrangeid;
    }

    public String getFileupstatus() {
        return fileupstatus;
    }

    public void setFileupstatus(String fileupstatus) {
        this.fileupstatus = fileupstatus == null ? null : fileupstatus.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getUpstatus() {
        return upstatus;
    }

    public void setUpstatus(String upstatus) {
        this.upstatus = upstatus == null ? null : upstatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}