package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

public class Teachertitlecheckinfo {
    private String checkid;

    private String teathertitleid;

    private Date checktime;

    private String checkperson;

    private String checkresult;

    private String checkdesc;

    public String getCheckid() {
        return checkid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid == null ? null : checkid.trim();
    }

    public String getTeathertitleid() {
        return teathertitleid;
    }

    public void setTeathertitleid(String teathertitleid) {
        this.teathertitleid = teathertitleid == null ? null : teathertitleid.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson == null ? null : checkperson.trim();
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public String getCheckdesc() {
        return checkdesc;
    }

    public void setCheckdesc(String checkdesc) {
        this.checkdesc = checkdesc == null ? null : checkdesc.trim();
    }
}