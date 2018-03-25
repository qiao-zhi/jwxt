package cn.xm.jwxt.mapper.common;

import cn.xm.jwxt.bean.common.Dictionary;
import cn.xm.jwxt.bean.common.DictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    int countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int deleteByPrimaryKey(String dictionaryid);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExample(DictionaryExample example);

    Dictionary selectByPrimaryKey(String dictionaryid);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}