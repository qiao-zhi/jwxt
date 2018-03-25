package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleafileuploadinfo;
import cn.xm.jwxt.bean.graduateDesign.PleafileuploadinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PleafileuploadinfoMapper {
    int countByExample(PleafileuploadinfoExample example);

    int deleteByExample(PleafileuploadinfoExample example);

    int deleteByPrimaryKey(Integer pleafileid);

    int insert(Pleafileuploadinfo record);

    int insertSelective(Pleafileuploadinfo record);

    List<Pleafileuploadinfo> selectByExample(PleafileuploadinfoExample example);

    Pleafileuploadinfo selectByPrimaryKey(Integer pleafileid);

    int updateByExampleSelective(@Param("record") Pleafileuploadinfo record, @Param("example") PleafileuploadinfoExample example);

    int updateByExample(@Param("record") Pleafileuploadinfo record, @Param("example") PleafileuploadinfoExample example);

    int updateByPrimaryKeySelective(Pleafileuploadinfo record);

    int updateByPrimaryKey(Pleafileuploadinfo record);
}