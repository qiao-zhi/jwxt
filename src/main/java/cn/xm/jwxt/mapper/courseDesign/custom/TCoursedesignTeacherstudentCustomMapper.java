package cn.xm.jwxt.mapper.courseDesign.custom;

import java.util.List;
import java.util.Map;

public interface TCoursedesignTeacherstudentCustomMapper {
    /**
     * 教师查询学生课设提交情况
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseDesignerSubmit(Map<String, Object> condition);

    /**
     *  教师课设教学工作量查询
     * @param condition
     * @return
     */

    public List<Map<String,Object>> findCourseDesignWorkload(Map<String,Object> condition);


}

