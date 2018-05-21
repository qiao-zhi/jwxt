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

    @Autowired
    private FinallypleainfoService finallypleainfoService;

    @Autowired
    private PleaarrangeinfoService pleaarrangeinfoService;

    @Autowired
    private PlearesultinfoService plearesultinfoService;

    @Autowired
    private PleafilerecordinfoService pleafilerecordinfoService;

    @Autowired
    private PleafileuploadinfoService pleafileuploadinfoService;

    @Autowired
    private PlearesultsigninfoService plearesultsigninfoService;

    /*
    插入答辩小组及其成员信息
    当结果都为true之后，才能插入
    （中期检查小组）
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
            String groupid = UUIDUtil.getUUID2();
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
    插入答辩小组及其成员信息
    当结果都为true之后，才能插入
    （毕业答辩检查小组）
     */
    @RequestMapping("addNew")
    @ResponseBody
    public String addGradesigncheckgroupNew(String data,String teacherids,String teachernames){
        String msg = null;
        try{
            List<String> teacherid = JSON.parseArray(teacherids,String.class);
            List<String> teachername = JSON.parseArray(teachernames,String.class);
            Map<String, Object> map = (Map)JSON.parse(data);
            GraDesignCheckGroupNew graDesignCheckGroupNew = new GraDesignCheckGroupNew();
            //小组id
            String groupid = UUIDUtil.getUUID2();
            //数据
            graDesignCheckGroupNew.setGroupid(groupid);
            graDesignCheckGroupNew.setGroupname(map.get("groupname").toString());
            //页面暂时没有的数据
            graDesignCheckGroupNew.setGrouptype("");
            graDesignCheckGroupNew.setReplyaddress(map.get("replayaddress").toString());


            boolean b1 = gradesigncheckgroupService.insertGraDesignCheckGroupNew(graDesignCheckGroupNew);
            boolean b2 = false;
            //插入小组成员信息
            for (int i=0;i<teacherid.size();i++){
                CheckGroupPersonNew checkGroupPersonNew = new CheckGroupPersonNew();
                checkGroupPersonNew.setGropersonid(null);
                checkGroupPersonNew.setTeacherid(teacherid.get(i));
                checkGroupPersonNew.setTeachername(teachername.get(i));
                checkGroupPersonNew.setGroupid(groupid);
                checkGroupPersonNew.setGrouprole("组员");
                checkGroupPersonNew.setRemark("");
                b2 = checkgrouppersonService.insertCheckGroupPersonNew(checkGroupPersonNew);
                if (b2 == false){
                    break;
                }
            }

            //指定老师为组长
            String groupleaderid = map.get("groupleader").toString();
            //将要修改的信息
            map.clear();
            map.put("grouprole","组长");
            map.put("teacheridCondition",groupleaderid);
            //修改操作
            boolean b3 = checkgrouppersonService.updatecheckgrouppersonNewByCondition(map);
            msg = b1 && b2 && b3?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    插入之前先查询老师信息用于select下拉框展示（中期检查已完成）
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
    插入之前先查询老师信息用于select下拉框展示（毕业答辩已完成）
     */
    @RequestMapping("selectBeforeAddGradesigncheckgroupNew")
    public ModelAndView selectBeforeAddGradesigncheckgroupNew(String checkgrouppersonVoList){
        ModelAndView modelAndView = new ModelAndView("/pages/graduateProgram/graduateReport/graduateReportGroup-add");
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
    更改小组信息（中期检查）
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

            //修改检查时间
            Cencheckbaseinfo cencheckbaseinfo = new Cencheckbaseinfo();
            cencheckbaseinfo.setCencheckinfoid(map.get("cencheckinfoid").toString());
            cencheckbaseinfo.setArrangetime(DateHandler.changeStringToDate(map.get("arrangetime").toString()));
            boolean b4 = cencheckbaseinfoService.updateByPrimaryKey(cencheckbaseinfo);
            msg = b1&&b2&&b3&&b4?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    更改小组信息（毕业答辩）
     */
    @RequestMapping("updateNew")
    @ResponseBody
    public String updateGradesigncheckgroupNew(String gradesigncheckgrouopInfo){
        String msg = null;
        try{
            //将json转换未Object再转换成Map进行提取数据
            Object object = JSON.parse(gradesigncheckgrouopInfo);
            Map<String,Object> map = (Map) object;

            //小组id
            String groupid = map.get("groupid").toString();
            //通过小组id更新页面上传过来的信息
            map.put("groupidCondition",groupid);
            boolean b1 = gradesigncheckgroupService.updateGraDesignCheckGroupNewByCondition(map);

            //将小组内所有成员角色改为组员
            map.put("grouprole","组员");
            boolean b2 = checkgrouppersonService.updatecheckgrouppersonNewByCondition(map);

            //将选中的老师的角色改为组长
            String teacherid = map.get("teacherid").toString();
            map.put("teacheridCondition",teacherid);
            map.put("grouprole","组长");
            boolean b3 = checkgrouppersonService.updatecheckgrouppersonNewByCondition(map);

            //修改答辩时间
            Finallypleainfo finallypleainfo = new Finallypleainfo();
            finallypleainfo.setPleaid(map.get("pleaid").toString());
            finallypleainfo.setArrangetime(DateHandler.changeStringToDate(map.get("arrangetime").toString()));
            boolean b4 = finallypleainfoService.updateByPrimaryKey(finallypleainfo);
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
    @RequestMapping("selectBeforeUpdateNew")
    public ModelAndView selectBeforeUpdateGradesigncheckgroupNew(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/graduateReport/graduateReportGroup-modifybaseinfo");
        //查询出当前小组信息，用于初始化
        TTeacherInfoVo tTeacherInfoVo = gradesigncheckgroupService.selectOneGradesigncheckgroup2New(groupid);
        modelAndView.addObject("tTeacherInfoVo",tTeacherInfoVo);
        //查询出当前组长信息，用于初始化展示
        String groupLeader = checkgrouppersonService.selectGroupLeader(groupid);
        modelAndView.addObject("groupLeader",groupLeader);
        //查询出小组内组员信息，用于select下拉框展示
        CheckGroupPersonNew checkGroupPersonNew = new CheckGroupPersonNew();
        checkGroupPersonNew.setGroupid(groupid);
        List<CheckGroupPersonNew> checkgrouppersonNewLeaderList = checkgrouppersonService.selectByCondition(checkGroupPersonNew);
        modelAndView.addObject("checkgrouppersonLeaderList",checkgrouppersonNewLeaderList);
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
    @RequestMapping("selectOneGradesigncheckgroupNew")
    public ModelAndView selectOneGradesigncheckgroupNew(String groupid){
        ModelAndView modelAndView = new ModelAndView("pages/graduateProgram/graduateReport/graduateReportGroup-view");
        //小组信息
        TTeacherInfoVo tTeacherInfoVo = gradesigncheckgroupService.selectOneGradesigncheckgroup2New(groupid);
        modelAndView.addObject("tTeacherInfoVo",tTeacherInfoVo);
        //组长
        String groupleader = checkgrouppersonService.selectGroupLeaderNew(groupid);
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
    查询中期检查全部小组及其成员信息
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
    查询中期检查全部小组及其成员信息
     */
    @RequestMapping("selectListNew")
    @ResponseBody
    public String selectGradesigncheckgroupListNew() throws Exception {
        StringBuffer result = new StringBuffer();
        List<GradesigncheckgroupVo> gradesigncheckgroupListVo = new ArrayList<GradesigncheckgroupVo>();
        Map<String ,Object> map = new HashMap<String, Object>();
        //查询到的数据
        gradesigncheckgroupListVo = gradesigncheckgroupService.selectGradesigncheckgroupList2New(map);

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
    删除毕业答辩小组,组内成员信息,小组检查的安排表信息,安排表下的答辩结果信息(已完成)
     */
    @RequestMapping("deleteGroupNew")
    @ResponseBody
    public String deleteGradesigncheckgroupNew(String groupId){

        String msg = null;
        try {
            //查询出该小组检查的毕业答辩安排表信息,再查出该安排表下的答辩结果信息，毕设资料提交情况，资料提交信息进行删除
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("groupid",groupId);
            List<Pleaarrangeinfo> pleaarrangeinfoList = pleaarrangeinfoService.selectPleaarrangeinfoList(map);
            boolean b1 = false;
            if(pleaarrangeinfoList.size() != 0){
                for (Pleaarrangeinfo pleaarrangeinfo:pleaarrangeinfoList){
                    //删除毕业答辩结果表
                    boolean booleanresult = false;
                    List<Plearesultinfo> plearesultinfoList = pleaarrangeinfo.getPlearesultinfoList();
                    if (plearesultinfoList.size() != 0){
                        for(Plearesultinfo plearesultinfo:plearesultinfoList){
                            //删除毕业答辩结果签名表
                            PlearesultsigninfoExample plearesultsigninfoExample = new PlearesultsigninfoExample();
                            PlearesultsigninfoExample.Criteria plearesultsigninfoExampleCriteria = plearesultsigninfoExample.createCriteria();
                            plearesultsigninfoExampleCriteria.andPlearesultidEqualTo(plearesultinfo.getPlearesultid());
                            boolean booleanresultsign = plearesultsigninfoService.deleteByExample(plearesultsigninfoExample);
                            if(booleanresultsign == false){
                                break;
                            }

                            PlearesultinfoExample plearesultinfoExample = new PlearesultinfoExample();
                            PlearesultinfoExample.Criteria criteria = plearesultinfoExample.createCriteria();
                            criteria.andArrangeidEqualTo(plearesultinfo.getArrangeid());
                            booleanresult = plearesultinfoService.deleteByExample(plearesultinfoExample);
                            if(booleanresult == false){
                                break;
                            }
                        }
                    }else {
                        booleanresult = true;
                    }

                    //删除毕设资料提交情况表
                    boolean booleanfilerecord = false;
                    List<Pleafilerecordinfo> pleafilerecordinfoList = pleaarrangeinfo.getPleafilerecordinfoList();

                    if (pleafilerecordinfoList.size() != 0){
                        for(Pleafilerecordinfo pleafilerecordinfo:pleafilerecordinfoList){
                            PleafilerecordinfoExample pleafilerecordinfoExample = new PleafilerecordinfoExample();
                            PleafilerecordinfoExample.Criteria criteria = pleafilerecordinfoExample.createCriteria();
                            criteria.andArrangeidEqualTo(pleafilerecordinfo.getArrangeid());
                            booleanresult = pleafilerecordinfoService.deleteByExample(pleafilerecordinfoExample);
                            if(booleanfilerecord == false){
                                break;
                            }
                        }
                    }else {
                        booleanfilerecord = true;
                    }

                    //删除毕设资料提交信息表
                    boolean booleanfileupload = false;
                    List<Pleafileuploadinfo> pleafileuploadinfoList = pleaarrangeinfo.getPleafileuploadinfoList();
                    if(pleafileuploadinfoList.size() != 0){
                        for (Pleafileuploadinfo pleafileuploadinfo:pleafileuploadinfoList){
                            PleafileuploadinfoExample pleafileuploadinfoExample = new PleafileuploadinfoExample();
                            PleafileuploadinfoExample.Criteria criteria = pleafileuploadinfoExample.createCriteria();
                            criteria.andArrangeidEqualTo(pleafileuploadinfo.getArrangeid());
                            booleanfileupload = pleafileuploadinfoService.deleteByExample(pleafileuploadinfoExample);
                            if(booleanfileupload == false){
                                break;
                            }
                        }
                    }else {
                        booleanfileupload = true;
                    }

                    b1 = booleanresult && booleanfilerecord && booleanfileupload;
                }
            }else {
                b1 = true;
            }

            //删除毕业答辩安排信息表
            PleaarrangeinfoExample pleaarrangeinfoExample = new PleaarrangeinfoExample();
            PleaarrangeinfoExample.Criteria pleaarrangeinfoExampleCriteria = pleaarrangeinfoExample.createCriteria();
            pleaarrangeinfoExampleCriteria.andGroupidEqualTo(groupId);
            boolean b2 = pleaarrangeinfoService.deleteByExample(pleaarrangeinfoExample);

            //删除互审信息
            boolean b3 = checkgrouppersonService.deleteArrangeTeacherResultNewByGroupid(groupId);

            //删除小组成员信息
            boolean b4 = checkgrouppersonService.deleteCheckgrouppersonNewBypgroupid(groupId);

            //删除小组信息
            boolean b5 = gradesigncheckgroupService.deleteGroupNewByPrimaryKey(groupId);
            msg = b1 && b2 && b3 && b4 && b5?"0":"1";

        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    删除中期检查小组,组内成员信息,小组检查的安排表信息,安排表下的检查结果信息(已完成)
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