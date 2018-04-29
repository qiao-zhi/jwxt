package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApTaskArrangeCourseMapper {
    int countByExample(ApTaskArrangeCourseExample example);

    int deleteByExample(ApTaskArrangeCourseExample example);

    int deleteByPrimaryKey(String arrangeCourseId);

    int insert(ApTaskArrangeCourse record);

    int insertSelective(ApTaskArrangeCourse record);

    List<ApTaskArrangeCourse> selectByExample(ApTaskArrangeCourseExample example);

    ApTaskArrangeCourse selectByPrimaryKey(String arrangeCourseId);

    int updateByExampleSelective(@Param("record") ApTaskArrangeCourse record, @Param("example") ApTaskArrangeCourseExample example);

    int updateByExample(@Param("record") ApTaskArrangeCourse record, @Param("example") ApTaskArrangeCourseExample example);

    int updateByPrimaryKeySelective(ApTaskArrangeCourse record);

    int updateByPrimaryKey(ApTaskArrangeCourse record);
}