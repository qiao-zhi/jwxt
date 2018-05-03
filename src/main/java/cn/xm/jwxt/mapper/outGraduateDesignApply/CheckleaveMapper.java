package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkleave;
import cn.xm.jwxt.bean.outGraduateDesignApply.CheckleaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckleaveMapper {
    int countByExample(CheckleaveExample example);

    int deleteByExample(CheckleaveExample example);

    int deleteByPrimaryKey(String checkleaveid);

    int insert(Checkleave record);

    int insertSelective(Checkleave record);

    List<Checkleave> selectByExample(CheckleaveExample example);

    Checkleave selectByPrimaryKey(String checkleaveid);

    int updateByExampleSelective(@Param("record") Checkleave record, @Param("example") CheckleaveExample example);

    int updateByExample(@Param("record") Checkleave record, @Param("example") CheckleaveExample example);

    int updateByPrimaryKeySelective(Checkleave record);

    int updateByPrimaryKey(Checkleave record);
}