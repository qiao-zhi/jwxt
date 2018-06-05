package cn.xm.jwxt.service.impl.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.mapper.orderBooks.TextbookOrderMapper;
import cn.xm.jwxt.mapper.orderBooks.TextbookorderinfoMapper;
import cn.xm.jwxt.mapper.orderBooks.custom.TextbookOrderCustomMapper;
import cn.xm.jwxt.service.orderBooks.TextbookOrderManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/25 8:49
 */
@Service
@Transactional
public class TextbookOrderManageServiceImpl implements TextbookOrderManageService{

    @Autowired
    private TextbookorderinfoMapper textbookorderinfoMapper;
    @Autowired
    private TextbookOrderMapper textbookOrderMapper;
    @Autowired
    private TextbookOrderCustomMapper textbookOrderCustomMapper;


    @Override
    public List<Map> isALLConfirm(String orderid) throws SQLException {
        return textbookOrderCustomMapper.isALLConfirm(orderid);
    }

    @Override
    public List<Map> displayOrderInfo(String orderid) throws SQLException {
        return textbookOrderCustomMapper.displayOrderInfo(orderid);
    }

    @Override
    public boolean updateCheckProposal(Map condition) throws SQLException {
        return textbookOrderCustomMapper.updateCheckProposal(condition);
    }

    @Override
    public boolean updateOrderIsOrder(String orderid) throws SQLException {
        return textbookOrderCustomMapper.updateOrderIsOrder(orderid);
    }

    @Override
    public boolean updateOrderDetailIsOrderAndIsConfirm(String orderid) throws SQLException {
        return textbookOrderCustomMapper.updateOrderDetailIsOrderAndIsConfirm(orderid);
    }

    @Override
    public List<Map> displayOrderDetailInfo(Map condition) throws SQLException {
        return textbookOrderCustomMapper.displayOrderDetailInfo(condition);
    }
}
