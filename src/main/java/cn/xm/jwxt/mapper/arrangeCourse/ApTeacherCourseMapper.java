package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;
import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApTeacherCourseMapper {
    int countByExample(ApTeacherCourseExample example);

    int deleteByExample(ApTeacherCourseExample example);

    int deleteByPrimaryKey(String teacherCourseId);

    int insert(ApTeacherCourse record);

    int insertSelective(ApTeacherCourse record);

    List<ApTeacherCourse> selectByExample(ApTeacherCourseExample example);

    ApTeacherCourse selectByPrimaryKey(String teacherCourseId);

    int updateByExampleSelective(@Param("record") ApTeacherCourse record, @Param("example") ApTeacherCourseExample example);

    int updateByExample(@Param("record") ApTeacherCourse record, @Param("example") ApTeacherCourseExample example);

    int updateByPrimaryKeySelective(ApTeacherCourse record);

    int updateByPrimaryKey(ApTeacherCourse record);
}