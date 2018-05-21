package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.MiddleReportManage;

import java.util.List;
import java.util.Map;

/**
 * 查询中期检查审核，毕业答辩审核前展示的信息
 */
public interface MiddleReportManageCustomMapper {

    /**
     * 多条件分页查询信息
     * @param map
     * @return
     */
    List<MiddleReportManage> selectMiddleReportManageList(Map<String,Object> map);

    /**
     * 多条件分页查询信息的条数
     * @param map
     * @return
     */
    Integer selectMiddleReportManageCount(Map<String,Object> map);

    /**
     * 通过学生id查询出中期检查结果信息
     * @param studentid
     * @return
     */
    MiddleReportManage selectcenCheckResultInfoByStudentId(String studentid);
}
