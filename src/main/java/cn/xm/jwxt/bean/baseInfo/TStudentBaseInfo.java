package cn.xm.jwxt.bean.baseInfo;

import java.util.Date;

public class TStudentBaseInfo {
    private String studentid;

    private String studentnum;

    private String classid;

    private String studentname;

    private String studentsex;

    private Date studentbirth;

    private String studentphoto;

    private String idnum;

    private Date enrollmenttime;

    private Date endtime;

    private String isgraduate;

    private String isdelete;

    private String remark1;

    private String remark2;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum == null ? null : studentnum.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex == null ? null : studentsex.trim();
    }

    public Date getStudentbirth() {
        return studentbirth;
    }

    public void setStudentbirth(Date studentbirth) {
        this.studentbirth = studentbirth;
    }

    public String getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(String studentphoto) {
        this.studentphoto = studentphoto == null ? null : studentphoto.trim();
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    public Date getEnrollmenttime() {
        return enrollmenttime;
    }

    public void setEnrollmenttime(Date enrollmenttime) {
        this.enrollmenttime = enrollmenttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getIsgraduate() {
        return isgraduate;
    }

    public void setIsgraduate(String isgraduate) {
        this.isgraduate = isgraduate == null ? null : isgraduate.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
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