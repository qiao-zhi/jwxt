package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.Coursearrangementbaseinfo;
import cn.xm.jwxt.bean.arrangeCourse.CoursearrangementbaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursearrangementbaseinfoMapper {
    int countByExample(CoursearrangementbaseinfoExample example);

    int deleteByExample(CoursearrangementbaseinfoExample example);

    int deleteByPrimaryKey(String arrangebaseinfoid);

    int insert(Coursearrangementbaseinfo record);

    int insertSelective(Coursearrangementbaseinfo record);

    List<Coursearrangementbaseinfo> selectByExample(CoursearrangementbaseinfoExample example);

    Coursearrangementbaseinfo selectByPrimaryKey(String arrangebaseinfoid);

    int updateByExampleSelective(@Param("record") Coursearrangementbaseinfo record, @Param("example") CoursearrangementbaseinfoExample example);

    int updateByExample(@Param("record") Coursearrangementbaseinfo record, @Param("example") CoursearrangementbaseinfoExample example);

    int updateByPrimaryKeySelective(Coursearrangementbaseinfo record);

    int updateByPrimaryKey(Coursearrangementbaseinfo record);
}