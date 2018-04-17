package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckarrangeinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.CencheckarrangeinfoMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 中期检查表Service
 */
public interface CencheckarrangeinfoService {

    int countByCencheckarrangeinfo(CencheckarrangeinfoExample example);

    boolean deleteByExample(CencheckarrangeinfoExample example);

    boolean deleteByPrimaryKey(Integer cenarrangeinfoid);

    boolean insert(Cencheckarrangeinfo record);

    boolean insertSelective(Cencheckarrangeinfo record);

    List<Cencheckarrangeinfo> selectByExample(CencheckarrangeinfoExample example);

    Cencheckarrangeinfo selectByPrimaryKey(Integer cenarrangeinfoid);

    boolean updateByExampleSelective(@Param("record") Cencheckarrangeinfo record, @Param("example") CencheckarrangeinfoExample example);

    boolean updateByExample(@Param("record") Cencheckarrangeinfo record, @Param("example") CencheckarrangeinfoExample example);

    boolean updateByPrimaryKeySelective(Cencheckarrangeinfo record);

    boolean updateByPrimaryKey(Cencheckarrangeinfo record);

}