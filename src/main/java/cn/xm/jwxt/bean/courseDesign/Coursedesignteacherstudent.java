package cn.xm.jwxt.bean.courseDesign;

import java.util.Date;

public class Coursedesignteacherstudent {
    private String coursedesignteacherstudentid;

    private String coursedesignteacherarrangeid;

    private String studentid;

    private String coursedesignarrangenum;

    private String coursedesignreportname;

    private String coursedesignreportstore;

    private Date uploadtime;

    private Date uploadstatus;

    public String getCoursedesignteacherstudentid() {
        return coursedesignteacherstudentid;
    }

    public void setCoursedesignteacherstudentid(String coursedesignteacherstudentid) {
        this.coursedesignteacherstudentid = coursedesignteacherstudentid == null ? null : coursedesignteacherstudentid.trim();
    }

    public String getCoursedesignteacherarrangeid() {
        return coursedesignteacherarrangeid;
    }

    public void setCoursedesignteacherarrangeid(String coursedesignteacherarrangeid) {
        this.coursedesignteacherarrangeid = coursedesignteacherarrangeid == null ? null : coursedesignteacherarrangeid.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getCoursedesignarrangenum() {
        return coursedesignarrangenum;
    }

    public void setCoursedesignarrangenum(String coursedesignarrangenum) {
        this.coursedesignarrangenum = coursedesignarrangenum == null ? null : coursedesignarrangenum.trim();
    }

    public String getCoursedesignreportname() {
        return coursedesignreportname;
    }

    public void setCoursedesignreportname(String coursedesignreportname) {
        this.coursedesignreportname = coursedesignreportname == null ? null : coursedesignreportname.trim();
    }

    public String getCoursedesignreportstore() {
        return coursedesignreportstore;
    }

    public void setCoursedesignreportstore(String coursedesignreportstore) {
        this.coursedesignreportstore = coursedesignreportstore == null ? null : coursedesignreportstore.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getUploadstatus() {
        return uploadstatus;
    }

    public void setUploadstatus(Date uploadstatus) {
        this.uploadstatus = uploadstatus;
    }
}