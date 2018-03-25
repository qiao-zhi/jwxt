package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.StudenttitleresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudenttitleresultMapper {
    int countByExample(StudenttitleresultExample example);

    int deleteByExample(StudenttitleresultExample example);

    int deleteByPrimaryKey(String studenttitleresultid);

    int insert(Studenttitleresult record);

    int insertSelective(Studenttitleresult record);

    List<Studenttitleresult> selectByExample(StudenttitleresultExample example);

    Studenttitleresult selectByPrimaryKey(String studenttitleresultid);

    int updateByExampleSelective(@Param("record") Studenttitleresult record, @Param("example") StudenttitleresultExample example);

    int updateByExample(@Param("record") Studenttitleresult record, @Param("example") StudenttitleresultExample example);

    int updateByPrimaryKeySelective(Studenttitleresult record);

    int updateByPrimaryKey(Studenttitleresult record);
}