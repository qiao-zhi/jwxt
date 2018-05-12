package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;
import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAuditExample;
import cn.xm.jwxt.mapper.arrangeCourse.ApArrangeCourseAuditMapper;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseAuditService;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课审核的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:19
 */
@Service
@Transactional
public class ApArrangeCourseAuditServiceImpl implements ApArrangeCourseAuditService {
    @Resource
    private ApArrangeCourseAuditMapper arrangeCourseAuditMapper;
    /**
     * 添加审核信息，关联排课任务ID
     * 需要修改排课任务状态
     * @param arrangeTaskId
     * @param auditInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addArrangeCourseAuditInfoByArrangeTaskId(String arrangeTaskId, ApArrangeCourseAudit auditInfo) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        if(auditInfo==null){
            throw new IllegalArgumentException("审核信息不能为空!");
        }
        auditInfo.setAuditId(UUIDUtil.getUUID2());
        auditInfo.setArrangeTaskId(arrangeTaskId);
        //为审核时间增加时分秒
        auditInfo.setAuditTime(DateHandler.addHourMinuteSecToDate(auditInfo.getAuditTime()));
        int count = arrangeCourseAuditMapper.insertSelective(auditInfo);
        return count>0?true:false;
    }

    /**
     * 根据排课任务ID查询最新的审核信息
     * @param arrangeCourseTaskId
     * @return
     * @throws Exception
     */
    @Override
    public ApArrangeCourseAudit getArrangeCourseAuditInfoByCondition(String arrangeCourseTaskId) throws Exception {
        ApArrangeCourseAuditExample arrangeCourseAuditExample = new ApArrangeCourseAuditExample();
        ApArrangeCourseAuditExample.Criteria criteria = arrangeCourseAuditExample.createCriteria();
        criteria.andArrangeTaskIdEqualTo(arrangeCourseTaskId);
        //按照审核时间倒序排列
        arrangeCourseAuditExample.setOrderByClause("audit_time DESC");
        List<ApArrangeCourseAudit> listInfo = arrangeCourseAuditMapper.selectByExample(arrangeCourseAuditExample);
        ApArrangeCourseAudit arrangeCourseAudit = null;
        //获取最新的审核结果
        if(listInfo.size()>0){
            arrangeCourseAudit = listInfo.get(0);
        }
        return arrangeCourseAudit;
    }
}
