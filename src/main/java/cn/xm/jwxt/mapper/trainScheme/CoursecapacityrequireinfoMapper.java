package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursecapacityrequireinfo;
import cn.xm.jwxt.bean.trainScheme.CoursecapacityrequireinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursecapacityrequireinfoMapper {
    int countByExample(CoursecapacityrequireinfoExample example);

    int deleteByExample(CoursecapacityrequireinfoExample example);

    int deleteByPrimaryKey(Integer coursecapacityid);

    int insert(Coursecapacityrequireinfo record);

    int insertSelective(Coursecapacityrequireinfo record);

    List<Coursecapacityrequireinfo> selectByExample(CoursecapacityrequireinfoExample example);

    Coursecapacityrequireinfo selectByPrimaryKey(Integer coursecapacityid);

    int updateByExampleSelective(@Param("record") Coursecapacityrequireinfo record, @Param("example") CoursecapacityrequireinfoExample example);

    int updateByExample(@Param("record") Coursecapacityrequireinfo record, @Param("example") CoursecapacityrequireinfoExample example);

    int updateByPrimaryKeySelective(Coursecapacityrequireinfo record);

    int updateByPrimaryKey(Coursecapacityrequireinfo record);
}