package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradesigncheckgroup;
import cn.xm.jwxt.bean.graduateDesign.GradesigncheckgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradesigncheckgroupMapper {
    int countByExample(GradesigncheckgroupExample example);

    int deleteByExample(GradesigncheckgroupExample example);

    int deleteByPrimaryKey(String groupid);

    int insert(Gradesigncheckgroup record);

    int insertSelective(Gradesigncheckgroup record);

    List<Gradesigncheckgroup> selectByExample(GradesigncheckgroupExample example);

    Gradesigncheckgroup selectByPrimaryKey(String groupid);

    int updateByExampleSelective(@Param("record") Gradesigncheckgroup record, @Param("example") GradesigncheckgroupExample example);

    int updateByExample(@Param("record") Gradesigncheckgroup record, @Param("example") GradesigncheckgroupExample example);

    int updateByPrimaryKeySelective(Gradesigncheckgroup record);

    int updateByPrimaryKey(Gradesigncheckgroup record);
}