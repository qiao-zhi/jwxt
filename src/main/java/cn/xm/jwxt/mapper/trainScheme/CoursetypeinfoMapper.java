package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;
import cn.xm.jwxt.bean.trainScheme.CoursetypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursetypeinfoMapper {
    int countByExample(CoursetypeinfoExample example);

    int deleteByExample(CoursetypeinfoExample example);

    int deleteByPrimaryKey(Integer coursetypeid);

    int insert(Coursetypeinfo record);

    int insertSelective(Coursetypeinfo record);

    List<Coursetypeinfo> selectByExample(CoursetypeinfoExample example);

    Coursetypeinfo selectByPrimaryKey(Integer coursetypeid);

    int updateByExampleSelective(@Param("record") Coursetypeinfo record, @Param("example") CoursetypeinfoExample example);

    int updateByExample(@Param("record") Coursetypeinfo record, @Param("example") CoursetypeinfoExample example);

    int updateByPrimaryKeySelective(Coursetypeinfo record);

    int updateByPrimaryKey(Coursetypeinfo record);
}