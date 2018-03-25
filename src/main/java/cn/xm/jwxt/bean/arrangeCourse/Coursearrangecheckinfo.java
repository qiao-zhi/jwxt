package cn.xm.jwxt.bean.arrangeCourse;

import java.util.Date;

public class Coursearrangecheckinfo {
    private Integer coursearrangecheckid;

    private String arrangebaseinfoid;

    private String checkpsrsonname;

    private Date checktime;

    private String checkresult;

    private String checkadvice;

    private String remark;

    public Integer getCoursearrangecheckid() {
        return coursearrangecheckid;
    }

    public void setCoursearrangecheckid(Integer coursearrangecheckid) {
        this.coursearrangecheckid = coursearrangecheckid;
    }

    public String getArrangebaseinfoid() {
        return arrangebaseinfoid;
    }

    public void setArrangebaseinfoid(String arrangebaseinfoid) {
        this.arrangebaseinfoid = arrangebaseinfoid == null ? null : arrangebaseinfoid.trim();
    }

    public String getCheckpsrsonname() {
        return checkpsrsonname;
    }

    public void setCheckpsrsonname(String checkpsrsonname) {
        this.checkpsrsonname = checkpsrsonname == null ? null : checkpsrsonname.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public String getCheckadvice() {
        return checkadvice;
    }

    public void setCheckadvice(String checkadvice) {
        this.checkadvice = checkadvice == null ? null : checkadvice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}