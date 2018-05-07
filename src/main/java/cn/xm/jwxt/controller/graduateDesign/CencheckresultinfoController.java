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

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.bean.graduateDesign.Cencheckresultinfo;
import cn.xm.jwxt.service.graduateDesign.CencheckbaseinfoService;
import cn.xm.jwxt.service.graduateDesign.CencheckresultinfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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
    @RequestMapping("add")
    @ResponseBody
    public String addCencheckresultinfo(Cencheckresultinfo cencheckresultinfo){
        return cencheckresultinfoService.insert(cencheckresultinfo)?"success":"fail";
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


}