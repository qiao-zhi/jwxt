package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignagreemen;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutsidegradesignagreemenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutsidegradesignagreemenMapper {
    int countByExample(OutsidegradesignagreemenExample example);

    int deleteByExample(OutsidegradesignagreemenExample example);

    int deleteByPrimaryKey(String agreementid);

    int insert(Outsidegradesignagreemen record);

    int insertSelective(Outsidegradesignagreemen record);

    List<Outsidegradesignagreemen> selectByExample(OutsidegradesignagreemenExample example);

    Outsidegradesignagreemen selectByPrimaryKey(String agreementid);

    int updateByExampleSelective(@Param("record") Outsidegradesignagreemen record, @Param("example") OutsidegradesignagreemenExample example);

    int updateByExample(@Param("record") Outsidegradesignagreemen record, @Param("example") OutsidegradesignagreemenExample example);

    int updateByPrimaryKeySelective(Outsidegradesignagreemen record);

    int updateByPrimaryKey(Outsidegradesignagreemen record);
}