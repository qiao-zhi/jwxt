package cn.xm.jwxt.bean.courseDesign;

import java.util.Date;

public class TCoursedesignInfo {
    private String coursedesignarrangeid;

    private String id;

    private String majorid;

    private Date starttime;

    private Date endtime;

    private String semester;

    private String yearnum;

    private String coursedesigninfo;

    private String coursearrangeinfo;

    private String coursearrangeteacher;

    private Date coursearrangetime;

    private String remark1;

    private String remark2;

    public String getCoursedesignarrangeid() {
        return coursedesignarrangeid;
    }

    public void setCoursedesignarrangeid(String coursedesignarrangeid) {
        this.coursedesignarrangeid = coursedesignarrangeid == null ? null : coursedesignarrangeid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
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

    public String getCoursedesigninfo() {
        return coursedesigninfo;
    }

    public void setCoursedesigninfo(String coursedesigninfo) {
        this.coursedesigninfo = coursedesigninfo == null ? null : coursedesigninfo.trim();
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

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}