package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;
import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAuditExample;
import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.custom.ArrangeCourseTaskStatusEnum;
import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.mapper.arrangeCourse.ApArrangeCourseAuditMapper;
import cn.xm.jwxt.mapper.orderBooks.TextbookorderinfoMapper;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseAuditService;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseTaskService;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.net.HttpRetryException;
import java.util.Date;
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
    private static final String ORDER_NAME = "教材征订单";
    @Resource
    private ApArrangeCourseAuditMapper arrangeCourseAuditMapper;
    @Resource
    private ApArrangeCourseTaskService arrangeCourseTaskService;
    @Resource
    private TextbookorderinfoMapper textbookorderinfoMapper;
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
        //如果审核通过
        if(DefaultValue.IS_USE.equals(auditInfo.getAuditResult())){
            //设置排课任务状态为通过审核
            arrangeCourseTaskService.updateArrangeCourseTaskStatus(arrangeTaskId, ArrangeCourseTaskStatusEnum.PASS_AUDIT.getStatus());
            //查询排课任务基本信息
            ApArrangeCourseTask arrangecoursetask = arrangeCourseTaskService.getArrangeCourseTaskById(arrangeTaskId);
            Textbookorderinfo textbookorderinfo = generateTextbookOrderInfo(arrangecoursetask);
            //初始化教材订购总表
            addTextbookOrderInfo(textbookorderinfo);
        }else{
            //设置排课任务状态为不通过审核
            arrangeCourseTaskService.updateArrangeCourseTaskStatus(arrangeTaskId, ArrangeCourseTaskStatusEnum.NOT_PASS_AUDIT.getStatus());
        }
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

    /**
     * 初始化教材订购总表
     * @param baseInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addTextbookOrderInfo(Textbookorderinfo baseInfo) throws Exception {
        if(baseInfo==null){
            throw new IllegalArgumentException("教材订购总表信息不能为空!");
        }
        int count = textbookorderinfoMapper.insertSelective(baseInfo);
        return count>0?true:false;
    }

    //构造一个订单总表的实体类
    private Textbookorderinfo generateTextbookOrderInfo(ApArrangeCourseTask taskInfo){
        if(taskInfo==null){
            throw new IllegalArgumentException("排课任务信息不能为空!");
        }
        Textbookorderinfo textbookorderinfo = new Textbookorderinfo();
        //订单名称
        textbookorderinfo.setOrdername(taskInfo.getMajorName()+ORDER_NAME);
        //专业名称
        textbookorderinfo.setRoomname(taskInfo.getMajorName());
        //专业ID
        textbookorderinfo.setRemark(taskInfo.getMajorId());
        //创建人
        textbookorderinfo.setCreateperson(taskInfo.getTaskReceiptName());
        //创建时间
        textbookorderinfo.setCreatetime(new Date());
        //学年
        textbookorderinfo.setYearnum(taskInfo.getAcademicYear());
        //学期
        textbookorderinfo.setSemester(taskInfo.getTerm());
        //是否审核
        textbookorderinfo.setIscheck(DefaultValue.IS_NOT_USE);
        //是否订购
        textbookorderinfo.setIsorder(DefaultValue.IS_NOT_USE);
        return textbookorderinfo;
    }
}
