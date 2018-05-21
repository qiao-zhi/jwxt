package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.*;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.OBJ_ADAPTER;

import java.util.List;
import java.util.Map;

/**
 *检查小组成员表Service
 */
public interface CheckgrouppersonService {

    int countByExample(CheckgrouppersonExample example);

    boolean deleteByExample(CheckgrouppersonExample example);

    boolean deleteByPrimaryKey(Integer gropersonid);

    boolean insert(Checkgroupperson record);

    boolean insertSelective(Checkgroupperson record);

    /**
     * 添加毕业答辩小组成员信息
     * @param checkGroupPersonNew
     * @return
     */
    boolean insertCheckGroupPersonNew(CheckGroupPersonNew checkGroupPersonNew);

    /**
     * 通过条件更新毕业答辩检查小组的信息（需要更改的字段值为原字段，更新的条件为原字段加上Condition）
     * @param map
     * @return
     */
    boolean updatecheckgrouppersonNewByCondition(Map<String ,Object> map);

    List<Checkgroupperson> selectByExample(CheckgrouppersonExample example);

    List<CheckGroupPersonNew> selectByCondition(CheckGroupPersonNew checkGroupPersonNew);

    Checkgroupperson selectByPrimaryKey(Integer gropersonid);

    boolean updateByExampleSelective(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    boolean updateByExample(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    boolean updateByPrimaryKeySelective(Checkgroupperson record);

    boolean updateByPrimaryKey(Checkgroupperson record);

    Checkgroupperson selectOneCheckgroupperson(int grppersonid);

    TTeacherInfoVo selectOneCheckgroupperson2(int grppersonid);

    List<Checkgroupperson> selectCheckgrouppersonList(Map<String,Object> map);

    /**
     * 条件查询出中期检查小组信息（可分页）
     * @param map
     * @return
     */
    List<TTeacherInfoVo> selectCheckgrouppersonList2(Map<String,Object> map);

    /**
     * 条件查询出毕业答辩小组信息（可分页）
     * @param map
     * @return
     */
    List<TTeacherInfoVo> selectCheckgrouppersonList2New(Map<String,Object> map);

    /**
     * 查询中期检查小组内老师和老师所带学生人数
     * @param groupid
     * @return
     */
    List<CheckgrouppersonVo> selectTeacherAndStudentCountBygroupid(String groupid);

    /**
     * 查询毕业答辩小组内老师和老师所带学生人数
     * @param groupid
     * @return
     */
    List<CheckgrouppersonVo> selectTeacherAndStudentCountNewBygroupid(String groupid);

    /**
     * 查询出中期检查组长信息
     * @param groupid
     * @return
     */
    String selectGroupLeader (String groupid); /**

     * 查询出毕业答辩检查组长信息
     * @param groupid
     * @return
     */
    String selectGroupLeaderNew (String groupid);

    /**
     * 查询中期检查小组人员个数
     * @param map
     * @return
     */
    int selectCheckgrouppersonCount(Map<String,Object> map);

    /**
     * 查询毕业答辩检查小组人员个数
     * @param map
     * @return
     */
    int selectCheckgrouppersonNewCount(Map<String,Object> map);

    /**
     * 插入一条中期检查老师互审信息
     * @param arrangeTeacherResult
     * @return
     */
    boolean insertArrangeTeacherResult(ArrangeTeacherResult arrangeTeacherResult);

    /**
     * 插入一条毕业答辩老师互审信息
     * @param arrangeTeacherResultNew
     * @return
     */
    boolean insertArrangeTeacherResultNew(ArrangeTeacherResultNew arrangeTeacherResultNew);

    /**
     * 查询出所有中期检查的老师互审信息
     * @param map
     * @return
     */
    List<ArrangeTeacherResult> selectArrangeTeacherResult(Map<String,Object> map);

    /**
     * 查询出所有毕业答辩的老师互审信息
     * @param map
     * @return
     */
    List<ArrangeTeacherResultNew> selectArrangeTeacherResultNew(Map<String,Object> map);

    /**
     * 通过id删除一条中期检查老师互审信息
     * @param arrangeresultid
     * @return
     */
    boolean deleteArrangeTeacherResultByPrimaryKey(String arrangeresultid);

    /**
     * 通过id删除一条毕业答辩老师互审信息
     * @param arrangeresultid
     * @return
     */
    boolean deleteArrangeTeacherResultNewByPrimaryKey(String arrangeresultid);

    /**
     * 通过小组id删除中期检查互审信息
     * @param groupid
     * @return
     */
    boolean deleteArrangeTeacherResultByGroupid(String groupid);

    /**
     * 通过小组id删除毕业答辩互审信息
     * @param groupid
     * @return
     */
    boolean deleteArrangeTeacherResultNewByGroupid(String groupid);

    /**
     * 通过小组id删除毕业答辩小组成员信息
     * @param groupid
     * @return
     */
    boolean deleteCheckgrouppersonNewBypgroupid(String groupid);
}
