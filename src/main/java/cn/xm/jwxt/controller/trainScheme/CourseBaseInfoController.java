package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.controller.system.UserAction;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * 根据课程编号查询是否存在相同课程编号的课程
     * @param courseNum
     * @return
     */
    @RequestMapping("/getCountByCourseNum")
    public @ResponseBody String getCountByCourseNum(String courseNum){
        int result = 0;
        if(ValidateCheck.isNull(courseNum)){
            result=1;
        }
        try {
            result =  courseBaseInfoService.getCountByCourseNum(courseNum);
        } catch (SQLException e) {
            logger.error("根据课程编号查询课程总数出错",e);
        }
        return String.valueOf(result);
    }

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

    /**
     * 分页组合条件查询课程信息
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @Cacheable(value = "coursesFy")//注解添加到redis缓存中
    @RequestMapping("/getCourseBaseInfosByCondition")
    public @ResponseBody PageInfo<Map<String,Object>> getCourseBaseInfosByCondition(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.valueOf((String) condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){
            pageNum = Integer.valueOf((String) condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"CONVERT(courseNameCN USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, Object>> courses = null;
        try {
            courses = courseBaseInfoService.getCourseBaseInfosByCondition(condition);
        } catch (SQLException e) {
            logger.error("分页查询课程信息失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(courses);
        return pageInfo;
    }


    /**
     * 根据课程主键查询课程基本信息
     * @param courseId  课程主键
     * @return
     */
    @RequestMapping("/getCourseBaseInfoById")
    public @ResponseBody TCourseBaseInfo getCourseBaseInfoById(String courseId){
        TCourseBaseInfo courseBaseInfo =null;
        try {
            courseBaseInfo = courseBaseInfoService.getCourseBaseInfoById(courseId);
        } catch (SQLException e) {
            logger.error("根据ID查询课程基本信息失败",e);
        }
        return courseBaseInfo;
    }

    @RequestMapping("/updateCourseBaseInfo")
    public @ResponseBody String updateCourse(TCourseBaseInfo courseBaseInfo){
        String result = null;
        try {
            result = courseBaseInfoService.updateCourseBaseInfoById(courseBaseInfo)?"修改成功":"修改失败";
        } catch (SQLException e) {
            logger.error("修改课程基本信息失败",e);
            result="修改出错了！！！";
        }
        return result;
    }

    @RequestMapping("/deleteCourseById")
    public @ResponseBody String deleteCourseById(String courseid){
        String result = null;
        try {
            result = courseBaseInfoService.deleteCourseBaseInfoById(courseid)?"删除成功":"删除失败";
        } catch (SQLException e) {
            result = "删除失败";
            logger.error("删除课程信息失败",e);
        }
        return result;
    }



}
