package cn.xm.jwxt.controller.graduateDesign.studentGPM;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.graduateDesign.studentGPM.StudentGPMService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/studentGPM")
public class StudentGPMController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private StudentGPMService studentGPMService;
//    @Autowired
    //private AssignmentManageService assignmentManageService;

    /**
     * 初始化界面
     * @return
     */
/*    @RequestMapping("/getPDInfo")
    @ResponseBody
    public Map<String,Object> getPDInfo(HttpSession session) {
        Map<String,Object> map = new HashMap<String,Object>();

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

        StudentPDVo studentPDVo = new StudentPDVo();
        try {
            studentPDVo = studentGPMService.getPDInfo(studentID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        map.put("studentPDVo",studentPDVo);

        return map;
    }*/

    /**
     * 初始化界面
     * @return
     */
    @RequestMapping("/getPDInfo")
    @ResponseBody
    public StudentPDVo getPDInfo(HttpSession session) {

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

        StudentPDVo studentPDVo = new StudentPDVo();
        try {
            studentPDVo = studentGPMService.getPDInfo(studentID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        return studentPDVo;
    }

    /**
     * 初始化表计划进程表
     * @return
     */
    @RequestMapping("/getProgramTable") public @ResponseBody
    ProgramTableVo getProgramTable(HttpSession session) {

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

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

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

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
    public @ResponseBody String saveStudentSign(String studentName, HttpSession session) {
        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

        boolean res = false;

        try {
            res  = studentGPMService.saveStudentSign(studentID, studentName);
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
        String studentID = user.getUsercode();*/
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
     * 初始化已审核的任务书用于学生查看签字
     * @return
     */
    @RequestMapping("/getAssignmentTable")
    public @ResponseBody
    AssignmentVo getAssignmentTable(String teacherTitleID, HttpSession session) {

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

        AssignmentVo assignmentVo = new AssignmentVo();
        try {
            //assignmentVo = assignmentManageService.getInitProjectInfoDetail(teacherTitleID, studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("初始化已审核的任务书用于学生查看签字失败", e);
        }

        return assignmentVo;
    }

    /**
     * 课题选择通知
     * @return
     */
    @RequestMapping("/getProjectChooseState")
    public @ResponseBody
    String getProjectChooseState(HttpSession session) {

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

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

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

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

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

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

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

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

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

        String res = "";

        try {
            res = studentGPMService.getGraduateCheckState(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取毕业答辩提示通知失败", e);
        }

        return res;
    }

    /**
     * 初始化文件管理信息
     * @return
     */
    @RequestMapping("/initFIleInfo")
    public @ResponseBody
    List<FileInfoVo> initFIleInfo(HttpSession session) {

        User user = (User) session.getAttribute("userinfo");
        //获取当前用户信息
        String studentID = user.getUsercode();

        List<FileInfoVo> fileInfoVos = new ArrayList<FileInfoVo>();

        try {
            fileInfoVos = studentGPMService.initFIleInfo(studentID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("初始化文件管理信息失败", e);
        }

        return fileInfoVos;
    }

}