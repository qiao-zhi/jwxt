package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentChooseProjectInfo;
import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/projectManage")
public class ProjectManageController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private Project_ACService project_ACService;
    @Autowired
    private ProjectManageService projectManageService;

    /**
     * 分页组合条件查询课题添加基本信息
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @RequestMapping("/getProjectInfo")
    public @ResponseBody
    PageInfo<Map<String,String>> getProjectInfo(@RequestParam Map<String,String> condition, HttpSession session){

        if(ValidateCheck.isNull(condition.get("yearNum"))) {
            String yearNum = DateHandler.getCurrentYearNum();
            condition.put("yearNum", yearNum);
        }
        //判断用户是否为教师，教师只显示选择了自己课题的学生
        // 获取用户信息
        Subject currentUser = SecurityUtils.getSubject();
        if (currentUser.hasRole("教师")) {
            User user = (User) session.getAttribute("userinfo");
            String teacherNum = user.getUsercode();
            condition.put("teacherNum",teacherNum);
        }

        /**查询学生之前，系统根据学生申请情况，为教师分配指导学生！*/
        try {
            boolean res = projectManageService.updateChooseStatus(condition);
            //if (res )
        } catch (Exception e) {
            e.printStackTrace();
        }

        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(condition.get("pageSize"))){//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(condition.get("pageNum"))){//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum,pageSize,"CONVERT(yearNum USING gbk) desc");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> projectInfo = null;
        try {
            projectInfo = projectManageService.getProjectInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页组合条件查询课题添加基本信息失败",e);
        }
        PageInfo<Map<String,String>> pageInfo = new PageInfo<Map<String,String>>(projectInfo);
        return pageInfo;
    }

    /**
     * 分配学生时，初始化学生信息
     * @return
     */
    @RequestMapping("/getStudentInfo")
    public @ResponseBody
    StudentChooseProjectInfo getStudentInfo(){
        StudentChooseProjectInfo studentChooseProjectInfo = new StudentChooseProjectInfo();
        try {
            studentChooseProjectInfo = projectManageService.getStudentInfo();
        } catch (Exception e) {
            logger.error("初始化学生信息失败",e);
        }

        return studentChooseProjectInfo;
    }

    /**
     * 分配学生时，保存分配结果
     * @return
     */
    @RequestMapping("/saveAssignment")
    public @ResponseBody
    String saveAssignment(String teacherTitleID, String studentIDs){
        String[] studentArray = studentIDs.split(",");
        Boolean res = false;
        try {
            res = projectManageService.saveAllocate(teacherTitleID,studentArray);
        } catch (Exception e) {
            logger.error("保存分配结果失败",e);
        }

        return res ? "success":"false";
    }

    /**
     * 获取课题详情信息
     * @return
     */
    @RequestMapping("/getProjectInfoDetail")
    public @ResponseBody
    TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID, HttpSession session){
        TeachergredesigntitleDetailVo teachergredesigntitleDetailVo = new TeachergredesigntitleDetailVo();
        try {
            teachergredesigntitleDetailVo = project_ACService.initProjectInfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("获取课题详情信息失败",e);
        }

        return teachergredesigntitleDetailVo;
    }

    /**
     * 提交确定的学生。
     * @return
     */
    @RequestMapping("/submitChooseStudent")
    public @ResponseBody
    String submitChooseStudent(@RequestParam String teacherTitleID, @RequestParam String studentIDs){
        Boolean res = false;
        try {
            res = projectManageService.submitChooseStudent(teacherTitleID, studentIDs);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("课题申请详细信息获取失败",e);
        }

        return res ? "success" : "false";
    }

    /**
     * 确定课题时，初始化课题表格
     * @return
     */
    @RequestMapping("/c_getProjectInfo")
    public @ResponseBody Teachergredesigntitle c_getProjectInfo(String teacherTitleID){
        Teachergredesigntitle teachergredesigntitle = new Teachergredesigntitle();
        try {
            teachergredesigntitle = project_ACService.c_getProjectInfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("获取课题详情信息失败",e);
        }

        return teachergredesigntitle;
    }

    /**
     * 确定课题时，初始化课题表格
     * @return
     */
    @RequestMapping("/c_getStudentInfo")
    public @ResponseBody Teachergredesigntitle c_getStudentInfo(String teacherTitleID){
        Teachergredesigntitle teachergredesigntitle = new Teachergredesigntitle();
        try {
            teachergredesigntitle = project_ACService.c_getProjectInfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("获取课题详情信息失败",e);
        }

        return teachergredesigntitle;
    }

}