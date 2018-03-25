package cn.xm.jwxt.mapper.courseDesign;

import cn.xm.jwxt.bean.courseDesign.Coursedesignteacherstudent;
import cn.xm.jwxt.bean.courseDesign.CoursedesignteacherstudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursedesignteacherstudentMapper {
    int countByExample(CoursedesignteacherstudentExample example);

    int deleteByExample(CoursedesignteacherstudentExample example);

    int deleteByPrimaryKey(String coursedesignteacherstudentid);

    int insert(Coursedesignteacherstudent record);

    int insertSelective(Coursedesignteacherstudent record);

    List<Coursedesignteacherstudent> selectByExample(CoursedesignteacherstudentExample example);

    Coursedesignteacherstudent selectByPrimaryKey(String coursedesignteacherstudentid);

    int updateByExampleSelective(@Param("record") Coursedesignteacherstudent record, @Param("example") CoursedesignteacherstudentExample example);

    int updateByExample(@Param("record") Coursedesignteacherstudent record, @Param("example") CoursedesignteacherstudentExample example);

    int updateByPrimaryKeySelective(Coursedesignteacherstudent record);

    int updateByPrimaryKey(Coursedesignteacherstudent record);
}