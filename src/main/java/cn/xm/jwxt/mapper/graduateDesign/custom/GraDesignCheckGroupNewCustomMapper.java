package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.GraDesignCheckGroupNew;
import cn.xm.jwxt.bean.graduateDesign.GradesigncheckgroupVo;
import cn.xm.jwxt.bean.graduateDesign.TTeacherInfoVo;

import javax.management.ObjectName;
import java.util.List;
import java.util.Map;

public interface GraDesignCheckGroupNewCustomMapper {

    /**
     * 插入一条毕业答辩小组信息
     * @param graDesignCheckGroupNew
     * @return
     */
    int insertGraDesignCheckGroupNew (GraDesignCheckGroupNew graDesignCheckGroupNew);

    /**
     * 通过条件更新字段(需要更新的值存放原值，更改条件在原字段后加上Condition)
     * @param map
     * @return
     */
    int updateGraDesignCheckGroupNewByCondition (Map<String , Object> map);
    /**
     * 查询出一个小组和小组内的所有成员
     * @param groupId
     * @return
     */
    GraDesignCheckGroupNew selectOneGradesigncheckgroup (String groupId);

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
    List<GraDesignCheckGroupNew> selectGradesigncheckgroupList (Map<String ,Object> map);

    /**
     * 查询出小组信息及其小组成员（可分页）
     * @param map
     * @return
     */
    List<GradesigncheckgroupVo> selectGradesigncheckgroupList2New (Map<String ,Object> map);

    /**
     * 通过小组id删除小组信息
     * @param groupid
     * @return
     */
    int deleteGroupNewByPrimaryKey(String groupid);
}
