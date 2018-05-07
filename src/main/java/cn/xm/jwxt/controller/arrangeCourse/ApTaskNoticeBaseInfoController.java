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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    @RequestMapping("/findTaskNoticeInfoList")
    public @ResponseBody PageInfo<ApTaskNoticeBaseInfo> findTaskNoticeInfoList(CommonQueryVo condition){
        if(condition.getPageSize()==null){
            condition.setPageSize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentPage()==null){
            condition.setCurrentPage(1);
        }
        PageInfo<ApTaskNoticeBaseInfo> pageInfo = null;
        try {
            pageInfo = taskNoticeBaseInfoService.findApTaskNoticeBaseInfoByCondition(condition, condition.getCurrentPage(),condition.getPageSize());
        } catch (Exception e) {
            logger.error("查询任务通知书失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据任务通知书ID删除通知书信息
     * @param noticeBookId
     * @return
     */
    @RequestMapping("/deleteNoticeBaseInfo")
    public @ResponseBody String deleteNoticeBaseInfo(String noticeBookId){
        try {
            taskNoticeBaseInfoService.deleteApTaskNoticeBaseInfoById(noticeBookId);
        } catch (Exception e) {
            logger.error("删除任务通知书失败",e);
            return "删除任务通知书失败！";
        }
        return "删除任务通知书成功！";
    }

    /**
     * 根据任务通知书ID查询基本信息
     * @param noticeBookId
     * @return
     */
    @RequestMapping("/getApTaskNoticeBaseInfo")
    public @ResponseBody ApTaskNoticeBaseInfo getApTaskNoticeBaseInfo(String noticeBookId){
        ApTaskNoticeBaseInfo taskNoticeBaseInfo = null;
        try {
            taskNoticeBaseInfo = taskNoticeBaseInfoService.getApTaskNoticeBaseInfoById(noticeBookId);
        } catch (Exception e) {
            logger.error("查询任务通知书失败",e);
        }
        return taskNoticeBaseInfo;
    }

    /**
     * 修改任务通知书基本信息
     * @param noticeInfo
     * @return
     */
    @RequestMapping("/updateApTaskNoticeBaseInfo")
    public @ResponseBody String updateApTaskNoticeBaseInfo(ApTaskNoticeBaseInfo noticeInfo){
       String noticeBookId = null;
       if(ValidateCheck.isNull(noticeInfo.getNoticeBookId())){
           return "修改失败！";
       }else{
           noticeBookId = noticeInfo.getNoticeBookId();
       }
        try {
            taskNoticeBaseInfoService.updateApTaskNoticeBaseInfoById(noticeBookId,noticeInfo);
        } catch (Exception e) {
            logger.error("修改任务通知书失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询教学任务通知书的名称和ID用于下拉框显示
    @RequestMapping("/findNoticeNameAndId")
    public @ResponseBody
    List<Map<String,Object>> findNoticeNameAndId(){
        List<Map<String, Object>> noticeNameAndIdList = null;
        try {
            noticeNameAndIdList = taskNoticeBaseInfoService.findNoticeNameAndId();
        } catch (Exception e) {
            logger.error("查询任务通知书失败",e);
        }
        return noticeNameAndIdList;
    }
}
