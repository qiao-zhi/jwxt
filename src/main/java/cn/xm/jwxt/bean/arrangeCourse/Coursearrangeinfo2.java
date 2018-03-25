package cn.xm.jwxt.bean.arrangeCourse;

import java.util.Date;

public class Coursearrangeinfo2 {
    private Integer arrangeoutid;

    private Integer noticedatailid;

    private String teacherid;

    private String arrangepersonname;

    private Date arrangetime;

    private String remark;

    public Integer getArrangeoutid() {
        return arrangeoutid;
    }

    public void setArrangeoutid(Integer arrangeoutid) {
        this.arrangeoutid = arrangeoutid;
    }

    public Integer getNoticedatailid() {
        return noticedatailid;
    }

    public void setNoticedatailid(Integer noticedatailid) {
        this.noticedatailid = noticedatailid;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getArrangepersonname() {
        return arrangepersonname;
    }

    public void setArrangepersonname(String arrangepersonname) {
        this.arrangepersonname = arrangepersonname == null ? null : arrangepersonname.trim();
    }

    public Date getArrangetime() {
        return arrangetime;
    }

    public void setArrangetime(Date arrangetime) {
        this.arrangetime = arrangetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}