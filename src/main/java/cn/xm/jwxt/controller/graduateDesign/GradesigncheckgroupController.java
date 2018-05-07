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

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfoExample;
import cn.xm.jwxt.service.graduateDesign.CencheckarrangeinfoService;
import cn.xm.jwxt.service.graduateDesign.CencheckresultinfoService;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import cn.xm.jwxt.service.graduateDesign.GradesigncheckgroupService;
import cn.xm.jwxt.utils.UUIDUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private CencheckarrangeinfoService cencheckarrangeinfoService;

    @Autowired
    private CencheckresultinfoService cencheckresultinfoService;

    /*
    插入答辩小组及其成员信息
    当结果都为true之后，才能插入
    （测试成功）
     */
    @RequestMapping("add")
    @ResponseBody
    public String addGradesigncheckgroup(Gradesigncheckgroup gradesigncheckgroup, List<CheckgrouppersonVo> checkgrouppersonVoList){
        String result = null;
        //小组id
        String groupid = UUIDUtil.getUUID();
        //数据
        gradesigncheckgroup.setGroupid(groupid);
        //页面暂时没有的数据
        gradesigncheckgroup.setGrouptype("检查小组");
        gradesigncheckgroup.setReplyaddress("检查小组备注");

        boolean b1 = gradesigncheckgroupService.insert(gradesigncheckgroup);
        boolean b2 = false;
        //插入小组成员信息
        for (CheckgrouppersonVo checkgrouppersonVo:checkgrouppersonVoList){
            Checkgroupperson checkgroupperson = new Checkgroupperson();
            checkgroupperson.setGropersonid(1);
            checkgroupperson.setTeacherid(checkgrouppersonVo.getTeacherid());
            checkgroupperson.setTeachername(checkgrouppersonVo.getTeachername());
            checkgroupperson.setGroupid(groupid);
            checkgroupperson.setGrouprole("组员");
            b2 = checkgrouppersonService.insert(checkgroupperson);
            if (b2 == false){
                break;
            }
        }
        result = b1 && b2?"0":"1";
        return result;
    }

    /*
    插入之前先查询老师信息用于select下拉框展示（已完成）
     */
    @RequestMapping("selectBeforeAddGradesigncheckgroup")
    public ModelAndView selectBeforeAddGradesigncheckgroup(String checkgrouppersonVoList){
        ModelAndView modelAndView = new ModelAndView("/pages/graduateProgram/middleReport/middleReportGroup-add");
        //将获取的三条老师信息转换成对象
        List<CheckgrouppersonVo> checkgrouppersonVos = JSON.parseArray(checkgrouppersonVoList,CheckgrouppersonVo.class);
        //获取老师id和姓名，用于前台展示
        List<TTeacherBaseInfo> tTeacherBaseInfos = new ArrayList<TTeacherBaseInfo>();
        for(CheckgrouppersonVo checkgrouppersonVo:checkgrouppersonVos){
            TTeacherBaseInfo tTeacherBaseInfo = new TTeacherBaseInfo();
            tTeacherBaseInfo.setTeacherid(checkgrouppersonVo.getTeacherid());
            tTeacherBaseInfo.setTeachername(checkgrouppersonVo.getTeachername());
            tTeacherBaseInfos.add(tTeacherBaseInfo);
        }
        modelAndView.addObject("tTeacherBaseInfos",tTeacherBaseInfos);
        return modelAndView;
    }

    /*
    更改小组信息（已完成）
     */
    @RequestMapping("update")
    @ResponseBody
    public String updateGradesigncheckgroup(String gradesigncheckgrouopInfo){
        String msg = null;
        try{
            //将json转换未Object再转换成Map进行提取数据
            Object object = JSON.parse(gradesigncheckgrouopInfo);
            Map<String,Object> map = (Map) object;

            //放置小组需要修改的信息
            Gradesigncheckgroup gradesigncheckgroup = new Gradesigncheckgroup();
            gradesigncheckgroup.setGroupid(map.get("groupid").toString());
            gradesigncheckgroup.setGroupname(map.get("groupname").toString());
            gradesigncheckgroup.setReplyaddress(map.get("replyaddress").toString());

            //答辩时间暂未确认

            boolean b1 = gradesigncheckgroupService.updateByPrimaryKeySelective(gradesigncheckgroup);
            //将小组内所有成员角色改为组员
            Checkgroupperson checkgrouppersonUpdate = new Checkgroupperson();
            checkgrouppersonUpdate.setGrouprole("组员");
            CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
            CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
            criteria.andGroupidEqualTo(gradesigncheckgroup.getGroupid());
            boolean b2 = checkgrouppersonService.updateByExampleSelective(checkgrouppersonUpdate,checkgrouppersonExample);

            //将选中的老师的角色改为组长
            String teacherid = map.get("teacherid").toString();
            Checkgroupperson checkgrouppersonUpdate2 = new Checkgroupperson();
            checkgrouppersonUpdate2.setGrouprole("组长");
            CheckgrouppersonExample checkgrouppersonExample2 = new CheckgrouppersonExample();
            CheckgrouppersonExample.Criteria criteria2 = checkgrouppersonExample2.createCriteria();
            criteria2.andTeacheridEqualTo(teacherid);
            boolean b3 = checkgrouppersonService.updateByExampleSelective(checkgrouppersonUpdate2,checkgrouppersonExample2);
            msg = b1&&b2&&b3?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    修改小组信息之前,先查询出小组基本信息（已完成）
     */
    @RequestMapping("selectBeforeUpdate")
    public ModelAndView selectBeforeUpdateGradesigncheckgroup(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/middleReport/middleReportGroup-modifybaseinfo");
        //查询出当前小组信息，用于初始化
        Gradesigncheckgroup gradesigncheckgroup = gradesigncheckgroupService.selectByPrimaryKey(groupid);
        modelAndView.addObject("gradesigncheckgroup",gradesigncheckgroup);
        //查询出当前组长信息，用于初始化展示
        String groupLeader = checkgrouppersonService.selectGroupLeader(groupid);
        modelAndView.addObject("groupLeader",groupLeader);
        //查询出小组内组员信息，用于select下拉框展示
        CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
        CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
        criteria.andGroupidEqualTo(groupid);
        List<Checkgroupperson> checkgrouppersonLeaderList = checkgrouppersonService.selectByExample(checkgrouppersonExample);
        modelAndView.addObject("checkgrouppersonLeaderList",checkgrouppersonLeaderList);
        return modelAndView;
    }


    /*
    查询一条小组信息（已完成）
     */
    @RequestMapping("selectOneGradesigncheckgroup")
    public ModelAndView selectOneGradesigncheckgroup(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/middleReport/middleReportGroup-view");
        //小组信息
        Gradesigncheckgroup gradesigncheckgroup = gradesigncheckgroupService.selectOneGradesigncheckgroup(groupid);
        modelAndView.addObject("gradesigncheckgroup",gradesigncheckgroup);
        //组长
        String groupleader = checkgrouppersonService.selectGroupLeader(groupid);
        modelAndView.addObject("groupLeader",groupleader);
        return modelAndView;
    }

    /*
    查询全部小组及其成员信息
     */
//    @RequestMapping("selectList")
//    public ModelAndView selectGradesigncheckgroupList(Gradesigncheckgroup gradesigncheckgroup){
//        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/middleReport/middleReportSettle");
//        List<Gradesigncheckgroup> GradesigncheckgroupList = new ArrayList<Gradesigncheckgroup>();
//        Map<String ,Object> map = new HashMap<String, Object>();
//        map.put("groupid",gradesigncheckgroup.getGroupid());
//        map.put("groupname",gradesigncheckgroup.getGroupname());
//        map.put("grouptype",gradesigncheckgroup.getGrouptype());
//        map.put("replyaddress",gradesigncheckgroup.getReplyaddress());
//        map.put("remark",gradesigncheckgroup.getRemark());
//        GradesigncheckgroupList = gradesigncheckgroupService.selectGradesigncheckgroupList(map);
//        modelAndView.addObject("GradesigncheckgroupList",GradesigncheckgroupList);
//        return modelAndView;
//    }

    /*
    删除小组,组内成员信息,小组检查的安排表信息,安排表下的检查结果信息(已完成)
     */
    @RequestMapping("deleteGroup")
    @ResponseBody
    public String deleteGradesigncheckgroup(String groupId){

        String msg = null;
        try {
            //查询出该小组检查的安排表信息,再查出该安排表下的检查结果信息进行删除
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("groupid",groupId);
            List<Cencheckarrangeinfo> cencheckarrangeinfoList = cencheckarrangeinfoService.selectCencheckarrangeinfoList(map);
            boolean b1 = false;
            if(cencheckarrangeinfoList != null){
                for (Cencheckarrangeinfo cencheckarrangeinfo:cencheckarrangeinfoList){
                    List<Cencheckresultinfo> cencheckresultinfoList = cencheckarrangeinfo.getCencheckresultinfoList();
                    if (cencheckresultinfoList != null){
                        for(Cencheckresultinfo cencheckresultinfo:cencheckresultinfoList){
                            //删除检查结果表
                            CencheckresultinfoExample cencheckresultinfoExample = new CencheckresultinfoExample();
                            CencheckresultinfoExample.Criteria cencheckresultinfoExampleCriteria = cencheckresultinfoExample.createCriteria();
                            cencheckresultinfoExampleCriteria.andCenarrangeinfoidEqualTo(cencheckresultinfo.getCenarrangeinfoid());
                            b1 = cencheckresultinfoService.deleteByExample(cencheckresultinfoExample);
                            if(b1 == false){
                                break;
                            }
                        }
                    }else {
                        b1 = true;
                    }
                }
            }else {
                b1 = true;
            }

            //删除安排表信息
            CencheckarrangeinfoExample cencheckarrangeinfoExample = new CencheckarrangeinfoExample();
            CencheckarrangeinfoExample.Criteria cencheckarrangeinfoExampleCriteria = cencheckarrangeinfoExample.createCriteria();
            cencheckarrangeinfoExampleCriteria.andGroupidEqualTo(groupId);
            boolean b2 = cencheckarrangeinfoService.deleteByExample(cencheckarrangeinfoExample);

            //删除小组成员信息
            CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
            CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
            criteria.andGroupidEqualTo(groupId);
            boolean b3 = checkgrouppersonService.deleteByExample(checkgrouppersonExample);

            //删除小组信息
            boolean b4 = gradesigncheckgroupService.deleteByPrimaryKey(groupId);
            msg = b1&&b2&&b3&&b4?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }
}