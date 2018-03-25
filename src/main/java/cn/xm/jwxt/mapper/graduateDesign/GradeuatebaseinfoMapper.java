package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;
import cn.xm.jwxt.bean.graduateDesign.GradeuatebaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeuatebaseinfoMapper {
    int countByExample(GradeuatebaseinfoExample example);

    int deleteByExample(GradeuatebaseinfoExample example);

    int deleteByPrimaryKey(String gradesignid);

    int insert(Gradeuatebaseinfo record);

    int insertSelective(Gradeuatebaseinfo record);

    List<Gradeuatebaseinfo> selectByExample(GradeuatebaseinfoExample example);

    Gradeuatebaseinfo selectByPrimaryKey(String gradesignid);

    int updateByExampleSelective(@Param("record") Gradeuatebaseinfo record, @Param("example") GradeuatebaseinfoExample example);

    int updateByExample(@Param("record") Gradeuatebaseinfo record, @Param("example") GradeuatebaseinfoExample example);

    int updateByPrimaryKeySelective(Gradeuatebaseinfo record);

    int updateByPrimaryKey(Gradeuatebaseinfo record);
}