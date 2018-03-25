package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleaarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.PleaarrangeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PleaarrangeinfoMapper {
    int countByExample(PleaarrangeinfoExample example);

    int deleteByExample(PleaarrangeinfoExample example);

    int deleteByPrimaryKey(Integer arrangeid);

    int insert(Pleaarrangeinfo record);

    int insertSelective(Pleaarrangeinfo record);

    List<Pleaarrangeinfo> selectByExample(PleaarrangeinfoExample example);

    Pleaarrangeinfo selectByPrimaryKey(Integer arrangeid);

    int updateByExampleSelective(@Param("record") Pleaarrangeinfo record, @Param("example") PleaarrangeinfoExample example);

    int updateByExample(@Param("record") Pleaarrangeinfo record, @Param("example") PleaarrangeinfoExample example);

    int updateByPrimaryKeySelective(Pleaarrangeinfo record);

    int updateByPrimaryKey(Pleaarrangeinfo record);
}