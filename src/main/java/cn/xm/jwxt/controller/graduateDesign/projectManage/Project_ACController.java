package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleSecondcheckinfo;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
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

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("project_AC")
public class Project_ACController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private Project_ACService project_ACService;

    /**
     * 添加审核信息
     * @param firstCheckInfo
     * @return
     */
    @RequestMapping("/addAuditFirst")
    public @ResponseBody String addAuditFirstInfo(TeachertitleFirstcheckinfo firstCheckInfo){
        try {
            Boolean res = project_ACService.addAuditFirstInfo(firstCheckInfo);
            if (!res) {
                return "审核失败";
            }
        } catch (Exception e) {
            logger.error("教研室审核失败",e);
            return "审核失败";
        }
        return "审核成功";
    }

    /**
     * 添加院长审核信息
     * @param secondCheckInfo
     * @return
     */
    @RequestMapping("/addAuditSecond")
    public @ResponseBody String addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo){
        try {
            Boolean res = project_ACService.addAuditSecondInfo(secondCheckInfo);
            if (!res) {
                return "审核失败";
            }
        } catch (Exception e) {
            logger.error("院长审核失败",e);
            return "审核失败";
        }
        return "审核成功";
    }

    /**
     * 添加课题信息
     * @param teachergredesigntitle
     * @return
     */
    @RequestMapping("/addAuditFirst")
    public @ResponseBody String addProjectInfo(Teachergredesigntitle teachergredesigntitle){
        try {
            Boolean res = project_ACService.addProjectInfo(teachergredesigntitle);
            if (!res) {
                return "添加失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息添加失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 在添加课题前，要先获取教师信息，初始化申请表
     * @param teacherID 当前登录用户的教师id
     * @return
     */
    public @ResponseBody TTeacherBaseInfo getProjectTeacherInfo(String teacherID){
        TTeacherBaseInfo tTeacherBaseInfo = new TTeacherBaseInfo();
        try {
            tTeacherBaseInfo = project_ACService.getProjectTeacherInfo(teacherID);
        } catch (Exception e) {
            logger.error("课题申请细信息添加失败",e);
        }
        return tTeacherBaseInfo;
    }

    /**
     * 修改申请表之前，初始化页面
     * @param teacherTitleID 教师题目id
     * @return
     */
    public @ResponseBody Teachergredesigntitle initProjectInfo(String teacherTitleID){
        Teachergredesigntitle teachergredesigntitle = new Teachergredesigntitle();
        try {
            teachergredesigntitle = project_ACService.initProjectInfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请细信息添加失败",e);
        }

        return teachergredesigntitle;
    }

    /**
     * 修改申请表
     * @param teachergredesigntitle
     * @return
     */
    public @ResponseBody String modifyProjectInfo(Teachergredesigntitle teachergredesigntitle){
        try {
            Boolean res = project_ACService.modifyProjectInfo(teachergredesigntitle);
            if (!res) {
                return "修改失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息修改失败",e);
            return "修改失败";
        }
        return "修改成功";
    }

    /**
     * 删除课题信息
     * @param teacherTitleID 教师题目id
     * @return
     */
    public @ResponseBody String removeProjectInfo(String teacherTitleID){
        try {
            Boolean res = project_ACService.removeProjectInfo(teacherTitleID);
            if (!res) {
                return "删除失败";
            }
        } catch (Exception e) {
            logger.error("课题申请细信息删除失败",e);
            return "删除失败";
        }
        return "删除成功";
    }

    /**
     * 分页组合条件查询课题基本信息,初始化表格
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @RequestMapping("/getProject_ACInfo")
    public @ResponseBody PageInfo<Map<String,String>> getProject_ACInfo(@RequestParam Map<String,String> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(condition.get("pageSize"))){//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(condition.get("pageNum"))){//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum,pageSize,"CONVERT(courseNameCN USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> projectInfo = null;
        try {
            projectInfo = project_ACService.getProjectInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页组合条件查询课题基本信息,初始化表格失败",e);
        }
        PageInfo<Map<String,String>> pageInfo = new PageInfo<Map<String,String>>(projectInfo);
        return pageInfo;
    }

    /**
     * 获取详细信息
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/getProjectInfoDetail")
    public @ResponseBody TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID){
        TeachergredesigntitleDetailVo teachergredesigntitledetail = new TeachergredesigntitleDetailVo();
        try {
            teachergredesigntitledetail = project_ACService.getProjectInfoDetail(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败",e);
        }

        return teachergredesigntitledetail;
    }

    /**
     * 获取教研室审核信息
     * @param teacherTitleID 审核标题id
     * @return
     */
    @RequestMapping("/getAuditFirstInfo")
    public @ResponseBody TeachertitleFirstcheckinfo getAuditFirstInfo(String teacherTitleID){
        TeachertitleFirstcheckinfo teachertitleFirstcheckinfo = new TeachertitleFirstcheckinfo();
        try {
            teachertitleFirstcheckinfo = project_ACService.getTeachertitleFirstcheckinfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败",e);
        }

        return teachertitleFirstcheckinfo;
    }

}