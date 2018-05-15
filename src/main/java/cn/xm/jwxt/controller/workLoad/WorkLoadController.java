package cn.xm.jwxt.controller.workLoad;

import cn.xm.jwxt.service.workLoad.CourseDesignWorkLoadService;
import cn.xm.jwxt.service.workLoad.WorkLoadService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/searchWorkLoad")
public class WorkLoadController {

    private Logger logger = Logger.getLogger(WorkLoadController.class);

    @Autowired
    private CourseDesignWorkLoadService courseDesignService;
    @Autowired
    private WorkLoadService workLoadService;

    @ResponseBody
    @RequestMapping("/getYearNumList.do")
    public List<String> getYearNum(){
        List<String> listInfo = new ArrayList<String>();
        try {
            listInfo = courseDesignService.getYearNumList();
        } catch (SQLException e) {
            logger.error("获取当前年出错",e);
        }
        return listInfo;
    }

    @ResponseBody
    @RequestMapping("/findWorkLoad.do")
    public Map<String,Object> findWorkLoad(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize"))){
            pageSize = Integer.parseInt((String)condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum = Integer.parseInt((String)condition.get("pageNum"));
        }
        List<Map<String,Object>> alllist = new ArrayList<Map<String,Object>>();

        try {
            alllist = workLoadService.findAllWorkLoad(condition);
        } catch (SQLException e) {
            logger.error("查询全部工作(课程，课设，毕设)量出错",e);
        }

        int total = alllist.size();
        // 判断最后一页
        int lastSize = total%pageSize; // 最后一页的数量
        int count;   //第几页为最后一页
        if(lastSize!=0){
            count = total/pageSize + 1;
        }else {
            count = total/pageSize;
        }

        int startNum = (pageNum - 1)*pageSize;
        // 是否到了最后一页
        if(pageNum == count){
            pageSize = lastSize;
        }
        int endNum = startNum + pageSize;
        if(endNum == (total)){
            pageSize = DefaultValue.PAGE_SIZE;
        }

        List<Map<String,Object>> infoList = alllist.subList(startNum,endNum);
        Map<String,Object> pageMap = new HashMap<String,Object>();
            pageMap.put("pageSize",pageSize);
            pageMap.put("pageNum",pageNum);
            pageMap.put("total",total);
            pageMap.put("infoList",infoList);

        return pageMap;
    }

}
