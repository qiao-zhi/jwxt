package cn.xm.jwxt.mapper.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.custom.ApTeacherCourseCustom;

import java.sql.SQLException;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师课程信息自定义的mapper
 * 创建人：LL
 * 创建时间：2018/5/9 17:02
 */
public interface ApTeacherCourseCustomMapper {
    /**
     * 根据任务安排课程ID查询这门课对应的教师和班级信息
     * @param taskArrangeCourseId
     * @return
     * @throws SQLException
     */
    List<ApTeacherCourseCustom> findTeacherCourseCustomInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws SQLException;

    /**
     * 根据排课任务ID查询教师课程信息集合
     * @param taskArrangeCourseId
     * @return
     * @throws SQLException
     */
    List<String> findTeacherCourseIdsByTaskArrangeCourseID(String taskArrangeCourseId) throws SQLException;
}
