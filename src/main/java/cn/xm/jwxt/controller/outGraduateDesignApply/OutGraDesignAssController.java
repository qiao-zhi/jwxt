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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@SuppressWarnings("all")
@RequestMapping("/assignment")
public class OutGraDesignAssController {
    private Logger logger = Logger.getLogger(OutGraDesignBaseInfoController.class);
    @Autowired
    private PublicMethod publicMethod;
    @Autowired
    private OutGradesignAssignmentService oGDAssignmentService;

    @RequestMapping("/commitAssignment")
    @ResponseBody
    public String commitAssignment(@RequestParam Map<String,Object> map){
        try{
            boolean b = oGDAssignmentService.saveAssignmentById(map,"01","01");
            if(b){
                return "提交成功";
            }
        }catch (Exception e){
            logger.error("数据库异常",e);
        }
        return "提交失败";
    }

    @RequestMapping("/saveAssignment")
    @ResponseBody
    public String saveAssignment(@RequestParam Map<String,Object> map){
        try{
            boolean b = oGDAssignmentService.saveAssignmentById(map,"00","00");
            if(b){
                return "保存成功";
            }
        }catch (Exception e){
            logger.error("数据库异常",e);
        }
        return "保存失败";
    }

    @RequestMapping("/studentSign")
    @ResponseBody
    public Map<String,Object> studentSign(String userID,String signPassword,String assignmentID){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        try {
            Map<String,Object> map = publicMethod.sureStudentSign(userID,signPassword);
            String status =(String) map.get("status");
            if("1".equals(status)){
                Signinfo signInfo = (Signinfo)map.get("signInfo");
                //保存导数据库中
                String fileName = signInfo.getNowname();
                //oGDInfoService.saveStudentSign(outsideApplyID,fileName);
                oGDAssignmentService.saveStudentsign(assignmentID,fileName);
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
