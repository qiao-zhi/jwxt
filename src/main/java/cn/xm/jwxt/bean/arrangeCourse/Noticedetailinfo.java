package cn.xm.jwxt.bean.arrangeCourse;

public class Noticedetailinfo {
    private Integer noticedatailid;

    private String noticebookid;

    private String datailsort;

    private String coursecode;

    private String coursename;

    private String teachplannum;

    private String majorname;

    private String schoolname;

    private String classname;

    private Short classstudentnum;

    private String studentgrade;

    private Short allstudentnum;

    private String testmethod;

    private String weekperiod;

    private String periodtotal;

    private String start2stopweek;

    private String coursehour;

    private String practice;

    private String coursecharacter;

    private String remark;

    public Integer getNoticedatailid() {
        return noticedatailid;
    }

    public void setNoticedatailid(Integer noticedatailid) {
        this.noticedatailid = noticedatailid;
    }

    public String getNoticebookid() {
        return noticebookid;
    }

    public void setNoticebookid(String noticebookid) {
        this.noticebookid = noticebookid == null ? null : noticebookid.trim();
    }

    public String getDatailsort() {
        return datailsort;
    }

    public void setDatailsort(String datailsort) {
        this.datailsort = datailsort == null ? null : datailsort.trim();
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode == null ? null : coursecode.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getTeachplannum() {
        return teachplannum;
    }

    public void setTeachplannum(String teachplannum) {
        this.teachplannum = teachplannum == null ? null : teachplannum.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Short getClassstudentnum() {
        return classstudentnum;
    }

    public void setClassstudentnum(Short classstudentnum) {
        this.classstudentnum = classstudentnum;
    }

    public String getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(String studentgrade) {
        this.studentgrade = studentgrade == null ? null : studentgrade.trim();
    }

    public Short getAllstudentnum() {
        return allstudentnum;
    }

    public void setAllstudentnum(Short allstudentnum) {
        this.allstudentnum = allstudentnum;
    }

    public String getTestmethod() {
        return testmethod;
    }

    public void setTestmethod(String testmethod) {
        this.testmethod = testmethod == null ? null : testmethod.trim();
    }

    public String getWeekperiod() {
        return weekperiod;
    }

    public void setWeekperiod(String weekperiod) {
        this.weekperiod = weekperiod == null ? null : weekperiod.trim();
    }

    public String getPeriodtotal() {
        return periodtotal;
    }

    public void setPeriodtotal(String periodtotal) {
        this.periodtotal = periodtotal == null ? null : periodtotal.trim();
    }

    public String getStart2stopweek() {
        return start2stopweek;
    }

    public void setStart2stopweek(String start2stopweek) {
        this.start2stopweek = start2stopweek == null ? null : start2stopweek.trim();
    }

    public String getCoursehour() {
        return coursehour;
    }

    public void setCoursehour(String coursehour) {
        this.coursehour = coursehour == null ? null : coursehour.trim();
    }

    public String getPractice() {
        return practice;
    }

    public void setPractice(String practice) {
        this.practice = practice == null ? null : practice.trim();
    }

    public String getCoursecharacter() {
        return coursecharacter;
    }

    public void setCoursecharacter(String coursecharacter) {
        this.coursecharacter = coursecharacter == null ? null : coursecharacter.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}