package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.service.outGraduateDesignApply.CheckOGDService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
@SuppressWarnings("all")
@RequestMapping("/selectOGDApply")
public class SelectOGDApplyController {
    private Logger logger = Logger.getLogger(SelectOGDApplyController.class);
    @Autowired
    private CheckOGDService checkOGDService;

    @RequestMapping("allApplyStudent")
    @ResponseBody
    public List<Map<String,Object>> allApplyStudent(String userID,String stadyYear,
                                                    String major,String studentNum,
                                                    String checkStatus){
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        if("未审核".equals(checkStatus.trim())){
            checkStatus = "11";
        }
        if("已审核".equals(checkStatus)){
            checkStatus = "21";
        }
        try {
            list = checkOGDService.selectOGDApplyStuBySelective(userID,stadyYear, major,studentNum,checkStatus);
        } catch (SQLException e) {
            logger.error("查询校外申请学生信息出错，数据库异常",e);
        }
        return list;
    }
}
