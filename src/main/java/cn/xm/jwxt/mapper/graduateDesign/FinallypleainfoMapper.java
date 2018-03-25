package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Finallypleainfo;
import cn.xm.jwxt.bean.graduateDesign.FinallypleainfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinallypleainfoMapper {
    int countByExample(FinallypleainfoExample example);

    int deleteByExample(FinallypleainfoExample example);

    int deleteByPrimaryKey(String pleaid);

    int insert(Finallypleainfo record);

    int insertSelective(Finallypleainfo record);

    List<Finallypleainfo> selectByExample(FinallypleainfoExample example);

    Finallypleainfo selectByPrimaryKey(String pleaid);

    int updateByExampleSelective(@Param("record") Finallypleainfo record, @Param("example") FinallypleainfoExample example);

    int updateByExample(@Param("record") Finallypleainfo record, @Param("example") FinallypleainfoExample example);

    int updateByPrimaryKeySelective(Finallypleainfo record);

    int updateByPrimaryKey(Finallypleainfo record);
}