package cn.xm.jwxt.mapper.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeacherBaseInfoMapper {
    int countByExample(TTeacherBaseInfoExample example);

    int deleteByExample(TTeacherBaseInfoExample example);

    int deleteByPrimaryKey(String teacherid);

    int insert(TTeacherBaseInfo record);

    int insertSelective(TTeacherBaseInfo record);

    List<TTeacherBaseInfo> selectByExample(TTeacherBaseInfoExample example);

    TTeacherBaseInfo selectByPrimaryKey(String teacherid);

    int updateByExampleSelective(@Param("record") TTeacherBaseInfo record, @Param("example") TTeacherBaseInfoExample example);

    int updateByExample(@Param("record") TTeacherBaseInfo record, @Param("example") TTeacherBaseInfoExample example);

    int updateByPrimaryKeySelective(TTeacherBaseInfo record);

    int updateByPrimaryKey(TTeacherBaseInfo record);
}