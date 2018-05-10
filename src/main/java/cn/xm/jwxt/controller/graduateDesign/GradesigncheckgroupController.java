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
import cn.xm.jwxt.service.graduateDesign.*;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.UUIDUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

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

    @Autowired
    private CencheckbaseinfoService cencheckbaseinfoService;

    @Autowired
    private ProjectManageService projectManageService;

    /*
    插入答辩小组及其成员信息
    当结果都为true之后，才能插入
     */
    @RequestMapping("add")
    @ResponseBody
    public String addGradesigncheckgroup(String data,String teacherids,String teachernames){
        String msg = null;
        try{
            List<String> teacherid = JSON.parseArray(teacherids,String.class);
            List<String> teachername = JSON.parseArray(teachernames,String.class);
            Map<String, Object> map = (Map)JSON.parse(data);
            Gradesigncheckgroup gradesigncheckgroup = new Gradesigncheckgroup();
            //小组id
            String groupid = UUIDUtil.getUUID();
            //数据
            gradesigncheckgroup.setGroupid(groupid);
            gradesigncheckgroup.setGroupname(map.get("groupname").toString());
            //页面暂时没有的数据
            gradesigncheckgroup.setGrouptype("");
            gradesigncheckgroup.setReplyaddress(map.get("replayaddress").toString());


            boolean b1 = gradesigncheckgroupService.insert(gradesigncheckgroup);
            boolean b2 = false;
            //插入小组成员信息
            for (int i=0;i<teacherid.size();i++){
                Checkgroupperson checkgroupperson = new Checkgroupperson();
                checkgroupperson.setGropersonid(null);
                checkgroupperson.setTeacherid(teacherid.get(i));
                checkgroupperson.setTeachername(teachername.get(i));
                checkgroupperson.setGroupid(groupid);
                checkgroupperson.setGrouprole("组员");
                checkgroupperson.setRemark("");
                b2 = checkgrouppersonService.insertSelective(checkgroupperson);
                if (b2 == false){
                    break;
                }
            }

            //指定老师为组长
            String groupleaderid = map.get("groupleader").toString();
            //将要修改的信息
            Checkgroupperson checkgroupperson = new Checkgroupperson();
            checkgroupperson.setGrouprole("组长");
            //修改的条件
            CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
            CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
            criteria.andTeacheridEqualTo(groupleaderid);
            //修改操作
            boolean b3 = checkgrouppersonService.updateByExampleSelective(checkgroupperson,checkgrouppersonExample);
            msg = b1 && b2 && b3?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
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
    更改小组信息（检查时间）
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
            boolean b4 = false;
            Cencheckbaseinfo cencheckbaseinfo = new Cencheckbaseinfo();
            cencheckbaseinfo.setCencheckinfoid(map.get("cencheckinfoid").toString());
            cencheckbaseinfo.setArrangetime(DateHandler.changeStringToDate(map.get("arrangetime").toString()));
            b4 = cencheckbaseinfoService.updateByPrimaryKey(cencheckbaseinfo);
            msg = b1&&b2&&b3&&b4?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    修改小组信息之前,先查询出小组基本信息（中期检查）
     */
    @RequestMapping("selectBeforeUpdate")
    public ModelAndView selectBeforeUpdateGradesigncheckgroup(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/middleReport/middleReportGroup-modifybaseinfo");
        //查询出当前小组信息，用于初始化
        TTeacherInfoVo tTeacherInfoVo = gradesigncheckgroupService.selectOneGradesigncheckgroup2(groupid);
        modelAndView.addObject("tTeacherInfoVo",tTeacherInfoVo);
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
    修改小组信息之前,先查询出小组基本信息（毕业答辩）
     */
    @RequestMapping("selectBeforeUpdate2")
    public ModelAndView selectBeforeUpdateGradesigncheckgroup2(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/graduateReport/graduateReportGroup-modify");
        //查询出当前小组信息，用于初始化
        TTeacherInfoVo tTeacherInfoVo = gradesigncheckgroupService.selectOneGradesigncheckgroup2(groupid);
        modelAndView.addObject("tTeacherInfoVo",tTeacherInfoVo);
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
    查询一条小组及其组内老师学生信息（中期检查）
     */
    @RequestMapping("selectOneGradesigncheckgroup")
    public ModelAndView selectOneGradesigncheckgroup(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/middleReport/middleReportGroup-view");
        //小组信息
        TTeacherInfoVo tTeacherInfoVo = gradesigncheckgroupService.selectOneGradesigncheckgroup2(groupid);
        modelAndView.addObject("tTeacherInfoVo",tTeacherInfoVo);
        //组长
        String groupleader = checkgrouppersonService.selectGroupLeader(groupid);
        modelAndView.addObject("groupLeader",groupleader);
        return modelAndView;
    }

    /*
    查询一条小组及其组内老师学生信息（毕业答辩）
     */
    @RequestMapping("selectOneGradesigncheckgroup2")
    public ModelAndView selectOneGradesigncheckgroup2(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/graduateReport/graduateReportGroup-view");
        //小组信息
        TTeacherInfoVo tTeacherInfoVo = gradesigncheckgroupService.selectOneGradesigncheckgroup2(groupid);
        modelAndView.addObject("tTeacherInfoVo",tTeacherInfoVo);
        //组长
        String groupleader = checkgrouppersonService.selectGroupLeader(groupid);
        modelAndView.addObject("groupLeader",groupleader);
        return modelAndView;
    }

    /*
    查询全部小组及其成员信息
     */
    @RequestMapping("selectList")
    @ResponseBody
    public String selectGradesigncheckgroupList() throws Exception {
        StringBuffer result = new StringBuffer();
        List<GradesigncheckgroupVo> gradesigncheckgroupListVo = new ArrayList<GradesigncheckgroupVo>();
        Map<String ,Object> map = new HashMap<String, Object>();
        //查询到的数据
        gradesigncheckgroupListVo = gradesigncheckgroupService.selectGradesigncheckgroupList2(map);


        for(int i = 0;i<gradesigncheckgroupListVo.size();i++){
            String[] teacherids = gradesigncheckgroupListVo.get(i).getTeacheridSum().split(",");
            //获取小组内所有老师带的学生
            int studentCountInTeacher = 0;
//            for(String teacherid:teacherids){
//                //获取老师带的学生人数
//                studentCountInTeacher +=  projectManageService.getSelfStudentNum(null,teacherid);
//            }
            //获取小组内所有学生人数
            gradesigncheckgroupListVo.get(i).setStudentCountInGroup(studentCountInTeacher);
        }

        result.append("{\"code\":0,\"msg\":\"\",\"count\":"+gradesigncheckgroupListVo.size()+",\"data\":"+JSON.toJSON(gradesigncheckgroupListVo)+"}");
        return result.toString();
    }

    /*
    删除小组,组内成员信息,小组检查的安排表信息,安排表下的检查结果信息(已完成)
     */
    @RequestMapping("deleteGroup")
    @ResponseBody
    public String deleteGradesigncheckgroup(String groupId){

        String msg = null;
        try {
            //查询出该小组检查的中期检查安排表信息,再查出该安排表下的检查结果信息进行删除
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("groupid",groupId);
            List<Cencheckarrangeinfo> cencheckarrangeinfoList = cencheckarrangeinfoService.selectCencheckarrangeinfoList(map);
            boolean b1 = false;
            if(cencheckarrangeinfoList.size() != 0){
                for (Cencheckarrangeinfo cencheckarrangeinfo:cencheckarrangeinfoList){
                    List<Cencheckresultinfo> cencheckresultinfoList = cencheckarrangeinfo.getCencheckresultinfoList();
                    if (cencheckresultinfoList.size() != 0){
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

            //删除互审信息
            boolean b3 = checkgrouppersonService.deleteArrangeTeacherResultByGroupid(groupId);

            //删除小组成员信息
            CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
            CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
            criteria.andGroupidEqualTo(groupId);
            boolean b4 = checkgrouppersonService.deleteByExample(checkgrouppersonExample);

            //删除小组信息
            boolean b5 = gradesigncheckgroupService.deleteByPrimaryKey(groupId);
            msg = b1 && b2 && b3 && b4 && b5?"0":"1";

        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }
}