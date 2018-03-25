package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo2;
import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Trainschemeinfo2Mapper {
    int countByExample(Trainschemeinfo2Example example);

    int deleteByExample(Trainschemeinfo2Example example);

    int deleteByPrimaryKey(String trainningschemeid2);

    int insert(Trainschemeinfo2 record);

    int insertSelective(Trainschemeinfo2 record);

    List<Trainschemeinfo2> selectByExample(Trainschemeinfo2Example example);

    Trainschemeinfo2 selectByPrimaryKey(String trainningschemeid2);

    int updateByExampleSelective(@Param("record") Trainschemeinfo2 record, @Param("example") Trainschemeinfo2Example example);

    int updateByExample(@Param("record") Trainschemeinfo2 record, @Param("example") Trainschemeinfo2Example example);

    int updateByPrimaryKeySelective(Trainschemeinfo2 record);

    int updateByPrimaryKey(Trainschemeinfo2 record);
}