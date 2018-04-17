package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 毕设中期检查结果表
 */
public class Cencheckresultinfo {
    private Integer centerresultid;

    private Integer cenarrangeinfoid;

    private String wordprogress;

    private String workattitude;

    private String qualityadvice;

    private String problemandaatter;

    private Date checktime;

    private String remark;

    public Integer getCenterresultid() {
        return centerresultid;
    }

    public void setCenterresultid(Integer centerresultid) {
        this.centerresultid = centerresultid;
    }

    public Integer getCenarrangeinfoid() {
        return cenarrangeinfoid;
    }

    public void setCenarrangeinfoid(Integer cenarrangeinfoid) {
        this.cenarrangeinfoid = cenarrangeinfoid;
    }

    public String getWordprogress() {
        return wordprogress;
    }

    public void setWordprogress(String wordprogress) {
        this.wordprogress = wordprogress == null ? null : wordprogress.trim();
    }

    public String getWorkattitude() {
        return workattitude;
    }

    public void setWorkattitude(String workattitude) {
        this.workattitude = workattitude == null ? null : workattitude.trim();
    }

    public String getQualityadvice() {
        return qualityadvice;
    }

    public void setQualityadvice(String qualityadvice) {
        this.qualityadvice = qualityadvice == null ? null : qualityadvice.trim();
    }

    public String getProblemandaatter() {
        return problemandaatter;
    }

    public void setProblemandaatter(String problemandaatter) {
        this.problemandaatter = problemandaatter == null ? null : problemandaatter.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}