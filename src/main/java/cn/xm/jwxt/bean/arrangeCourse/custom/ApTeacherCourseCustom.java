package cn.xm.jwxt.bean.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacher;
import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;

import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：教师课程表扩展类
 * 创建人：LL
 * 创建时间：2018/5/9 15:31
 */
public class ApTeacherCourseCustom extends ApTeacherCourse {
    //班级名称，中间用逗号隔开
    private String classNames;
    //所带班级的总人数
    private String classSize;
    //班级教师信息集合
    private List<ApClassTeacher> classTeachers;

    public String getClassNames() {
        return classNames;
    }

    public void setClassNames(String classNames) {
        this.classNames = classNames;
    }

    public String getClassSize() {
        return classSize;
    }

    public void setClassSize(String classSize) {
        this.classSize = classSize;
    }

    public List<ApClassTeacher> getClassTeachers() {
        return classTeachers;
    }

    public void setClassTeachers(List<ApClassTeacher> classTeachers) {
        this.classTeachers = classTeachers;
    }
}
