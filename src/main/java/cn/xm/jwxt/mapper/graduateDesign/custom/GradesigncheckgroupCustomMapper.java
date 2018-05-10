package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.Gradesigncheckgroup;
import cn.xm.jwxt.bean.graduateDesign.GradesigncheckgroupVo;
import cn.xm.jwxt.bean.graduateDesign.TTeacherInfoVo;

import java.util.List;
import java.util.Map;

/**
 * 中期和后期毕设答辩检查小组表和其他表的关系
 */
public interface GradesigncheckgroupCustomMapper {

    /**
     * 查询出一个小组和小组内的所有成员
     * @param groupId
     * @return
     */
    Gradesigncheckgroup selectOneGradesigncheckgroup (String groupId);

    /**
     * 查询一个小组和中期检查时间
     * @param groupId
     * @return
     */
    TTeacherInfoVo selectOneGradesigncheckgroup2(String groupId);

    /**
     * 按照条件查询出小组信息及其小组成员（可分页）
     * @param map
     * @return
     */
    List<Gradesigncheckgroup> selectGradesigncheckgroupList (Map<String ,Object> map);

    /**
     * 查询出小组信息及其小组成员（可分页）
     * @param map
     * @return
     */
    List<GradesigncheckgroupVo> selectGradesigncheckgroupList2 (Map<String ,Object> map);

}
