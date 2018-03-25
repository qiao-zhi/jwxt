package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckresultinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckresultinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CencheckresultinfoMapper {
    int countByExample(CencheckresultinfoExample example);

    int deleteByExample(CencheckresultinfoExample example);

    int deleteByPrimaryKey(Integer centerresultid);

    int insert(Cencheckresultinfo record);

    int insertSelective(Cencheckresultinfo record);

    List<Cencheckresultinfo> selectByExample(CencheckresultinfoExample example);

    Cencheckresultinfo selectByPrimaryKey(Integer centerresultid);

    int updateByExampleSelective(@Param("record") Cencheckresultinfo record, @Param("example") CencheckresultinfoExample example);

    int updateByExample(@Param("record") Cencheckresultinfo record, @Param("example") CencheckresultinfoExample example);

    int updateByPrimaryKeySelective(Cencheckresultinfo record);

    int updateByPrimaryKey(Cencheckresultinfo record);
}