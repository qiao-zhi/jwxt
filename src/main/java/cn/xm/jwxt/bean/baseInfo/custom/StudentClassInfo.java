package cn.xm.jwxt.bean.baseInfo.custom;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
//继承学生信息，增加班级名称，学院名称
public class StudentClassInfo extends TStudentBaseInfo {
    private String classname;

    private String collegename;

    private String majorname;

    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }



}
