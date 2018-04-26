package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignClassArrange;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignClassArrangeService {
    /**
     *  在安排课设时需要同时在课设班级表中批量插入数据
     * @param list
     * @return
     * @throws SQLException
     */
    public boolean addTCoursedesignArrange(List<TCoursedesignClassArrange> list) throws SQLException;

    /**
     *  根据课设安排表的中courseDesignArrangeID删除
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public boolean deleteTCoursedesignArrange(String courseDesignArrangeID) throws SQLException;
//    public boolean updateTCoursedesignArrange(TCoursedesignArrange cda)throws SQLException;

    /**
     * 学生根据id从教师学生课设表 课设安排表 教师课设安排表 中查询课设安排
     * @param condition
     * @return 多个表的字段的组合
     * @throws SQLException
     */
    public List<Map<String,Object>> findCourseDesignerByStudentId(Map<String, Object> condition) throws SQLException;

}
