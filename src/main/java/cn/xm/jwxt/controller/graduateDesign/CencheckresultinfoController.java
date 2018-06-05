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
package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckresultinfo;
import cn.xm.jwxt.bean.graduateDesign.MiddleReportManage;
import cn.xm.jwxt.service.graduateDesign.CencheckresultinfoService;
import cn.xm.jwxt.utils.DateHandler;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈中期检查结果表控制层〉
 *
 * @author xuexiaolei
 * @create 2018/4/20
 * @since 1.0.0
 */
@Controller
@RequestMapping("cencheckresultinfo")
public class CencheckresultinfoController {

    @Autowired
    private CencheckresultinfoService cencheckresultinfoService;

    /*
    添加中期检查结果表
     */
    @RequestMapping("addCencheckresultinfo")
    @ResponseBody
    public String addCencheckresultinfo(String cenArrangeInfoId,String wordProgress,String workAttitude,String qualityAdvice,String problemAndAatter,String checkTime) throws ParseException {
        String msg = null;
        try {
            Cencheckresultinfo cencheckresultinfo = new Cencheckresultinfo();
            cencheckresultinfo.setCenterresultid(null);
            cencheckresultinfo.setCenarrangeinfoid(Integer.parseInt(cenArrangeInfoId));
            cencheckresultinfo.setWordprogress(wordProgress);
            cencheckresultinfo.setWorkattitude(workAttitude);
            cencheckresultinfo.setQualityadvice(qualityAdvice);
            cencheckresultinfo.setProblemandaatter(problemAndAatter);
            cencheckresultinfo.setChecktime(DateHandler.changeStringToDate(checkTime));
            msg = cencheckresultinfoService.insertSelective(cencheckresultinfo)?"1":"0";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    删除中期检查结果表
     */
    @RequestMapping("delete")
    @ResponseBody
    public String deleteCencheckresultinfo(Integer centerresultid){
        return cencheckresultinfoService.deleteByPrimaryKey(centerresultid)?"success":"fail";
    }

    /*
    修改中期检查结果表
     */
    @RequestMapping("update")
    @ResponseBody
    public String updateCencheckresultinfo(Cencheckresultinfo cencheckresultinfo){
        return cencheckresultinfoService.updateByPrimaryKey(cencheckresultinfo)?"success":"fail";
    }

    /*
    查询中期检查结果表
     */
    @RequestMapping("selectOne")
    @ResponseBody
    public ModelAndView selectCencheckresultinfo(Integer centerresultid){
        Cencheckresultinfo cencheckresultinfo = cencheckresultinfoService.selectByPrimaryKey(centerresultid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cencheckresultinfo",cencheckresultinfo);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /*
    初始化中期检查结果表信息，同于添加表格
     */
    @RequestMapping("selectcencheckresultByStudentId")
    public ModelAndView selectcencheckresultByStudentId(String studentid){
        ModelAndView modelAndView = new ModelAndView("/pages/graduateProgram/middleReport/middleReportManage-addResult");
        MiddleReportManage middleReportManage = cencheckresultinfoService.selectcenCheckResultInfoByStudentId(studentid);
        modelAndView.addObject("middleReportManage",middleReportManage);
        return modelAndView;
    }

    /*
    查询中期检查审核页面初始化信息
     */
    @RequestMapping("selectPage")
    @ResponseBody
    public String selectMiddleReportManageList(String studentname,String classname,String titlename,
                                               String checkedNewstate,String isout,String checktablefilled,
                                               Integer page,Integer limit){
        StringBuffer result = new StringBuffer();
        //查询条件
        studentname = studentname==null?"":studentname;
        classname = classname==null?"":classname;
        titlename = titlename==null?"":titlename;
        checkedNewstate = checkedNewstate==null?"":checkedNewstate;
        isout = isout==null?"":isout;
        checktablefilled = checktablefilled==null?"":checktablefilled;
        page = page==null?1:page;
        limit = limit==null?30:limit;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("studentname",studentname);
        map.put("classname",classname);
        map.put("titlename",titlename);
        map.put("checkedNewstate",checkedNewstate);
        map.put("isout",isout);
        map.put("checktablefilled",checktablefilled);
        map.put("page",page);
        map.put("limit",limit);
        List<MiddleReportManage> middleReportManageList = cencheckresultinfoService.selectMiddleReportManageList(map);

        Integer studentCount = cencheckresultinfoService.selectMiddleReportManageCount(map);
        result.append("{\"code\":0,\"msg\":\"\",\"count\":"+studentCount+",\"data\":"+ JSON.toJSON(middleReportManageList)+"}");

        return result.toString();
    }


}