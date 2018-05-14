package cn.xm.jwxt.mapper.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CourseDesignWorkLoadMapper {

    /**
     * 查询课设工作量
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseDesignWorload(Map<String,Object> condition) throws SQLException;

    /**
     * 查询一个教师的课设工作量详细信息
     * @param courseDesignTeacherArrangeID
     * @return
     */
    public Map<String,Object> findOneTeacherCourseDesignInfo(String courseDesignTeacherArrangeID) throws SQLException;

    /**
     *  根据courseDesignTeacherArrangeID 查询学生信息
     * @param courseDesignTeacherArrangeID
     * @return
     */
    public List<Map<String,Object>> findStuInfoBycourseDesignTeacherArrangeID(String courseDesignTeacherArrangeID) throws SQLException;

}
