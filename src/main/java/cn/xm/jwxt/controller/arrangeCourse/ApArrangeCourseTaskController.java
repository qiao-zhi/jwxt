package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseTaskService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：LL
 * 创建时间：2018/5/4 16:31
 */
@Controller
@RequestMapping("/arrangeCourse")
public class ApArrangeCourseTaskController {
    private Logger logger = Logger.getLogger(ApArrangeCourseTaskController.class);

    @Resource
    private ApArrangeCourseTaskService arrangeCourseTaskService;

    /**
     * 根据任务通知书ID添加排课任务
     * @param noticeBookId
     * @param taskInfo
     * @return
     */
    @RequestMapping("/addArrangeCourseTask")
    public @ResponseBody String addArrangeCourseTask(String noticeBookId, ApArrangeCourseTask taskInfo){
        try {
            arrangeCourseTaskService.addApArrangeCourseTaskByNoticeId(noticeBookId,taskInfo);
        } catch (Exception e) {
            logger.error("添加排课任务失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 修改排课任务基本信息
     * @param taskInfo
     * @return
     */
    @RequestMapping("/updateArrangeCourseTask")
    public @ResponseBody String updateArrangeCourseTask(ApArrangeCourseTask taskInfo){
        String arrangeTaskId = null;
        if(ValidateCheck.isNull(taskInfo.getArrangeTaskId())){
            return "修改失败！";
        }else{
            arrangeTaskId = taskInfo.getArrangeTaskId();
        }
        try {
            arrangeCourseTaskService.updateArrangeCourseTaskById(arrangeTaskId, taskInfo);
        } catch (Exception e) {
            logger.error("修改排课任务失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    /**
     * 根据排课任务ID修改排课状态
     * @param arrangeTaskId
     * @param status
     * @return
     */
    @RequestMapping("/updateArrangeCourseTaskStatus")
    public @ResponseBody String updateArrangeCourseTaskStatus(String arrangeTaskId,String status){
        try {
            arrangeCourseTaskService.updateArrangeCourseTaskStatus(arrangeTaskId,status);
        } catch (Exception e) {
            logger.error("修改排课任务状态失败",e);
            return "操作失败！";
        }
        return "操作成功!";
    }

    /**
     * 根据排课任务ID删除排课信息
     * @param arrangeTaskId
     * @return
     */
    @RequestMapping("/deleteArrangeCourseTaskInfo")
    public @ResponseBody String deleteArrangeCourseTaskInfo(String arrangeTaskId){
        try {
            arrangeCourseTaskService.deleteArrangeCourseTaskById(arrangeTaskId);
        } catch (Exception e) {
            logger.error("删除排课任务失败",e);
            return "删除失败！";
        }
        return "删除成功!";
    }

    /**
     * 根据排课任务ID查询排课任务基本信息
     * @param arrangeTaskId
     * @return
     */
    @RequestMapping("/getArrangeCourseTask")
    public @ResponseBody ApArrangeCourseTask getArrangeCourseTask(String arrangeTaskId){
        ApArrangeCourseTask arrangeCourseTask = null;
        try {
            arrangeCourseTask = arrangeCourseTaskService.getArrangeCourseTaskById(arrangeTaskId);
        } catch (Exception e) {
            logger.error("查询排课任务信息失败",e);
        }
        return arrangeCourseTask;
    }

    /**
     * 组合条件查询排课任务信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findArrangeCourseTaskList")
    public @ResponseBody
    PageInfo<ApArrangeCourseTask> findArrangeCourseTaskList(CommonQueryVo condition){
        if(condition.getPageSize()==null){
            condition.setPageSize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentPage()==null){
            condition.setCurrentPage(1);
        }
        PageInfo<ApArrangeCourseTask> pageInfo = null;
        try {
            pageInfo = arrangeCourseTaskService.findApArrangeCourseTaskInfoByCondition(condition,condition.getCurrentPage(),condition.getPageSize());
        } catch (Exception e) {
            logger.error("查询排课任务信息失败",e);
        }
        return pageInfo;
    }
}
