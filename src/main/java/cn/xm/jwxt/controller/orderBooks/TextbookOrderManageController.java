package cn.xm.jwxt.controller.orderBooks;

import cn.xm.jwxt.controller.arrangeCourse.ApTaskNoticeBaseInfoController;
import cn.xm.jwxt.service.orderBooks.TextbookOrderManageService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/25 8:53
 */
@RestController//包括了@Controller,@ResponseBody的功能
@SuppressWarnings("all")//压制警告
@RequestMapping("/TextbookOrderManage")
public class TextbookOrderManageController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ApTaskNoticeBaseInfoController.class);

    @Autowired
    private TextbookOrderManageService textbookOrderManageService;

    /**
     * 判断总订单是否全部确认
     * @param orderid
     * @return
     * @throws SQLException
     */
    @RequestMapping("/isALLConfirm")
    public List<Map> isALLConfirm(String orderid){
        List<Map> orderDetailInfo=null;
        try {
            orderDetailInfo = textbookOrderManageService.isALLConfirm(orderid);
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  orderDetailInfo;
    }

    /**
     * 查询总订单信息
     * @param orderid
     * @return
     * @throws SQLException
     */
    @RequestMapping("/displayOrderInfo")
    public List<Map> displayOrderInfo(String orderid){
        List<Map> textbookOrderInfo=null;
        try {
            textbookOrderInfo = textbookOrderManageService.displayOrderInfo(orderid);
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  textbookOrderInfo;
    }

    /**
     * 更新审核意见
     * @param condition
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateCheckProposal")
    public String updateCheckProposal(@RequestParam Map condition){
        String result=null;
        try{
            result=textbookOrderManageService.updateCheckProposal(condition)?"更新成功":"更新失败";
        }
        catch (SQLException e){
            result="更新失败";
            logger.error( "更新失败",e);
        }
        return result;
    }

    /**
     * 在订单管理页面查看订单详细信息
     * @param condition
     * @return
     */
    @RequestMapping("/displayOrderDetailInfo")
    public PageInfo<Map/*泛型与service的返回类型对应*/> displayOrderDetailInfo(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
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
            textbookOrder=textbookOrderManageService.displayOrderDetailInfo(condition);
        } catch (SQLException e) {
            logger.error("查找失败",e);
        }
        PageInfo<Map> pageInfo = new PageInfo<Map>(textbookOrder);
        return pageInfo;
    }

    /**
     * 审核不通过时更新总订单订购状态为未订购
     * @param orderid
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateOrderIsOrder")
    public String updateOrderIsOrder(String orderid){
        String result=null;
        try{
            result=textbookOrderManageService.updateOrderIsOrder(orderid)?"更新成功":"更新失败";
        }
        catch (SQLException e){
            result="更新失败";
            logger.error( "更新失败",e);
        }
        return result;
    }

    /**
     * 审核不通过时更新订单明细中的订购状态和确认状态
     * @param orderid
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateOrderDetailIsOrderAndIsConfirm")
    public String updateOrderDetailIsOrderAndIsConfirm(String orderid){
        String result=null;
        try{
            result=textbookOrderManageService.updateOrderDetailIsOrderAndIsConfirm(orderid)?"更新成功":"更新失败";
        }
        catch (SQLException e){
            result="更新失败";
            logger.error( "更新失败",e);
        }
        return result;
    }
}
