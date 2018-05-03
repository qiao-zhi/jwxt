package cn.xm.jwxt.bean.orderBooks;

public class TextbookOrder {
    private String orderdetailid;

    private Integer orderid;

    private String textbookid;

    private String courseid;

    private Integer ordernum;

    private String teacherid;

    private String isorder;

    private String isconfirm;

    private String remark;

    public String getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(String orderdetailid) {
        this.orderdetailid = orderdetailid == null ? null : orderdetailid.trim();
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

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getIsorder() {
        return isorder;
    }

    public void setIsorder(String isorder) {
        this.isorder = isorder == null ? null : isorder.trim();
    }

    public String getIsconfirm() {
        return isconfirm;
    }

    public void setIsconfirm(String isconfirm) {
        this.isconfirm = isconfirm == null ? null : isconfirm.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}