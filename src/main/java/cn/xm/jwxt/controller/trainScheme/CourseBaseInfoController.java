package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.controller.system.UserAction;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * private String ;
 */
@Controller//控制层注解
@RequestMapping("/courseLibrary")
public class CourseBaseInfoController {

    private Logger logger = Logger.getLogger(CourseBaseInfoController.class);//日志记录器
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;//课程service

    /**
     * 添加一条课程信息
     * @param tCourseBaseInfo
     * @return
     */
    @RequestMapping("/addCourse")
    public @ResponseBody
    String addCourseBaseInfo(TCourseBaseInfo tCourseBaseInfo){
        if(tCourseBaseInfo == null){
            return "添加失败!";
        }
        try {
            courseBaseInfoService.addCourseBaseInfo(tCourseBaseInfo);
        } catch (SQLException e) {
            logger.error("添加课程失败",e);
            return "添加失败!";
        }
        return "添加成功";
    }
}
