package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCourseBaseInfoMapper {
    int countByExample(TCourseBaseInfoExample example);

    int deleteByExample(TCourseBaseInfoExample example);

    int deleteByPrimaryKey(String courseid);

    int insert(TCourseBaseInfo record);

    int insertSelective(TCourseBaseInfo record);

    List<TCourseBaseInfo> selectByExample(TCourseBaseInfoExample example);

    TCourseBaseInfo selectByPrimaryKey(String courseid);

    int updateByExampleSelective(@Param("record") TCourseBaseInfo record, @Param("example") TCourseBaseInfoExample example);

    int updateByExample(@Param("record") TCourseBaseInfo record, @Param("example") TCourseBaseInfoExample example);

    int updateByPrimaryKeySelective(TCourseBaseInfo record);

    int updateByPrimaryKey(TCourseBaseInfo record);
}