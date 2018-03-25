package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachergredesigntitleMapper {
    int countByExample(TeachergredesigntitleExample example);

    int deleteByExample(TeachergredesigntitleExample example);

    int deleteByPrimaryKey(String teachertitleid);

    int insert(Teachergredesigntitle record);

    int insertSelective(Teachergredesigntitle record);

    List<Teachergredesigntitle> selectByExample(TeachergredesigntitleExample example);

    Teachergredesigntitle selectByPrimaryKey(String teachertitleid);

    int updateByExampleSelective(@Param("record") Teachergredesigntitle record, @Param("example") TeachergredesigntitleExample example);

    int updateByExample(@Param("record") Teachergredesigntitle record, @Param("example") TeachergredesigntitleExample example);

    int updateByPrimaryKeySelective(Teachergredesigntitle record);

    int updateByPrimaryKey(Teachergredesigntitle record);
}