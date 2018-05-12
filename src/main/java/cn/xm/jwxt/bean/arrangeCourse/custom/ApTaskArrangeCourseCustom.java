package cn.xm.jwxt.bean.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;

import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：任务安排课程表实体类
 * 创建人：LL
 * 创建时间：2018/5/9 12:17
 */
public class ApTaskArrangeCourseCustom extends ApTaskArrangeCourse {
    //多个教师名称中间用逗号隔开
    private String teacherNames;
    //教师信息集合
    private List<ApTeacherCourseCustom> teachers;
    //学年
    private String academicYear;
    //学期
    private String term;
    //教师名称
    private String teacherName;
    //教师编号
    private String teacherNumber;

    public String getTeacherNames() {
        return teacherNames;
    }

    public void setTeacherNames(String teacherNames) {
        this.teacherNames = teacherNames;
    }

    public List<ApTeacherCourseCustom> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<ApTeacherCourseCustom> teachers) {
        this.teachers = teachers;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }
}
