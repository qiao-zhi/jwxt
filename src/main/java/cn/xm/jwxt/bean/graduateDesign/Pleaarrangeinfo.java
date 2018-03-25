package cn.xm.jwxt.bean.graduateDesign;

public class Pleaarrangeinfo {
    private Integer arrangeid;

    private String pleaid;

    private String groupid;

    private String teacherid;

    private Integer bookid;

    public Integer getArrangeid() {
        return arrangeid;
    }

    public void setArrangeid(Integer arrangeid) {
        this.arrangeid = arrangeid;
    }

    public String getPleaid() {
        return pleaid;
    }

    public void setPleaid(String pleaid) {
        this.pleaid = pleaid == null ? null : pleaid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
}