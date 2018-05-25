package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.TextbookorderinfoExample;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/3 14:47
 */
public interface TextbookOrderService {

    /**
     * 查看是否发现新的订购教材任务
     * @return
     * @throws SQLException
     */
    public List<Map> findNewOrderTask()throws SQLException;

    /**
     * 把新任务变为旧任务，设置总订单表中的remark1为非空
     * @return
     * @throws SQLException
     */
    public boolean updateNewOrderTasktoOld(String orderid)throws SQLException;

    /**
     * by 专业（所属教研室）&学年&学期：学期和学年绑定。教材征订单总表，开放组合查询，根据订购状态选择订购
     * @param findcondition
     * @return
     * @throws SQLException
     */
    public List<Textbookorderinfo> findTextbookOrder(Map findcondition)throws SQLException;

    /**
     * 按照所属教研室，学年，学期查看排课信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> findArrageCourseDetailInfo(Map condition)throws SQLException;

    /**
     * 用课程编号在任务安排课程表中查找所有课程
     * @return
     * @throws SQLException
     */
    public List<Map> findAllCourseByCourseCode()throws SQLException;

    /**
     * 在排课详细信息页面进行查找操作
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> findOperationInArrgeCoursePage(Map condition)throws SQLException;

    /**
     * 显示历史教材订购信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> findHistoryTextbookOrder(Map condition) throws SQLException;

    /**
     * 在总订单下生成详细订单
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    public boolean generateOrderDetail(TextbookOrder textbookorder)throws SQLException;

    /**
     * 初始化订单明细表字段isOrder和isConfirm为0（未订购）
     * @return
     * @throws SQLException
     */
    public boolean initIsOrderAndIsConfirm()throws SQLException;

    /**
     * 按照主键找到订单详细信息
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    public List<Map> findOrderDetailInfo(String orderDetailId)throws SQLException;

    /**
     * 选择订购新教材的下拉列表
     * @return
     * @throws SQLException
     */
    public List<Map> findAllNewTextbook()throws SQLException;

    /**
     * 选择订购历史教材的下拉列表
     * @return
     * @throws SQLException
     */
    public List<Map> findAllHistoryTextbook(String courseCode)throws SQLException;

    /**
     * 改变总订单的订购状态
     * @param orderid
     * @return
     * @throws SQLException
     */
    public boolean updateOrderStatus(String orderid) throws SQLException;

    /**
     * 根据订单明细ID更新订单状态为已订购，并更改教材ID
     * @param condition
     * @return
     * @throws SQLException
     */
    public boolean updateOrderDetailStatus(Map condition)throws SQLException;

    /**
     * 根据订单明细ID提交订单，设置明细表的remark为1
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    public boolean commit(String orderDetailId)throws SQLException;

    /**
     * 使用历史教材
     * @param condition
     * @return
     * @throws SQLException
     */
    public int useHistoryTextbook(Map condition)throws SQLException;

}
