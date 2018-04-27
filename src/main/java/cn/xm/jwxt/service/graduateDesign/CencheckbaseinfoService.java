package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckbaseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 课程安排信息表Service
 */
public interface CencheckbaseinfoService {

    int countByExample(CencheckbaseinfoExample example);

    boolean deleteByExample(CencheckbaseinfoExample example);

    boolean deleteByPrimaryKey(String cencheckinfoid);

    boolean insert(Cencheckbaseinfo record);

    boolean insertSelective(Cencheckbaseinfo record);

    List<Cencheckbaseinfo> selectByExample(CencheckbaseinfoExample example);

    Cencheckbaseinfo selectByPrimaryKey(String cencheckinfoid);

    boolean updateByExampleSelective(@Param("record") Cencheckbaseinfo record, @Param("example") CencheckbaseinfoExample example);

    boolean updateByExample(@Param("record") Cencheckbaseinfo record, @Param("example") CencheckbaseinfoExample example);

    boolean updateByPrimaryKeySelective(Cencheckbaseinfo record);

    boolean updateByPrimaryKey(Cencheckbaseinfo record);

    List<Cencheckbaseinfo> selectCencheckbaseinfoList(Map<String,Object> map);
}
