/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CheckgrouppersonController
 * Author:   xuexiaolei
 * Date:     2018/4/23 18:19
 * Description: 检查小组成员控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Checkgroupperson;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonVo;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import cn.xm.jwxt.utils.DateHandler;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈检查小组成员控制器〉
 *
 * @author xuexiaolei
 * @create 2018/4/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("checkgroupperson")
public class CheckgrouppersonController {

    @Autowired
    private CheckgrouppersonService checkgrouppersonService;

    /*
    添加一条检查小组成员信息
     */
//    @RequestMapping("add")
//    @ResponseBody
//    public String addCheckgroupperson(Checkgroupperson checkgroupperson){
//        return checkgrouppersonService.insert(checkgroupperson)==true?"success":"false";
//    }

    /*
    删除一条检查小组成员信息
     */
//    @RequestMapping("delete")
//    @ResponseBody
//    public String deleteCheckgroupperson(int gropersonid){
//        return checkgrouppersonService.deleteByPrimaryKey(gropersonid)==true?"success":"false";
//    }

    /*
    更新一条检查小组成员信息
     */
//    @RequestMapping("update")
//    @ResponseBody
//    public String updateCheckgroupperson(int gropersonid){
//        Checkgroupperson checkgroupperson = new Checkgroupperson();
//        checkgroupperson.setGropersonid(gropersonid);
//        String result =  checkgrouppersonService.updateByPrimaryKey(checkgroupperson)==true?"success":"false";
//        return result;
//    }

    /*
    查询一条检查小组成员信息（完成一半，剩余学生和老师关系待确认）
     */
    @RequestMapping("selectOne")
    public ModelAndView selectOneCheckgroupperson(Integer gropersonid,String teacherid){
        ModelAndView modelAndView = new ModelAndView();

        //查询出检查小组成员信息及其小组信息
        Checkgroupperson checkgroupperson = checkgrouppersonService.selectByPrimaryKey(gropersonid);
        CheckgrouppersonVo checkgrouppersonVo = new CheckgrouppersonVo();
        //若小组信息不为空时，展示小组信息
        if (checkgroupperson.getGradesigncheckgroup() != null){
            checkgrouppersonVo.setGroupname(checkgroupperson.getGradesigncheckgroup().getGroupname());
            String groupLeader = checkgrouppersonService.selectGroupLeader(checkgroupperson.getGroupid());
            checkgrouppersonVo.setGroupleader(groupLeader);
            checkgrouppersonVo.setReplyaddress(checkgroupperson.getGradesigncheckgroup().getReplyaddress());
            //答辩时间暂定为今天
            checkgrouppersonVo.setReplytime(DateHandler.dateToString(new Date(),"yyyy-MM-dd"));
        }

        //老师所带学生详细信息（待完成）

        modelAndView.addObject("checkgrouppersonVo",checkgrouppersonVo);
        modelAndView.setViewName("pages/graduateProgram/middleReport/middleReportManage-view");
        return modelAndView;
    }

    /*
    中期检查小组管理：页面初始化及其条件查询（已完成）
     */
    @RequestMapping("selectPage")
    @ResponseBody
    public String selectCheckgrouppersonListPage(String teachername,String groupname,Integer page,Integer limit){

        //初始化参数
        teachername = teachername == null ? "":teachername;
        groupname = groupname == null ? "":groupname;
        page = page == null?1:page;
        limit = limit == null?10:limit;

        //准备对象，存放数据和回调页面
        ModelAndView modelAndView = new ModelAndView();
        //前台显示的数据存放在CheckgrouppersonVo中
        List<CheckgrouppersonVo> checkgrouppersonVoList = new ArrayList<CheckgrouppersonVo>();
        //查询条件及分页条件存放在Map中
        Map<String,Object> map = new HashMap<String, Object>();
        //存放条件
        map.put("teachername",teachername);
        map.put("groupname",groupname);
        map.put("page",page);
        map.put("limit", limit);

        //查询出小组信息
        List<Checkgroupperson> checkgrouppersonList = checkgrouppersonService.selectCheckgrouppersonList(map);

        //小组数量
        int checkgrouppersonCount = checkgrouppersonService.selectCheckgrouppersonCount(map);


        //将小组及其附带信息组合，放到checkgrouppersonVoList中
        for (Checkgroupperson checkgrouppersoninfo:checkgrouppersonList){
            CheckgrouppersonVo checkgrouppersonVo = new CheckgrouppersonVo();
            checkgrouppersonVo.setGropersonid(checkgrouppersoninfo.getGropersonid());
            checkgrouppersonVo.setTeacherid(checkgrouppersoninfo.gettTeacherBaseInfo().getTeacherid());
            checkgrouppersonVo.setGroupid(checkgrouppersoninfo.getGroupid());
            checkgrouppersonVo.setTeachername(checkgrouppersoninfo.gettTeacherBaseInfo().getTeachername());
            checkgrouppersonVo.setGroupname(checkgrouppersoninfo.getGradesigncheckgroup().getGroupname());

            //小组组长
            String groupLeader = checkgrouppersonService.selectGroupLeader(checkgrouppersoninfo.getGroupid());
            checkgrouppersonVo.setGroupleader(groupLeader);

            //查询老师所带学生人数(未完成)

            checkgrouppersonVo.setReplyaddress(checkgrouppersoninfo.getGradesigncheckgroup().getReplyaddress());

            //答辩时间未确认，暂时设定为当前时间 checkgrouppersoninfo.getGradesigncheckgroup().getReplytime()
            checkgrouppersonVo.setReplytime(DateHandler.dateToString(new Date(),"yyyy-MM-dd"));

            checkgrouppersonVoList.add(checkgrouppersonVo);
        }

        //返回数据
        StringBuffer result = new StringBuffer();
        result.append("{\"code\":0,\"msg\":\"\",\"count\":"+checkgrouppersonCount+",\"data\":"+JSON.toJSON(checkgrouppersonVoList)+"}");

        return result.toString();
    }
}