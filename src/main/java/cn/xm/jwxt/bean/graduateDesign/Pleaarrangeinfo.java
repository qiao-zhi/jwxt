package cn.xm.jwxt.bean.graduateDesign;

import java.util.List;

/**
 * 毕业答辩安排信息表
 */
public class Pleaarrangeinfo {
    private Integer arrangeid;

    private String pleaid;

    private String groupid;

    private String teacherid;

    private Integer bookid;

    private GraDesignCheckGroupNew graDesignCheckGroupNew;

    private Finallypleainfo finallypleainfo;

    private List<Plearesultinfo> plearesultinfoList;

    private List<Pleafilerecordinfo> pleafilerecordinfoList;

    private List<Pleafileuploadinfo> pleafileuploadinfoList;

    public GraDesignCheckGroupNew getGraDesignCheckGroupNew() {
        return graDesignCheckGroupNew;
    }

    public void setGraDesignCheckGroupNew(GraDesignCheckGroupNew graDesignCheckGroupNew) {
        this.graDesignCheckGroupNew = graDesignCheckGroupNew;
    }

    public Finallypleainfo getFinallypleainfo() {
        return finallypleainfo;
    }

    public void setFinallypleainfo(Finallypleainfo finallypleainfo) {
        this.finallypleainfo = finallypleainfo;
    }

    public List<Plearesultinfo> getPlearesultinfoList() {
        return plearesultinfoList;
    }

    public void setPlearesultinfoList(List<Plearesultinfo> plearesultinfoList) {
        this.plearesultinfoList = plearesultinfoList;
    }

    public List<Pleafilerecordinfo> getPleafilerecordinfoList() {
        return pleafilerecordinfoList;
    }

    public void setPleafilerecordinfoList(List<Pleafilerecordinfo> pleafilerecordinfoList) {
        this.pleafilerecordinfoList = pleafilerecordinfoList;
    }

    public List<Pleafileuploadinfo> getPleafileuploadinfoList() {
        return pleafileuploadinfoList;
    }

    public void setPleafileuploadinfoList(List<Pleafileuploadinfo> pleafileuploadinfoList) {
        this.pleafileuploadinfoList = pleafileuploadinfoList;
    }

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