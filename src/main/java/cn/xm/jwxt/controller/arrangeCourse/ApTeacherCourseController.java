package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.service.arrangeCourse.ApTeacherCourseService;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师课程信息的Controller
 * 创建人：LL
 * 创建时间：2018/5/9 21:16
 */
@Controller
@RequestMapping("/arrangeCourse")
public class ApTeacherCourseController {
    private Logger logger = Logger.getLogger(ApTeacherCourseController.class);
    @Resource
    private ApTeacherCourseService teacherCourseService;

    /**
     * 根据学院ID查询教师信息（在职的）
     * @param academicId
     * @return
     */
    @RequestMapping("/findTeacherBaseInfo")
    public @ResponseBody
    List<TTeacherBaseInfo> findTeacherBaseInfo(String academicId){
        List<TTeacherBaseInfo> teachersBaseInfo = null;
        try {
            teachersBaseInfo = teacherCourseService.findTeacherBaseInfoByAcademicId(academicId);
        } catch (Exception e) {
            logger.error("查询在职教师信息失败!",e);
        }
        return teachersBaseInfo;
    }
}
