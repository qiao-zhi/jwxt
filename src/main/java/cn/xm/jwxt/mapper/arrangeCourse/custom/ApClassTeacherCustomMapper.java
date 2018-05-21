package cn.xm.jwxt.mapper.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacher;

import java.sql.SQLException;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：教师课程信息的自定义的mapper
 * 创建人：LL
 * 创建时间：2018/5/9 16:21
 */
public interface ApClassTeacherCustomMapper {

    /**
     * 批量插入教师班级信息
     * @param listInfo
     * @return
     * @throws SQLException
     */
    int saveClassTeacherListInfo(List<ApClassTeacher> listInfo) throws SQLException;

    /**
     * 根据教师课程ID设置班级教师表中的人数
     * @param teacherCourseId
     * @return
     * @throws SQLException
     */
    int updateClassSizeByTeacherCourseId(String teacherCourseId) throws SQLException;
}
