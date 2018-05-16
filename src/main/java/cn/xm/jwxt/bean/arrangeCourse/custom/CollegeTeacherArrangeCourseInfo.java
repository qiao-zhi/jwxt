package cn.xm.jwxt.bean.arrangeCourse.custom;

/**
 * 项目名称：jwxt
 * 类描述：学院教师每学年学期排课信息的实体类
 * 创建人：LL
 * 创建时间：2018/5/15 18:53
 */
public class CollegeTeacherArrangeCourseInfo {
    private String collegeId;

    private String majorId;

    private String teacherMajorName;

    private String teacherName;

    private String teacherNum;

    private String academicYear;

    private String term;

    private String majorName;

    private String arrangeCourseId;

    private String courseCode;

    private String courseName;

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
    }

    public String getTeacherMajorName() {
        return teacherMajorName;
    }

    public void setTeacherMajorName(String teacherMajorName) {
        this.teacherMajorName = teacherMajorName == null ? null : teacherMajorName.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum == null ? null : teacherNum.trim();
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear == null ? null : academicYear.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getArrangeCourseId() {
        return arrangeCourseId;
    }

    public void setArrangeCourseId(String arrangeCourseId) {
        this.arrangeCourseId = arrangeCourseId == null ? null : arrangeCourseId.trim();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode == null ? null : courseCode.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }
}