package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseGPStudentService;
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
@RequestMapping("/assignmentManage")
public class AssignmentManageController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private Project_ACService project_ACService;
    @Autowired
    private ChooseGPStudentService chooseGPStudentService;

    /**
     * 分页组合条件查询课题添加基本信息
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @RequestMapping("/getProjectInfo")
    public @ResponseBody
    PageInfo<Map<String,String>> getProjectInfo(@RequestParam Map<String,String> condition){
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
            projectInfo = chooseGPStudentService.getprojectInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询信息失败",e);
        }
        PageInfo<Map<String,String>> pageInfo = new PageInfo<Map<String,String>>(projectInfo);
        return pageInfo;
    }

    /**
     * 添加任务书 获取课题信息。调用课题添加中的方法
     * @param teacherTitleID 教师题目id
     * @return
     */
    @RequestMapping("/getProjectInfo")
    public @ResponseBody
    TeachergredesigntitleDetailVo getProjectInfo(String teacherTitleID){
        TeachergredesigntitleDetailVo teachergredesigntitledetail = null;
        try {
            teachergredesigntitledetail = project_ACService.getProjectInfoDetail(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败",e);
        }

        return teachergredesigntitledetail;
    }

    /**
     * 添加任务书 获取学生信息。
     * @return
     */
    @RequestMapping("/getStudentInfo")
    public @ResponseBody
    StudentInfoVo getStudentInfo(String teacherTitleID){
        StudentInfoVo studentInfoVo = null;
        try {
            studentInfoVo = chooseGPStudentService.getStudentInfo(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败",e);
        }

        return studentInfoVo;
    }


}