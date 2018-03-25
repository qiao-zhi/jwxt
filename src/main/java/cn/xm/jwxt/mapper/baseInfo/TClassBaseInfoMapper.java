package cn.xm.jwxt.mapper.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TClassBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TClassBaseInfoMapper {
    int countByExample(TClassBaseInfoExample example);

    int deleteByExample(TClassBaseInfoExample example);

    int deleteByPrimaryKey(String classid);

    int insert(TClassBaseInfo record);

    int insertSelective(TClassBaseInfo record);

    List<TClassBaseInfo> selectByExample(TClassBaseInfoExample example);

    TClassBaseInfo selectByPrimaryKey(String classid);

    int updateByExampleSelective(@Param("record") TClassBaseInfo record, @Param("example") TClassBaseInfoExample example);

    int updateByExample(@Param("record") TClassBaseInfo record, @Param("example") TClassBaseInfoExample example);

    int updateByPrimaryKeySelective(TClassBaseInfo record);

    int updateByPrimaryKey(TClassBaseInfo record);
}