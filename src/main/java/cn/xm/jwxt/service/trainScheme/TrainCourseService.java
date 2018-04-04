package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TrainCourse;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 培养方案课程Service
 * @Author: qlq
 * @Description
 * @Date: 16:43 2018/4/3
 */
public interface TrainCourseService {
    /**
     * 增加培养方案课程
     * @param trainCourse
     * @return
     * @throws SQLException
     */
    public boolean addTrainCourse(TrainCourse trainCourse)throws SQLException;

    /**
     * 删除培养方案课程
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainCourseById(int trainCourseId)throws SQLException;

    /**
     * 更新培养方案课程
     * @param trainCourse
     * @return
     * @throws SQLException
     */
    public boolean updateTrainCourseByID(TrainCourse trainCourse)throws SQLException;

    /**
     * 查询单个培养方案课程
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public TrainCourse getTrainCourseByTrainCourseId(int trainCourseId)throws SQLException;

    /**
     * 根据培养方案编号查询培养方案课程
     * @param trainSchemeId
     * @return
     * @throws SQLException
     */
    public List<TrainCourse> getTrainCoursesByTrainId(String trainSchemeId)throws SQLException;

    /**
     * 分页查询所有的培养方案课程
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<TrainCourse> getTrainCoursesByCondition(Map condition)throws SQLException;
}
