package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgraduateassignment;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutgraduateassignmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutgraduateassignmentMapper {
    int countByExample(OutgraduateassignmentExample example);

    int deleteByExample(OutgraduateassignmentExample example);

    int deleteByPrimaryKey(String assignmentid);

    int insert(Outgraduateassignment record);

    int insertSelective(Outgraduateassignment record);

    List<Outgraduateassignment> selectByExample(OutgraduateassignmentExample example);

    Outgraduateassignment selectByPrimaryKey(String assignmentid);

    int updateByExampleSelective(@Param("record") Outgraduateassignment record, @Param("example") OutgraduateassignmentExample example);

    int updateByExample(@Param("record") Outgraduateassignment record, @Param("example") OutgraduateassignmentExample example);

    int updateByPrimaryKeySelective(Outgraduateassignment record);

    int updateByPrimaryKey(Outgraduateassignment record);
}