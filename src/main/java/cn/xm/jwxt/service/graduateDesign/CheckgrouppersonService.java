package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.*;
import org.apache.ibatis.annotations.Param;

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

    List<Checkgroupperson> selectByExample(CheckgrouppersonExample example);

    Checkgroupperson selectByPrimaryKey(Integer gropersonid);

    boolean updateByExampleSelective(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    boolean updateByExample(@Param("record") Checkgroupperson record, @Param("example") CheckgrouppersonExample example);

    boolean updateByPrimaryKeySelective(Checkgroupperson record);

    boolean updateByPrimaryKey(Checkgroupperson record);

    Checkgroupperson selectOneCheckgroupperson(int grppersonid);

    TTeacherInfoVo selectOneCheckgroupperson2(int grppersonid);

    List<Checkgroupperson> selectCheckgrouppersonList(Map<String,Object> map);

    List<TTeacherInfoVo> selectCheckgrouppersonList2(Map<String,Object> map);

    List<CheckgrouppersonVo> selectTeacherAndStudentCountBygroupid(String groupid);

    String selectGroupLeader (String groupid);

    int selectCheckgrouppersonCount(Map<String,Object> map);

    boolean insertArrangeTeacherResult(ArrangeTeacherResult arrangeTeacherResult);

    List<ArrangeTeacherResult> selectArrangeTeacherResult(Map<String,Object> map);

    boolean deleteArrangeTeacherResultByPrimaryKey(String arrangeresultid);

    boolean deleteArrangeTeacherResultByGroupid(String groupid);
}
