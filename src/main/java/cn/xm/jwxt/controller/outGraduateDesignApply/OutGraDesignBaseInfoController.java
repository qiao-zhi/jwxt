package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import cn.xm.jwxt.service.outGraduateDesignApply.Outgradesigninfoservice;
import cn.xm.jwxt.service.outGraduateDesignApply.PublicMethod;
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

    /*处理校外申请提交请求*/
    @RequestMapping("/commitODGApply")
    @ResponseBody
    public String commitODGApply(String outsideApplyId){
        Outgradesigninfo info = new Outgradesigninfo();
        try {
            info.setOutsideapplyid(outsideApplyId);
            info.setIscommit("11");
            boolean b = oGDInfoService.updateInfo(info);
            if(b){
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
                resultMap.put("signUrl","未上传签名，请到...上传签名。");
            }
        } catch (SQLException e) {
            logger.error("数据库异常",e);
        }
        return resultMap;
    }
}
