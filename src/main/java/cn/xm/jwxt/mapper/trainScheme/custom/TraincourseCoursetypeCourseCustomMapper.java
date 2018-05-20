package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.TraincourseCoursetypeCourse;
import cn.xm.jwxt.bean.trainScheme.TraincourseCoursetypeCourseExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 手写的培养方案课程，课程类别，课程视图dao
 */
public interface TraincourseCoursetypeCourseCustomMapper {
    /**
     * 根据培养方案编号获取学时和学分分配信息(用于第11项查询)
     * @param trainSchemeId 培养方案编号
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getCreditCoursehourAllocateInfo(@Param("trainSchemeId") String trainSchemeId)throws SQLException;

    /**
     *  根据培养方案编号与课程性质统计课程性质，用于生成第(14项)
     * @param courseNature  课程性质
     * @param trainSchemeId 培养方案编号
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM traincourse_coursetype_course WHERE courseNature = #{courseNature} AND trainningSchemeID=#{trainSchemeId} ORDER BY CONVERT(coursePlatform USING gbk)")
    public List<Map<String,Object>> getCourseNatureAllocateInfoByTrainSchemeId(@Param("courseNature")String courseNature,@Param("trainSchemeId") String trainSchemeId)throws SQLException;

    /**
     *培养方案编号查询按学期统计信息
     * @param trainSchemeId     培养方案编号
     * @return  按学期统计信息
     * @throws SQLException
     */
    @Select("SELECT * FROM traincourse_coursetype_course WHERE trainningSchemeID = #{trainSchemeId} ORDER BY semester")
    public List<Map<String,Object>> getSemesterStaticsInfo(@Param("trainSchemeId")String trainSchemeId)throws SQLException;

}