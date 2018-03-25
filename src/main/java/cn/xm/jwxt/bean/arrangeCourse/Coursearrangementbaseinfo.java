package cn.xm.jwxt.bean.arrangeCourse;

import java.util.Date;

public class Coursearrangementbaseinfo {
    private String arrangebaseinfoid;

    private String arrangepersonname;

    private Date coursearrangetime;

    private String coursearrangename;

    private String yearnum;

    private String semester;

    private String status;

    public String getArrangebaseinfoid() {
        return arrangebaseinfoid;
    }

    public void setArrangebaseinfoid(String arrangebaseinfoid) {
        this.arrangebaseinfoid = arrangebaseinfoid == null ? null : arrangebaseinfoid.trim();
    }

    public String getArrangepersonname() {
        return arrangepersonname;
    }

    public void setArrangepersonname(String arrangepersonname) {
        this.arrangepersonname = arrangepersonname == null ? null : arrangepersonname.trim();
    }

    public Date getCoursearrangetime() {
        return coursearrangetime;
    }

    public void setCoursearrangetime(Date coursearrangetime) {
        this.coursearrangetime = coursearrangetime;
    }

    public String getCoursearrangename() {
        return coursearrangename;
    }

    public void setCoursearrangename(String coursearrangename) {
        this.coursearrangename = coursearrangename == null ? null : coursearrangename.trim();
    }

    public String getYearnum() {
        return yearnum;
    }

    public void setYearnum(String yearnum) {
        this.yearnum = yearnum == null ? null : yearnum.trim();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}