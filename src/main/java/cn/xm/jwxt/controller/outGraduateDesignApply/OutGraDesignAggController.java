package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignagreemen;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignAggAndSureService;
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
@RequestMapping("/aggreement")
public class OutGraDesignAggController {
    private Logger logger = Logger.getLogger(OutGraDesignAggController.class);
    @Autowired
    private PublicMethod publicMethod;
    @Autowired
    private OutGraDesignAggAndSureService oGDAggAndSureService;

    @RequestMapping("/commitAgg")
    @ResponseBody
    public String commitAgg(String aggID){
        Outsidegradesignagreemen oAgg = new Outsidegradesignagreemen();
        oAgg.setAgreementid(aggID);
        oAgg.setApplystatus("01");
        oAgg.setRemark("01");
        try {
            boolean b = oGDAggAndSureService.updateOGDAgreementById(oAgg);
            if(b){
                return "提交成功";
            }
        } catch (SQLException e) {
            logger.error("提交自我管理协议书失败，数据库异常",e);
        }
        return "提交失败";
    }

    /*处理自我管理协议中学生签字请求*/
    @RequestMapping("/studentSign")
    @ResponseBody
    public Map<String,Object> studentSign(String userID, String signPassword, String aggreementID){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        try {
            Map<String,Object> map = publicMethod.sureStudentSign(userID,signPassword);
            String status =(String) map.get("status");
            if("1".equals(status)){
                Signinfo signInfo = (Signinfo)map.get("signInfo");
                //保存导数据库中
                String fileName = signInfo.getNowname();
                Outsidegradesignagreemen oAggreement = new Outsidegradesignagreemen();
                oAggreement.setAgreementid(aggreementID);
                oAggreement.setStudentsign(fileName);
                oAggreement.setStudentsigndate(new Date());
                boolean b = oGDAggAndSureService.updateOGDAgreementById(oAggreement);
                String path = FileHandleUtil.getValue("path","signPicturePath");
                if(b){
                    resultMap.put("status",1);
                    resultMap.put("signUrl",path+fileName);
                }
                else   resultMap.put("status",3);
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
