package cn.xm.jwxt.bean.orderBooks;

public class TTextbookBaseInfo {
    private String textbookid;

    private String textbooknum;

    private String courseid;

    private String textbookname;

    private String publishinghouse;

    private String author;

    private String isbn;

    private Double price;

    private String remark;

    public String getTextbookid() {
        return textbookid;
    }

    public void setTextbookid(String textbookid) {
        this.textbookid = textbookid == null ? null : textbookid.trim();
    }

    public String getTextbooknum() {
        return textbooknum;
    }

    public void setTextbooknum(String textbooknum) {
        this.textbooknum = textbooknum == null ? null : textbooknum.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getTextbookname() {
        return textbookname;
    }

    public void setTextbookname(String textbookname) {
        this.textbookname = textbookname == null ? null : textbookname.trim();
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse == null ? null : publishinghouse.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}