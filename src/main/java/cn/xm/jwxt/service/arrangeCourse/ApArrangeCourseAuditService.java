package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;

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
     * 根据排课任务ID查询最新的审核信息
     * @param ArrangeCourseTaskId
     * @return
     * @throws Exception
     */
    ApArrangeCourseAudit getArrangeCourseAuditInfoByCondition(String ArrangeCourseTaskId) throws Exception;

    /**
     * 初始化教材订购总表
     * @param baseInfo
     * @return
     * @throws Exception
     */
    boolean addTextbookOrderInfo(Textbookorderinfo baseInfo) throws Exception;
}
