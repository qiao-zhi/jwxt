package cn.xm.jwxt.controller.workLoad;

import cn.xm.jwxt.service.workLoad.CourseDesignWorkLoadService;
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
@RequestMapping("/teachingWorkLoad")
public class CourseDesignWorkLoadController {

    private Logger logger = Logger.getLogger(CourseDesignWorkLoadController.class);

    @Autowired
    private CourseDesignWorkLoadService courseDesignService;


    @ResponseBody
    @RequestMapping("/searchCourseDesignWorkLoad.do")
    public PageInfo<Map<String,Object>> findTeachingWorkLoad(@RequestParam Map<String,Object> condition){

        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.parseInt((String)condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum = Integer.parseInt((String)condition.get("pageNum"));
        }
        PageHelper.startPage(pageNum,pageSize,"yearNum");
        List<Map<String,Object>> list = null;
        try {
            list = courseDesignService.findCourseDesignWorload(condition);
        } catch (SQLException e) {
            logger.error("查询课设工作量出错",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     *  课设工作量详细信息查询
     * @param courseDesignTeacherArrangeID
     * @return
     */
    @ResponseBody
    @RequestMapping("/findOneTeacherCourseDesignInfo.do")
    public Map<String,Object> findOneTeacherCourseDesignInfo(String courseDesignTeacherArrangeID){
        Map<String,Object> mapInfo = new HashMap<String,Object>();
        try {
            mapInfo = courseDesignService.findOneTeacherCourseDesignInfo(courseDesignTeacherArrangeID);
        } catch (SQLException e) {
            logger.error("查询课设详细工作量出错",e);
        }
        return mapInfo;
    }

}
