package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseAuditService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 项目名称：jwxt
 * 类描述：排课审核的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:19
 */
@Service
@Transactional
public class ApArrangeCourseAuditServiceImpl implements ApArrangeCourseAuditService {
    /**
     * 添加审核信息，关联排课任务ID
     * 需要修改排课任务状态
     *
     * @param arrangeTaskId
     * @param auditInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addArrangeCourseAuditInfoByArrangeTaskId(String arrangeTaskId, ApArrangeCourseAudit auditInfo) throws Exception {

        return false;
    }

    /**
     * 根据排课任务ID查询对应的排课信息
     *
     * @param ArrangeCourseTaskId
     * @return
     * @throws Exception
     */
    @Override
    public ApArrangeCourseAudit findArrangeCourseAuditInfoByCondition(String ArrangeCourseTaskId) throws Exception {
        return null;
    }
}
