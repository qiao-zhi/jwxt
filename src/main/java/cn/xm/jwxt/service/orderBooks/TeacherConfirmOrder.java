package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.arrangeCourse.Coursearrangementbaseinfo;
import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TeacherConfirmOrder {

    /**
     * 查询：by 专业&学年&学期：学期和学年绑定
     * @param textbook
     * @return
     * @throws SQLException
     */
    public List<TTextbookBaseInfo> findTextbookOrder(Map textbook)throws SQLException;

    /**
     * 确认：教师确认订单
     * @param textbook
     * @return
     * @throws SQLException
     */
    public boolean cinfirmTextbookOrder(TTextbookBaseInfo textbook)throws SQLException;

    /**
     * 修改：根据排课信息修改订单
     * @param course
     * @return
     * @throws SQLException
     */
    public boolean updateTextbookOrder(Coursearrangementbaseinfo course)throws SQLException;
}

