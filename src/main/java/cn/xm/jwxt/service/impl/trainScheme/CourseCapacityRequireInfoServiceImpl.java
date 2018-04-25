package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursecapacityrequireinfo;
import cn.xm.jwxt.service.trainScheme.CourseCapacityRequireInfoService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:38 2018/4/24
 */
public class CourseCapacityRequireInfoServiceImpl implements CourseCapacityRequireInfoService {
    @Override
    public boolean addCoursecapacityrequireinfoBatch(List<Coursecapacityrequireinfo> coursecapacityrequireinfos) throws SQLException {
        return false;
    }

    @Override
    public boolean addCoursecapacityrequireinfo() throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCoursecapacitysByTrainSchemeId(String trainSchemeId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCourseCapacityByTrainCourseId(int trainCourseId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCourseCapacityByCourseCapacityId(int courseCapacityId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseCapacityByTrainSchemeId(String trainSchemeId, List<Coursecapacityrequireinfo> coursecapacityrequireinfos) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> getCourseCapacityByCondition(Map condition) throws SQLException {
        return null;
    }
}
