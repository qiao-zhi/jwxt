package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Graduatedesigntasksigninfo;
import cn.xm.jwxt.bean.graduateDesign.GraduatedesigntasksigninfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设任务书签名表Service
 */
public interface GraduatedesigntasksigninfoService {
    int countByExample(GraduatedesigntasksigninfoExample example);

    boolean deleteByExample(GraduatedesigntasksigninfoExample example);

    boolean deleteByPrimaryKey(String gratasksignid);

    boolean insert(Graduatedesigntasksigninfo record);

    boolean insertSelective(Graduatedesigntasksigninfo record);

    List<Graduatedesigntasksigninfo> selectByExample(GraduatedesigntasksigninfoExample example);

    Graduatedesigntasksigninfo selectByPrimaryKey(String gratasksignid);

    boolean updateByExampleSelective(@Param("record") Graduatedesigntasksigninfo record, @Param("example") GraduatedesigntasksigninfoExample example);

    boolean updateByExample(@Param("record") Graduatedesigntasksigninfo record, @Param("example") GraduatedesigntasksigninfoExample example);

    boolean updateByPrimaryKeySelective(Graduatedesigntasksigninfo record);

    boolean updateByPrimaryKey(Graduatedesigntasksigninfo record);
}
