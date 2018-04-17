package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 毕设资料提交信息表
 */
public class Pleafileuploadinfo {
    private Integer pleafileid;

    private Integer arrangeid;

    private String filetype;

    private String oriname;

    private String uuidname;

    private Date uptime;

    private String remark;

    public Integer getPleafileid() {
        return pleafileid;
    }

    public void setPleafileid(Integer pleafileid) {
        this.pleafileid = pleafileid;
    }

    public Integer getArrangeid() {
        return arrangeid;
    }

    public void setArrangeid(Integer arrangeid) {
        this.arrangeid = arrangeid;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getOriname() {
        return oriname;
    }

    public void setOriname(String oriname) {
        this.oriname = oriname == null ? null : oriname.trim();
    }

    public String getUuidname() {
        return uuidname;
    }

    public void setUuidname(String uuidname) {
        this.uuidname = uuidname == null ? null : uuidname.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}