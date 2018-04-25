package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;
import cn.xm.jwxt.service.trainScheme.CourseTypeInfoService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:39 2018/4/24
 */
public class CourseTypeInfoServiceImpl implements CourseTypeInfoService {
    @Override
    public boolean addcourseTypeInfo(Coursetypeinfo coursetypeinfo) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCourseTypeInfoById(int courseId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseTypeInfoById(Coursetypeinfo coursetypeinfo) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> getCourseInfosByCourseTypeId(String coursetypeinfoID) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, Object>> getTypeTreeByTrainSchemeId(String trainSchemeId) throws SQLException {
        return null;
    }
}
