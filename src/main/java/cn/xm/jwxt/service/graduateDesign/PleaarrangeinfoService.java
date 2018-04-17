package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleaarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.PleaarrangeinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 表毕设资料提交信息表Service
 */
public interface PleaarrangeinfoService {
    int countByExample(PleaarrangeinfoExample example);

    boolean deleteByExample(PleaarrangeinfoExample example);

    boolean deleteByPrimaryKey(Integer arrangeid);

    boolean insert(Pleaarrangeinfo record);

    boolean insertSelective(Pleaarrangeinfo record);

    List<Pleaarrangeinfo> selectByExample(PleaarrangeinfoExample example);

    Pleaarrangeinfo selectByPrimaryKey(Integer arrangeid);

    boolean updateByExampleSelective(@Param("record") Pleaarrangeinfo record, @Param("example") PleaarrangeinfoExample example);

    boolean updateByExample(@Param("record") Pleaarrangeinfo record, @Param("example") PleaarrangeinfoExample example);

    boolean updateByPrimaryKeySelective(Pleaarrangeinfo record);

    boolean updateByPrimaryKey(Pleaarrangeinfo record);
}
