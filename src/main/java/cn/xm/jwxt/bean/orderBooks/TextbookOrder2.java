package cn.xm.jwxt.bean.orderBooks;

public class TextbookOrder2 {
    private String orderdetailid2;

    private Integer orderid;

    private String textbookid;

    private Integer noticedatailid;

    private Short ordernum;

    private String teacherid;

    private String isconfirm;

    private String remark1;

    private String remark2;

    public String getOrderdetailid2() {
        return orderdetailid2;
    }

    public void setOrderdetailid2(String orderdetailid2) {
        this.orderdetailid2 = orderdetailid2 == null ? null : orderdetailid2.trim();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getTextbookid() {
        return textbookid;
    }

    public void setTextbookid(String textbookid) {
        this.textbookid = textbookid == null ? null : textbookid.trim();
    }

    public Integer getNoticedatailid() {
        return noticedatailid;
    }

    public void setNoticedatailid(Integer noticedatailid) {
        this.noticedatailid = noticedatailid;
    }

    public Short getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getIsconfirm() {
        return isconfirm;
    }

    public void setIsconfirm(String isconfirm) {
        this.isconfirm = isconfirm == null ? null : isconfirm.trim();
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