package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesignsurebook;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgraduateassignment;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignagreemen;
import cn.xm.jwxt.service.outGraduateDesignApply.*;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@SuppressWarnings("all")
@RequestMapping("/baseInfo")
public class OutGraDesignBaseInfoController {
    private Logger logger = Logger.getLogger(OutGraDesignBaseInfoController.class);
    @Autowired
    private PublicMethod publicMethod;
    @Autowired
    private Outgradesigninfoservice oGDInfoService;
    @Autowired
    private OutGraDesignTitleApplyService oGDTitleService;
    @Autowired
    private GraDesignLeaveApplyService gLeaveApplyService;
    @Autowired
    private OutGraDesignAggAndSureService oGDAggAndSureService;
    @Autowired
    private OutsideGraDesignAttachmentService oGDAttachmentService;
    @Autowired
    private OutGradesignAssignmentService oGDAssignmentService;

    /*处理校外申请提交请求*/
    @RequestMapping("/commitODGApply")
    @ResponseBody
    public String commitODGApply(String outsideApplyId,String titleId,String leaveId,
                                 String aggreementId,String sureId,String attachementId,String assignmentId){
        Outgradesigninfo info = new Outgradesigninfo();
        info.setOutsideapplyid(outsideApplyId);
        info.setStatus("01");
        info.setIscommit("11");
        Outsidegradesignagreemen oAgg = new Outsidegradesignagreemen();
        oAgg.setAgreementid(aggreementId);
        oAgg.setApplystatus("01");
        oAgg.setRemark("01");
        Outgradesignsurebook sureBook = new Outgradesignsurebook();
        sureBook.setSureid(sureId);
        sureBook.setIscommit("01");
        Outgraduateassignment oAss = new Outgraduateassignment();
        oAss.setAssignmentid(assignmentId);
        oAss.setCheckstatus("01");
        oAss.setIsok("01");
        try {
            //提交申请表
            boolean i = oGDInfoService.updateInfo(info);
            //提交题目表
            boolean t = oGDTitleService.commitTitle(titleId);
            //提交请假表
            boolean l = gLeaveApplyService.commitLeave(leaveId);
            //提交自我管理协议书
            boolean a = oGDAggAndSureService.updateOGDAgreementById(oAgg);
            //提交保证书
            boolean s = oGDAggAndSureService.updateSureBySureID(sureBook);
            //提交附件
            boolean b = oGDAttachmentService.commitAttachment(attachementId,null);
            //提交任务书
            boolean as = oGDAssignmentService.commitAssigmengById(oAss);
            if(i&&t&&l&&a&&a&&s&&b&&as){
                return "提交成功，进入审批流程...";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "提交失败";
    }

    /*处理申请表提交请求*/
    @RequestMapping("/commitInfo")
    @ResponseBody
    public String commitInfo(String outApplyID){
        Outgradesigninfo info = new Outgradesigninfo();
        try {
            info.setOutsideapplyid(outApplyID);
            info.setIscommit("01");
            boolean b = oGDInfoService.updateInfo(info);
            if(b){
                return "提交成功";
            }
        } catch (SQLException e) {
            logger.error("提交申请表失败，数据库异常",e);
        }
        return "提交失败";
    }

    /*处理校外申请表中的保存按钮请求*/
    @RequestMapping("/saveBaseInfo")
    @ResponseBody
    public String saveBaseInfo(String outApplyID,String receiveUnit,String applyReason){
        Outgradesigninfo outgradesigninfo = new Outgradesigninfo();
        outgradesigninfo.setOutsideapplyid(outApplyID);
        outgradesigninfo.setApplyreason(applyReason);
        outgradesigninfo.setReceiveunit(receiveUnit);
        outgradesigninfo.setApplydate(new Date());
        try {
            boolean b = oGDInfoService.updateInfo(outgradesigninfo);
            if(b){
                return "保存成功";
            }
        } catch (SQLException e) {
            logger.error("数据库异常",e);
        }
        return "保存失败";
    }

    @RequestMapping("/studentSign")
    @ResponseBody
    public Map<String,Object> studentSign(String userID,String signPassword,String outsideApplyID){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        try {
            Map<String,Object> map = publicMethod.sureStudentSign(userID,signPassword);
            String status =(String) map.get("status");
            if("1".equals(status)){
                Signinfo signInfo = (Signinfo)map.get("signInfo");
                //保存导数据库中
                String fileName = signInfo.getNowname();
                oGDInfoService.saveStudentSign(outsideApplyID,fileName);
                String path = FileHandleUtil.getValue("path","signPicturePath");
                resultMap.put("status",1);
                resultMap.put("signUrl",path+fileName);
            }if("0".equals(status)){
                resultMap.put("status",0);
                resultMap.put("signUrl","签名秘密错误，请重新输入。");
            }if("2".equals(status)){
                resultMap.put("status",2);
                resultMap.put("signUrl","未上传签名，请到基本信息模块上传签名。");
            }
        } catch (SQLException e) {
            logger.error("数据库异常",e);
        }
        return resultMap;
    }
}
