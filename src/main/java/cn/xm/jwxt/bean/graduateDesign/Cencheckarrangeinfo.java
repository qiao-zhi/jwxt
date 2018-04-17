package cn.xm.jwxt.bean.graduateDesign;

/**
 * 毕设中期检查安排表
 */
public class Cencheckarrangeinfo {
    private Integer cenarrangeinfoid;

    private String cencheckinfoid;

    private String teacherid;

    private String groupid;

    private Integer bookid;

    public Integer getCenarrangeinfoid() {
        return cenarrangeinfoid;
    }

    public void setCenarrangeinfoid(Integer cenarrangeinfoid) {
        this.cenarrangeinfoid = cenarrangeinfoid;
    }

    public String getCencheckinfoid() {
        return cencheckinfoid;
    }

    public void setCencheckinfoid(String cencheckinfoid) {
        this.cencheckinfoid = cencheckinfoid == null ? null : cencheckinfoid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
}