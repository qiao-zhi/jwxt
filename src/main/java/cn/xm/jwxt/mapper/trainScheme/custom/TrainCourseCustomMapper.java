package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.bean.trainScheme.TrainCourse;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 培养方案课程手写的mapper
 */
public interface TrainCourseCustomMapper {

    /**
     * 根据培养方案编号查询还未安排的课程(用于给培养方案排课)
     * @param condition 组合条件，里面至少应该包含培养方案编号等信息
     * @return  满足条件的集合
     * @throws SQLException
     */
    public List<TCourseBaseInfo> getCoursesBseInfoByCondition(Map<String,Object> condition)throws SQLException;

    /**
     * 批量添加培养方案课程
     * @param trainCourses
     * @return
     * @throws SQLException
     */
    public int addTrainCourseBatch(List<TrainCourse> trainCourses)throws SQLException;


    /**
     * 分页查询已经排好的课程信息(关联查询培养方案，课程，课程类别，培养方案课程表)
     * @param condition:组合条件(必须包含一个培养方案编号)
     * @return  数据集合
     * @throws SQLException
     */
    public List<Map<String,Object>> getTrainCoursesByCondition(Map<String,Object> condition)throws SQLException;


}