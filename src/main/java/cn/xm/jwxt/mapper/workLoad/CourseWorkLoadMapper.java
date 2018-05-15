package cn.xm.jwxt.mapper.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CourseWorkLoadMapper {

    /**
     *  查询教师课程工作量
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseWorkLoad(Map<String,Object> condition) throws SQLException;

    /**
     *  根据 teacher_course_id 查询班级名称与人数
     * @param teacher_course_id
     * @return
     */
    public List<Map<String,Object>> findClassInfoByteacher_course_id(String teacher_course_id) throws SQLException;

    /**
     *  根据teacher_course_id查询详细信息
      * @param teacher_course_id
     * @return
     */
    public Map<String,Object> findCourseDetail(String teacher_course_id) throws SQLException;

    /**
     * 根据班级名称获取学生信息
     * @param className
     * @return
     */
    public List<String> findStuListByClassName(String className) throws SQLException;
}
