/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CenCheckBaseInfoController
 * Author:   xuexiaolei
 * Date:     2018/4/20 21:27
 * Description: 中期检查基本信息表控制层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseProjectService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.service.impl.graduateDesign.projectManage.ChooseProjectServiceImpl;
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
/**
 *
 * @author xuexiaolei
 * @create 2018/4/20
 * @since 1.0.0
 */
@Controller
@RequestMapping("/chooseProject")
public class ChooseProjectController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    //课题管理
    private Project_ACService project_ACService;
    @Autowired
    private ChooseProjectService chooseProjectService;

    /**
     * 修改申请表之前，初始化页面
     *
     * @param studentID //获取登录的学生信息
     * @return
     */
    public @ResponseBody List<ChooseProjectVo> getChooseProjectInfo(String studentID) {

        List<ChooseProjectVo> chooseProjectVo = null;
        try {
            chooseProjectVo = chooseProjectService.getChooseProjectInfo(studentID);
        } catch (Exception e) {
            logger.error("选择课题，选择情况初始化", e);
        }

        return chooseProjectVo;
    }

    /**
     * 分页组合条件查询课题添加基本信息
     *
     * @param condition 组合条件
     * @return 查询到的数据
     */
    @RequestMapping("/getProjectInfo")
    public @ResponseBody PageInfo<Map<String, String>> getProjectInfo(@RequestParam Map<String, String> condition) {
        int pageSize = DefaultValue.PAGE_SIZE;
        if (ValidateCheck.isNotNull(condition.get("pageSize"))) {//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if (ValidateCheck.isNotNull(condition.get("pageNum"))) {//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum, pageSize, "CONVERT(courseNameCN USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> projectInfo = null;
        try {
            projectInfo = chooseProjectService.getprojectInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询答辩秘书审核信息失败", e);
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
    public @ResponseBody TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) {
        TeachergredesigntitleDetailVo teachergredesigntitledetail = null;
        try {
            teachergredesigntitledetail = chooseProjectService.getProjectInfoDetail(teacherTitleID);
        } catch (Exception e) {
            logger.error("课题申请详细信息获取失败", e);
        }

        return teachergredesigntitledetail;
    }

    /**
     * 保存选择课题
     * @param choose_titleIDstr
     * @return
     */
    @RequestMapping("/saveChooseProject")
    public @ResponseBody String saveChooseProject(String choose_titleIDstr) {

        boolean res = false;
        try {
            res = chooseProjectService.saveChooseProject(choose_titleIDstr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res ? "success" : "false";
    }

    /**
     * 提交选择课题
     * @param choose_titleIDstr
     * @return
     */
    @RequestMapping("/submitChooseProject")
    public @ResponseBody String submitChooseProject(String choose_titleIDstr) {

        boolean res = false;
        try {
            res = chooseProjectService.submitChooseProject(choose_titleIDstr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res ? "success" : "false";
    }

    /**
     * 检查学生提交信息   校内校外选择信息。
     * @return
     */
    @RequestMapping("/findIsChoose")
    public @ResponseBody boolean findIsChoose() {

        boolean res = false;
        try {
            res = chooseProjectService.findIsChoose();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    /**
     * 提交学生选择校外毕设的指导老师
     * @return
     */
    @RequestMapping("/submitChooseTeacher") public @ResponseBody String submitChooseTeacher() {

        boolean res = false;
        try {
            res = chooseProjectService.submitChooseTeacher();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res ? "success" : "false";
    }
}