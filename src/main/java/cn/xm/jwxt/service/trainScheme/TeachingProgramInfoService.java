package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfo;

import java.sql.SQLException;
import java.util.List;

/**
 * 完
 * 课程教学资料Service
 * @Author: qlq
 * @Description 课程教学资料Service
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
     * @param teachingprogramInfoId 资料编号
     * @return
     * @throws SQLException
     */
    public boolean deleteTeachingProgramInfoById(int teachingprogramInfoId) throws SQLException;

    /**
     * 根据课程编号删除培训资料(1.删除服务器上文件，2.删除数据库内容)
     * @param courseId  课程编号
     * @return
     * @throws SQLException
     */
    public boolean deleteTeachingProgramInfoByCourseId(String courseId) throws SQLException;

    /**
     * 修改培训资料，主要是更换培训资料内容(1.根据编号删除培训资料 2.重新上传并保存资料)
     * @param teachingprogramInfoId 需要删除的资料编号
     * @param teachingprogramInfo   需要重新添加的资料信息
     * @return
     * @throws SQLException
     */
    public boolean updateTeachingProgramInfo(int teachingprogramInfoId,TTeachingprogramInfo teachingprogramInfo) throws SQLException;

    /**
     * 在线预览培训资料信息(主要是预览pdf文件)
     * @param teachingprogramInfo
     * @return
     * @throws SQLException
     */
    public TTeachingprogramInfo getTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException;
}
