package cn.xm.jwxt.mapper.courseDesign;

import java.util.List;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrangeExample;
import org.apache.ibatis.annotations.Param;

public interface TCoursedesignTeacherArrangeMapper {
    int countByExample(TCoursedesignTeacherArrangeExample example);

    int deleteByExample(TCoursedesignTeacherArrangeExample example);

    int deleteByPrimaryKey(String coursedesignteacherarrangeid);

    int insert(TCoursedesignTeacherArrange record);

    int insertSelective(TCoursedesignTeacherArrange record);

    List<TCoursedesignTeacherArrange> selectByExample(TCoursedesignTeacherArrangeExample example);

    TCoursedesignTeacherArrange selectByPrimaryKey(String coursedesignteacherarrangeid);

    int updateByExampleSelective(@Param("record") TCoursedesignTeacherArrange record, @Param("example") TCoursedesignTeacherArrangeExample example);

    int updateByExample(@Param("record") TCoursedesignTeacherArrange record, @Param("example") TCoursedesignTeacherArrangeExample example);

    int updateByPrimaryKeySelective(TCoursedesignTeacherArrange record);

    int updateByPrimaryKey(TCoursedesignTeacherArrange record);
}