package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.Teachercourseinfo;
import cn.xm.jwxt.bean.arrangeCourse.TeachercourseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachercourseinfoMapper {
    int countByExample(TeachercourseinfoExample example);

    int deleteByExample(TeachercourseinfoExample example);

    int deleteByPrimaryKey(Integer teachercourseid);

    int insert(Teachercourseinfo record);

    int insertSelective(Teachercourseinfo record);

    List<Teachercourseinfo> selectByExample(TeachercourseinfoExample example);

    Teachercourseinfo selectByPrimaryKey(Integer teachercourseid);

    int updateByExampleSelective(@Param("record") Teachercourseinfo record, @Param("example") TeachercourseinfoExample example);

    int updateByExample(@Param("record") Teachercourseinfo record, @Param("example") TeachercourseinfoExample example);

    int updateByPrimaryKeySelective(Teachercourseinfo record);

    int updateByPrimaryKey(Teachercourseinfo record);
}