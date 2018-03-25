package cn.xm.jwxt.mapper.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStudentBaseInfoMapper {
    int countByExample(TStudentBaseInfoExample example);

    int deleteByExample(TStudentBaseInfoExample example);

    int deleteByPrimaryKey(String studentid);

    int insert(TStudentBaseInfo record);

    int insertSelective(TStudentBaseInfo record);

    List<TStudentBaseInfo> selectByExample(TStudentBaseInfoExample example);

    TStudentBaseInfo selectByPrimaryKey(String studentid);

    int updateByExampleSelective(@Param("record") TStudentBaseInfo record, @Param("example") TStudentBaseInfoExample example);

    int updateByExample(@Param("record") TStudentBaseInfo record, @Param("example") TStudentBaseInfoExample example);

    int updateByPrimaryKeySelective(TStudentBaseInfo record);

    int updateByPrimaryKey(TStudentBaseInfo record);
}