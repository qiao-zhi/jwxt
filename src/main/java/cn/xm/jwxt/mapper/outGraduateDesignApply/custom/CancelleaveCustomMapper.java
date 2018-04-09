package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Cancelleave;
import cn.xm.jwxt.bean.outGraduateDesignApply.CancelleaveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CancelleaveCustomMapper {
    int countByExample(CancelleaveExample example);

    int deleteByExample(CancelleaveExample example);

    int deleteByPrimaryKey(Integer cancelleaveid);

    int insert(Cancelleave record);

    int insertSelective(Cancelleave record);

    List<Cancelleave> selectByExample(CancelleaveExample example);

    Cancelleave selectByPrimaryKey(Integer cancelleaveid);

    int updateByExampleSelective(@Param("record") Cancelleave record, @Param("example") CancelleaveExample example);

    int updateByExample(@Param("record") Cancelleave record, @Param("example") CancelleaveExample example);

    int updateByPrimaryKeySelective(Cancelleave record);

    int updateByPrimaryKey(Cancelleave record);
}