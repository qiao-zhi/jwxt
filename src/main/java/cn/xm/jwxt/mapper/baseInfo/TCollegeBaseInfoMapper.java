package cn.xm.jwxt.mapper.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCollegeBaseInfoMapper {
    int countByExample(TCollegeBaseInfoExample example);

    int deleteByExample(TCollegeBaseInfoExample example);

    int deleteByPrimaryKey(String collegeid);

    int insert(TCollegeBaseInfo record);

    int insertSelective(TCollegeBaseInfo record);

    List<TCollegeBaseInfo> selectByExample(TCollegeBaseInfoExample example);

    TCollegeBaseInfo selectByPrimaryKey(String collegeid);

    int updateByExampleSelective(@Param("record") TCollegeBaseInfo record, @Param("example") TCollegeBaseInfoExample example);

    int updateByExample(@Param("record") TCollegeBaseInfo record, @Param("example") TCollegeBaseInfoExample example);

    int updateByPrimaryKeySelective(TCollegeBaseInfo record);

    int updateByPrimaryKey(TCollegeBaseInfo record);
}