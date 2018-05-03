package cn.xm.jwxt.mapper.courseDesign.custom;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;

import java.util.List;
import java.util.Map;

public interface TCoursedesignInfoArrangeCustomMapper {

    /**
     *  查询需要安排的课设
     * @param condition
     * @return
     */
    List<TCourseBaseInfo> findNeedArrangeCourseDesign(Map<String, Object> condition);

    /**
     * 教研室主任查看已安排的课设详细信息
     * @param condition  存多个参数
     * @return  返回t_courseDesign_info，trainSchemeCourseDesign的组合
     */

    List<Map<String,Object>> findAllTCoursedesignInfo(Map<String, Object> condition);



}