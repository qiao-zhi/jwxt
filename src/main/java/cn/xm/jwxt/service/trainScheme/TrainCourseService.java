package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TrainCourse;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * 培养方案课程Service
 * @Author: qlq
 * @Description
 * @Date: 16:43 2018/4/3
 */
public interface TrainCourseService {
    /**
     * 批量增加培养方案课程
     * @param trainCourses
     * @return
     * @throws SQLException
     */
    public boolean addTrainCourse(List<TrainCourse> trainCourses)throws SQLException;

    /**
     * 根据培养方案编号删除培养方案课程
     * @param trainSchemeId 培养方案编号
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainCourseByTrainSchemeId(String trainSchemeId)throws SQLException;

    /**
     * 根据培养方案课程类别删除培养方案课程
     * @param courseTypeId 培养方案课程类别编号
     * @return  是否删除成功
     * @throws SQLException
     */
    public boolean deleteTrainCourseByCoureseTypeId(String courseTypeId)throws SQLException;

    /**
     * 更新培养方案课程(1.根据培养方案编号先删除。2.重新添加培养方案)
     * @param courseTypeId  根据培养方案编号先删除
     * @param trainCourses  重新添加的课程集合
     * @return
     * @throws SQLException
     */
    public boolean updateTrainCourseByID(String courseTypeId,List<TrainCourse> trainCourses)throws SQLException;

    /**
     * 查询单个培养方案课程(根据培养方案课程编号关联查出培养方案课程类别以及课程详细信息)
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public Map<String,Object> getTrainCourseByTrainCourseId(int trainCourseId)throws SQLException;

    /**
     * 根据培养方案编号查询培养方案课程(只查询课程信息，不查询对应的能力信息)
     * @param trainSchemeId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getTrainCoursesByTrainId(String trainSchemeId)throws SQLException;

    /**
     * 分页查询所有的培养方案课程
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<TrainCourse> getTrainCoursesByCondition(Map condition)throws SQLException;

}
