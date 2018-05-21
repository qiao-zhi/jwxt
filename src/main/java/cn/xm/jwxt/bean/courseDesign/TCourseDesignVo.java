package cn.xm.jwxt.bean.courseDesign;

import java.util.Date;

public class TCourseDesignVo {
    private String courseDesignArrangeID;
    private String courseDesignTeacherArrangeID;
    private String courseDesignTeacherStudentID;
    private String trainCourseID;
    private String courseDesignName;
    private String courseDesignNum;
    private String majorID;
    private String teacherNum;
    private String teacherName;
    private String classNames;
    private String startTime;
    private String endTime;
    private String CourseArrangeInfo;
    private String semester;  // 这是1-8，需转换
    private String year;
    private String yearNum;
    private String CourseArrangeTeacher;
    private Date CourseArrangeTime;
    private String display;
    private String isArrange;
    private String teacherID;
    private String[] stuArr;
    private String[] classArr;

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String[] getClassArr() {
        return classArr;
    }

    public void setClassArr(String[] classArr) {
        this.classArr = classArr;
    }

    public String getCourseDesignNum() {
        return courseDesignNum;
    }

    public void setCourseDesignNum(String courseDesignNum) {
        this.courseDesignNum = courseDesignNum;
    }

    public String getCourseDesignArrangeID() {
        return courseDesignArrangeID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourseDesignName() {
        return courseDesignName;
    }

    public void setCourseDesignName(String courseDesignName) {
        this.courseDesignName = courseDesignName;
    }

    public void setCourseDesignArrangeID(String courseDesignArrangeID) {
        this.courseDesignArrangeID = courseDesignArrangeID;
    }

    public String getCourseDesignTeacherArrangeID() {
        return courseDesignTeacherArrangeID;
    }

    public void setCourseDesignTeacherArrangeID(String courseDesignTeacherArrangeID) {
        this.courseDesignTeacherArrangeID = courseDesignTeacherArrangeID;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public String getCourseDesignTeacherStudentID() {
        return courseDesignTeacherStudentID;
    }

    public void setCourseDesignTeacherStudentID(String courseDesignTeacherStudentID) {
        this.courseDesignTeacherStudentID = courseDesignTeacherStudentID;
    }

    public String getTrainCourseID() {
        return trainCourseID;
    }

    public void setTrainCourseID(String trainCourseID) {
        this.trainCourseID = trainCourseID;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassNames() {
        return classNames;
    }

    public void setClassNames(String classNames) {
        this.classNames = classNames;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCourseArrangeInfo() {
        return CourseArrangeInfo;
    }

    public void setCourseArrangeInfo(String courseArrangeInfo) {
        CourseArrangeInfo = courseArrangeInfo;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYearNum() {
        return yearNum;
    }

    public void setYearNum(String yearNum) {
        this.yearNum = yearNum;
    }

    public String getCourseArrangeTeacher() {
        return CourseArrangeTeacher;
    }

    public void setCourseArrangeTeacher(String courseArrangeTeacher) {
        CourseArrangeTeacher = courseArrangeTeacher;
    }

    public Date getCourseArrangeTime() {
        return CourseArrangeTime;
    }

    public void setCourseArrangeTime(Date courseArrangeTime) {
        CourseArrangeTime = courseArrangeTime;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getIsArrange() {
        return isArrange;
    }

    public void setIsArrange(String isArrange) {
        this.isArrange = isArrange;
    }

    public String[] getStuArr() {
        return stuArr;
    }

    public void setStuArr(String[] stuArr) {
        this.stuArr = stuArr;
    }
}
