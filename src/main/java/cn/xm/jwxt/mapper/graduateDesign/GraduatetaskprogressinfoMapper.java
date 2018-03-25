package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Graduatetaskprogressinfo;
import cn.xm.jwxt.bean.graduateDesign.GraduatetaskprogressinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduatetaskprogressinfoMapper {
    int countByExample(GraduatetaskprogressinfoExample example);

    int deleteByExample(GraduatetaskprogressinfoExample example);

    int deleteByPrimaryKey(Integer progressid);

    int insert(Graduatetaskprogressinfo record);

    int insertSelective(Graduatetaskprogressinfo record);

    List<Graduatetaskprogressinfo> selectByExample(GraduatetaskprogressinfoExample example);

    Graduatetaskprogressinfo selectByPrimaryKey(Integer progressid);

    int updateByExampleSelective(@Param("record") Graduatetaskprogressinfo record, @Param("example") GraduatetaskprogressinfoExample example);

    int updateByExample(@Param("record") Graduatetaskprogressinfo record, @Param("example") GraduatetaskprogressinfoExample example);

    int updateByPrimaryKeySelective(Graduatetaskprogressinfo record);

    int updateByPrimaryKey(Graduatetaskprogressinfo record);
}