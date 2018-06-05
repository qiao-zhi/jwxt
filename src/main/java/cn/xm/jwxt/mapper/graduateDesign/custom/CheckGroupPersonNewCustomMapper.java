package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.CheckGroupPersonNew;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonVo;
import cn.xm.jwxt.bean.graduateDesign.TTeacherInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CheckGroupPersonNewCustomMapper {

    /**
     * 插入一条毕业答辩小组成员信息
     * @param checkGroupPersonNew
     * @return
     */
    int insertCheckGroupPersonNew(CheckGroupPersonNew checkGroupPersonNew);

    /**
     * 通过条件更新毕业答辩检查小组的信息（需要更改的字段值为原字段，更新的条件为原字段加上Condition）
     * @param map
     * @return
     */
    int updatecheckgrouppersonNewByCondition(Map<String ,Object> map);

    /**
     * 查询出单个成员及其小组信息，老师信息
     * @param gropersonid
     * @return
     */
    CheckGroupPersonNew selectOneCheckgroupperson (@Param("gropersonid")int gropersonid);

    /**
     * 查询出单个成员及其小组信息，老师信息
     * @param gropersonid
     * @return
     */
    TTeacherInfoVo selectOneCheckgroupperson2 (@Param("gropersonid")int gropersonid);

    /**
     * 相当于selectByExample
     * @param checkGroupPersonNew
     * @return
     */
    List<CheckGroupPersonNew> selectByCondition (CheckGroupPersonNew checkGroupPersonNew);

    /**
     * 通过条件查询
     * @param map
     * @return
     */
    List<CheckGroupPersonNew> selectCheckgrouppersonList (Map<String,Object> map);

    /**
     * 通过条件查询2
     * @param map
     * @return
     */
    List<TTeacherInfoVo> selectCheckgrouppersonList2(Map<String,Object> map);

    /**
     * 查询检查小组人员个数
     * @param map
     * @return
     */
    int selectCheckgrouppersonCount(Map<String,Object> map);

    /**
     * 查询小组内老师和老师所带学生人数
     * @param groupid
     * @return
     */
    List<CheckgrouppersonVo> selectTeacherAndStudentCountBygroupid(String groupid);

    /**
     * 删除小组内的毕业答辩检查人员信息
     * @param groupid
     * @return
     */
    int deleteCheckgrouppersonNewBypgroupid(String groupid);
}
