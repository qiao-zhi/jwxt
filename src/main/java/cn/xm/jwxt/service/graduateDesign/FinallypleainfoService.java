package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Finallypleainfo;
import cn.xm.jwxt.bean.graduateDesign.FinallypleainfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕业答辩安排信息表
 */
public interface FinallypleainfoService {

    int countByExample(FinallypleainfoExample example);

    boolean deleteByExample(FinallypleainfoExample example);

    boolean deleteByPrimaryKey(String pleaid);

    boolean insert(Finallypleainfo record);

    boolean insertSelective(Finallypleainfo record);

    List<Finallypleainfo> selectByExample(FinallypleainfoExample example);

    Finallypleainfo selectByPrimaryKey(String pleaid);

    boolean updateByExampleSelective(@Param("record") Finallypleainfo record, @Param("example") FinallypleainfoExample example);

    boolean updateByExample(@Param("record") Finallypleainfo record, @Param("example") FinallypleainfoExample example);

    boolean updateByPrimaryKeySelective(Finallypleainfo record);

    boolean updateByPrimaryKey(Finallypleainfo record);
}
