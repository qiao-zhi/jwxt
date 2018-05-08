package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

import java.util.List;
import java.util.Map;

public interface TCoursedesignToolService {
    /**
     *  从数据库获取当前 年
     * @return
     */
    public List<String> getYearList();

    /**
     *  根据学院id获取专业信息
     * @param collegeID
     * @return
     */
    public List<String> getMajorList(String collegeID);

    /**
     *  根据培养方案课程编号查询已安排的课设信息
     * @param condition       trainCourseID , yearNum .majorid ,grade
     * @return
     */
    public List<Map<String,Object>> findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition);

    /**
     * 根据专业id获取教师姓名
     * @param majorID
     * @return
     */
    public List<String> getTeacheName(String majorID);

    /**
     * 根据专业id获取班级名称列表
     * @param condition
     * @return
     */
    public List<String> getClassNameByMajor(Map<String,Object> condition);

    /**
     * 根据班级名称，专业id获取学生id，姓名列表
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getStudentListByClassNameAndMajorid(Map<String,Object> condition);

    /**
     * 获取教师编号
     * @param condition
     * @return
     */
    public String getTeacherNum(Map<String,Object> condition);

    /**
     * 根据老师编号获取老师id
     * @param teacherNum
     * @return
     */
    public String getTeacherID(String teacherNum);

    /**
     *  从infoArrange表中根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignArrangeIDByDisplay(String display);

    /**
     *  teacherArrange表 根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeIDByDisplay(String display);

    /**
     *  classArrange 根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignClassArrangeIDByDisplay(String display);
    /**
     * teacherArrange 根据courseDesignArrangeID获取courseDesignTeacherArrangeID
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeID(String courseDesignArrangeID);

    /**
     *  teacherStudent表根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherStudentIDByDisplay(String display);

    /**
     *  通过培养方案课程编号,学年,专业,grade 查询课设安排id
     * @param condition
     * @return
     */
    public List<String> findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition);
}
