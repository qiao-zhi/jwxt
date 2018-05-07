package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;

import java.util.List;
import java.util.Map;

/**
 * 中期检查基本信息表
 * 只和中期检查安排表连接
 *
 * 外键：中期检查安排表id
 */
public interface CencheckbaseinfoCustomMapper {

    /**
     * 通过id查询中期检查表信息及中期检查安排信息
     * @param cencheckinfoid
     * @return
     */
    Cencheckbaseinfo selectOneCencheckbaseinfo(String cencheckinfoid);

    /**
     * 通过条件查询中期检查表信息（多表联查及分页查询）
     * @param map
     * @return
     */
    List<Cencheckbaseinfo> selectCencheckbaseinfoList(Map<String,Object> map);

}
