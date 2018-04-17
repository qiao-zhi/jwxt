package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Graduatetaskprogressinfo;
import cn.xm.jwxt.bean.graduateDesign.GraduatetaskprogressinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GraduatetaskprogressinfoService {
    int countByExample(GraduatetaskprogressinfoExample example);

    boolean deleteByExample(GraduatetaskprogressinfoExample example);

    boolean deleteByPrimaryKey(Integer progressid);

    boolean insert(Graduatetaskprogressinfo record);

    boolean insertSelective(Graduatetaskprogressinfo record);

    List<Graduatetaskprogressinfo> selectByExample(GraduatetaskprogressinfoExample example);

    Graduatetaskprogressinfo selectByPrimaryKey(Integer progressid);

    boolean updateByExampleSelective(@Param("record") Graduatetaskprogressinfo record, @Param("example") GraduatetaskprogressinfoExample example);

    boolean updateByExample(@Param("record") Graduatetaskprogressinfo record, @Param("example") GraduatetaskprogressinfoExample example);

    boolean updateByPrimaryKeySelective(Graduatetaskprogressinfo record);

    boolean updateByPrimaryKey(Graduatetaskprogressinfo record);
}
