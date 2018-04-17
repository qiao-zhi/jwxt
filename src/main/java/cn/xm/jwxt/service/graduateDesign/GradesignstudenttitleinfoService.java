package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradesignstudenttitleinfo;
import cn.xm.jwxt.bean.graduateDesign.GradesignstudenttitleinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设学生选题表Service
 */
public interface GradesignstudenttitleinfoService {

    int countByExample(GradesignstudenttitleinfoExample example);

    boolean deleteByExample(GradesignstudenttitleinfoExample example);

    boolean deleteByPrimaryKey(String studenttitleid);

    boolean insert(Gradesignstudenttitleinfo record);

    boolean insertSelective(Gradesignstudenttitleinfo record);

    List<Gradesignstudenttitleinfo> selectByExample(GradesignstudenttitleinfoExample example);

    Gradesignstudenttitleinfo selectByPrimaryKey(String studenttitleid);

    boolean updateByExampleSelective(@Param("record") Gradesignstudenttitleinfo record, @Param("example") GradesignstudenttitleinfoExample example);

    boolean updateByExample(@Param("record") Gradesignstudenttitleinfo record, @Param("example") GradesignstudenttitleinfoExample example);

    boolean updateByPrimaryKeySelective(Gradesignstudenttitleinfo record);

    boolean updateByPrimaryKey(Gradesignstudenttitleinfo record);
}
