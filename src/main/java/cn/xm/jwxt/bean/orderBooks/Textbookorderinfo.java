package cn.xm.jwxt.bean.orderBooks;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Textbookorderinfo {
    private Integer orderid;

    private String ordername;

    private String roomname;

    private String createperson;

    private Date createtime;

    private String yearnum;

    private String semester;

    private String isorder;

    private String ischeck;

    private String checkproposal;

    private String proposalnote;

    private String remark;

    private String remark1;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getYearnum() {
        return yearnum;
    }

    public void setYearnum(String yearnum) {
        this.yearnum = yearnum == null ? null : yearnum.trim();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getIsorder() {
        return isorder;
    }

    public void setIsorder(String isorder) {
        this.isorder = isorder == null ? null : isorder.trim();
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck == null ? null : ischeck.trim();
    }

    public String getCheckproposal() {
        return checkproposal;
    }

    public void setCheckproposal(String checkproposal) {
        this.checkproposal = checkproposal == null ? null : checkproposal.trim();
    }

    public String getProposalnote() {
        return proposalnote;
    }

    public void setProposalnote(String proposalnote) {
        this.proposalnote = proposalnote == null ? null : proposalnote.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}
