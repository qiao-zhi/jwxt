package cn.xm.jwxt.controller.workLoad;

import cn.xm.jwxt.service.workLoad.CourseWorkLoadService;
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
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/courseWorkLoad")
public class CourseWorkLoadController {

    private Logger logger = Logger.getLogger(CourseWorkLoadController.class);

    @Autowired
    private CourseWorkLoadService courseService;


    @ResponseBody
    @RequestMapping("/findCourseWorkLoad.do")
    public PageInfo<Map<String,Object>> findCourseWorkLoad(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.parseInt((String)condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum = Integer.parseInt((String)condition.get("pageNum"));
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String,Object>> list = null;
        try {
            list = courseService.findCourseWorkLoad(condition);
        } catch (SQLException e) {
            logger.error("查询课程工作量出错",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @ResponseBody
    @RequestMapping("/findCourseDetail.do")
    public Map<String,Object> findCourseDetail(String teacher_course_id){
        Map<String,Object> map = null;
        try {
            map = courseService.findOneCourseDetail(teacher_course_id);
        } catch (SQLException e) {
            logger.error("查询课程详细工作量出错");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/findStuListInfo.do")
    public List<String> findStuList(String className){
        List<String> list = null;
        try {
            list = courseService.findStuListByClassName(className);
        } catch (SQLException e) {
            logger.error("查询课程工作量（学生列表）出错",e);
        }
        return list;
    }

}
