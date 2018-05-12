package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitlecheckinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 教师毕设课题审核表Service
 */
public interface TeachertitlecheckinfoService {

    int countByExample(TeachertitlecheckinfoExample example);

    boolean deleteByExample(TeachertitlecheckinfoExample example);

    boolean deleteByPrimaryKey(String checkid);

    boolean insert(TeachertitleFirstcheckinfo record);

    boolean insertSelective(TeachertitleFirstcheckinfo record);

    List<TeachertitleFirstcheckinfo> selectByExample(TeachertitlecheckinfoExample example);

    TeachertitleFirstcheckinfo selectByPrimaryKey(String checkid);

    boolean updateByExampleSelective(@Param("record") TeachertitleFirstcheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    boolean updateByExample(@Param("record") TeachertitleFirstcheckinfo record, @Param("example") TeachertitlecheckinfoExample example);

    boolean updateByPrimaryKeySelective(TeachertitleFirstcheckinfo record);

    boolean updateByPrimaryKey(TeachertitleFirstcheckinfo record);
}
