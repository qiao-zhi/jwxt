package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * CourseBaseInfoService实现类
 */
public class CourseBaseInfoServiceImpl implements CourseBaseInfoService {
    @Override
    public boolean addCourseBaseInfo(TCourseBaseInfo courseBaseInfo) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCourseBaseInfoById(String courseId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseBaseInfoById(TCourseBaseInfo courseBaseInfo) throws SQLException {
        return false;
    }

    @Override
    public TCourseBaseInfo getCourseBaseInfoById(String courseId) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String,Object>> getCourseBaseInfosByCondition(Map condition) throws SQLException {
        return null;
    }
}
