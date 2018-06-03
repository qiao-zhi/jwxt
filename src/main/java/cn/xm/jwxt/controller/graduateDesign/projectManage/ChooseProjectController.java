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
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseProjectService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.service.impl.graduateDesign.projectManage.ChooseProjectServiceImpl;
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
     * 初始化选择的课题
     *
     * @return
     */
    @RequestMapping("/getChooseProjectInfo")
    public @ResponseBody List<ChooseProjectVo> getChooseProjectInfo(HttpSession session) {

        List<ChooseProjectVo> chooseProjectVo = null;

        //获取当前学生id
        //User user = (User) session.getAttribute("userinfo");
        //String userCode = user.getUsercode();
        String studentID = "111";

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
    public @ResponseBody PageInfo<Map<String, String>> getProjectInfo(@RequestParam Map<String, String> condition, HttpSession session) {
        int pageSize = DefaultValue.PAGE_SIZE;
        if (ValidateCheck.isNotNull(condition.get("pageSize"))) {//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if (ValidateCheck.isNotNull(condition.get("pageNum"))) {//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum, pageSize, "CONVERT(teacherName desc)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> projectInfo = null;

        //根据当前用户，获取用户的专业。只查询该学的专业
        //User user = (User) session.getAttribute("userinfo");
        //String userCode = user.getUsercode();
        String userCode = "111";

        try {
            projectInfo = chooseProjectService.getProjectInfoByCondition(condition,userCode);
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
     * @param teacherTitleID 课题id
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
    public @ResponseBody String saveChooseProject(String choose_titleIDstr, String isSubmit, HttpSession session) {

        //获取用户信息
        /*User user = (User) session.getAttribute("userinfo");
        String studentID = user.getUsercode();
*/
        String studentID = "111";

        //生成随机ID
        String studentTitleID = UUIDUtil.getUUID2();
        //用，拆分字符串
        String[] choose_titleID = choose_titleIDstr.split(",");

        //获取结果表对象
        Gradesignstudenttitleinfo gradesignstudenttitleinfo = new Gradesignstudenttitleinfo();
        gradesignstudenttitleinfo.setStudenttitleid(studentTitleID);//主键
        gradesignstudenttitleinfo.setStudentid(studentID); //学号
        gradesignstudenttitleinfo.setIsSubmit(isSubmit); //是否提交
        gradesignstudenttitleinfo.setFirstteachertitleid(choose_titleID[0]); //第一志愿
        if (choose_titleID.length == 2) {
            gradesignstudenttitleinfo.setSecteachertitleid(choose_titleID[1]); //第二志愿
        }

        boolean res = false;
        try {
            res = chooseProjectService.saveChooseProject(gradesignstudenttitleinfo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res ? "success" : "false";
    }

    /**
     * 提交学生选择校外毕设的指导老师
     * @return
     */
    @RequestMapping("/submitChooseTeacher")
    public @ResponseBody String submitChooseTeacher() {

        boolean res = false;
        try {
            res = chooseProjectService.submitChooseTeacher();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res ? "success" : "false";
    }
}