package cn.xm.jwxt.controller.orderBooks;

import cn.xm.jwxt.aspect.LogAspect;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.controller.arrangeCourse.ApTaskNoticeBaseInfoController;
import cn.xm.jwxt.service.orderBooks.TextbookOrderConfirmService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/23 22:21
 */
@RestController//包括了@Controller,@ResponseBody的功能
@SuppressWarnings("all")//压制警告
@RequestMapping("/TextbookOrderConfirm")
public class TextbookOrderConfirmController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ApTaskNoticeBaseInfoController.class);

    @Autowired
    private TextbookOrderConfirmService textbookOrderConfirmService;

    /**
     * 获取登录ID
     * @return
     */
    @RequestMapping("/getUsercode")
    public String usercode(){
        //获取request与session
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession(false);
        //获取request与session中的东西保存到日志中
        //String ip = LogAspect.getIpAddress(request);//获取发出请求的IP地址
        User user = (User) session.getAttribute("userinfo");//获取session中的user对象进而获取操作人名字
        return user.getUsercode();
    }

    /**
     * 在教师确认页面显示订单信息
     * @param condition
     * @return
     */
    @RequestMapping("/displayTextbookOrder")
    public PageInfo<Map/*泛型与service的返回类型对应*/> displayTextbookOrder(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
        int pageSize= DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize")/*get（）根据键得到值*/)){
            pageSize=Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum=1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum=Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"CONVERT (textbookName USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共6条
        List<Map> textbookOrder = null;
        try {
            textbookOrder=textbookOrderConfirmService.displayTextbookOrder(condition);
        } catch (SQLException e) {
            logger.error("查找失败",e);
        }
        PageInfo<Map> pageInfo = new PageInfo<Map>(textbookOrder);
        return pageInfo;
    }

    /**
     * 修改确认状态
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateConfirmStatus")
    public String updateConfirmStatus(String orderDetailId){
        String result=null;
        try{
            result=textbookOrderConfirmService.updateConfirmStatus(orderDetailId)?"确认成功":"确认失败";
        }
        catch (SQLException e){
            result="确认失败";
            logger.error( "确认失败",e);
        }
        return result;
    }

}
