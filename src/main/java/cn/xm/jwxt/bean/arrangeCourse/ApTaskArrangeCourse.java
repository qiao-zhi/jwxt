package cn.xm.jwxt.bean.arrangeCourse;

public class ApTaskArrangeCourse {
    private String arrangeCourseId;

    private String arrangeTaskId;

    private String courseName;

    private String courseCode;

    private String majorName;

    private String className;

    private Integer majorStudentsNumber;

    private Integer totalPeriod;

    private String campusCode;

    private String isUseMultimedia;

    private String remark;

    public String getArrangeCourseId() {
        return arrangeCourseId;
    }

    public void setArrangeCourseId(String arrangeCourseId) {
        this.arrangeCourseId = arrangeCourseId == null ? null : arrangeCourseId.trim();
    }

    public String getArrangeTaskId() {
        return arrangeTaskId;
    }

    public void setArrangeTaskId(String arrangeTaskId) {
        this.arrangeTaskId = arrangeTaskId == null ? null : arrangeTaskId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode == null ? null : courseCode.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getMajorStudentsNumber() {
        return majorStudentsNumber;
    }

    public void setMajorStudentsNumber(Integer majorStudentsNumber) {
        this.majorStudentsNumber = majorStudentsNumber;
    }

    public Integer getTotalPeriod() {
        return totalPeriod;
    }

    public void setTotalPeriod(Integer totalPeriod) {
        this.totalPeriod = totalPeriod;
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode == null ? null : campusCode.trim();
    }

    public String getIsUseMultimedia() {
        return isUseMultimedia;
    }

    public void setIsUseMultimedia(String isUseMultimedia) {
        this.isUseMultimedia = isUseMultimedia == null ? null : isUseMultimedia.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}