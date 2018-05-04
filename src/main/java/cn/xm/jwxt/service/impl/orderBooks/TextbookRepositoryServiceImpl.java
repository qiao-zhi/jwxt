package cn.xm.jwxt.service.impl.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.service.orderBooks.TextbookRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * TextbookRepositoryService的实现类
 */

@Service//service层
public class TextbookRepositoryServiceImpl implements TextbookRepositoryService {
    @Override
    public List<TTextbookBaseInfo> findTextbook(Map findcondition)throws SQLException {

        return null;
    }
    @Override
    public boolean addTextbook(TTextbookBaseInfo textbook)throws SQLException  {
        return false;
    }
    @Override
    public boolean updateTextbook(TTextbookBaseInfo textbook)throws SQLException {
        return false;
    }
    @Override
    public boolean deleteTextbook(String textbookid)throws SQLException {
        return false;
    }
}