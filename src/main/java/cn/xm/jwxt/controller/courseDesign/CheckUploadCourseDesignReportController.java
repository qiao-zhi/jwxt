package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherArrangeService;
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
@RequestMapping("/checkCourseDesignReport")
@SuppressWarnings("all")
public class CheckUploadCourseDesignReportController {

    private Logger logger = Logger.getLogger(CheckUploadCourseDesignReportController.class);

    @Autowired
    private TCoursedesignTeacherArrangeService taService;

    /**
     *  获取学生信息与课设信息（用于课设报告上传情况选择）
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/getClassinfoAndCourseDesigninfo.do")
    public Map<String,Object> findCourseDesignReportStatus(@RequestParam Map<String,Object> condition){
        List<Map<String,Object>> classInfoList = null;
        try {
            classInfoList = taService.getClassInfo(condition);
        } catch (SQLException e) {
            logger.error("查询班级信息异常",e);
        }
        List<Map<String,Object>> courseDesignList = null;
        try {
            courseDesignList = taService.getCourseDesignInfo(condition);
        } catch (SQLException e) {
            logger.error("查询课设信息出错",e);
        }
        Map<String,Object> infoMap = new HashMap<String,Object>();
            infoMap.put("classInfoList",classInfoList);
            infoMap.put("courseDesignList",courseDesignList);
        return infoMap;
    }

    /**
     *  根据条件查询学生课设报告上传情况
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/findStudentReportUploadStatus.do")
    public PageInfo<Map<String,Object>> findStudentReportUploadStatus(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.valueOf((String) condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){
            pageNum = Integer.valueOf((String) condition.get("pageNum"));
        }
        // 对紧邻的下一条select进行分页查询，对之后的不起作用
        PageHelper.startPage(pageNum,pageSize,"uploadStatus");
        //查询学生课设报告上传情况
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try {
            list = taService.findStudentReportUploadStatus(condition);
        } catch (SQLException e) {
            logger.error("查询学生课设报告上传状态出错",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     *  查询学生课设报告（预览）
     * @param courseDesignTeacherStudentID
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkCourseDesignReport.do")
    public Map<String,Object> checkCourseDesignReport(String courseDesignTeacherStudentID){
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            map = taService.checkCourseDesignReport(courseDesignTeacherStudentID);
        } catch (SQLException e) {
            logger.error("查看课设报告出错",e);
        }
        return map;
    }

    /**
     * 保存报告审核结果
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveCourseDesignReportCheckResult.do")
    public boolean saveCourseDesignReportCheckResult(String checkAdvice,String checkStatus,String[] courseDesignTeacherStudentIDs){
        boolean result = false;
        Map<String,Object> condition = new HashMap<String,Object>();
            condition.put("checkAdvice",checkAdvice);
            condition.put("checkStatus",checkStatus);
            condition.put("courseDesignTeacherStudentIDs",courseDesignTeacherStudentIDs);
        try {
            result = taService.saveCourseDesignReportCheckResult(condition);
        } catch (SQLException e) {
            logger.error("保存课设报告审核结果出错",e);
        }
        return result;
    }

}
