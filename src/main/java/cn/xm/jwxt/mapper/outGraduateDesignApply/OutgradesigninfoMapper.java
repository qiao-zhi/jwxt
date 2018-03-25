package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutgradesigninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutgradesigninfoMapper {
    int countByExample(OutgradesigninfoExample example);

    int deleteByExample(OutgradesigninfoExample example);

    int deleteByPrimaryKey(String outsideapplyid);

    int insert(Outgradesigninfo record);

    int insertSelective(Outgradesigninfo record);

    List<Outgradesigninfo> selectByExample(OutgradesigninfoExample example);

    Outgradesigninfo selectByPrimaryKey(String outsideapplyid);

    int updateByExampleSelective(@Param("record") Outgradesigninfo record, @Param("example") OutgradesigninfoExample example);

    int updateByExample(@Param("record") Outgradesigninfo record, @Param("example") OutgradesigninfoExample example);

    int updateByPrimaryKeySelective(Outgradesigninfo record);

    int updateByPrimaryKey(Outgradesigninfo record);
}