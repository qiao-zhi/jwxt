package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.bean.system.User;
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
import java.util.*;

@Controller
@RequestMapping("/project_AC")
public class Project_ACController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private Project_ACService project_ACService;

    /**
     * 在添加课题前，判断是否有本学期的毕业设计基本信息
     *
     * @return
     */
    @RequestMapping("/getGraDesignID")
    public @ResponseBody
    String getGraDesignID() {
        String graDesignID = "";

        //默认设置当前学年
        String currentYearNum = DateHandler.getCurrentYearNum();
        String currentSemesterNum = "";
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(calendar.MONTH) + 1;
        if (3 <= month && month < 8) { //第二学期
            currentSemesterNum = "二";
        } else {
            currentSemesterNum = "一";
        }

        try {
            graDesignID = project_ACService.getGraDesignIDByCurrentYear(currentYearNum, currentSemesterNum);
        } catch (Exception e) {
            logger.error("课题申请细信息添加失败", e);
        }
        return graDesignID;
    }

    /**
     * 添加教研室审核信息
     *
     * @param firstCheckInfo
     * @return
     */
    @RequestMapping("/addAuditFirst")
    public @ResponseBody
    String addAuditFirst(TeachertitleFirstcheckinfo firstCheckInfo) {
        try {
            Boolean res = project_ACService.addAuditFirstInfo(firstCheckInfo);
            if (!res) {
                return "审核失败";
            }
        } catch (Exception e) {
            logger.error("教研室审核失败", e);
            return "审核失败";
        }
        return "审核成功";
    }

    /**
     * 添加院长审核信息
     *
     * @param secondCheckInfo
     * @return
     */
    @RequestMapping("/addAuditSecondInfo")
    public @ResponseBody
    String addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) {
        try {
            Boolean res = project_ACService.addAuditSecondInfo(secondCheckInfo);
            if (!res) {
                return "审核失败";
            }
        } catch (Exception e) {
            logger.error("院长审核失败", e);
            return "审核失败";
        }
        return "审核成功";
    }

    /**
     * 添加课题信息-保存
     *
     * @param teachergredesigntitle
     * @return
     */
    @RequestMapping("/saveProjectInfo")
    public @ResponseBody
    String saveProjectInfo(Teachergredesigntitle teachergredesigntitle, HttpSession session) {

        //获取教师id
        User user = (User) session.getAttribute("userinfo");
        String teacherNum = user.getUsercode();

        try {
            String teacherID = project_ACService.getTeacherIDByTeacherNum(teacherNum);
            teachergredesigntitle.setTeacherid(teacherID);

            Date applyTime = teachergredesigntitle.getApplyTime();

            String d = DateHandler.dateToString(applyTime);

            Boolean res = project_ACService.addProjectInfo(teachergredesigntitle);
            if (!res) {
                return "保存失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息保存失败", e);
            return "保存失败";
        }
        return "保存成功";
    }

    /**
     * 添加课题信息
     *
     * @param teachergredesigntitle
     * @return
     */
    @RequestMapping("/addProjectInfo")
    public @ResponseBody
    String addProjectInfo(Teachergredesigntitle teachergredesigntitle, HttpSession session) {

        //获取教师id
        User user = (User) session.getAttribute("userinfo");
        String teacherNum = user.getUsercode();

        try {
            String teacherID = project_ACService.getTeacherIDByTeacherNum(teacherNum);
            teachergredesigntitle.setTeacherid(teacherID);

            Boolean res = project_ACService.addProjectInfo(teachergredesigntitle);
            if (!res) {
                return "添加失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息添加失败", e);
            return "添加失败";
        }
        return "添加成功";
    }


    /**
     * 在添加课题前，要先获取教师信息，初始化申请表
     *
     * @param session
     * @return
     */
    @RequestMapping("/getProjectTeacherInfo")
    public @ResponseBody
    TTeacherBaseInfo getProjectTeacherInfo(HttpSession session) {
        //获取教师id
        User user = (User) session.getAttribute("userinfo");
        String teacherNum = user.getUsercode();

        TTeacherBaseInfo tTeacherBaseInfo = new TTeacherBaseInfo();
        try {
            tTeacherBaseInfo = project_ACService.getProjectTeacherInfo(teacherNum);
        } catch (Exception e) {
            logger.error("初始化申请表失败", e);
        }
        return tTeacherBaseInfo;
    }

    /**
     * 修改申请表之前，初始化页面
     *
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/initProjectInfo")
    public @ResponseBody
    Teachergredesigntitle initProjectInfo(String teacherTitleID) {
        Teachergredesigntitle teachergredesigntitle = new Teachergredesigntitle();
        try {
            teachergredesigntitle = project_ACService.initProjectInfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("初始化页面失败", e);
        }

        return teachergredesigntitle;
    }

    /**
     * 修改申请表
     *
     * @param teachergredesigntitle
     * @return
     */
    @RequestMapping("/modifyProjectInfo")
    public @ResponseBody
    String modifyProjectInfo(Teachergredesigntitle teachergredesigntitle) {
        try {
            Boolean res = project_ACService.modifyProjectInfo(teachergredesigntitle);
            if (!res) {
                return "修改失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息修改失败", e);
            return "修改失败";
        }
        return "修改成功";
    }

    /**
     * 删除课题信息
     *
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/removeProjectInfo")
    public @ResponseBody
    String removeProjectInfo(String teacherTitleID, String isSubmit) {
        try {
            Boolean res = project_ACService.removeProjectInfo(teacherTitleID,isSubmit);
            if (!res) {
                return "删除失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息删除失败", e);
            return "删除失败";
        }
        return "删除成功";
    }

    /**
     * 分页组合条件查询课题基本信息,初始化表格
     *
     * @param condition 组合条件
     * @return 查询到的数据
     */
    @RequestMapping("/getProject_ACInfo")
    public @ResponseBody
    PageInfo<Map<String, String>> getProject_ACInfo(@RequestParam Map<String, String> condition, HttpSession session) {

        try{
            //获取教师id
            //判断登录用户。类型，登录用户为教师的话，就添加该字段。
            User user = (User) session.getAttribute("userinfo");
            String teacherNum = user.getUsercode();

            // 获取用户信息
            Subject currentUser = SecurityUtils.getSubject();
            if (!currentUser.hasRole("院长") && !currentUser.hasRole("教研室主任")) {
                String teacherID = project_ACService.getTeacherIDByTeacherNum(teacherNum);
                condition.put("teacherID", teacherID);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        int pageSize = DefaultValue.PAGE_SIZE;
        if (ValidateCheck.isNotNull(condition.get("pageSize"))) {//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if (ValidateCheck.isNotNull(condition.get("pageNum"))) {//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum, pageSize, "yearNum desc");
        //上面pagehelper的设置对此查询有效，查到数据总共8条

        List<Map<String, String>> projectInfo = null;
        try {

            //默认设置当前学年
            if (!ValidateCheck.isNotNull(condition.get("yearNum"))) {
                condition.put("yearNum", DateHandler.getCurrentYearNum());
            }

            projectInfo = project_ACService.getProjectInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页组合条件查询课题基本信息,初始化表格失败", e);
        }
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(projectInfo);
        return pageInfo;
    }

    /**
     * 获取详细信息
     *
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/getProjectInfoDetail")
    public @ResponseBody
    TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) {
        TeachergredesigntitleDetailVo teachergredesigntitledetail = new TeachergredesigntitleDetailVo();
        try {
            teachergredesigntitledetail = project_ACService.getProjectInfoDetail(teacherTitleID);

            if (ValidateCheck.isNull(teachergredesigntitledetail.getCheckFirstDesc())) {
                teachergredesigntitledetail.setCheckFirstDesc("");
            }
            if (ValidateCheck.isNull(teachergredesigntitledetail.getCheckFirstResult())){
                teachergredesigntitledetail.setCheckFirstResult("");
            }
            if (ValidateCheck.isNull(teachergredesigntitledetail.getCheckSecondDesc())){
                teachergredesigntitledetail.setCheckSecondDesc("");
            }
            if (ValidateCheck.isNull(teachergredesigntitledetail.getCheckSecondResult())){
                teachergredesigntitledetail.setCheckSecondResult("");
            }

        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        return teachergredesigntitledetail;
    }

    /**
     * 获取教研室审核信息
     *
     * @param teacherTitleID 审核标题id
     * @return
     */
    @RequestMapping("/getAuditFirstInfo")
    public @ResponseBody
    List<TeachertitleFirstCheckVo> getAuditFirstInfo(String teacherTitleID) {
        List<TeachertitleFirstCheckVo> teachertitleFirstCheckVo = new ArrayList<TeachertitleFirstCheckVo>();
        try {
            teachertitleFirstCheckVo = project_ACService.getTeachertitleFirstcheckinfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        return teachertitleFirstCheckVo;
    }

    /**
     * 初始化学院信息
     *
     * @return
     */
    @RequestMapping("/getCollege")
    public @ResponseBody
    String getCollege(HttpSession session) {

        //获取教师id
        User user = (User) session.getAttribute("userinfo");
        String teacherNum = user.getUsercode();

        String collegeName = "";
        try {
            collegeName = project_ACService.getCollege(teacherNum);
        } catch (Exception e) {
            logger.error("初始化学院信息失败", e);
        }
        return collegeName;
    }

    /**
     * 获取当前登录用户的权限
     *
     * @return
     */
    @RequestMapping("/getAuthority")
    public @ResponseBody
    String getAuthority() {

        String authority = "0";

        Subject currentUser = SecurityUtils.getSubject();
        if (currentUser.hasRole("院长")) {
            authority = "2";
        } else if (currentUser.hasRole("教研室主任")) {
            authority = "1";
        }

        return authority;
    }


}