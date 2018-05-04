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
 * 创建时间：2018/5/3 14:47
 */
public interface TextbookOrderService {

    /**
     * by 专业（所属教研室）&学年&学期：学期和学年绑定。教材征订单总表，开放组合查询，根据订购状态选择订购
     * @param findcondition
     * @return
     * @throws SQLException
     */
    public List<Textbookorderinfo> findTextbookOrder(Map findcondition)throws SQLException;

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
     * 根据排课信息修改订单，保存进入最新一条教材基本信息表（最新教材）和征订单明细表
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    public boolean updateTextbookOrder(TextbookOrder textbookorder)throws SQLException;

}
