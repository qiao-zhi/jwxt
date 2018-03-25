package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutgradesigntitleapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutgradesigntitleapplyMapper {
    int countByExample(OutgradesigntitleapplyExample example);

    int deleteByExample(OutgradesigntitleapplyExample example);

    int deleteByPrimaryKey(String outgradesignapplyid);

    int insert(Outgradesigntitleapply record);

    int insertSelective(Outgradesigntitleapply record);

    List<Outgradesigntitleapply> selectByExample(OutgradesigntitleapplyExample example);

    Outgradesigntitleapply selectByPrimaryKey(String outgradesignapplyid);

    int updateByExampleSelective(@Param("record") Outgradesigntitleapply record, @Param("example") OutgradesigntitleapplyExample example);

    int updateByExample(@Param("record") Outgradesigntitleapply record, @Param("example") OutgradesigntitleapplyExample example);

    int updateByPrimaryKeySelective(Outgradesigntitleapply record);

    int updateByPrimaryKey(Outgradesigntitleapply record);
}