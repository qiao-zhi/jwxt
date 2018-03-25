package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Checkgroupperson;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckgrouppersonMapper {
    int countByExample(CheckgrouppersonExample example);

    int deleteByExample(CheckgrouppersonExample example);

    int deleteByPrimaryKey(Integer gropersonid);

    int insert(Checkgroupperson record);

    int insertSelective(Checkgroupperson record);

    List<Checkgroupperson> selectByExample(CheckgrouppersonExample example);

    Checkgroupperson selectByPrimaryKey(Integer gropersonid);

    int updateByExampleSelective(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    int updateByExample(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    int updateByPrimaryKeySelective(Checkgroupperson record);

    int updateByPrimaryKey(Checkgroupperson record);
}