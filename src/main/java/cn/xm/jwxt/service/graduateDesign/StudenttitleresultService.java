package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.StudenttitleresultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudenttitleresultService {
    int countByExample(StudenttitleresultExample example);

    boolean deleteByExample(StudenttitleresultExample example);

    boolean deleteByPrimaryKey(String studenttitleresultid);

    boolean insert(Studenttitleresult record);

    boolean insertSelective(Studenttitleresult record);

    List<Studenttitleresult> selectByExample(StudenttitleresultExample example);

    Studenttitleresult selectByPrimaryKey(String studenttitleresultid);

    boolean updateByExampleSelective(@Param("record") Studenttitleresult record, @Param("example") StudenttitleresultExample example);

    boolean updateByExample(@Param("record") Studenttitleresult record, @Param("example") StudenttitleresultExample example);

    boolean updateByPrimaryKeySelective(Studenttitleresult record);

    boolean updateByPrimaryKey(Studenttitleresult record);
}
