package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.ArrangeTeacherResultNew;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ArrangeTeacherResultNewMapper {
    /**
     * 插入老师互审信息
     * @param arrangeTeacherResultNew
     * @return
     */
    int insertArrangeTeacherResult(ArrangeTeacherResultNew arrangeTeacherResultNew);

    /**
     * 删除一条老师互审信息
     * @param arrangeresultid
     * @return
     */
    int deleteArrangeTeacherResultByPrimaryKey(String arrangeresultid);

    /**
     * 查询出所有互审老师信息
     * @return
     */
    List<ArrangeTeacherResultNew> selectArrangeTeacherResult(Map<String,Object> map);

    /**
     * 通过小组id删除互审信息
     * @param groupid
     * @return
     */
    int deleteArrangeTeacherResultNewByGroupid(String groupid);
}
