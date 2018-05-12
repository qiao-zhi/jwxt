package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.Coursecapacityrequireinfo;
import cn.xm.jwxt.bean.trainScheme.CoursecapacityrequireinfoExample;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 培养方案课程能力手写的DAO
 */
public interface CoursecapacityrequireinfoCustomMapper {

    /**
     * 根据培养方案课程比俺还查询培养方案能力集合
     * @param trainCourseIds    培养方案课程ID集合
     * @return
     * @throws SQLException
     */
    public List<Coursecapacityrequireinfo> getTrainCourseCapacityByTrainCourseIds(List<Integer> trainCourseIds)throws SQLException;


    /**
     * 根据培养方案课ID批量删除培养方案课程能力集合
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public int deleteCoursecapacitByTrainCourseId(List<Integer> trainCourseId)throws SQLException;

    /**
     * 批量添加培养方案课程能力对应关系
     * @param coursecapacityrequireinfos    能力集合
     * @return
     * @throws SQLException
     */
    public int addCoursecapacitBatch(List<Coursecapacityrequireinfo> coursecapacityrequireinfos)throws SQLException;

    /**
     * 根据培养方案课程ID查询培养方案课程能力
     * @param trainCourseId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getCapacityByTrainCourseId(@Param("trainCourseID") Integer trainCourseId)throws SQLException;

}