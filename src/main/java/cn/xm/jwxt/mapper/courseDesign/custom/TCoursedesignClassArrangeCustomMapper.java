package cn.xm.jwxt.mapper.courseDesign.custom;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignClassArrangeCustomMapper {
    /**
     * 学生根据id在 教师学生课设表 课设安排表 教师课设安排表  中查询课设安排
     * @param condition
     * @return  map是几个表的字段的组合
     */
    List<Map<String,Object>> findCourseDesignerByStudentId(Map<String, Object> condition) throws SQLException;

}
