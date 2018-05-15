package cn.xm.jwxt.bean.baseInfo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TTeacherBaseInfo {
    private String teacherid;

    private String teachernum;

    private String collegeid;

    private String majorid;

    private String teachername;

    private String teachersex;

    private Date teacherbirth;

    private String education;

    private String degree;

    private String graduateschool;

    private String graduatemajor;

    private String teacherphoto;

    private String teachertel;

    private String positionaltitle;

    private Date joinschooltime;

    private String teacherposition;

    private String inposition;

    private String remark2;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid == null ? null : collegeid.trim();
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getTeacherbirth() {
        return teacherbirth;
    }

    public void setTeacherbirth(Date teacherbirth) {
        this.teacherbirth = teacherbirth;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool == null ? null : graduateschool.trim();
    }

    public String getGraduatemajor() {
        return graduatemajor;
    }

    public void setGraduatemajor(String graduatemajor) {
        this.graduatemajor = graduatemajor == null ? null : graduatemajor.trim();
    }

    public String getTeacherphoto() {
        return teacherphoto;
    }

    public void setTeacherphoto(String teacherphoto) {
        this.teacherphoto = teacherphoto == null ? null : teacherphoto.trim();
    }

    public String getTeachertel() {
        return teachertel;
    }

    public void setTeachertel(String teachertel) {
        this.teachertel = teachertel == null ? null : teachertel.trim();
    }

    public String getPositionaltitle() {
        return positionaltitle;
    }

    public void setPositionaltitle(String positionaltitle) {
        this.positionaltitle = positionaltitle == null ? null : positionaltitle.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getJoinschooltime() {
        return joinschooltime;
    }

    public void setJoinschooltime(Date joinschooltime) {
        this.joinschooltime = joinschooltime;
    }

    public String getTeacherposition() {
        return teacherposition;
    }

    public void setTeacherposition(String teacherposition) {
        this.teacherposition = teacherposition == null ? null : teacherposition.trim();
    }

    public String getInposition() {
        return inposition;
    }

    public void setInposition(String inposition) {
        this.inposition = inposition == null ? null : inposition.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}