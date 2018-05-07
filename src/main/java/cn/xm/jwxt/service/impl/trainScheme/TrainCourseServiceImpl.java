package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TrainCourse;
import cn.xm.jwxt.service.trainScheme.TrainCourseService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:40 2018/4/24
 */
public class TrainCourseServiceImpl implements TrainCourseService {
    @Override
    public boolean addTrainCourse(List<TrainCourse> trainCourses) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainCourseByTrainSchemeId(String trainSchemeId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainCourseByCoureseTypeId(String courseTypeId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTrainCourseByID(String courseTypeId, List<TrainCourse> trainCourses) throws SQLException {
        return false;
    }

    @Override
    public Map<String, Object> getTrainCourseByTrainCourseId(int trainCourseId) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, Object>> getTrainCoursesByTrainId(String trainSchemeId) throws SQLException {
        return null;
    }

    @Override
    public List<TrainCourse> getTrainCoursesByCondition(Map condition) throws SQLException {
        return null;
    }
}
