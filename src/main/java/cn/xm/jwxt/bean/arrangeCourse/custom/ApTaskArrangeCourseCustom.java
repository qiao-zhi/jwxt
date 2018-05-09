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
}
