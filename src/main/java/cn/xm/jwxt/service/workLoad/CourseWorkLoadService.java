package cn.xm.jwxt.service.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CourseWorkLoadService {

    /**
     *  查询教师课程工作量
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseWorkLoad(Map<String,Object> condition) throws SQLException;

    /**
     * 查询详细信息
     * @param teacher_course_id
     * @return
     */
    public Map<String,Object> findOneCourseDetail(String teacher_course_id) throws SQLException;

    /**
     * 根据班级查学生列表
     * @param className
     * @return
     */
    public List<String> findStuListByClassName(String className) throws SQLException;
}
