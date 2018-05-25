package cn.xm.jwxt.service.impl.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.mapper.orderBooks.TextbookOrderMapper;
import cn.xm.jwxt.mapper.orderBooks.custom.TextbookOrderCustomMapper;
import cn.xm.jwxt.service.orderBooks.TextbookOrderConfirmService;
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
 * 创建时间：2018/5/24 18:02
 */
@Service
@Transactional
public class TextbookOrderConfirmServiceImpl implements TextbookOrderConfirmService{

    @Autowired
    private TextbookOrderMapper textbookOrderMapper;
    @Autowired
    private TextbookOrderCustomMapper textbookOrderCustomMapper;

    @Override
    public List<Map> displayTextbookOrder(Map findconditin)throws SQLException{
        return textbookOrderCustomMapper.displayTextbookOrder(findconditin);
    }

    @Override
    public boolean updateConfirmStatus(String orderDetailId) throws SQLException {
        String[] orderdetailId=orderDetailId.split(",");
        for(int i=0;i<orderdetailId.length;i++){
            textbookOrderCustomMapper.updateConfirmStatus(orderdetailId[i]);
        }
        return true;
    }

    @Override
    public boolean updateTextbookOrder(TextbookOrder textbookorder) throws SQLException {
        return false;
    }
}
