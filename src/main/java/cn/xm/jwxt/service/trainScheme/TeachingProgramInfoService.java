package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfo;

import java.sql.SQLException;
import java.util.List;

/**
 * 课程教学资料Service
 *
 * @Author: qlq
 * @Description
 * @Date: 16:59 2018/4/3
 */
public interface TeachingProgramInfoService {
    /**
     * 增加课程教学资料(1.存到本地，2.数据库存入信息)
     *
     * @param teachingprogramInfo
     * @return
     * @throws SQLException
     */
    public boolean addTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException;

    /**
     * 根据培训资料编号删除培训资料(1.删除服务器上文件，2.删除数据库内容)
     * @param teachingprogramInfo
     * @return
     * @throws SQLException
     */
    public boolean deleteTeachingProgramInfoById(TTeachingprogramInfo teachingprogramInfo) throws SQLException;

    /**
     *
     * @param teachingprogramInfo
     * @return
     * @throws SQLException
     */
    public boolean updateTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException;

    public TTeachingprogramInfo getTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException;

    public List<TTeachingprogramInfo> getTeachingProgramInfosByCourseId(String courseId) throws SQLException;
}
