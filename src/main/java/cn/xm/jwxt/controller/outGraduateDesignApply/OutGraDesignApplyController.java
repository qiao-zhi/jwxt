package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.*;
import cn.xm.jwxt.service.outGraduateDesignApply.*;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.TransitionStatusUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Controller
@SuppressWarnings("all")
@RequestMapping("/outGraduateDesiner")
public class OutGraDesignApplyController {
    private Logger logger = Logger.getLogger(OutGraDesignApplyController.class);
    @Autowired
    private OutGraduateDesignApplyService oGDApplyService;       //校外申请service
    @Autowired
    private Outgradesigninfoservice oGDInfoService;
    @Autowired
    private OutGraDesignTitleApplyService oGDTitleService;
    @Autowired
    private GraDesignLeaveApplyService gDesignLeaveService;
    @Autowired
    private OutGraDesignAggAndSureService oGDAgreementService;
    @Autowired
    private OutsideGraDesignAttachmentService oGDAttachmentService;

    @RequestMapping("/commitOGDAttachment")
    @ResponseBody
    public String commitOGDAttachment(String attachmentID,String contentType){
        try {
            boolean b = oGDAttachmentService.commitAttachment(attachmentID,contentType);
            if(b){
                return "提交成功";
            }
        } catch (SQLException e) {
            logger.error("保存失败，数据库出错",e);
        }
        return "提交失败";
    }

    @RequestMapping("/saveOGDAttachment")
    @ResponseBody
    public String saveOGDAttachment(String attachmentID,String contentType){
        try {
            boolean b = oGDAttachmentService.updateAttachment(attachmentID,contentType);
            if(b){
                return "保存成功";
            }
        } catch (SQLException e) {
            logger.error("保存失败，数据库出错",e);
        }
        return "保存失败";
    }

    @RequestMapping("/selectOGDAttachment")
    @ResponseBody
    public Outsidegradesignattachment selectOGDAttachment(String attachmentID){
        Outsidegradesignattachment oGDAttachment = null;
        try {
            oGDAttachment = oGDAttachmentService.selectAttachmentByAttID(attachmentID);
        } catch (SQLException e) {
            logger.error("查询学生附件信息失败，数据库异常",e);
        }
        return oGDAttachment;
    }

    @RequestMapping("/selectODGSureBook")
    @ResponseBody
    public Outgradesignsurebook selecODGSureBook(String sureID){
        Outgradesignsurebook oGDSureBook = null;
        try {
            oGDSureBook = oGDAgreementService.selectBySureID(sureID);
        } catch (SQLException e) {
            logger.error("查询学生保证书信息失败，数据库异常",e);
        }
        return oGDSureBook;
    }

    @RequestMapping("/selectODGSelfAggreement")
    @ResponseBody
    public Outsidegradesignagreemen selectODGSelfAggreement(String selfManageId){
        Outsidegradesignagreemen oGDAgreement = null;
        try{
            oGDAgreement = oGDAgreementService.selectByID(selfManageId);
        } catch(SQLException e){
            logger.error("查询学生自我管理协议书失败，数据库异常",e);
        }
        return oGDAgreement;
    }
    /*查询毕设中自我管理协议书*/
    @RequestMapping("/selectOGDLeaveInfo")
    @ResponseBody
    public Gradesignleaveapply selectOGDLeaveInfo(String leaveID){
        Gradesignleaveapply gradesignleaveapply = null;
        try {
            gradesignleaveapply = gDesignLeaveService.selectLeaveApplyByLeaveID(leaveID);
        } catch (SQLException e) {
            logger.error("查询学生请假申请表失败，数据库异常",e);
        }
        return gradesignleaveapply;
    }

    /*查询学生题目申请表的信息*/
    @RequestMapping("/selectOGDTitleInfo")
    @ResponseBody
    public Outgradesigntitleapply selectOGDTitleInfo(String outGraApplyID){
        Outgradesigntitleapply outgradesigntitleapply = null;
        try {
            outgradesigntitleapply = oGDTitleService.selectTitleInfoByTitleID(outGraApplyID);
        } catch (SQLException e) {
            logger.error("查询学生题目申请表失败，数据库异常",e);
        }
        return outgradesigntitleapply;
    }

    /*读取学生申请基本信息表的详细信息*/
    @RequestMapping("/selectODGApplyInfo")
    @ResponseBody
    public Outgradesigninfo selectODGApplyInfo(String outsideApplyID){
        Outgradesigninfo outGraDesignInfo = null;
        try {
            outGraDesignInfo = oGDInfoService.selectInfoByOutsideApplyID(outsideApplyID);
        } catch (SQLException e) {
            logger.error("查询学生申请表信息失败，数据库异常",e);
        }
        return outGraDesignInfo;
    }

    /*读取学生申请文件信息*/
    @RequestMapping("/loadApplyFile")
    @ResponseBody
    public ResposeResult<Map<String,Object>> loadApplyFileInfo(String userID){
        boolean b = false;
        ResposeResult<Map<String,Object>> result = new ResposeResult<Map<String,Object>>();
        Map<String,Object> newResult = new HashMap<String,Object>();
        try {
            b = oGDApplyService.isFinishTitleResult(userID);
            if(b){
                //获取数据库中中得查询结果
                Map<String,Object> oldResult = oGDApplyService.checkFile(userID);
                //对结果进行处理
                newResult = oldResult;
                /*对审核字段进行处理*/
                newResult.put("table1Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table1Status")));
                newResult.put("table2Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table2Status")));
                newResult.put("table3Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table3Status")));
                newResult.put("table4Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table4Status")));
                //newResult.put("table1Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table1Status")));
                //newResult.put("table1Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table1Status")));
                /*对提交字段进行处理*/
                String checkStatus = (String)oldResult.get("table1Commit");
                if("11".equals(checkStatus)){
                    newResult.put("table1Commit","申请中");
                    newResult.put("table2Commit","申请中");
                    newResult.put("table3Commit","申请中");
                    newResult.put("table4Commit","申请中");
                    newResult.put("table5Commit","申请中");
                    newResult.put("table6Commit","申请中");
                } else if("21".equals(checkStatus)){
                    newResult.put("table1Commit","已申请");
                    newResult.put("table2Commit","已申请");
                    newResult.put("table3Commit","已申请");
                    newResult.put("table4Commit","已申请");
                    newResult.put("table5Commit","已申请");
                    newResult.put("table6Commit","已申请");
                } else{
                    newResult.put("table1Commit",TransitionStatusUtil.commitTransition((String)oldResult.get("table1Commit")));
                    newResult.put("table2Commit",TransitionStatusUtil.commitTransition((String)oldResult.get("table2Commit")));
                    newResult.put("table3Commit",TransitionStatusUtil.commitTransition((String)oldResult.get("table3Commit")));
                    newResult.put("table4Commit",TransitionStatusUtil.commitTransition((String)oldResult.get("table4Commit")));
                    newResult.put("table5Commit",TransitionStatusUtil.commitTransition((String)oldResult.get("table5Commit")));
                    newResult.put("table6Commit",TransitionStatusUtil.commitTransition((String)oldResult.get("table6Commit")));
                }

                result.setSuccess(b);
                result.setData(newResult);
            }
        } catch (SQLException e) {
            result.setMsg("根据学生id查询校外毕设信息失败");
            logger.error("根据学生id查询校外毕设信息失败",e);
        }
        result.setSuccess(b);
        return result;
    }
}
