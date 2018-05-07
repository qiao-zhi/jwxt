package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课审核的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:13
 */
public interface ApArrangeCourseAuditService {
    /**
     * 添加审核信息，关联排课任务ID
     * 需要修改排课任务状态
     * @param arrangeTaskId
     * @param auditInfo
     * @return
     * @throws Exception
     */
    boolean addArrangeCourseAuditInfoByArrangeTaskId(String arrangeTaskId, ApArrangeCourseAudit auditInfo) throws Exception;

    /**
     * 根据排课任务ID查询对应的排课信息
     * @param ArrangeCourseTaskId
     * @return
     * @throws Exception
     */
    ApArrangeCourseAudit findArrangeCourseAuditInfoByCondition(String ArrangeCourseTaskId) throws Exception;
}
