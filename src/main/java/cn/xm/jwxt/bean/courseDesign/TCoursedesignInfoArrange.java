package cn.xm.jwxt.bean.courseDesign;

import java.util.Date;

public class TCoursedesignInfoArrange {
    private String coursedesignarrangeid;

    private String traincourseid;

    private String majorid;

    private String starttime;

    private String endtime;

    private String semester;

    private String yearnum;

    private String coursedesignname;

    private String coursearrangeinfo;

    private String coursearrangeteacher;

    private Date coursearrangetime;

    private String isarrange;

    private String display;

    private String remark2;

    public String getCoursedesignarrangeid() {
        return coursedesignarrangeid;
    }

    public void setCoursedesignarrangeid(String coursedesignarrangeid) {
        this.coursedesignarrangeid = coursedesignarrangeid == null ? null : coursedesignarrangeid.trim();
    }

    public String getTraincourseid() {
        return traincourseid;
    }

    public void setTraincourseid(String traincourseid) {
        this.traincourseid = traincourseid == null ? null : traincourseid.trim();
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getYearnum() {
        return yearnum;
    }

    public void setYearnum(String yearnum) {
        this.yearnum = yearnum == null ? null : yearnum.trim();
    }

    public String getCoursedesignname() {
        return coursedesignname;
    }

    public void setCoursedesignname(String coursedesignname) {
        this.coursedesignname = coursedesignname == null ? null : coursedesignname.trim();
    }

    public String getCoursearrangeinfo() {
        return coursearrangeinfo;
    }

    public void setCoursearrangeinfo(String coursearrangeinfo) {
        this.coursearrangeinfo = coursearrangeinfo == null ? null : coursearrangeinfo.trim();
    }

    public String getCoursearrangeteacher() {
        return coursearrangeteacher;
    }

    public void setCoursearrangeteacher(String coursearrangeteacher) {
        this.coursearrangeteacher = coursearrangeteacher == null ? null : coursearrangeteacher.trim();
    }

    public Date getCoursearrangetime() {
        return coursearrangetime;
    }

    public void setCoursearrangetime(Date coursearrangetime) {
        this.coursearrangetime = coursearrangetime;
    }

    public String getIsarrange() {
        return isarrange;
    }

    public void setIsarrange(String isarrange) {
        this.isarrange = isarrange == null ? null : isarrange.trim();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}