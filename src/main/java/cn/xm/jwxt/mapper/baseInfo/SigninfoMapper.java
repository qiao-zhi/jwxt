package cn.xm.jwxt.mapper.baseInfo;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.baseInfo.SigninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SigninfoMapper {
    int countByExample(SigninfoExample example);

    int deleteByExample(SigninfoExample example);

    int deleteByPrimaryKey(String signId);

    int insert(Signinfo record);

    int insertSelective(Signinfo record);

    List<Signinfo> selectByExample(SigninfoExample example);

    Signinfo selectByPrimaryKey(String signId);

    int updateByExampleSelective(@Param("record") Signinfo record, @Param("example") SigninfoExample example);

    int updateByExample(@Param("record") Signinfo record, @Param("example") SigninfoExample example);

    int updateByPrimaryKeySelective(Signinfo record);

    int updateByPrimaryKey(Signinfo record);
}