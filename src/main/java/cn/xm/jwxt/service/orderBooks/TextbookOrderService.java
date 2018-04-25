package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.arrangeCourse.Coursearrangementbaseinfo;
import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.bean.orderBooks.TextbookOrder;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TextbookOrderService {

    /**
     * 查询：by 专业&学年&学期：学期和学年绑定
     * @param textbook_order
     * @return
     * @throws SQLException
     */
    public List<TextbookOrder> findTextbookOrder(Map textbook_order)throws SQLException;

    /**
     * 订购：by 课程ID
     * @param courseid
     * @return
     * @throws SQLException
     */
    public boolean orderTextbookBycourseid(String courseid)throws SQLException;

    /**
     * 使用：使用历史订购教材
     * @param textbook
     * @return
     * @throws SQLException
     */
    public boolean useTextbook(TTextbookBaseInfo textbook)throws SQLException;

    /**
     * 修改：根据排课信息修改教材
     * @param course
     * @return
     * @throws SQLException
     */
    public boolean updateTextbook(Coursearrangementbaseinfo course)throws SQLException;
}
