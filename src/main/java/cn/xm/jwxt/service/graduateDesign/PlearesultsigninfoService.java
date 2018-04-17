package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Plearesultsigninfo;
import cn.xm.jwxt.bean.graduateDesign.PlearesultsigninfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设答辩结果签名表Service
 */
public interface PlearesultsigninfoService {
    int countByExample(PlearesultsigninfoExample example);

    boolean deleteByExample(PlearesultsigninfoExample example);

    boolean deleteByPrimaryKey(Integer plearesultsignid);

    boolean insert(Plearesultsigninfo record);

    boolean insertSelective(Plearesultsigninfo record);

    List<Plearesultsigninfo> selectByExample(PlearesultsigninfoExample example);

    Plearesultsigninfo selectByPrimaryKey(Integer plearesultsignid);

    boolean updateByExampleSelective(@Param("record") Plearesultsigninfo record, @Param("example") PlearesultsigninfoExample example);

    boolean updateByExample(@Param("record") Plearesultsigninfo record, @Param("example") PlearesultsigninfoExample example);

    boolean updateByPrimaryKeySelective(Plearesultsigninfo record);

    boolean updateByPrimaryKey(Plearesultsigninfo record);
}
