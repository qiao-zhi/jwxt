package cn.xm.jwxt.mapper.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.custom.ApTeacherCourseCustom;
import cn.xm.jwxt.bean.arrangeCourse.custom.CollegeTeacherArrangeCourseInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
     * 根据排课任务ID查询教师课程ID集合
     * @param taskArrangeCourseId
     * @return
     * @throws SQLException
     */
    List<String> findTeacherCourseIdsByTaskArrangeCourseID(String taskArrangeCourseId) throws SQLException;

    /**
     * 根据课程编号查询历史任课教师
     * @param courseNumber
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findHistoryTeacherInfoByNumber(String courseNumber) throws SQLException;

    /**
     * 根据条件查询一个学院某一学年学期的教师排课信息
     * @param condition
     * @return
     * @throws SQLException
     */
    List<CollegeTeacherArrangeCourseInfo> findCollegeTeacherArrangeCourseInfoList(CommonQueryVo condition) throws SQLException;
}
