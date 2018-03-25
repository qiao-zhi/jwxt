package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfo;
import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeachingprogramInfoMapper {
    int countByExample(TTeachingprogramInfoExample example);

    int deleteByExample(TTeachingprogramInfoExample example);

    int deleteByPrimaryKey(Integer coursefileid);

    int insert(TTeachingprogramInfo record);

    int insertSelective(TTeachingprogramInfo record);

    List<TTeachingprogramInfo> selectByExample(TTeachingprogramInfoExample example);

    TTeachingprogramInfo selectByPrimaryKey(Integer coursefileid);

    int updateByExampleSelective(@Param("record") TTeachingprogramInfo record, @Param("example") TTeachingprogramInfoExample example);

    int updateByExample(@Param("record") TTeachingprogramInfo record, @Param("example") TTeachingprogramInfoExample example);

    int updateByPrimaryKeySelective(TTeachingprogramInfo record);

    int updateByPrimaryKey(TTeachingprogramInfo record);
}