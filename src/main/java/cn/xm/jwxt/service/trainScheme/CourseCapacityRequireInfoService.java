package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursecapacityrequireinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * @Author: qlq
 * @Description 培养方案课程能力对应service
 * @Date: 22:14 2018/4/23
 */
public interface CourseCapacityRequireInfoService {
    /**
     * 批量添加培养方案课程能力对应关系(1.删除培养方案能力，2重新添加)
     * @param coursecapacityrequireinfos    培养方案课程能力对应集合
     * @param trainCourseIds    需要删除的能力集合
     * @return  是否添加成功
     * @throws SQLException
     */
    public boolean addCoursecapacityrequireinfoBatch(List<Coursecapacityrequireinfo> coursecapacityrequireinfos,List<Integer> trainCourseIds)throws SQLException;

    /**
     * 添加单个培养方案能力对应关系
     * @return
     * @throws SQLException
     */
    public boolean addCoursecapacityrequireinfo()throws  SQLException;

    /**
     * 根据培养方案编号删除培养方案课程能力对应关系
     * @param trainSchemeId
     * @return
     * @throws SQLException
     */
    public boolean deleteCoursecapacitysByTrainSchemeId(String trainSchemeId)throws SQLException;

    /**
     * 根据培养方案课程删除课程能力对应关系
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public boolean deleteCourseCapacityByTrainCourseId(int trainCourseId)throws  SQLException;

    /**
     * 根据课程能力要求关系删除单个课程能力信息
     * @param courseCapacityId
     * @return
     * @throws SQLException
     */
    public boolean deleteCourseCapacityByCourseCapacityId(int courseCapacityId)throws SQLException;

    /**
     * 根据培养方案编号删除能力关系之后重新添加能力对应关系
     * @param trainSchemeId 需要删除的培养方案编号
     * @param coursecapacityrequireinfos 需要新加的集合
     * @return
     * @throws SQLException
     */
    public boolean updateCourseCapacityByTrainSchemeId(String trainSchemeId,List<Coursecapacityrequireinfo> coursecapacityrequireinfos)throws SQLException;

    /**
     * 根据条件组合查询培养方案课设能力(可能根据培养方案编号或者培养方案课程编号)
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getCourseCapacityByCondition(Map condition)throws SQLException;


    /**
     * 根据培养方案课程比俺还查询培养方案能力集合
     * @param trainCourseIds    培养方案课程ID集合
     * @return
     * @throws SQLException
     */
    public List<Coursecapacityrequireinfo> getTrainCourseCapacityByTrainCourseIds(List<Integer> trainCourseIds)throws SQLException;
    /**
     * 根据培养方案课程ID查询培养方案课程能力
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getCapacityByTrainCourseId(Integer trainCourseId)throws SQLException;

}