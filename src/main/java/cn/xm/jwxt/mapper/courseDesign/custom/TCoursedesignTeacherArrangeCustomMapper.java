package cn.xm.jwxt.mapper.courseDesign.custom;

import java.util.List;
import java.util.Map;

public interface TCoursedesignTeacherArrangeCustomMapper {
    /**
     * 教师 根据id,学年等从教师课设安排表开始 查询课设安排（三个表中查）
     * @param condition
     * @return map是多个表的字段的组合
     */
    List<Map<String,Object>> findCourseDesignerByTeacherId(Map<String, Object> condition);

}
