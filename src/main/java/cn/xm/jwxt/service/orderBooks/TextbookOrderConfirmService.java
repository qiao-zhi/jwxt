package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/3 15:09
 */
public interface TextbookOrderConfirmService {

    /**
     * by 专业&学年&学期：学期和学年绑定。
     * 教材征订总单表（所属教研室），教材基本信息表，征订单明细表，订单明细班级表
     * 开放组合查询，根据确认状态进行确认。
     * @param findconditin
     * @return
     * @throws SQLException
     */
    public List<TextbookOrder> findTextbookOrder(Map findconditin)throws SQLException;

    /**
     * 根据排课信息修改订单，保存进入最新一条教材基本信息表(最新教材）和征订单明细表
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    public boolean updateTextbookOrder(TextbookOrder textbookorder)throws SQLException;
}
