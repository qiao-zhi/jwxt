package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Cancelleave;
import cn.xm.jwxt.bean.outGraduateDesignApply.CancelleaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CancelleaveMapper {
    int countByExample(CancelleaveExample example);

    int deleteByExample(CancelleaveExample example);

    int deleteByPrimaryKey(String cancelleaveid);

    int insert(Cancelleave record);

    int insertSelective(Cancelleave record);

    List<Cancelleave> selectByExample(CancelleaveExample example);

    Cancelleave selectByPrimaryKey(String cancelleaveid);

    int updateByExampleSelective(@Param("record") Cancelleave record, @Param("example") CancelleaveExample example);

    int updateByExample(@Param("record") Cancelleave record, @Param("example") CancelleaveExample example);

    int updateByPrimaryKeySelective(Cancelleave record);

    int updateByPrimaryKey(Cancelleave record);
}