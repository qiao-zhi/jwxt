package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
@SuppressWarnings("all")
public interface TCourseBaseInfoCustomMapper {
    /**
     * 根据课程编号查询课程总数，判断当前是否存在对应课程编号的课程
     * @param courseNum 课程编号
     * @return  查到的总数
     * @throws SQLException
     */
    @Select("select count(courseId) from t_course_base_info where coursenum=#{courseNum}")
    public int getCountByCourseNum(@Param("courseNum")String courseNum)throws SQLException;


    /**
     * 分页组合条件查询课程信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, Object>> getCourseBaseInfosByCondition(Map<String,Object> condition) throws SQLException;

}