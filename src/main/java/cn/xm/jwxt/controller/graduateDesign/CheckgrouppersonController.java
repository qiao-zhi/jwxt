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
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonExample;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    @RequestMapping("add.action")
    @ResponseBody
    public String addCheckgroupperson(Checkgroupperson checkgroupperson){
        return checkgrouppersonService.insert(checkgroupperson)==true?"success":"false";
    }

    /*
    删除一条检查小组成员信息
     */
    @RequestMapping("delete.action")
    @ResponseBody
    public String deleteCheckgroupperson(int gropersonid){
        return checkgrouppersonService.deleteByPrimaryKey(gropersonid)==true?"success":"false";
    }

    /*
    更新一条检查小组成员信息
     */
    @RequestMapping("update.action")
    @ResponseBody
    public String updateCheckgroupperson(int gropersonid){
        Checkgroupperson checkgroupperson = new Checkgroupperson();
        checkgroupperson.setGropersonid(gropersonid);
        String result =  checkgrouppersonService.updateByPrimaryKey(checkgroupperson)==true?"success":"false";
        return result;
    }

    /*
    查询一条检查小组成员信息
     */
    @RequestMapping("selectOne.action")
    public Checkgroupperson selectOneCheckgroupperson(int gropersonid){
        Checkgroupperson checkgroupperson = checkgrouppersonService.selectByPrimaryKey(gropersonid);
        return checkgroupperson;
    }

    /*
    通过条件查询小组成员（测试成功）
     */
    @RequestMapping("selectList.action")
    public ModelAndView selectCheckgrouppersonList(Checkgroupperson checkgroupperson){
        //假数据
        checkgroupperson.setGropersonid(1);
        checkgroupperson.setGroupid("1");
        checkgroupperson.setTeacherid("1");
        checkgroupperson.setTeachername("呜呜");
        checkgroupperson.setGrouprole("1");
        checkgroupperson.setRemark("1");
        //假数据
        CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
        CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
        criteria.andTeacheridEqualTo(checkgroupperson.getTeacherid());
        criteria.andTeachernameEqualTo(checkgroupperson.getTeachername());
        List<Checkgroupperson> checkgrouppersonList = checkgrouppersonService.selectByExample(checkgrouppersonExample);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("checkgrouppersonList",checkgrouppersonList);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}