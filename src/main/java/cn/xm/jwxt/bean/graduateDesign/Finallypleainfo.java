package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

public class Finallypleainfo {
    private String pleaid;

    private Date starttime;

    private Date endtime;

    private String arrangeperson;

    private Date arrangetime;

    private String description;

    public String getPleaid() {
        return pleaid;
    }

    public void setPleaid(String pleaid) {
        this.pleaid = pleaid == null ? null : pleaid.trim();
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