package cn.xm.jwxt.mapper.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMajorBaseInfoMapper {
    int countByExample(TMajorBaseInfoExample example);

    int deleteByExample(TMajorBaseInfoExample example);

    int deleteByPrimaryKey(String majorid);

    int insert(TMajorBaseInfo record);

    int insertSelective(TMajorBaseInfo record);

    List<TMajorBaseInfo> selectByExample(TMajorBaseInfoExample example);

    TMajorBaseInfo selectByPrimaryKey(String majorid);

    int updateByExampleSelective(@Param("record") TMajorBaseInfo record, @Param("example") TMajorBaseInfoExample example);

    int updateByExample(@Param("record") TMajorBaseInfo record, @Param("example") TMajorBaseInfoExample example);

    int updateByPrimaryKeySelective(TMajorBaseInfo record);

    int updateByPrimaryKey(TMajorBaseInfo record);
}