package cn.xm.jwxt.bean.arrangeCourse;

public class ApClassTeacher {
    private String classTeacherId;

    private String teacherCourseId;

    private String className;

    private Integer classSize;

    private String remark;

    public String getClassTeacherId() {
        return classTeacherId;
    }

    public void setClassTeacherId(String classTeacherId) {
        this.classTeacherId = classTeacherId == null ? null : classTeacherId.trim();
    }

    public String getTeacherCourseId() {
        return teacherCourseId;
    }

    public void setTeacherCourseId(String teacherCourseId) {
        this.teacherCourseId = teacherCourseId == null ? null : teacherCourseId.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassSize() {
        return classSize;
    }

    public void setClassSize(Integer classSize) {
        this.classSize = classSize;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}