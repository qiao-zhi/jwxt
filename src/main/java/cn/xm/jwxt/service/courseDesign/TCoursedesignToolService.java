package cn.xm.jwxt.service.courseDesign;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignToolService {
    /**
     *  从数据库获取当前 年
     * @return
     */
    public List<String> getYearList() throws SQLException;

    /**
     *  根据学院id获取专业信息
     * @param collegeID
     * @return
     */
    public List<Map<String,Object>> getMajorList(String collegeID) throws SQLException;

    /**
     *  根据培养方案课程编号查询已安排的课设信息
     * @param condition       trainCourseID , yearNum .majorid ,grade，semester
     * @return
     */
    public List<Map<String,Object>> findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) throws SQLException;

    /**
     * 根据专业id获取教师姓名 id
     * @param majorID
     * @return
     */
    public List<Map<String,Object>> getTeacherNameid(String majorID) throws SQLException;

    /**
     * 根据专业id获取班级名称, id列表
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getClassNameByMajor(Map<String,Object> condition) throws SQLException;

    /**
     * 根据班级id获取学生id，姓名列表
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getStudentListByClassid(Map<String,Object> condition) throws SQLException;

    /**
     * 获取教师编号
     * @param condition
     * @return
     */
    public String getTeacherNum(Map<String,Object> condition) throws SQLException;


    /**
     *  从infoArrange表中根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignArrangeIDByDisplay(String display) throws SQLException;

    /**
     *  teacherArrange表 根据display查询id
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeIDByDisplay(String courseDesignArrangeID) throws SQLException;

    /**
     *  classArrange 根据display查询id
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignClassArrangeIDByDisplay(String courseDesignArrangeID) throws SQLException;
    /**
     * teacherArrange 根据courseDesignArrangeID获取courseDesignTeacherArrangeID
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeID(String courseDesignArrangeID) throws SQLException;

    /**
     *  teacherStudent表根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherStudentIDByDisplay(String courseDesignArrangeID) throws SQLException;

    /**
     *  通过培养方案课程编号,学年,专业,grade 查询课设安排id
     * @param condition
     * @return
     */
    public List<String> findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) throws SQLException;
}
