package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesignsurebook;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutgradesignsurebookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutgradesignsurebookMapper {
    int countByExample(OutgradesignsurebookExample example);

    int deleteByExample(OutgradesignsurebookExample example);

    int deleteByPrimaryKey(String sureid);

    int insert(Outgradesignsurebook record);

    int insertSelective(Outgradesignsurebook record);

    List<Outgradesignsurebook> selectByExample(OutgradesignsurebookExample example);

    Outgradesignsurebook selectByPrimaryKey(String sureid);

    int updateByExampleSelective(@Param("record") Outgradesignsurebook record, @Param("example") OutgradesignsurebookExample example);

    int updateByExample(@Param("record") Outgradesignsurebook record, @Param("example") OutgradesignsurebookExample example);

    int updateByPrimaryKeySelective(Outgradesignsurebook record);

    int updateByPrimaryKey(Outgradesignsurebook record);
}