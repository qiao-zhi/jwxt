package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;
import cn.xm.jwxt.bean.graduateDesign.GradeuatebaseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设基本信息表Service
 */
public interface GradeuatebaseinfoService {

    int countByExample(GradeuatebaseinfoExample example);

    boolean deleteByExample(GradeuatebaseinfoExample example);

    boolean deleteByPrimaryKey(String gradesignid);

    boolean insert(Gradeuatebaseinfo record);

    boolean insertSelective(Gradeuatebaseinfo record);

    List<Gradeuatebaseinfo> selectByExample(GradeuatebaseinfoExample example);

    Gradeuatebaseinfo selectByPrimaryKey(String gradesignid);

    boolean updateByExampleSelective(@Param("record") Gradeuatebaseinfo record, @Param("example") GradeuatebaseinfoExample example);

    boolean updateByExample(@Param("record") Gradeuatebaseinfo record, @Param("example") GradeuatebaseinfoExample example);

    boolean updateByPrimaryKeySelective(Gradeuatebaseinfo record);

    boolean updateByPrimaryKey(Gradeuatebaseinfo record);
}
