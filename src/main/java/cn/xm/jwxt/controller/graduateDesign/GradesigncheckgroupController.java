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
import cn.xm.jwxt.mapper.graduateDesign.custom.GradesigncheckgroupCustomMapper;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import cn.xm.jwxt.service.graduateDesign.GradesigncheckgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    （测试成功）
     */
    @RequestMapping("add.action")
    @ResponseBody
    public String addGradesigncheckgroup(Gradesigncheckgroup gradesigncheckgroup, List<Checkgroupperson> checkgrouppersonList){
        //测试数据
        gradesigncheckgroup.setGroupid("2");
        gradesigncheckgroup.setGroupname("2号小组");
        gradesigncheckgroup.setGrouptype("突击小组");
        gradesigncheckgroup.setReplyaddress("18楼301");
        gradesigncheckgroup.setReplyaddress("突击小组备注");
        checkgrouppersonList = new ArrayList<Checkgroupperson>();
        for (int i = 0 ;i<3;i++){
            Checkgroupperson checkgroupperson = new Checkgroupperson();
            checkgroupperson.setGropersonid(i+2);
            checkgroupperson.setTeacherid("1");
            checkgroupperson.setTeachername("呜呜");
            checkgroupperson.setGroupid("2");
            checkgroupperson.setGrouprole("组长");
            checkgroupperson.setRemark("测试备注");
            checkgrouppersonList.add(checkgroupperson);
        }
        //测试数据


        boolean b1 = gradesigncheckgroupService.insert(gradesigncheckgroup);
        boolean b2 = false;
        for (Checkgroupperson checkgroupperson:checkgrouppersonList){
            b2 = checkgrouppersonService.insert(checkgroupperson);
            if (b2 == false){
                break;
            }
        }
        return b1 && b2?"success":"fail";
    }

    /*
    更改小组信息（测试成功）
     */
    @ResponseBody
    @RequestMapping("update.action")
    public String updateGradesigncheckgroup(Gradesigncheckgroup gradesigncheckgroup){
        //假数据
        gradesigncheckgroup = new Gradesigncheckgroup();
        gradesigncheckgroup.setGroupid("1");
        gradesigncheckgroup.setGroupname("1号小组");
        gradesigncheckgroup.setGrouptype("检查小组");
        gradesigncheckgroup.setReplyaddress("16楼301");
        gradesigncheckgroup.setRemark("没有备注");
        //假数据
        String result = "";
        result = gradesigncheckgroupService.updateByPrimaryKey(gradesigncheckgroup)?"success":"fail";
        return result;
    }

    /*
    查询全部小组及其成员信息
     */
    @RequestMapping("selectList.action")
    public ModelAndView selectGradesigncheckgroupList(Gradesigncheckgroup gradesigncheckgroup){
        ModelAndView modelAndView = new ModelAndView();
        List<Gradesigncheckgroup> GradesigncheckgroupList = new ArrayList<Gradesigncheckgroup>();
        Map<String ,Object> map = new HashMap<String, Object>();
        map.put("groupid",gradesigncheckgroup.getGroupid());
        map.put("groupname",gradesigncheckgroup.getGroupname());
        map.put("grouptype",gradesigncheckgroup.getGrouptype());
        map.put("replyaddress",gradesigncheckgroup.getReplyaddress());
        map.put("remark",gradesigncheckgroup.getRemark());
        GradesigncheckgroupList = gradesigncheckgroupService.selectGradesigncheckgroupList(map);
        modelAndView.addObject("GradesigncheckgroupList",GradesigncheckgroupList);
        modelAndView.setViewName("pages/graduateProgram/middleReport/middleReportSettle");
        return modelAndView;
    }

    /*
    删除小组及组内成员信息
     */
    @RequestMapping("deleteGroup.action")
    @ResponseBody
    public String deleteGradesigncheckgroup(String groupId){
        CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
        CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
        criteria.andGroupidEqualTo(groupId);
        boolean b1 = checkgrouppersonService.deleteByExample(checkgrouppersonExample);
        boolean b2 = gradesigncheckgroupService.deleteByPrimaryKey(groupId);
        return b1 && b2?"success":"fail";
    }
}