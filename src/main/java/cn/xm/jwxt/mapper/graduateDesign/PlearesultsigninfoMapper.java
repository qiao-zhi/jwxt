package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Plearesultsigninfo;
import cn.xm.jwxt.bean.graduateDesign.PlearesultsigninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlearesultsigninfoMapper {
    int countByExample(PlearesultsigninfoExample example);

    int deleteByExample(PlearesultsigninfoExample example);

    int deleteByPrimaryKey(Integer plearesultsignid);

    int insert(Plearesultsigninfo record);

    int insertSelective(Plearesultsigninfo record);

    List<Plearesultsigninfo> selectByExample(PlearesultsigninfoExample example);

    Plearesultsigninfo selectByPrimaryKey(Integer plearesultsignid);

    int updateByExampleSelective(@Param("record") Plearesultsigninfo record, @Param("example") PlearesultsigninfoExample example);

    int updateByExample(@Param("record") Plearesultsigninfo record, @Param("example") PlearesultsigninfoExample example);

    int updateByPrimaryKeySelective(Plearesultsigninfo record);

    int updateByPrimaryKey(Plearesultsigninfo record);
}