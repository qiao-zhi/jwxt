package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课程基本信息Service
 * @Author: qlq
 * @Description
 * @Date: 16:53 2018/4/3
 */
public interface CourseBaseInfoService {
    /**
     * 增加课程基本信息
     * @param courseBaseInfo    课程信息实体类
     * @return  是否添加成功
     * @throws SQLException
     */
    public boolean addCourseBaseInfo(TCourseBaseInfo courseBaseInfo)throws SQLException;

    /**
     * 根据编号删除课程信息
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
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<TCourseBaseInfo> getCourseBaseInfosByCondition(Map condition)throws SQLException;
}
