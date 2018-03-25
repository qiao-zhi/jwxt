package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Teachertitlecheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitlecheckinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachertitlecheckinfoMapper {
    int countByExample(TeachertitlecheckinfoExample example);

    int deleteByExample(TeachertitlecheckinfoExample example);

    int deleteByPrimaryKey(String checkid);

    int insert(Teachertitlecheckinfo record);

    int insertSelective(Teachertitlecheckinfo record);

    List<Teachertitlecheckinfo> selectByExample(TeachertitlecheckinfoExample example);

    Teachertitlecheckinfo selectByPrimaryKey(String checkid);

    int updateByExampleSelective(@Param("record") Teachertitlecheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    int updateByExample(@Param("record") Teachertitlecheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    int updateByPrimaryKeySelective(Teachertitlecheckinfo record);

    int updateByPrimaryKey(Teachertitlecheckinfo record);
}