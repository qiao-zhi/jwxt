package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;
import cn.xm.jwxt.service.outGraduateDesignApply.GraDesignLeaveApplyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/leave")
@SuppressWarnings("all")

public class OutGraDesignLeaveController {
    private Logger logger = Logger.getLogger(OutGraDesignApplyController.class);
    @Autowired
    private GraDesignLeaveApplyService gLeaveApplyService;

    @RequestMapping("/commitLeave")
    @ResponseBody
    public String commitLeave(String leaveid){
        try {
            boolean b = gLeaveApplyService.commitLeave(leaveid);
            if(b){
                return "提交成功";
            }
        } catch (SQLException e) {
            logger.error("请假信息修改失败，数据库异常",e);
        }
        return "提交失败";
    }

    @RequestMapping("/updateLeaveApply")
    @ResponseBody
    public String updateLeaveApply(String leaveid,String startdate,String enddate,String leavedays,
                                   String leaveaddress,String studenttel,String homeaddress,String hometel,
                                   String leavereason){
        Gradesignleaveapply leaveApply = new Gradesignleaveapply();
        try {
            leaveApply.setLeaveid(leaveid);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            leaveApply.setStartdate(sdf.parse(startdate));
            leaveApply.setEnddate(sdf.parse(enddate));
            if(!leavedays.equals("")){
                leaveApply.setLeavedays(Integer.valueOf(leavedays));
            }
            leaveApply.setLeaveaddress(leaveaddress);
            leaveApply.setStudenttel(studenttel);
            leaveApply.setHomeaddress(homeaddress);
            leaveApply.setHometel(hometel);
            leaveApply.setLeavereason(leavereason);
            boolean b = gLeaveApplyService.updateLeave(leaveApply);
            if(b){
                return "保存成功";
            }
        } catch (Exception e) {
            logger.error("请假信息修改失败，数据库异常",e);
        }
        return "保存失败";
    }
}
