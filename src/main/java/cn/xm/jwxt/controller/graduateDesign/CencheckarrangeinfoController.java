package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.mapper.graduateDesign.custom.CencheckarrangeinfoCustomMapper;
import cn.xm.jwxt.service.graduateDesign.CencheckarrangeinfoService;
import cn.xm.jwxt.service.graduateDesign.CencheckbaseinfoService;
import org.apache.log4j.Logger;
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
 * 〈中期检查安排表控制器〉
 *
 * @author xuexiaolei
 * @create 2018/4/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("cencheckarrangeinfo")
public class CencheckarrangeinfoController {

    @Autowired
    private CencheckarrangeinfoService cencheckarrangeinfoService;

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    /*
    添加安排信息
     */
    @RequestMapping("add.action")
    @ResponseBody
    public String addCencheckarrangeinfo(Cencheckarrangeinfo cencheckarrangeinfo){
        return cencheckarrangeinfoService.insert(cencheckarrangeinfo)?"success":"fail";
    }

    /*
    删除安排信息
     */
    @RequestMapping("delete.action")
    @ResponseBody
    public String deleteCencheckarrangeinfo(Integer cenarrangeinfoid ){
        return cencheckarrangeinfoService.deleteByPrimaryKey(cenarrangeinfoid)?"success":"fail";
    }

    /*
    通过id修改安排信息
     */
    @RequestMapping("update.action")
    @ResponseBody
    public String updateCencheckarrangeinfo(String cencheckinfoid ){
        Cencheckarrangeinfo cencheckarrangeinfo = new Cencheckarrangeinfo();
        cencheckarrangeinfo.setCencheckinfoid(cencheckinfoid);
        return cencheckarrangeinfoService.updateByPrimaryKey(cencheckarrangeinfo)?"success":"false";
    }

    /*
    查询单个安排信息(视图待确认)
     */
    @RequestMapping("selectOne.action")
    public ModelAndView selectOneCencheckarrangeinfo(Integer cenarrangeinfoid){
        ModelAndView modelAndView = new ModelAndView();
        Cencheckarrangeinfo cencheckarrangeinfo = cencheckarrangeinfoService.selectOneCencheckarrangeinfo(cenarrangeinfoid);
        modelAndView.addObject("cencheckarrangeinfo",cencheckarrangeinfo);
        modelAndView.setViewName("");
        return modelAndView;
    }


    /*
    多条件连表带分页查询
     */
    @RequestMapping("selectList.action")
    public ModelAndView selectCencheckarrangeinfoList(Cencheckarrangeinfo cencheckarrangeinfo){
        ModelAndView modelAndView = new ModelAndView();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("cenArrangeInfoId",cencheckarrangeinfo.getCenarrangeinfoid());
        map.put("cenCheckInfoid",cencheckarrangeinfo.getCencheckinfoid());
        map.put("teacherid",cencheckarrangeinfo.getTeacherid());
        map.put("groupid",cencheckarrangeinfo.getBookid());
        map.put("page",null);
        map.put("limit",null);
        List<Cencheckarrangeinfo> cencheckarrangeinfoList = cencheckarrangeinfoService.selectCencheckarrangeinfoList(map);
        modelAndView.addObject("cencheckarrangeinfoList",cencheckarrangeinfoList);
        modelAndView.setViewName("");
        return modelAndView;
    }
}