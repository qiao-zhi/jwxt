package cn.xm.jwxt.mapper.orderBooks.custom;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/15 21:01
 */
public interface TextbookOrderCustomMapper {

    /**
     * 查看是否发现新的订购教材任务
     * @return
     * @throws SQLException
     */
    @Select("select orderid from textbookorderinfo where remark1 is null")
    public List<Map> findNewOrderTask()throws SQLException;

    /**
     * 查找总订单任务
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
    @Select("select DISTINCT course_code,course_name from ap_task_arrange_course order by CONVERT(course_name USING gbk)")
    public List<Map> findAllCourseByCourseCode()throws SQLException;

    /**
     * 在总订单下生成详细订单
     * @param textbookorder
     * @return
     * @throws SQLException
     */
    public int generateOrderDetail(TextbookOrder textbookorder)throws SQLException;

    /**
     * 初始化订单明细表字段isOrder和isConfirm为0（未订购）
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbook_order SET isOrder='0',isConfirm='0' WHERE isOrder IS NULL AND isConfirm IS NULL")
    public int initIsOrderAndIsConfirm()throws SQLException;

    /**
     * 在排课详细信息页面进行查找操作
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> findOperationInArrgeCoursePage(Map condition)throws SQLException;
}
