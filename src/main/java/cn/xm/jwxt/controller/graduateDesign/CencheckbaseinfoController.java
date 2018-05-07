/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckbaseinfoController
 * Author:   xuexiaolei
 * Date:     2018/4/23 18:10
 * Description: 中期检查基本信息控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.mapper.graduateDesign.custom.CencheckbaseinfoCustomMapper;
import cn.xm.jwxt.service.graduateDesign.CencheckbaseinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈中期检查基本信息控制器〉
 *
 * @author xuexiaolei
 * @create 2018/4/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("cencheckbaseinfo")
public class CencheckbaseinfoController {

    @Autowired
    private CencheckbaseinfoService cencheckbaseinfoService;

    @Autowired
    private CencheckbaseinfoCustomMapper cencheckbaseinfoCustomMapper;

    /*
    添加一条中期检查基本信息表（所有数据）
     */
    @RequestMapping("add.action")
    @ResponseBody
    public String addCencheckbaseinfo(Cencheckbaseinfo cencheckbaseinfo){
        return cencheckbaseinfoService.insert(cencheckbaseinfo)?"success":"false";
    }

    /*
    通过id删除一条中期检查基本信息
     */
    @RequestMapping("delete.action")
    @ResponseBody
    public String deleteCencheckbaseinfo(String cencheckinfoid){
        return cencheckbaseinfoService.deleteByPrimaryKey(cencheckinfoid)?"success":"false";
    }

    /*
    通过id修改一条中期检查基本信息
     */
    @RequestMapping("update.action")
    @ResponseBody
    public String updateCencheckbaseinfo(String cencheckinfoid){
        Cencheckbaseinfo cencheckbaseinfo = new Cencheckbaseinfo();
        cencheckbaseinfo.setCencheckinfoid(cencheckinfoid);
        return cencheckbaseinfoService.updateByPrimaryKey(cencheckbaseinfo)?"success":"false";
    }

    /*
    通过id查询一条中期检查基本信息(视图待确认)
     */
    @RequestMapping("selectOne.action")
    public ModelAndView selectOneCencheckbaseinfo(String cencheckinfoid){
        ModelAndView modelAndView = new ModelAndView();
        Cencheckbaseinfo cencheckbaseinfo = cencheckbaseinfoService.selectByPrimaryKey(cencheckinfoid);

        modelAndView.addObject("cencheckbaseinfo",cencheckbaseinfo);
        modelAndView.setViewName("");
        return modelAndView;
    }

    /**
     * 测试多条件连表带分页查询（成功）
     * @return
     */
    @RequestMapping("test.action")
    public String a(){
        Cencheckbaseinfo cencheckbaseinfo = cencheckbaseinfoCustomMapper.selectOneCencheckbaseinfo("852");
        System.out.println(cencheckbaseinfo.getCencheckinfoid());
        System.out.println(cencheckbaseinfo.getCencheckarrangeinfoList().get(0).getCenarrangeinfoid());

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("cencheckinfoid",cencheckbaseinfo.getCencheckinfoid());
        map.put("page",0);
        map.put("limit",10);
        List<Cencheckbaseinfo> list = cencheckbaseinfoService.selectCencheckbaseinfoList(map);
        System.out.println(list.get(0).getCencheckinfoid()+"=============================");
        System.out.println(map.get("cencheckinfoid")+"=======================================");
        for (Cencheckbaseinfo cencheckbaseinfo1:list){
            System.out.println(cencheckbaseinfo.getArrangeperson()+"安排人======================================");
        }
        return "index";
    }
}