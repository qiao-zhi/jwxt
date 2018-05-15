package cn.xm.jwxt.mapper.courseDesign.custom;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignToolMapper {
    /**
     * 数据库获取当前年
     */
    public String getNowYear();


    /**
     *  查询专业
     * @param collegeID
     * @return
     */
    public List<Map<String,Object>> getMajorList(String collegeID) throws SQLException;

    /**
     * 根据专业id,grade获取班级名称列表
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getClassNameByMajor(Map<String,Object> condition) throws SQLException;

    /**
     * 根据专业id查询教师姓名  id
     * @param majorID
     * @return
     */
    public List<Map<String,Object>> getTeacherNameid(String majorID) throws SQLException;

    /**
     *  根据班级id获取学生列表
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getStudentListByClassId(Map<String,Object> condition) throws SQLException;

    /**
     * 根据教师id获取教师编号
     * @param condition
     * @return
     */
    public String getTeacherNum(Map<String,Object> condition) throws SQLException;


    /**
     *  根据安排id获取教师安排id
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeID(String courseDesignArrangeID) throws SQLException;

    /**
     *  从infoArrange表中根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignArrangeIDByDisplay(String display) throws SQLException;

    /**
     * classArrange表 根据display查id
     * @param display
     * @return
     */
    public List<String> getcourseDesignClassArrangeIDByDisplay(String display) throws SQLException;

    /**
     *  teacherArrange表 根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeIDByDisplay(String display) throws SQLException;

    /**
     *  teacherStudent表根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherStudentIDByDisplay(String display) throws SQLException;

    /**
     *  根据培养方案课程编号学年专业查询已安排的课设信息
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) throws SQLException;

    /**
     * 通过培养方案课程编号,学年 专业查询课设安排id
     * @param  condition trainCourseID ，yearNum ,grade ,yearNum
     * @return
     */
    public List<String> findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) throws SQLException;

}
