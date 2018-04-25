package cn.xm.jwxt.bean.arrangeCourse;

public class ApTeacherCourse {
    private String teacherCourseId;

    private String arrangeCourseId;

    private String term;

    private String academicYear;

    private String courseCode;

    private String teacherId;

    private String teacherNumber;

    private String teacherName;

    private String remark;

    public String getTeacherCourseId() {
        return teacherCourseId;
    }

    public void setTeacherCourseId(String teacherCourseId) {
        this.teacherCourseId = teacherCourseId == null ? null : teacherCourseId.trim();
    }

    public String getArrangeCourseId() {
        return arrangeCourseId;
    }

    public void setArrangeCourseId(String arrangeCourseId) {
        this.arrangeCourseId = arrangeCourseId == null ? null : arrangeCourseId.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear == null ? null : academicYear.trim();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode == null ? null : courseCode.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber == null ? null : teacherNumber.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}