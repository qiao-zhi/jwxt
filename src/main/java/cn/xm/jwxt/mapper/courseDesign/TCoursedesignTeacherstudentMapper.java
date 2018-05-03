package cn.xm.jwxt.mapper.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudent;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoursedesignTeacherstudentMapper {
    int countByExample(TCoursedesignTeacherstudentExample example);

    int deleteByExample(TCoursedesignTeacherstudentExample example);

    int deleteByPrimaryKey(String coursedesignteacherstudentid);

    int insert(TCoursedesignTeacherstudent record);

    int insertSelective(TCoursedesignTeacherstudent record);

    List<TCoursedesignTeacherstudent> selectByExample(TCoursedesignTeacherstudentExample example);

    TCoursedesignTeacherstudent selectByPrimaryKey(String coursedesignteacherstudentid);

    int updateByExampleSelective(@Param("record") TCoursedesignTeacherstudent record, @Param("example") TCoursedesignTeacherstudentExample example);

    int updateByExample(@Param("record") TCoursedesignTeacherstudent record, @Param("example") TCoursedesignTeacherstudentExample example);

    int updateByPrimaryKeySelective(TCoursedesignTeacherstudent record);

    int updateByPrimaryKey(TCoursedesignTeacherstudent record);
}