package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkassignment;
import cn.xm.jwxt.bean.outGraduateDesignApply.CheckassignmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckassignmentMapper {
    int countByExample(CheckassignmentExample example);

    int deleteByExample(CheckassignmentExample example);

    int deleteByPrimaryKey(String checkId);

    int insert(Checkassignment record);

    int insertSelective(Checkassignment record);

    List<Checkassignment> selectByExample(CheckassignmentExample example);

    Checkassignment selectByPrimaryKey(String checkId);

    int updateByExampleSelective(@Param("record") Checkassignment record, @Param("example") CheckassignmentExample example);

    int updateByExample(@Param("record") Checkassignment record, @Param("example") CheckassignmentExample example);

    int updateByPrimaryKeySelective(Checkassignment record);

    int updateByPrimaryKey(Checkassignment record);
}