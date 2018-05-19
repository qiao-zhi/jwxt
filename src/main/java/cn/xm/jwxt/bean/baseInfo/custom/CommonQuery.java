package cn.xm.jwxt.bean.baseInfo.custom;

public class CommonQuery {

    //当前页
    private Integer currentpage;
    //当前页显示条数
    private Integer pagesize;
    // 学院id
    private String collegeid;
    //专业代码
    private String majornum;
    //学生学号
    private String studentnum;
    //教师编号
    private String teachernum;

    private String teachername;

    private String studentname;

    private String classnum;

    private String grade;

    private String majorsort ;

    private String majorid;

    private String collegenum;

    public String getCollegenum() {
        return collegenum;
    }

    public void setCollegenum(String collegenum) {
        this.collegenum = collegenum;
    }



    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorname) {
        this.majorid = majorname;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }


    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMajorsort(String majorsort) {
        this.majorsort = majorsort;
    }

    public String getTeachername() {
        return teachername;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getGrade() {
        return grade;
    }

    public String getMajorsort() {
        return majorsort;
    }

    public void setCurrentpage(Integer currentpage) {
        this.currentpage = currentpage;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum;
    }

    public void setStudentnum(String studentid) {
        this.studentnum = studentid;
    }

    public void setTeachernum(String teacherid) {
        this.teachernum = teacherid;
    }

    public Integer getCurrentpage() {
        return currentpage;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public String getCollegeid() {
        return collegeid;
    }

    public String getMajornum() {
        return majornum;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public String getTeachernum() {
        return teachernum;
    }


}
