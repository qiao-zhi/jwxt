package cn.xm.jwxt.controller.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.controller.arrangeCourse.ApTaskNoticeBaseInfoController;
import cn.xm.jwxt.service.orderBooks.TextbookOrderService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/15 21:52
 */
@Controller
@RequestMapping("/TextbookOrder")
public class TextbookOrderController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ApTaskNoticeBaseInfoController.class);

    @Autowired
    private TextbookOrderService textbookOrderService;

    @RequestMapping("/findTextbookOrder")
    public @ResponseBody PageInfo<Textbookorderinfo/*泛型与service的返回类型对应*/> findTextbookOrder(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
        int pageSize=DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize")/*get（）根据键得到值*/)){
            pageSize=Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum=1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum=Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"CONVERT(roomName USING gbk)");//orderName数据库字段
        //上面pagehelper的设置对此查询有效，查到数据总共6条
        List<Textbookorderinfo> textbookOrder = null;
        try {
            textbookOrder=textbookOrderService.findTextbookOrder(condition);
        } catch (SQLException e) {
            logger.error("分页查询订单信息失败",e);
        }
        PageInfo<Textbookorderinfo> pageInfo = new PageInfo<Textbookorderinfo>(textbookOrder);
        return pageInfo;
    }

    @RequestMapping("/findArrageCourseDetailInfo")
    public @ResponseBody PageInfo<Map/*泛型与service的返回类型对应*/> findArrageCourseDetailInfo(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
        int pageSize=DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize")/*get（）根据键得到值*/)){
            pageSize=Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum=1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum=Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize);
        //上面pagehelper的设置对此查询有效，查到数据总共6条
        List<Map> arrageCourseDetailInfo = null;
        try {
            arrageCourseDetailInfo=textbookOrderService.findArrageCourseDetailInfo(condition);
        } catch (SQLException e) {
            logger.error("初始化排课详细信息失败",e);
        }
        PageInfo<Map> pageInfo = new PageInfo<Map>(arrageCourseDetailInfo);
        return pageInfo;
    }

    /**
     * 用课程编号在任务安排课程表中查找所有课程
     * @return
     */
    @RequestMapping("/findAllCourseByCourseCode")
    public @ResponseBody List<Map> findAllCourseByCourseCode(){
        List<Map> course = null;
        try {
            course = textbookOrderService.findAllCourseByCourseCode();
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  course;
    }

    /**
     * 查看是否发现新的订购教材任务
     * @return
     * @throws SQLException
     */
    @RequestMapping("/findNewOrderTask")
    public @ResponseBody List<Map> findNewOrderTask(){
        List<Map> remark1=null;
        try {
            remark1 = textbookOrderService.findNewOrderTask();
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  remark1;
    }

    /**
     * 在总订单下生成详细订单
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    @RequestMapping("/generateOrderDetail")
    public @ResponseBody String generateOrderDetail(TextbookOrder textbookorder){
        if(textbookorder==null)
            return "生成失败";
        try{
            textbookOrderService.generateOrderDetail(textbookorder);
        }
        catch (SQLException e){
            logger.error( "生成订单明细失败",e);
            return "生成失败";
        }
        return "生成成功";
    }

    /**
     * 初始化订单明细表字段isOrder和isConfirm为0（未订购）
     * @return
     * @throws SQLException
     */
    @RequestMapping("/initIsOrderAndIsConfirm")
    public @ResponseBody String initIsOrderAndIsConfirm(){
        String result=null;
        try{
            result=textbookOrderService.initIsOrderAndIsConfirm()?"初始化成功":"初始化失败";
        }
        catch (SQLException e){
            result="初始化失败";
            logger.error( "初始化失败",e);
        }
        return result;
    }

    /**
     * 把新任务变为旧任务，设置总订单表中的remark1为非空
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateNewOrderTasktoOld")
    public @ResponseBody String updateNewOrderTasktoOld(String orderid){
        String result=null;
        try{
            result=textbookOrderService.updateNewOrderTasktoOld(orderid)?"修改成功":"修改失败";
        }
        catch (SQLException e){
            result="修改失败";
            logger.error( "修改接收状态失败",e);
        }
        return result;
    }

    @RequestMapping("/findOperationInArrgeCoursePage")
    public @ResponseBody PageInfo<Map/*泛型与service的返回类型对应*/> findOperationInArrgeCoursePage(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
        int pageSize=DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize")/*get（）根据键得到值*/)){
            pageSize=Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum=1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum=Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize);
        //上面pagehelper的设置对此查询有效，查到数据总共6条
        List<Map> findOperationInArrgeCourse = null;
        try {
            findOperationInArrgeCourse=textbookOrderService.findOperationInArrgeCoursePage(condition);
        } catch (SQLException e) {
            logger.error("查找失败",e);
        }
        PageInfo<Map> pageInfo = new PageInfo<Map>(findOperationInArrgeCourse);
        return pageInfo;
    }

    }

