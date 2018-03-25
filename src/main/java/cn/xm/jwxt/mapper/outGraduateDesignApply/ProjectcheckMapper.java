package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Projectcheck;
import cn.xm.jwxt.bean.outGraduateDesignApply.ProjectcheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectcheckMapper {
    int countByExample(ProjectcheckExample example);

    int deleteByExample(ProjectcheckExample example);

    int deleteByPrimaryKey(String checkId);

    int insert(Projectcheck record);

    int insertSelective(Projectcheck record);

    List<Projectcheck> selectByExample(ProjectcheckExample example);

    Projectcheck selectByPrimaryKey(String checkId);

    int updateByExampleSelective(@Param("record") Projectcheck record, @Param("example") ProjectcheckExample example);

    int updateByExample(@Param("record") Projectcheck record, @Param("example") ProjectcheckExample example);

    int updateByPrimaryKeySelective(Projectcheck record);

    int updateByPrimaryKey(Projectcheck record);
}