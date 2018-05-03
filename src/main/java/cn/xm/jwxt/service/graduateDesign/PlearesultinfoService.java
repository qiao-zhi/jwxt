package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Plearesultinfo;
import cn.xm.jwxt.bean.graduateDesign.PlearesultinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕业答辩结果表Service
 */
public interface PlearesultinfoService {
    int countByExample(PlearesultinfoExample example);

    boolean deleteByExample(PlearesultinfoExample example);

    boolean deleteByPrimaryKey(Integer plearesultid);

    boolean insert(Plearesultinfo record);

    boolean insertSelective(Plearesultinfo record);

    List<Plearesultinfo> selectByExample(PlearesultinfoExample example);

    Plearesultinfo selectByPrimaryKey(Integer plearesultid);

    boolean updateByExampleSelective(@Param("record") Plearesultinfo record, @Param("example") PlearesultinfoExample example);

    boolean updateByExample(@Param("record") Plearesultinfo record, @Param("example") PlearesultinfoExample example);

    boolean updateByPrimaryKeySelective(Plearesultinfo record);

    boolean updateByPrimaryKey(Plearesultinfo record);
}
