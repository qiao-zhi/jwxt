package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 学生选题最终结果表Service
 */
public interface GradesigncheckgroupService {

    int countByExample(GradesigncheckgroupExample example);

    boolean deleteByExample(GradesigncheckgroupExample example);

    boolean deleteByPrimaryKey(String groupid);

    boolean insert(Gradesigncheckgroup record);

    /**
     * 插入毕业答辩小组信息
     * @param graDesignCheckGroupNew
     * @return
     */
    boolean insertGraDesignCheckGroupNew(GraDesignCheckGroupNew graDesignCheckGroupNew);

    /**
     * 通过条件更新毕业答辩小组信息（更新字段为原字段，更新条件为原字段后面加上Condition）
     * @param map
     * @return
     */
    boolean updateGraDesignCheckGroupNewByCondition(Map<String , Object> map);

    boolean insertSelective(Gradesigncheckgroup record);

    List<Gradesigncheckgroup> selectByExample(GradesigncheckgroupExample example);

    Gradesigncheckgroup selectByPrimaryKey(String groupid);

    boolean updateByExampleSelective(@Param("record") Gradesigncheckgroup record, @Param("example") GradesigncheckgroupExample example);

    boolean updateByExample(@Param("record") Gradesigncheckgroup record, @Param("example") GradesigncheckgroupExample example);

    boolean updateByPrimaryKeySelective(Gradesigncheckgroup record);

    boolean updateByPrimaryKey(Gradesigncheckgroup record);

    Gradesigncheckgroup selectOneGradesigncheckgroup(String groupid);

    /**
     * 查询一个小组和中期检查时间
     * @param groupid
     * @return
     */
    TTeacherInfoVo selectOneGradesigncheckgroup2(String groupid);

    /**
     * 查询一个小组和毕业答辩时间
     * @param groupid
     * @return
     */
    TTeacherInfoVo selectOneGradesigncheckgroup2New(String groupid);

    List<Gradesigncheckgroup> selectGradesigncheckgroupList(Map<String,Object> map);

    /**
     * 中期检查小组成员互审分配前查询出小组和老师信息
     * @param map
     * @return
     */
    List<GradesigncheckgroupVo> selectGradesigncheckgroupList2(Map<String,Object> map);

    /**
     * 毕业答辩小组成员互审分配前查询出小组和老师信息
     * @param map
     * @return
     */
    List<GradesigncheckgroupVo> selectGradesigncheckgroupList2New(Map<String,Object> map);

    /**
     * 通过小组id删除小组信息
     * @param groupid
     * @return
     */
    boolean deleteGroupNewByPrimaryKey(String groupid);
}
