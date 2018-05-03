package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrange;

import java.util.List;

import java.sql.SQLException;
import java.util.Map;

public interface TCoursedesignTeacherArrangeService {

    /**
     *  在安排课设表中插入信息时需要同时在教师课设安排表批量插入信息
     * @param list
     * @return
     * @throws SQLException
     */
    public boolean addTCoursedesignTeacherArrange(List<TCoursedesignTeacherArrange> list) throws SQLException;

    /**
     *  删除的时候根据安排表中的courseDesignArrangeID删除
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public boolean deleteTCoursedesignTeacherArrange(String courseDesignArrangeID) throws SQLException;

    //    public boolean updateTCoursedesignTeacherArrange(TCoursedesignTeacherArrange cdta)throws SQLException;

    /**
     * 教师 根据id,学年等从教师课设安排表开始 查询课设安排
     * @param condition
     * @return  可以查出带过的所有课设
     * @throws SQLException
     */
    public List<Map<String,Object>> findCourseDesignerByTeacherId(Map<String, Object> condition) throws SQLException;

    /**
     *  根据课设安排id查询课设教师安排表
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public List<TCoursedesignTeacherArrange> findTCoursedesignTeacherArrangeBycourseDesignArrangeID(String courseDesignArrangeID) throws SQLException;
}
