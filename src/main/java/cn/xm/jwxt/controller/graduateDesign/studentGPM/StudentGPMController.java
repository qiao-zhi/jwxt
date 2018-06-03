package cn.xm.jwxt.controller.graduateDesign.studentGPM;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.service.graduateDesign.studentGPM.StudentGPMService;
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

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/studentGPM")
public class StudentGPMController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private StudentGPMService studentGPMService;

    /**
     * 初始化界面
     * @return
     */
    @RequestMapping("/getPDInfo")
    public @ResponseBody
    StudentPDVo getPDInfo(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        StudentPDVo studentPDVo = new StudentPDVo();
        try {
            studentPDVo = studentGPMService.getPDInfo(studentID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        if (studentPDVo == null) {
            return null;
        }

        return studentPDVo;
    }

    /**
     * 初始化表计划进程表
     * @return
     */
    @RequestMapping("/getProgramTable") public @ResponseBody
    ProgramTableVo getProgramTable(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");

        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        ProgramTableVo programTableVo = new ProgramTableVo();
        try {
            programTableVo = studentGPMService.getProgramTable(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("初始化表计划进程表失败", e);
        }

        return programTableVo;
    }

    /**
     * 保存进程表信息
     * @return
     */
    @RequestMapping("/saveProgramTable")
    public @ResponseBody String saveProgramTable(Graduatetaskprogressinfo progressinfo, HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");

        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        boolean res = false;

        try {
            res  = studentGPMService.saveProgramTable(progressinfo, studentID);
        } catch (Exception e) {
            logger.error("保存进程表信息失败", e);
        }

        return res ? "success" : "false";
    }

    /**
     * 保存任务表签字信息
     * @return
     */
    @RequestMapping("/saveStudentSign")
    public @ResponseBody String saveStudentSign(HttpSession session) {
/*        User user = (User) session.getAttribute("userinfo");

        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        boolean res = false;

        try {
            res  = studentGPMService.saveStudentSign(studentID, 1);
        } catch (Exception e) {
            logger.error("保存任务表签字信息失败", e);
        }

        return res ? "success" : "false";
    }


    /**
     * 初始化课题详细信息
     * @return
     */
    @RequestMapping("/getProjectDetailInfo")
    public @ResponseBody
    Teachergredesigntitle getProjectDetailInfo(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");

        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        Teachergredesigntitle teachergredesigntitle = new Teachergredesigntitle();
        try {
            teachergredesigntitle = studentGPMService.getProjectDetailInfo(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("初始化表计划进程表失败", e);
        }

        return teachergredesigntitle;
    }

    /**
     * 课题选择通知
     * @return
     */
    @RequestMapping("/getProjectChooseState")
    public @ResponseBody
    String getProjectChooseState(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUserid()*/;

        String studentID = "111";

        String res = "";

        try {
            res = studentGPMService.getProjectChooseState(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取课题选择通知失败", e);
        }

        return res;
    }

    /**
     * 任务书签字通知
     * @return
     */
    @RequestMapping("/getTaskbookSignState")
    public @ResponseBody
    String getTaskbookSignState(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        String res = "";

        try {
            res = studentGPMService.getTaskbookSignState(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取任务书签字通知失败", e);
        }

        return res;
    }

    /**
     * 判断是否填写计划进程表
     * @return
     */
    @RequestMapping("/getProgramTableState")
    public @ResponseBody
    String getProgramTableState(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        String res = "";

        try {
            res = studentGPMService.getProgramTableState(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取判断是否填写计划进程表通知失败", e);
        }

        return res;
    }


    /**
     * 中期检查提示
     * @return
     */
    @RequestMapping("/getMiddleCheckState")
    public @ResponseBody
    String getMiddleCheckState(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        String res = "";

        try {
            res = studentGPMService.getMiddleCheckState(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取中期检查提示失败", e);
        }

        return res;
    }


    /**
     * 毕业答辩提示
     * @return
     */
    @RequestMapping("/getGraduateCheckState")
    public @ResponseBody
    String getGraduateCheckState(HttpSession session) {

/*        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUserid();*/
        String studentID = "111";

        String res = "";

        try {
            res = studentGPMService.getGraduateCheckState(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取毕业答辩提示通知失败", e);
        }

        return res;
    }
}