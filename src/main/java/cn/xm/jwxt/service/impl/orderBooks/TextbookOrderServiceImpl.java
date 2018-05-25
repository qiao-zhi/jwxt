package cn.xm.jwxt.service.impl.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.mapper.orderBooks.TextbookOrderMapper;
import cn.xm.jwxt.mapper.orderBooks.TextbookorderinfoMapper;
import cn.xm.jwxt.mapper.orderBooks.custom.TextbookOrderCustomMapper;
import cn.xm.jwxt.service.orderBooks.TextbookOrderService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：TextbookOrderService的实现类
 * 创建人：yy
 * 创建时间：2018/5/15 20:35
 */

@Service
@Transactional
public class TextbookOrderServiceImpl implements TextbookOrderService{

    @Autowired
    private TextbookorderinfoMapper textbookorderinfoMapper;
    @Autowired
    private TextbookOrderMapper textbookOrderMapper;
    @Autowired
    private TextbookOrderCustomMapper textbookOrderCustomMapper;

    @Override
    public List<Map> findAllCourseByCourseCode()throws SQLException{
        return textbookOrderCustomMapper.findAllCourseByCourseCode();
    }

    @Override
    public List<Map> findNewOrderTask()throws SQLException{
        return textbookOrderCustomMapper.findNewOrderTask();
    }

    @Override
    public boolean updateNewOrderTasktoOld(String orderid)throws SQLException{
        Textbookorderinfo textbookorderinfo=new Textbookorderinfo();
        textbookorderinfo.setOrderid(Integer.valueOf(orderid));
        textbookorderinfo.setRemark1("已接收该总订单");
        return textbookorderinfoMapper.updateByPrimaryKeySelective(textbookorderinfo)>0?true:false;
    }

    @Override
    public List<Textbookorderinfo> findTextbookOrder(Map findcondition)throws SQLException{
        return textbookOrderCustomMapper.findTextbookOrder(findcondition);
    }

    @Override
    public List<Map> findArrageCourseDetailInfo(Map condition)throws SQLException{
        return textbookOrderCustomMapper.findArrageCourseDetailInfo(condition);
    }

    @Override
    public List<Map> findOperationInArrgeCoursePage(Map condition)throws SQLException{
        return textbookOrderCustomMapper.findOperationInArrgeCoursePage(condition);
    }

    @Override
    public List<Map> findOrderDetailInfo(String orderDetailId)throws SQLException{
        return textbookOrderCustomMapper.findOrderDetailInfo(orderDetailId);
    }

    @Override
    public boolean generateOrderDetail(TextbookOrder textbookorder)throws SQLException{
        if(textbookorder==null) {
            throw new IllegalArgumentException("订单明细信息不能为空!");
        }
        int count = textbookOrderCustomMapper.generateOrderDetail(textbookorder);

        return count>0?true:false;
    }

    @Override
    public boolean initIsOrderAndIsConfirm()throws SQLException{
        return textbookOrderCustomMapper.initIsOrderAndIsConfirm()>0?true:false;
    }

    @Override
    public List<Map> findHistoryTextbookOrder(Map condition) throws SQLException{
        return textbookOrderCustomMapper.findHistoryTextbookOrder(condition);
    }

    @Override
    public List<Map> findAllNewTextbook()throws SQLException{
        return textbookOrderCustomMapper.findAllNewTextbook();
    }

    @Override
    public List<Map> findAllHistoryTextbook(String courseCode)throws SQLException{
        return textbookOrderCustomMapper.findAllHistoryTextbook(courseCode);
    }

    @Override
    public boolean updateOrderStatus(String orderid) throws SQLException {
        return textbookOrderCustomMapper.updateOrderStatus(orderid);
    }

    @Override
    public boolean updateOrderDetailStatus(Map condition)throws SQLException{
        return textbookOrderCustomMapper.updateOrderDetailStatus(condition);
    }

    @Override
    public boolean commit(String orderDetailId)throws SQLException{
        return textbookOrderCustomMapper.commit(orderDetailId);
    }

    @Override
    public int useHistoryTextbook(Map condition) throws SQLException {
        //1.先从Map取出四个参数
        String nowOrderid= (String) condition.get("nowOrderid");
        String course_code= (String) condition.get("course_code");
        String textbookid= (String) condition.get("textbookid");
        String ordernum= (String) condition.get("ordernum");
        //2.按，分割成数组
        String[] course_codes=course_code.split(",");
        String[] textbookids=textbookid.split(",");
        String [] ordernums=ordernum.split(",");
        //3.遍历数组，循环修改
        System.out.println(course_code);
        for(int i=0;i<course_codes.length;i++){
            textbookOrderCustomMapper.useHistoryTextbook(course_codes[i],textbookids[i],Integer.valueOf(ordernums[i]),nowOrderid);
        }
        return 0;
    }

}
