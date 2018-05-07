package cn.xm.jwxt.bean.graduateDesign;

import java.util.List;

/**
 * 毕设中期检查安排表
 */
public class Cencheckarrangeinfo {
    private Integer cenarrangeinfoid;

    private String cencheckinfoid;

    private String teacherid;

    private String groupid;

    private Integer bookid;

    private List<Cencheckresultinfo> cencheckresultinfoList;

    private Gradesigncheckgroup gradesigncheckgroup;

    public Gradesigncheckgroup getGradesigncheckgroup() {
        return gradesigncheckgroup;
    }

    public void setGradesigncheckgroup(Gradesigncheckgroup gradesigncheckgroup) {
        this.gradesigncheckgroup = gradesigncheckgroup;
    }

    public Integer getCenarrangeinfoid() {
        return cenarrangeinfoid;
    }

    public void setCencheckresultinfoList(List<Cencheckresultinfo> cencheckresultinfoList) {
        this.cencheckresultinfoList = cencheckresultinfoList;
    }

    public List<Cencheckresultinfo> getCencheckresultinfoList() {
        return cencheckresultinfoList;
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