package cn.xm.jwxt.mapper.system;

import cn.xm.jwxt.bean.system.Logtable;
import cn.xm.jwxt.bean.system.LogtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogtableMapper {
    int countByExample(LogtableExample example);

    int deleteByExample(LogtableExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(Logtable record);

    int insertSelective(Logtable record);

    List<Logtable> selectByExample(LogtableExample example);

    Logtable selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") Logtable record, @Param("example") LogtableExample example);

    int updateByExample(@Param("record") Logtable record, @Param("example") LogtableExample example);

    int updateByPrimaryKeySelective(Logtable record);

    int updateByPrimaryKey(Logtable record);
}