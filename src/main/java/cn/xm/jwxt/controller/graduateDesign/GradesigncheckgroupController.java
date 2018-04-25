/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GradesigncheckgroupController
 * Author:   xuexiaolei
 * Date:     2018/4/23 18:23
 * Description: 学生选题最终结果表控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Checkgroupperson;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonExample;
import cn.xm.jwxt.bean.graduateDesign.Gradesigncheckgroup;
import cn.xm.jwxt.bean.graduateDesign.GradesigncheckgroupExample;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import cn.xm.jwxt.service.graduateDesign.GradesigncheckgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈中期和后期毕设答辩检查小组控制器〉
 *
 * @author xuexiaolei
 * @create 2018/4/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("gradesigncheckgroup")
public class GradesigncheckgroupController {

    @Autowired
    private GradesigncheckgroupService gradesigncheckgroupService;

    @Autowired
    private CheckgrouppersonService checkgrouppersonService;

    /*
    插入答辩小组及其成员信息
    当结果都为true之后，才能插入
     */
    @RequestMapping("add")
    @ResponseBody
    public String addGradesigncheckgroup(Gradesigncheckgroup gradesigncheckgroup, List<Checkgroupperson> checkgrouppersonList){
        String result = "";
        boolean b1 = gradesigncheckgroupService.insert(gradesigncheckgroup);
        boolean b2 = false;
        for (Checkgroupperson checkgroupperson:checkgrouppersonList){
            b2 = checkgrouppersonService.insert(checkgroupperson);
            if (b2 == false){
                break;
            }
        }
        if (b1 && b2){
            result = "success";
        }else {
            result = "fail";
        }
        return result;
    }

    /*
    更改小组信息
     */
    @ResponseBody
    @RequestMapping("update")
    public String updateGradesigncheckgroup(String groupId){
        String result = "";
        Gradesigncheckgroup gradesigncheckgroup = new Gradesigncheckgroup();
        gradesigncheckgroup.setGroupid(groupId);
        result = gradesigncheckgroupService.updateByPrimaryKey(gradesigncheckgroup)?"success":"fail";
        return result;
    }

    /*
    查询全部小组及其成员信息(未完成)
     */
    @RequestMapping("selectList")
    public ModelAndView selectGradesigncheckgroupList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Gradesigncheckgroup> GradesigncheckgroupList = new ArrayList<Gradesigncheckgroup>();
        GradesigncheckgroupExample gradesigncheckgroup = new GradesigncheckgroupExample();
        GradesigncheckgroupList = gradesigncheckgroupService.selectByExample(gradesigncheckgroup);
        modelAndView.addObject("GradesigncheckgroupList",GradesigncheckgroupList);
        modelAndView.setViewName("pages/graduateProgram/middleReport/middleReportSettle");
        return modelAndView;
    }

    /*
    删除教师所属小组
     */
    @RequestMapping("deleteGroup")
    @ResponseBody
    public String deleteGradesigncheckgroup(String groupId){
        String result = "";
        CheckgrouppersonExample checkgroupperson = new CheckgrouppersonExample();
        checkgroupperson.setOrderByClause(groupId);
        boolean b1 = checkgrouppersonService.deleteByExample(checkgroupperson);
        boolean b2 = gradesigncheckgroupService.deleteByPrimaryKey(groupId);
        if (b1 && b2){
            result = "success";
        }else {
            result = "fail";
        }
        return result;
    }
}