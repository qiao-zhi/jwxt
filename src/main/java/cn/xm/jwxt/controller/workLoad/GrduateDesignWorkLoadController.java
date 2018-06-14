package cn.xm.jwxt.controller.workLoad;

import cn.xm.jwxt.service.workLoad.GrduateDesignWorkLoadService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/grduateDesignWorkLoad")
public class GrduateDesignWorkLoadController {
    private Logger logger = Logger.getLogger(GrduateDesignWorkLoadController.class);

    @Autowired
    private GrduateDesignWorkLoadService grduateService;

    @ResponseBody
    @RequestMapping("/searchGrduateDesignWorkLoad.do")
    public PageInfo<Map<String,Object>> findGrduateDesignWorkLoad(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize"))){
            pageSize = Integer.parseInt((String)condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum = Integer.parseInt((String)condition.get("pageNum"));
        }
        PageHelper.startPage(pageNum,pageSize);

        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try {
            list = grduateService.findGrduateDesignWorkLoad(condition);
        } catch (SQLException e) {
            logger.error("查询毕设工作量失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @ResponseBody
    @RequestMapping("/findGrduateDesignWorkLoadDetail.do")
    public Map<String,Object> findGrduateDesignWorkLoadDetail(String teacherTitleID){
        Map<String,Object> mapInfo = new HashMap<String,Object>();
        try {
            mapInfo = grduateService.findGraDesignDetail(teacherTitleID);
        } catch (SQLException e) {
            logger.error("查询毕设工作量详细信息出错",e);
        }
        return mapInfo;
    }

}
