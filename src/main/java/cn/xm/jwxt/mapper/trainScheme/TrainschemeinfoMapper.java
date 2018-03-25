package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;
import cn.xm.jwxt.bean.trainScheme.TrainschemeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainschemeinfoMapper {
    int countByExample(TrainschemeinfoExample example);

    int deleteByExample(TrainschemeinfoExample example);

    int deleteByPrimaryKey(String trainingschemeid);

    int insert(Trainschemeinfo record);

    int insertSelective(Trainschemeinfo record);

    List<Trainschemeinfo> selectByExample(TrainschemeinfoExample example);

    Trainschemeinfo selectByPrimaryKey(String trainingschemeid);

    int updateByExampleSelective(@Param("record") Trainschemeinfo record, @Param("example") TrainschemeinfoExample example);

    int updateByExample(@Param("record") Trainschemeinfo record, @Param("example") TrainschemeinfoExample example);

    int updateByPrimaryKeySelective(Trainschemeinfo record);

    int updateByPrimaryKey(Trainschemeinfo record);
}