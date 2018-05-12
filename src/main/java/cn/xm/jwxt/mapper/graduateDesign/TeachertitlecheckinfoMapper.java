package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitlecheckinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachertitlecheckinfoMapper {
    int countByExample(TeachertitlecheckinfoExample example);

    int deleteByExample(TeachertitlecheckinfoExample example);

    int deleteByPrimaryKey(String checkid);

    int insert(TeachertitleFirstcheckinfo record);

    int insertSelective(TeachertitleFirstcheckinfo record);

    List<TeachertitleFirstcheckinfo> selectByExample(TeachertitlecheckinfoExample example);

    TeachertitleFirstcheckinfo selectByPrimaryKey(String checkid);

    int updateByExampleSelective(@Param("record") TeachertitleFirstcheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    int updateByExample(@Param("record") TeachertitleFirstcheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    int updateByPrimaryKeySelective(TeachertitleFirstcheckinfo record);

    int updateByPrimaryKey(TeachertitleFirstcheckinfo record);
}