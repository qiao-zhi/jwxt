package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignTitleApplyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
@SuppressWarnings("all")
@RequestMapping("/title")
public class OutGraDesignTitleController {
@Autowired
private OutGraDesignTitleApplyService oGDTitleService;
    private Logger logger = Logger.getLogger(OutGraDesignBaseInfoController.class);

    @RequestMapping("/commit")
    @ResponseBody
    public String commitTitle(String outgradesignapplyid){
        try {
            boolean b = oGDTitleService.commitTitle(outgradesignapplyid);
            if(b){
                return "提交成功";
            }
        } catch (SQLException e) {
            logger.error("数据库异常",e);
        }
        return "提交失败！！！";
    }
    @RequestMapping("/updateTitle")
    @ResponseBody
    public String updateTitle(Outgradesigntitleapply oGDtitle){
        try {
            boolean b = oGDTitleService.updateTitleApply(oGDtitle);
            if(b){
                return "保存成功";
            }
        } catch (SQLException e) {
            logger.error("数据库异常",e);
        }

        return "";
    }
}
