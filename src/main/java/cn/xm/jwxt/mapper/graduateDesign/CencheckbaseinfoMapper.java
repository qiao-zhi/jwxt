package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckbaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CencheckbaseinfoMapper {
    int countByExample(CencheckbaseinfoExample example);

    int deleteByExample(CencheckbaseinfoExample example);

    int deleteByPrimaryKey(String cencheckinfoid);

    int insert(Cencheckbaseinfo record);

    int insertSelective(Cencheckbaseinfo record);

    List<Cencheckbaseinfo> selectByExample(CencheckbaseinfoExample example);

    Cencheckbaseinfo selectByPrimaryKey(String cencheckinfoid);

    int updateByExampleSelective(@Param("record") Cencheckbaseinfo record, @Param("example") CencheckbaseinfoExample example);

    int updateByExample(@Param("record") Cencheckbaseinfo record, @Param("example") CencheckbaseinfoExample example);

    int updateByPrimaryKeySelective(Cencheckbaseinfo record);

    int updateByPrimaryKey(Cencheckbaseinfo record);
}