package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradesignstudenttitleinfo;
import cn.xm.jwxt.bean.graduateDesign.GradesignstudenttitleinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradesignstudenttitleinfoMapper {
    int countByExample(GradesignstudenttitleinfoExample example);

    int deleteByExample(GradesignstudenttitleinfoExample example);

    int deleteByPrimaryKey(String studenttitleid);

    int insert(Gradesignstudenttitleinfo record);

    int insertSelective(Gradesignstudenttitleinfo record);

    List<Gradesignstudenttitleinfo> selectByExample(GradesignstudenttitleinfoExample example);

    Gradesignstudenttitleinfo selectByPrimaryKey(String studenttitleid);

    int updateByExampleSelective(@Param("record") Gradesignstudenttitleinfo record, @Param("example") GradesignstudenttitleinfoExample example);

    int updateByExample(@Param("record") Gradesignstudenttitleinfo record, @Param("example") GradesignstudenttitleinfoExample example);

    int updateByPrimaryKeySelective(Gradesignstudenttitleinfo record);

    int updateByPrimaryKey(Gradesignstudenttitleinfo record);
}