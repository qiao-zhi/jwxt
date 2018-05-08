package cn.xm.jwxt.bean.arrangeCourse.custom;
/**
 * 项目名称：jwxt
 * 类描述：分配课程来源显示封装的实体类
 * 创建人：LL
 * 创建时间：2018/5/4 18:53
 */
public class DistributeCourseSource {
    private String courseCode;

    private String courseName;

    private String majorName;

    private String campusCode;

    private Integer majorStudentsNumber;

    private String totalPeriod;

    private String classNames;

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

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode == null ? null : campusCode.trim();
    }

    public Integer getMajorStudentsNumber() {
        return majorStudentsNumber;
    }

    public void setMajorStudentsNumber(Integer majorStudentsNumber) {
        this.majorStudentsNumber = majorStudentsNumber;
    }

    public String getTotalPeriod() {
        return totalPeriod;
    }

    public void setTotalPeriod(String totalPeriod) {
        this.totalPeriod = totalPeriod == null ? null : totalPeriod.trim();
    }

    public String getClassNames() {
        return classNames;
    }

    public void setClassNames(String classNames) {
        this.classNames = classNames == null ? null : classNames.trim();
    }
}