package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkoutgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.CheckoutgradesigninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckoutgradesigninfoMapper {
    int countByExample(CheckoutgradesigninfoExample example);

    int deleteByExample(CheckoutgradesigninfoExample example);

    int deleteByPrimaryKey(String checkoutapplyid);

    int insert(Checkoutgradesigninfo record);

    int insertSelective(Checkoutgradesigninfo record);

    List<Checkoutgradesigninfo> selectByExample(CheckoutgradesigninfoExample example);

    Checkoutgradesigninfo selectByPrimaryKey(String checkoutapplyid);

    int updateByExampleSelective(@Param("record") Checkoutgradesigninfo record, @Param("example") CheckoutgradesigninfoExample example);

    int updateByExample(@Param("record") Checkoutgradesigninfo record, @Param("example") CheckoutgradesigninfoExample example);

    int updateByPrimaryKeySelective(Checkoutgradesigninfo record);

    int updateByPrimaryKey(Checkoutgradesigninfo record);
}