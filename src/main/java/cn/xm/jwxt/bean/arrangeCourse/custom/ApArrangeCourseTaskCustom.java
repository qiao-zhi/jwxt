package cn.xm.jwxt.bean.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;

/**
 * 项目名称：jwxt
 * 类描述：排课任务扩展类
 * 创建人：LL
 * 创建时间：2018/6/6 17:58
 */
public class ApArrangeCourseTaskCustom extends ApArrangeCourseTask {
    //学院id
    private String academicId;

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }
}
