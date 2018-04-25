package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacher;
import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApClassTeacherMapper {
    int countByExample(ApClassTeacherExample example);

    int deleteByExample(ApClassTeacherExample example);

    int deleteByPrimaryKey(String classTeacherId);

    int insert(ApClassTeacher record);

    int insertSelective(ApClassTeacher record);

    List<ApClassTeacher> selectByExample(ApClassTeacherExample example);

    ApClassTeacher selectByPrimaryKey(String classTeacherId);

    int updateByExampleSelective(@Param("record") ApClassTeacher record, @Param("example") ApClassTeacherExample example);

    int updateByExample(@Param("record") ApClassTeacher record, @Param("example") ApClassTeacherExample example);

    int updateByPrimaryKeySelective(ApClassTeacher record);

    int updateByPrimaryKey(ApClassTeacher record);
}