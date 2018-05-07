package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleafilerecordinfo;
import cn.xm.jwxt.bean.graduateDesign.PleafilerecordinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设资料提交情况记录表Service
 */
public interface PleafilerecordinfoService {
    int countByExample(PleafilerecordinfoExample example);

    boolean deleteByExample(PleafilerecordinfoExample example);

    boolean deleteByPrimaryKey(Integer fileuprecoreid);

    boolean insert(Pleafilerecordinfo record);

    boolean insertSelective(Pleafilerecordinfo record);

    List<Pleafilerecordinfo> selectByExample(PleafilerecordinfoExample example);

    Pleafilerecordinfo selectByPrimaryKey(Integer fileuprecoreid);

    boolean updateByExampleSelective(@Param("record") Pleafilerecordinfo record, @Param("example") PleafilerecordinfoExample example);

    boolean updateByExample(@Param("record") Pleafilerecordinfo record, @Param("example") PleafilerecordinfoExample example);

    boolean updateByPrimaryKeySelective(Pleafilerecordinfo record);

    boolean updateByPrimaryKey(Pleafilerecordinfo record);
}
