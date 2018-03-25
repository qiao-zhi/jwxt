package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckarrangeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CencheckarrangeinfoMapper {
    int countByExample(CencheckarrangeinfoExample example);

    int deleteByExample(CencheckarrangeinfoExample example);

    int deleteByPrimaryKey(Integer cenarrangeinfoid);

    int insert(Cencheckarrangeinfo record);

    int insertSelective(Cencheckarrangeinfo record);

    List<Cencheckarrangeinfo> selectByExample(CencheckarrangeinfoExample example);

    Cencheckarrangeinfo selectByPrimaryKey(Integer cenarrangeinfoid);

    int updateByExampleSelective(@Param("record") Cencheckarrangeinfo record, @Param("example") CencheckarrangeinfoExample example);

    int updateByExample(@Param("record") Cencheckarrangeinfo record, @Param("example") CencheckarrangeinfoExample example);

    int updateByPrimaryKeySelective(Cencheckarrangeinfo record);

    int updateByPrimaryKey(Cencheckarrangeinfo record);
}