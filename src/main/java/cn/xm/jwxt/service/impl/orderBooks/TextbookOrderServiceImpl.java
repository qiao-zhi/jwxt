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
    public boolean usePreviousTextbookOrder(List<TextbookOrder> textbookorder)throws SQLException{
        return  false;
    }

    @Override
    public boolean orderTextbook(TextbookOrder textbookorder)throws SQLException{
        return false;
    }

}
