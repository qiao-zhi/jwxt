package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleafilerecordinfo;
import cn.xm.jwxt.bean.graduateDesign.PleafilerecordinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PleafilerecordinfoMapper {
    int countByExample(PleafilerecordinfoExample example);

    int deleteByExample(PleafilerecordinfoExample example);

    int deleteByPrimaryKey(Integer fileuprecoreid);

    int insert(Pleafilerecordinfo record);

    int insertSelective(Pleafilerecordinfo record);

    List<Pleafilerecordinfo> selectByExample(PleafilerecordinfoExample example);

    Pleafilerecordinfo selectByPrimaryKey(Integer fileuprecoreid);

    int updateByExampleSelective(@Param("record") Pleafilerecordinfo record, @Param("example") PleafilerecordinfoExample example);

    int updateByExample(@Param("record") Pleafilerecordinfo record, @Param("example") PleafilerecordinfoExample example);

    int updateByPrimaryKeySelective(Pleafilerecordinfo record);

    int updateByPrimaryKey(Pleafilerecordinfo record);
}