package cn.xm.jwxt.bean.graduateDesign;

/**
 * 教研室课题管理，分配学生，加载学生表
 */
public class StudentChooseProjectInfo {

    private String studentID;
    private String studentName;
    private String studentSex;
    private String className;

    /**第一志愿的教师*/
    private String teacherName1;

    /**第一志愿的课题*/
    private String titlename1;

    /**第二志愿的教师*/
    private String teacherName2;

    /**第二志愿的课题*/
    private String titlename2;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName1() {
        return teacherName1;
    }

    public void setTeacherName1(String teacherName1) {
        this.teacherName1 = teacherName1;
    }

    public String getTitlename1() {
        return titlename1;
    }

    public void setTitlename1(String titlename1) {
        this.titlename1 = titlename1;
    }

    public String getTeacherName2() {
        return teacherName2;
    }

    public void setTeacherName2(String teacherName2) {
        this.teacherName2 = teacherName2;
    }

    public String getTitlename2() {
        return titlename2;
    }

    public void setTitlename2(String titlename2) {
        this.titlename2 = titlename2;
    }
}
