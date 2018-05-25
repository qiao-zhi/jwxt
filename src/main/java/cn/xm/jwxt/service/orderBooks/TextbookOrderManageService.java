package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.bean.orderBooks.TextbookOrder;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/3 15:41
 */
public interface TextbookOrderManageService {

    /**
     * 判断总订单是否全部确认
     * @param orderid
     * @return
     * @throws SQLException
     */
    public List<Map> isALLConfirm(String orderid)throws SQLException;

    /**
     * 查看总订单信息
     * @param orderid
     * @return
     * @throws SQLException
     */
    public List<Map> displayOrderInfo(String orderid)throws SQLException;

    /**
     * 更新审核意见
     * @param condition
     * @return
     * @throws SQLException
     */
    public boolean updateCheckProposal(Map condition)throws SQLException;

    /**
     * 在订单管理页面查看订单详细信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> displayOrderDetailInfo(Map condition)throws SQLException;
}
