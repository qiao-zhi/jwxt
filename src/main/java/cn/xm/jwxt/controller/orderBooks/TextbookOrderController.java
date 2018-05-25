package cn.xm.jwxt.controller.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.controller.arrangeCourse.ApTaskNoticeBaseInfoController;
import cn.xm.jwxt.mapper.orderBooks.TextbookorderinfoMapper;
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
@SuppressWarnings("all")//压制警告
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
     * 按照主键找到订单详细信息
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    @RequestMapping("/findOrderDetailInfo")
    public @ResponseBody List<Map> findOrderDetailInfo(String orderDetailId){
        List<Map> orderDetailInfo=null;
        try {
            orderDetailInfo=textbookOrderService.findOrderDetailInfo(orderDetailId);
        } catch (SQLException e) {
            logger.error("查找订单详细信息失败",e);
        }
        return orderDetailInfo;
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

    /**
     * 选择订购新教材的下拉列表
     * @return
     * @throws SQLException
     */
    @RequestMapping("/findAllNewTextbook")
    public @ResponseBody List<Map> findAllNewTextbook(){
        List<Map> allNewTextbook = null;
        try {
            allNewTextbook = textbookOrderService.findAllNewTextbook();
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  allNewTextbook;
    }

    /**
     * 选择订购历史教材的下拉列表
     * @return
     * @throws SQLException
     */
    @RequestMapping("/findAllHistoryTextbook")
    public @ResponseBody List<Map> findAllHistoryTextbook(String courseCode){
        List<Map> allHistoryTextbook = null;
        try {
            allHistoryTextbook = textbookOrderService.findAllHistoryTextbook(courseCode);
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  allHistoryTextbook;
    }

    /**
     * 根据订单明细ID更新订单状态为已订购，并更改教材ID
     * @param condition
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateOrderDetailStatus")
    public @ResponseBody String updateOrderDetailStatus(@RequestParam Map condition){//Map类型要有注解@RequestParam
        String result=null;
        try{
            result=textbookOrderService.updateOrderDetailStatus(condition)?"订购成功":"订购失败";
        }
        catch (SQLException e){
            result="订购失败";
            logger.error( "订购教材失败",e);
        }
        return result;
    }

    /**
     * 根据订单明细ID提交订单，设置明细表的remark为1
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    @RequestMapping("/commit")
    public @ResponseBody String commit(String orderDetailId){
        String result=null;
        try{
            result=textbookOrderService.commit(orderDetailId)?"提交成功":"提交失败";
        }
        catch (SQLException e){
            result="提交失败";
            logger.error( "提交订单失败",e);
        }
        return result;
    }

//    @RequestMapping("/xxxxx")
//    public @ResponseBody List<Map> getXXX(@RequestParam(defaultValue = "0,0") String orderids){
//        String[] split = orderids.split(",");
//        System.out.println(split);
//        return null;
//    }

    /**
     * 显示历史教材订购信息
     * @param condition
     * @return
     * @throws SQLException
     */
    @RequestMapping("/findHistoryTextbookOrder")
    public @ResponseBody PageInfo<Map/*泛型与service的返回类型对应*/> findHistoryTextbookOrder(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
        int pageSize=DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize")/*get（）根据键得到值*/)){
            pageSize=Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum=1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum=Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"CONVERT (course_name USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共6条
        List<Map> findHistoryTextbookOrder = null;
        try {
            findHistoryTextbookOrder=textbookOrderService.findHistoryTextbookOrder(condition);
        } catch (SQLException e) {
            logger.error("查找失败",e);
        }
        PageInfo<Map> pageInfo = new PageInfo<Map>(findHistoryTextbookOrder);
        return pageInfo;
    }

    @RequestMapping("/useHistoryTextbook")
    public @ResponseBody String useHistoryTextbook(@RequestParam Map condition){
        String result=null;
        try{
            result=textbookOrderService.useHistoryTextbook(condition)==0?"使用成功":"使用失败";
        }
        catch (SQLException e){
            result="使用失败";
            logger.error( "使用历史教材失败",e);
        }
        return result;
    }

    /**
     * 改变总订单的订购状态
     * @param orderid
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateOrderStatus")
    public @ResponseBody String updateOrderStatus(String orderid){
        String result=null;
        try{
            result=textbookOrderService.updateOrderStatus(orderid)?"更新成功":"更新失败";
        }
        catch (SQLException e){
            result="更新失败";
            logger.error( "更新总订单状态失败",e);
        }
        return result;
    }

    }


