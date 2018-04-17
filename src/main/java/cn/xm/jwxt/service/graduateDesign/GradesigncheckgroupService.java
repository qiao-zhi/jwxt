package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradesigncheckgroup;
import cn.xm.jwxt.bean.graduateDesign.GradesigncheckgroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学生选题最终结果表Service
 */
public interface GradesigncheckgroupService {

    int countByExample(GradesigncheckgroupExample example);

    boolean deleteByExample(GradesigncheckgroupExample example);

    boolean deleteByPrimaryKey(String groupid);

    boolean insert(Gradesigncheckgroup record);

    boolean insertSelective(Gradesigncheckgroup record);

    List<Gradesigncheckgroup> selectByExample(GradesigncheckgroupExample example);

    Gradesigncheckgroup selectByPrimaryKey(String groupid);

    boolean updateByExampleSelective(@Param("record") Gradesigncheckgroup record, @Param("example") GradesigncheckgroupExample example);

    boolean updateByExample(@Param("record") Gradesigncheckgroup record, @Param("example") GradesigncheckgroupExample example);

    boolean updateByPrimaryKeySelective(Gradesigncheckgroup record);

    boolean updateByPrimaryKey(Gradesigncheckgroup record);
}
