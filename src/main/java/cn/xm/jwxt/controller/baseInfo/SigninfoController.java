package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.service.baseInfo.SigninfoService;
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
 * 类描述：教师学生签名信息的controller
 * 创建人：bqq
 * 创建时间：2018/5/4
 */
@Controller
@RequestMapping("/baseInfo")

public class SigninfoController {
    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(SigninfoController.class);
    @Resource
    private SigninfoService signinfoService;
    /**
     * 添加任务通知书基本信息
     * @param signInfo
     * @return
     */
    @RequestMapping("/addSignInfo")
    public @ResponseBody
    String addSignInfo(Signinfo signInfo){
        try {
            signinfoService.addSignInfo(signInfo);
        } catch (Exception e) {
            logger.error("添加教师学生签名图片失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询签名信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findSignInfoList")
    public @ResponseBody PageInfo<Signinfo> findSignInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<Signinfo> pageInfo = null;
        try {
            pageInfo = signinfoService.findSignInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询教师失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据签名ID删除签名信息
     * @param signId
     * @return
     */
    @RequestMapping("/deleteSignInfo")
    public @ResponseBody String deleteSignInfo(String signId){
        try {
            signinfoService.deleteSignInfoById(signId);
        } catch (Exception e) {
            logger.error("删除签名信息失败",e);
            return "删除签名信息失败！";
        }
        return "删除签名信息成功！";
    }

    /**
     * 根据签名ID查询基本信息
     * @param signId
     * @return
     */
    @RequestMapping("/getSignInfo")
    public @ResponseBody Signinfo getSignBaseInfo(String signId){
        Signinfo signinfo = null;
        try {
            signinfo = signinfoService.getSignInfoById(signId);
        } catch (Exception e) {
            logger.error("查询任务通知书失败",e);
        }
        return signinfo;
    }

    /**
     * 修改任务通知书基本信息
     * @param signInfo
     * @return
     */
    @RequestMapping("/updateApTaskNoticeBaseInfo")
    public @ResponseBody String updateApTaskNoticeBaseInfo(Signinfo signInfo){
        String signId = null;
        if(ValidateCheck.isNull(signInfo.getSignId())){
            return "修改失败！";
        }else{
            signId = signInfo.getSignId();
        }
        try {
            signinfoService.updateSignInfoById(signId,signInfo);
        } catch (Exception e) {
            logger.error("修改签名失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }
}