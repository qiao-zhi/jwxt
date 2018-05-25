package cn.xm.jwxt.mapper.orderBooks.custom;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import org.apache.ibatis.annotations.Param;
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
    @Select("SELECT * FROM t_textbook_base_info order by CONVERT(textbookName USING gbk)")
    public List<Map> findAllNewTextbook()throws SQLException;

    /**
     * 选择订购历史教材的下拉列表
     * @return
     * @throws SQLException
     */
    public List<Map> findAllHistoryTextbook(@Param("courseCode")String courseCode)throws SQLException;

    /**
     * 根据订单明细ID更新订单状态为已订购，并更改教材ID
     * @param condition
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbook_order SET textbookID=#{textbookId},isOrder='1',orderNum=#{textbookNum} where orderDetailID=#{orderDetailId}")
    public boolean updateOrderDetailStatus(Map condition)throws SQLException;

    /**
     * 根据订单明细ID提交订单，设置明细表的remark为1
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbook_order SET remark='1' WHERE orderDetailID=#{orderDetailId}")
    public boolean commit(String orderDetailId)throws SQLException;

    /**
     * 显示历史教材订购信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> findHistoryTextbookOrder(Map condition) throws SQLException;

    /**
     *使用历史教材
     * @param course_code
     * @param textbookid
     * @param ordernum
     * @param nowOrderid
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbook_order SET textbookID=#{textbookid},orderNum=#{ordernum},isOrder='1',remark='1' WHERE orderid=#{nowOrderid} AND courseID=#{course_code}")
    public int useHistoryTextbook(@Param("course_code") String course_code,@Param("textbookid")String textbookid,@Param("ordernum")int ordernum,@Param("nowOrderid")String nowOrderid)throws SQLException;

    /**
     * 改变总订单的订购状态
     * @param orderid
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbookorderinfo SET isOrder='1' WHERE (SELECT COUNT(isOrder) FROM textbook_order WHERE isOrder='0' AND orderid=#{orderid})=0 AND orderid=#{orderid}")
    public boolean updateOrderStatus(@Param("orderid")String orderid) throws SQLException;

    /**
     * 在教师确认页面显示订单信息
     * @param findconditin
     * @return
     * @throws SQLException
     */
    public List<Map> displayTextbookOrder(Map findconditin)throws SQLException;

    /**
     * 修改确认状态
     * @param orderDetailId
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbook_order SET isConfirm='1' WHERE orderDetailID=#{orderDetailId}")
    public boolean updateConfirmStatus(@Param("orderDetailId")String orderDetailId)throws SQLException;

    /**
     * 判断总订单是否全部确认
     * @param orderid
     * @return
     * @throws SQLException
     */
    @Select("SELECT COUNT(*)num FROM textbook_order WHERE orderid=#{orderid} AND isConfirm='0'")
    public List<Map> isALLConfirm(@Param("orderid")String orderid)throws SQLException;

    /**
     * 查看总订单信息
     * @param orderid
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM textbookorderinfo WHERE orderid=#{orderid}")
    public List<Map> displayOrderInfo(@Param("orderid")String orderid)throws SQLException;

    /**
     * 更新审核意见
     * @param condition
     * @return
     * @throws SQLException
     */
    @Update("UPDATE textbookorderinfo SET isCheck='1',checkProposal=#{checkProposal},proposalNote=#{proposalNote} WHERE orderid=#{orderid}")
    public boolean updateCheckProposal(Map condition)throws SQLException;

    /**
     * 在订单管理页面查看订单详细信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map> displayOrderDetailInfo(Map condition)throws SQLException;
}
