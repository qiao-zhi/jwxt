package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Plearesultinfo;
import cn.xm.jwxt.bean.graduateDesign.PlearesultinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlearesultinfoMapper {
    int countByExample(PlearesultinfoExample example);

    int deleteByExample(PlearesultinfoExample example);

    int deleteByPrimaryKey(Integer plearesultid);

    int insert(Plearesultinfo record);

    int insertSelective(Plearesultinfo record);

    List<Plearesultinfo> selectByExample(PlearesultinfoExample example);

    Plearesultinfo selectByPrimaryKey(Integer plearesultid);

    int updateByExampleSelective(@Param("record") Plearesultinfo record, @Param("example") PlearesultinfoExample example);

    int updateByExample(@Param("record") Plearesultinfo record, @Param("example") PlearesultinfoExample example);

    int updateByPrimaryKeySelective(Plearesultinfo record);

    int updateByPrimaryKey(Plearesultinfo record);
}