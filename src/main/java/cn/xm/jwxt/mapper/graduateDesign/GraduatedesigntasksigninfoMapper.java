package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Graduatedesigntasksigninfo;
import cn.xm.jwxt.bean.graduateDesign.GraduatedesigntasksigninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduatedesigntasksigninfoMapper {
    int countByExample(GraduatedesigntasksigninfoExample example);

    int deleteByExample(GraduatedesigntasksigninfoExample example);

    int deleteByPrimaryKey(String gratasksignid);

    int insert(Graduatedesigntasksigninfo record);

    int insertSelective(Graduatedesigntasksigninfo record);

    List<Graduatedesigntasksigninfo> selectByExample(GraduatedesigntasksigninfoExample example);

    Graduatedesigntasksigninfo selectByPrimaryKey(String gratasksignid);

    int updateByExampleSelective(@Param("record") Graduatedesigntasksigninfo record, @Param("example") GraduatedesigntasksigninfoExample example);

    int updateByExample(@Param("record") Graduatedesigntasksigninfo record, @Param("example") GraduatedesigntasksigninfoExample example);

    int updateByPrimaryKeySelective(Graduatedesigntasksigninfo record);

    int updateByPrimaryKey(Graduatedesigntasksigninfo record);
}