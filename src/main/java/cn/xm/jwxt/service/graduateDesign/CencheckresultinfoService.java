package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckresultinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckresultinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *排课信息审核表Service
 */
public interface CencheckresultinfoService {

    int countByExample(CencheckresultinfoExample example);

    boolean deleteByExample(CencheckresultinfoExample example);

    boolean deleteByPrimaryKey(Integer centerresultid);

    boolean insert(Cencheckresultinfo record);

    boolean insertSelective(Cencheckresultinfo record);

    List<Cencheckresultinfo> selectByExample(CencheckresultinfoExample example);

    Cencheckresultinfo selectByPrimaryKey(Integer centerresultid);

    boolean updateByExampleSelective(@Param("record") Cencheckresultinfo record, @Param("example") CencheckresultinfoExample example);

    boolean updateByExample(@Param("record") Cencheckresultinfo record, @Param("example") CencheckresultinfoExample example);

    boolean updateByPrimaryKeySelective(Cencheckresultinfo record);

    boolean updateByPrimaryKey(Cencheckresultinfo record);
}
