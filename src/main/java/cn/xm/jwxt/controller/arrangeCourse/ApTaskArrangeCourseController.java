package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.queryVo.ListVo;
import cn.xm.jwxt.service.arrangeCourse.ApTaskArrangeCourseService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课任务分配课程的Controller
 * 创建人：LL
 * 创建时间：2018/5/6 18:44
 */
@Controller
@RequestMapping("/arrangeCourse")
public class ApTaskArrangeCourseController {
    private Logger logger = Logger.getLogger(ApTaskArrangeCourse.class);
    @Resource
    private ApTaskArrangeCourseService taskArrangeCourseService;

    /**
     * 批量添加排课任务分配课程信息
     * @param arrangeTaskId
     * @param listVo
     * @return
     */
    @RequestMapping("/addTaskArrangeCourseInfoList")
    public @ResponseBody String addTaskArrangeCourseInfoList(String arrangeTaskId, ListVo listVo){
        try {
            taskArrangeCourseService.saveTaskArrangeCourseListByArrangeId(arrangeTaskId,listVo.getTaskArrangeCourses());
        } catch (Exception e) {
            logger.error("保存排课任务分配课程出错！",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 批量修改排课任务分配课程信息
     * @param arrangeTaskId
     * @param listVo
     * @return
     */
    @RequestMapping("/updateTaskArrangeCourseInfoList")
    public @ResponseBody String updateTaskArrangeCourseInfoList(String arrangeTaskId, ListVo listVo){
        try {
            taskArrangeCourseService.updateTaskArrangeCourseListByArrangeId(arrangeTaskId,listVo.getTaskArrangeCourses());
        } catch (Exception e) {
            logger.error("修改排课任务分配课程出错！",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 根据排课任务ID查询相关的课程信息用于排课任务详情的显示
     * @param arrangeTaskId
     * @return
     */
    @RequestMapping("/findTaskArrangeCourseInfoList")
    public @ResponseBody List<ApTaskArrangeCourse> findTaskArrangeCourseInfoList(String arrangeTaskId){
        List<ApTaskArrangeCourse> taskArrangeCourseList = null;
        try {
            taskArrangeCourseList = taskArrangeCourseService.findTaskArrangeCourseListInfoByArrangeId(arrangeTaskId);
        } catch (Exception e) {
            logger.error("查询排课任务分配课程信息失败",e);
        }
        return taskArrangeCourseList;
    }
}
