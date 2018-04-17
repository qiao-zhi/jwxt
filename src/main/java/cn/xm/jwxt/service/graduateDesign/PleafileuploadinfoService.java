package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleafileuploadinfo;
import cn.xm.jwxt.bean.graduateDesign.PleafileuploadinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设资料提交信息表Service
 */
public interface PleafileuploadinfoService {
    int countByExample(PleafileuploadinfoExample example);

    boolean deleteByExample(PleafileuploadinfoExample example);

    boolean deleteByPrimaryKey(Integer pleafileid);

    boolean insert(Pleafileuploadinfo record);

    boolean insertSelective(Pleafileuploadinfo record);

    List<Pleafileuploadinfo> selectByExample(PleafileuploadinfoExample example);

    Pleafileuploadinfo selectByPrimaryKey(Integer pleafileid);

    boolean updateByExampleSelective(@Param("record") Pleafileuploadinfo record, @Param("example") PleafileuploadinfoExample example);

    boolean updateByExample(@Param("record") Pleafileuploadinfo record, @Param("example") PleafileuploadinfoExample example);

    boolean updateByPrimaryKeySelective(Pleafileuploadinfo record);

    boolean updateByPrimaryKey(Pleafileuploadinfo record);
}
