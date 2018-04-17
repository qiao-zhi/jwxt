package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Teachertitlecheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitlecheckinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachertitlecheckinfoService {

    int countByExample(TeachertitlecheckinfoExample example);

    boolean deleteByExample(TeachertitlecheckinfoExample example);

    boolean deleteByPrimaryKey(String checkid);

    boolean insert(Teachertitlecheckinfo record);

    boolean insertSelective(Teachertitlecheckinfo record);

    List<Teachertitlecheckinfo> selectByExample(TeachertitlecheckinfoExample example);

    Teachertitlecheckinfo selectByPrimaryKey(String checkid);

    boolean updateByExampleSelective(@Param("record") Teachertitlecheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    boolean updateByExample(@Param("record") Teachertitlecheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    boolean updateByPrimaryKeySelective(Teachertitlecheckinfo record);

    boolean updateByPrimaryKey(Teachertitlecheckinfo record);
}
