package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;
import cn.xm.jwxt.service.outGraduateDesignApply.GraDesignLeaveApplyService;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignTitleApplyService;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraduateDesignApplyService;
import cn.xm.jwxt.service.outGraduateDesignApply.Outgradesigninfoservice;
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
                newResult.put("table1Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table1Status")));
                newResult.put("table2Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table2Status")));
                newResult.put("table3Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table3Status")));
                newResult.put("table4Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table4Status")));
                //newResult.put("table1Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table1Status")));
                //newResult.put("table1Result", TransitionStatusUtil.checkTransition((String) oldResult.get("table1Status")));
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
