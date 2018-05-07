package cn.xm.jwxt.bean.courseDesign;

import java.util.Date;

public class TCoursedesignTeacherstudent {
    private String coursedesignteacherstudentid;

    private String coursedesignteacherarrangeid;

    private String studentid;

    private String coursedesignarrangenum;

    private String coursedesignreportname;

    private String coursedesignreportstore;

    private Date uploadtime;

    private String uploadstatus;

    private String checkstatus;

    private String checkadvice;

    private String display;

    private String remark;

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

    public String getUploadstatus() {
        return uploadstatus;
    }

    public void setUploadstatus(String uploadstatus) {
        this.uploadstatus = uploadstatus == null ? null : uploadstatus.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getCheckadvice() {
        return checkadvice;
    }

    public void setCheckadvice(String checkadvice) {
        this.checkadvice = checkadvice == null ? null : checkadvice.trim();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}