package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.service.graduateDesign.projectManage.AssignmentManageService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/assignmentManage")
public class AssignmentManageController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private AssignmentManageService assignmentManageService;
    @Autowired
    private Project_ACService project_ACService;

    /**
     * 分页组合条件查询学生基本信息
     *
     * @param condition 组合条件
     * @return 查询到的数据
     */
    @RequestMapping("/getStudentInfo")
    public @ResponseBody
    PageInfo<Map<String, String>> getStudentInfo(@RequestParam Map<String, String> condition) {
        int pageSize = DefaultValue.PAGE_SIZE;
        if (ValidateCheck.isNotNull(condition.get("pageSize"))) {//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if (ValidateCheck.isNotNull(condition.get("pageNum"))) {//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum, pageSize, "CONVERT(studentName desc)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> taskbookInfo = null;

        //获取教师id
        //判断登录用户。类型，登录用户为教师的话，就添加该字段。
/*        User user = (User) session.getAttribute("userinfo");
        String teacherID = user.getUserid();
        if (userinfo.sort.equals("教师")) {
            condition.put("teacherID", teacherID);
        }
        */

        String teacherID = "111";
        condition.put("teacherID", teacherID);

        //判断当前学年，去查这个学年
        if(ValidateCheck.isNull(condition.get("yearNum"))) {
            condition.put("yearNum", DateHandler.getCurrentYearNum());
        }

        try {
            taskbookInfo = assignmentManageService.getStudentInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询信息失败", e);
        }
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(taskbookInfo);
        return pageInfo;
    }

    /**
     * 添加任务书 获取课题信息 初始化任务书表
     *
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/getProjectInfo")
    public @ResponseBody
    AssignmentVo getProjectInfo(String teacherTitleID, String studentID) {
        AssignmentVo assignmentVo = null;
        try {
            assignmentVo = assignmentManageService.getProjectInfoDetail(teacherTitleID, studentID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        return assignmentVo;
    }

    /**
     * 修改任务书初始化任务书
     *
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/getInitProjectInfo")
    public @ResponseBody
    AssignmentVo getInitProjectInfo(String teacherTitleID, String studentID) {
        AssignmentVo assignmentVo = null;
        try {
            assignmentVo = assignmentManageService.getInitProjectInfoDetail(teacherTitleID, studentID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        return assignmentVo;
    }

    /**
     * 提交任务书
     *
     * @return
     */
    @RequestMapping("/submitAssignment")
    public @ResponseBody String submitAssignment(AssignmentVo assignmentVo) {
        try {
            Boolean res = assignmentManageService.saveAssignment(assignmentVo);
            if (!res) {
                return "添加失败";
            }
        } catch (Exception e) {
            logger.error("任务书添加失败", e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 保存任务书
     *
     * @return
     */
    @RequestMapping("/saveAssignment")
    public @ResponseBody
    String saveAssignment(AssignmentVo assignmentVo) {
        try {
            Boolean res = assignmentManageService.saveAssignment(assignmentVo);
            if (!res) {
                return "保存失败";
            }
        } catch (Exception e) {
            logger.error("任务书保存失败", e);
            return "保存失败";
        }
        return "保存成功";
    }

    /**
     * 修改任务书
     *
     * @return
     */
    @RequestMapping("/modifyAssignment")
    public @ResponseBody
    String modifyAssignment(AssignmentVo assignmentVo) {
        Boolean res = false;
        try {
            res = assignmentManageService.modifyAssignment(assignmentVo);
        } catch (Exception e) {
            logger.error("保存任务书失败", e);
        }

        return res ? "success" : "false";
    }

    /**
     * 获得系主任审核信息
     *
     * @param bookID
     * @return
     */
    @RequestMapping("/getAuditFirstInfo")
    public @ResponseBody
    TaskBooktFirstCheckInfo getAuditFirstInfo(String bookID) {
        TaskBooktFirstCheckInfo taskBooktFirstCheckInfo = new TaskBooktFirstCheckInfo();
        try {
            taskBooktFirstCheckInfo = assignmentManageService.getAuditFirstInfo(bookID);
        } catch (Exception e) {
            logger.error("获得系主任审核信息失败", e);
        }

        return taskBooktFirstCheckInfo;
    }

    /**
     * 添加审核信息
     *
     * @return
     */
    @RequestMapping("/addAuditInfo")
    public @ResponseBody
    String addAuditInfo(TaskBookSecondCheckInfo taskBookCheckInfo, HttpSession session) {
        Boolean res = false;
        //获取用户类型
        /*User user = (User) session.getAttribute("userinfo");
        String userSort = user.getUsersort();*/
        String userSort = "111";

        String bookIDs = taskBookCheckInfo.getBookID();
        String[] bookIDArray = bookIDs.split(",");
        List<TaskBookSecondCheckInfo> secondCheckInfos = new ArrayList<TaskBookSecondCheckInfo>();

        for (String t : bookIDArray) {
            TaskBookSecondCheckInfo taskBookSecondCheckInfo = new TaskBookSecondCheckInfo();
            //设置主键
            taskBookSecondCheckInfo.setCheckID(UUIDUtil.getUUID2());
            taskBookSecondCheckInfo.setCheckResult(taskBookCheckInfo.getCheckResult());
            taskBookSecondCheckInfo.setCheckPerson(taskBookCheckInfo.getCheckPerson());
            taskBookSecondCheckInfo.setCheckTime(taskBookCheckInfo.getCheckTime());
            taskBookSecondCheckInfo.setCheckDesc(taskBookCheckInfo.getCheckDesc());
            taskBookSecondCheckInfo.setBookID(t);

            secondCheckInfos.add(taskBookSecondCheckInfo);
        }

        try {
            if (userSort.equals("院长")) {
                res = assignmentManageService.addAuditSecondInfo(secondCheckInfos);
            } else {
                res = assignmentManageService.addAuditFirstInfo(secondCheckInfos);
            }
        } catch (Exception e) {
            logger.error("添加审核信息失败", e);
        }

        return res ? "success" : "false";
    }

}