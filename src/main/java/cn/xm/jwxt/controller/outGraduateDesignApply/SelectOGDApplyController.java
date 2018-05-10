package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.service.outGraduateDesignApply.CheckOGDService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public  PageInfo<Map<String,Object>> allApplyStudent(String userID,String stadyYear,
                                                    String major,String studentNum,
                                                    String checkStatus,String pagesize,String pagenum){
        //分页大小
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(pagesize)){
            pageSize = Integer.valueOf(pagesize);
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(pagenum)){
            pageNum = Integer.valueOf(pagenum);
        }
        //只对紧邻的下一条SELECT语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"t.remark1");

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
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
