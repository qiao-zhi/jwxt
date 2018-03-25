package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TrainCourse;
import cn.xm.jwxt.bean.trainScheme.TrainCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainCourseMapper {
    int countByExample(TrainCourseExample example);

    int deleteByExample(TrainCourseExample example);

    int deleteByPrimaryKey(Integer traincourseid);

    int insert(TrainCourse record);

    int insertSelective(TrainCourse record);

    List<TrainCourse> selectByExample(TrainCourseExample example);

    TrainCourse selectByPrimaryKey(Integer traincourseid);

    int updateByExampleSelective(@Param("record") TrainCourse record, @Param("example") TrainCourseExample example);

    int updateByExample(@Param("record") TrainCourse record, @Param("example") TrainCourseExample example);

    int updateByPrimaryKeySelective(TrainCourse record);

    int updateByPrimaryKey(TrainCourse record);
}