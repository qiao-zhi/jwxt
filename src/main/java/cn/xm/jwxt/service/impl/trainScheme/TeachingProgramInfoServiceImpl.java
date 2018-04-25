package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfo;
import cn.xm.jwxt.service.trainScheme.TeachingProgramInfoService;

import java.sql.SQLException;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:39 2018/4/24
 */
public class TeachingProgramInfoServiceImpl implements TeachingProgramInfoService {
    @Override
    public boolean addTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTeachingProgramInfoById(int teachingprogramInfoId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTeachingProgramInfoByCourseId(String courseId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTeachingProgramInfo(int teachingprogramInfoId, TTeachingprogramInfo teachingprogramInfo) throws SQLException {
        return false;
    }

    @Override
    public TTeachingprogramInfo getTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException {
        return null;
    }
}
