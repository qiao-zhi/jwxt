package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Checkgroupperson;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *检查小组成员表Service
 */
public interface CheckgrouppersonService {

    int countByExample(CheckgrouppersonExample example);

    boolean deleteByExample(CheckgrouppersonExample example);

    boolean deleteByPrimaryKey(Integer gropersonid);

    boolean insert(Checkgroupperson record);

    boolean insertSelective(Checkgroupperson record);

    List<Checkgroupperson> selectByExample(CheckgrouppersonExample example);

    Checkgroupperson selectByPrimaryKey(Integer gropersonid);

    boolean updateByExampleSelective(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    boolean updateByExample(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    boolean updateByPrimaryKeySelective(Checkgroupperson record);

    boolean updateByPrimaryKey(Checkgroupperson record);
}
