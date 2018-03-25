package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.Coursearrangecheckinfo;
import cn.xm.jwxt.bean.arrangeCourse.CoursearrangecheckinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursearrangecheckinfoMapper {
    int countByExample(CoursearrangecheckinfoExample example);

    int deleteByExample(CoursearrangecheckinfoExample example);

    int insert(Coursearrangecheckinfo record);

    int insertSelective(Coursearrangecheckinfo record);

    List<Coursearrangecheckinfo> selectByExample(CoursearrangecheckinfoExample example);

    int updateByExampleSelective(@Param("record") Coursearrangecheckinfo record, @Param("example") CoursearrangecheckinfoExample example);

    int updateByExample(@Param("record") Coursearrangecheckinfo record, @Param("example") CoursearrangecheckinfoExample example);
}