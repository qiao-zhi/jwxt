package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.Checkgroupperson;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 检查小组成员（外联中期和后期毕设答辩检查小组）
 */
public interface CheckGroupPersonCustomMapper {

    /**
     * 查询出单个成员及其小组信息，老师信息
     * @param gropersonid
     * @return
     */
    Checkgroupperson selectOneCheckgroupperson (@Param("gropersonid")int gropersonid);

    /**
     * 通过条件查询
     * @param map
     * @return
     */
    List<Checkgroupperson> selectCheckgrouppersonList (Map<String,Object> map);

    /**
     * 查询检查小组人员个数
     * @param map
     * @return
     */
    int selectCheckgrouppersonCount(Map<String,Object> map);
}
