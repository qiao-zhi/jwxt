package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseAuditService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 项目名称：jwxt
 * 类描述：排课审核的Controller
 * 创建人：LL
 * 创建时间：2018/5/11 19:31
 */
@RequestMapping("/arrangeCourse")
public class ApArrangeCourseAuditController {
    Logger logger = Logger.getLogger(ApArrangeCourseAuditController.class);
    @Resource
    private ApArrangeCourseAuditService arrangeCourseAuditService;

    /**
     * 根据排课任务ID添加审核信息
     * @param arrangeTaskId
     * @param auditInfo
     * @return
     */
    @RequestMapping("/addArrangeCourseAuditInfo")
    public @ResponseBody String addArrangeCourseAuditInfo(String arrangeTaskId, ApArrangeCourseAudit auditInfo){
        try {
            arrangeCourseAuditService.addArrangeCourseAuditInfoByArrangeTaskId(arrangeTaskId,auditInfo);
        } catch (Exception e) {
            logger.error("添加审核失败",e);
            return "审核失败";
        }
        return "审核成功";
    }

    /**
     * 根据排课任务ID查询审核信息
     * @param arrangeTaskId
     * @return
     */
    public @ResponseBody ApArrangeCourseAudit getLastArrangeCourseAudit(String arrangeTaskId){
        ApArrangeCourseAudit arrangeCourseAudit = null;
        try {
            arrangeCourseAudit = arrangeCourseAuditService.getArrangeCourseAuditInfoByCondition(arrangeTaskId);
        } catch (Exception e) {
            logger.error("查询审核信息失败",e);
        }
        return arrangeCourseAudit;
    }
}
