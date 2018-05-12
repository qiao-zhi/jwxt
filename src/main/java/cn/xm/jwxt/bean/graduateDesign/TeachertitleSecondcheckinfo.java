package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 教师毕设课题审核表
 */
public class TeachertitleSecondcheckinfo {
    /**教师课题审核ID*/
    private String checkid;
    /**教师题目ID*/
    private String teathertitleid;
    /**审核时间*/
    private Date checktime;
    /**审核人*/
    private String checkperson;
    /**审核结果*/
    private String checkresult;
    /**描述*/
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