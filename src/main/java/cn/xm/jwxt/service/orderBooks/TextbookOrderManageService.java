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
     * by 专业&学年&学期：学期和学年绑定。教材征订单总表，开放组合查询，根据审核状态进行审核。
     * @param findcondition
     * @return
     * @throws SQLException
     */
    public List<Textbookorderinfo> findTextbookOrder(Map findcondition)throws SQLException;

    /**
     * 详细信息：根据教研室来查询，教材基本信息表，征订单明细表，如果存在未确认将无法进行审核
     * @param roomname
     * @return
     * @throws SQLException
     */
    public List<TextbookOrder> findDetialTextbookOrder(String roomname)throws SQLException;

    /**
     * 根据教材征订单总表进行审核
     * 条件是都进行了确认，填写审核意见和意见描述，保存进入教材征订单总表最新记录，可查看。
     * @param roomname
     * @return
     * @throws SQLException
     */
    public boolean checkTextbookOrder(String roomname)throws SQLException;

    /**
     * 查看审核信息
     * @param roomname
     * @return
     * @throws SQLException
     */
    public Textbookorderinfo findCheckInfo(String roomname)throws SQLException;
}
