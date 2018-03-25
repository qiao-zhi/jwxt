package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;
import cn.xm.jwxt.bean.outGraduateDesignApply.GradesignleaveapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradesignleaveapplyMapper {
    int countByExample(GradesignleaveapplyExample example);

    int deleteByExample(GradesignleaveapplyExample example);

    int deleteByPrimaryKey(String leaveid);

    int insert(Gradesignleaveapply record);

    int insertSelective(Gradesignleaveapply record);

    List<Gradesignleaveapply> selectByExample(GradesignleaveapplyExample example);

    Gradesignleaveapply selectByPrimaryKey(String leaveid);

    int updateByExampleSelective(@Param("record") Gradesignleaveapply record, @Param("example") GradesignleaveapplyExample example);

    int updateByExample(@Param("record") Gradesignleaveapply record, @Param("example") GradesignleaveapplyExample example);

    int updateByPrimaryKeySelective(Gradesignleaveapply record);

    int updateByPrimaryKey(Gradesignleaveapply record);
}