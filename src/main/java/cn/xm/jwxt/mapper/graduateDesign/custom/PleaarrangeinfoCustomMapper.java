package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.Pleaarrangeinfo;

import java.util.List;
import java.util.Map;

/**
 * 毕业答辩安排信息表和其他表的关联信息（关联毕业课题任务书）
 */
public interface PleaarrangeinfoCustomMapper {

    /**
     * 查询出所有和毕业安排相关表的信息
     * @param map
     * @return
     */
    List<Pleaarrangeinfo> selectPleaarrangeinfoList(Map<String,Object> map);
}
