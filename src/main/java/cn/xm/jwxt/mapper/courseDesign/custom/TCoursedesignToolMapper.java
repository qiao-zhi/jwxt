package cn.xm.jwxt.mapper.courseDesign.custom;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

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
    public List<String> getMajorList(String collegeID);

    /**
     * 根据专业id,grade获取班级名称列表
     * @param condition
     * @return
     */
    public List<String> getClassNameByMajor(Map<String,Object> condition);

    /**
     * 根据专业id查询教师姓名
     * @param majorID
     * @return
     */
    public List<String> getTeacherName(String majorID);

    /**
     *  根据班级名称,专业id获取学生列表
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getStudentListByClassNameAndMajorId(Map<String,Object> condition);

    /**
     * 根据教师姓名和专业id获取教师编号
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
     *  根据安排id获取教师安排id
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeID(String courseDesignArrangeID);

    /**
     *  从infoArrange表中根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignArrangeIDByDisplay(String display);

    /**
     * classArrange表 根据display查id
     * @param display
     * @return
     */
    public List<String> getcourseDesignClassArrangeIDByDisplay(String display);

    /**
     *  teacherArrange表 根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeIDByDisplay(String display);

    /**
     *  teacherStudent表根据display查询id
     * @param display
     * @return
     */
    public List<String> getcourseDesignTeacherStudentIDByDisplay(String display);

    /**
     *  根据培养方案课程编号学年专业查询已安排的课设信息
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition);

    /**
     * 通过培养方案课程编号,学年 专业查询课设安排id
     * @param  condition trainCourseID ，yearNum ,grade ,yearNum
     * @return
     */
    public List<String> findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition);

}
