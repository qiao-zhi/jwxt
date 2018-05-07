package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;
import java.util.List;

/**
 * 中期检查基本信息表
 */
public class Cencheckbaseinfo {
    private String cencheckinfoid;

    private Date starttime;

    private Date endtime;

    private String arrangeperson;

    private Date arrangetime;

    private String description;

    private List<Cencheckarrangeinfo> cencheckarrangeinfoList;

    public void setCencheckarrangeinfoList(List<Cencheckarrangeinfo> cencheckarrangeinfoList) {
        this.cencheckarrangeinfoList = cencheckarrangeinfoList;
    }

    public List<Cencheckarrangeinfo> getCencheckarrangeinfoList() {
        return cencheckarrangeinfoList;
    }

    public String getCencheckinfoid() {
        return cencheckinfoid;
    }

    public void setCencheckinfoid(String cencheckinfoid) {
        this.cencheckinfoid = cencheckinfoid == null ? null : cencheckinfoid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getArrangeperson() {
        return arrangeperson;
    }

    public void setArrangeperson(String arrangeperson) {
        this.arrangeperson = arrangeperson == null ? null : arrangeperson.trim();
    }

    public Date getArrangetime() {
        return arrangetime;
    }

    public void setArrangetime(Date arrangetime) {
        this.arrangetime = arrangetime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}