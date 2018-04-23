package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckarrangeinfo;
import cn.xm.jwxt.service.graduateDesign.CencheckarrangeinfoService;
import cn.xm.jwxt.service.graduateDesign.CencheckbaseinfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    public Logger logger = Logger.getLogger(CencheckresultinfoController.class);

    //测试是否成功，成功返回index界面
    @RequestMapping("a.action")
    public String a (){
        return "index";
    }

    @RequestMapping("add.action")
    public String s(Cencheckarrangeinfo cencheckarrangeinfo){
        return cencheckarrangeinfoService.insert(cencheckarrangeinfo)?"success":"fail";
    }

    @RequestMapping("delete.action")
    public String deleteCencheckarrangeinfo(Integer cenarrangeinfoid ){
        return cencheckarrangeinfoService.deleteByPrimaryKey(cenarrangeinfoid)?"success":"fail";
    }


}