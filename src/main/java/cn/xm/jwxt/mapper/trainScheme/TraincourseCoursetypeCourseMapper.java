package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TraincourseCoursetypeCourse;
import cn.xm.jwxt.bean.trainScheme.TraincourseCoursetypeCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraincourseCoursetypeCourseMapper {
    int countByExample(TraincourseCoursetypeCourseExample example);

    int deleteByExample(TraincourseCoursetypeCourseExample example);

    int insert(TraincourseCoursetypeCourse record);

    int insertSelective(TraincourseCoursetypeCourse record);

    List<TraincourseCoursetypeCourse> selectByExample(TraincourseCoursetypeCourseExample example);

    int updateByExampleSelective(@Param("record") TraincourseCoursetypeCourse record, @Param("example") TraincourseCoursetypeCourseExample example);

    int updateByExample(@Param("record") TraincourseCoursetypeCourse record, @Param("example") TraincourseCoursetypeCourseExample example);
}