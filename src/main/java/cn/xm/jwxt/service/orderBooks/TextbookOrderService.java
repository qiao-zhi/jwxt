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
     * 历史订购信息：教材基本信息表&教材征订单明细表，显示历史订单信息。选择使用是进行批量使用后提交上去
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    public boolean usePreviousTextbookOrder(List<TextbookOrder> textbookorder)throws SQLException;

    /**
     * 订购教材：征订单明细表&订单明细班级表，对未订购状态的课程进行订购，未订购一定未确认，订购后保存，可修改
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    public boolean orderTextbook(TextbookOrder textbookorder)throws SQLException;

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

}
