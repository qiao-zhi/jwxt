package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApArrangeCourseTaskMapper {
    int countByExample(ApArrangeCourseTaskExample example);

    int deleteByExample(ApArrangeCourseTaskExample example);

    int deleteByPrimaryKey(String arrangeTaskId);

    int insert(ApArrangeCourseTask record);

    int insertSelective(ApArrangeCourseTask record);

    List<ApArrangeCourseTask> selectByExample(ApArrangeCourseTaskExample example);

    ApArrangeCourseTask selectByPrimaryKey(String arrangeTaskId);

    int updateByExampleSelective(@Param("record") ApArrangeCourseTask record, @Param("example") ApArrangeCourseTaskExample example);

    int updateByExample(@Param("record") ApArrangeCourseTask record, @Param("example") ApArrangeCourseTaskExample example);

    int updateByPrimaryKeySelective(ApArrangeCourseTask record);

    int updateByPrimaryKey(ApArrangeCourseTask record);
}