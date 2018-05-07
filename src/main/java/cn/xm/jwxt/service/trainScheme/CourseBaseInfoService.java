package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * 课程基本信息Service(课程库)
 * @Author: qlq
 * @Description
 * @Date: 16:53 2018/4/3
 */
public interface CourseBaseInfoService {
    /**
     * 根据课程编号查询课程总数，判断当前是否存在对应课程编号的课程
     * @param courseNum 课程编号
     * @return  查到的总数
     * @throws SQLException
     */
    public int getCountByCourseNum(String courseNum)throws SQLException;

    /**
     * 增加课程基本信息
     * @param courseBaseInfo    课程信息实体类
     * @return  是否添加成功
     * @throws SQLException
     */
    public boolean addCourseBaseInfo(TCourseBaseInfo courseBaseInfo)throws SQLException;

    /**
     * 增加课程基本信息
     * @param courseBaseInfos    课程信息实体类集合(用于批量添加)
     * @return  重复的课程编号(用于筛选重复的课程编号)
     * @throws SQLException
     */
    public List<String> addCourseBaseInfoBatch(List<TCourseBaseInfo> courseBaseInfos)throws SQLException;

    /**
     * 根据编号删除课程信息(修改remark1,标记为0)
     * @param courseId
     * @return
     * @throws SQLException
     */
    public boolean deleteCourseBaseInfoById(String courseId)throws SQLException;

    /**
     * 修改课程基本信息
     * @param courseBaseInfo    课程基本信息
     * @return  是否成功
     * @throws SQLException
     */
    public boolean updateCourseBaseInfoById(TCourseBaseInfo courseBaseInfo)throws SQLException;

    /**
     * 根据课程ID查询课程基本信息
     * @param courseId
     * @return
     * @throws SQLException
     */
    public TCourseBaseInfo getCourseBaseInfoById(String courseId)throws SQLException;

    /**
     * 组合条件分页查询课程信息
     * @param condition 组合条件
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getCourseBaseInfosByCondition(Map<String,Object> condition)throws SQLException;
}
