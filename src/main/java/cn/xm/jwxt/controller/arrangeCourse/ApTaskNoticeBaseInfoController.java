package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeBaseInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 项目名称：jwxt
 * 类描述：教学任务通知书基本信息的controller
 * 创建人：LL
 * 创建时间：2018/4/27 16:47
 */
@Controller
@RequestMapping("/arrangeCourse")
public class ApTaskNoticeBaseInfoController {
    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ApTaskNoticeBaseInfoController.class);
    @Resource
    private ApTaskNoticeBaseInfoService taskNoticeBaseInfoService;

    /**
     * 添加任务通知书基本信息
     * @param noticeInfo
     * @return
     */
    @RequestMapping("/addTaskNoticeBaseInfo")
    public @ResponseBody String addTaskNoticeBaseInfo(ApTaskNoticeBaseInfo noticeInfo){
        try {
            taskNoticeBaseInfoService.addApTaskNoticeBaseInfo(noticeInfo);
        } catch (Exception e) {
            logger.error("添加任务通知书失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询任务通知书信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findTaskInfoList")
    public @ResponseBody PageInfo<ApTaskNoticeBaseInfo> findTaskNoticeInfoList(CommonQueryVo condition){
        Integer pageSize = DefaultValue.PAGE_SIZE;
        Integer currentPage = 1;
        if(ValidateCheck.isNotNull(condition.getPageSize())){
            pageSize = Integer.valueOf(condition.getPageSize());
        }
        if(ValidateCheck.isNotNull(condition.getCurrentPage())){
            currentPage = Integer.valueOf(condition.getCurrentPage());
        }
        PageInfo<ApTaskNoticeBaseInfo> pageInfo = null;
        try {
            pageInfo = taskNoticeBaseInfoService.findApTaskNoticeBaseInfoByCondition(condition, currentPage, pageSize);
        } catch (Exception e) {
            logger.error("查询任务通知书失败",e);
        }
        return pageInfo;
    }
}
