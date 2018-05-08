package cn.xm.jwxt.service.impl.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.mapper.orderBooks.TTextbookBaseInfoMapper;
import cn.xm.jwxt.service.orderBooks.TextbookRepositoryService;

import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * TextbookRepositoryService的实现类
 */

@Service//service层
@Transactional
public class TextbookRepositoryServiceImpl implements TextbookRepositoryService {

    @Resource
    private TTextbookBaseInfoMapper textbookBaseInfoMapper;

    @Override
    public List<TTextbookBaseInfo> findTextbook(Map findcondition)throws SQLException {
        return null;
    }
    @Override
    public boolean addTextbook(TTextbookBaseInfo textbook)throws SQLException  {
        if(textbook==null){
            throw new IllegalArgumentException("教材基本信息不能为空!");
        }
        //设置主键
        textbook.setTextbookid(UUIDUtil.getUUID2());
        int count = textbookBaseInfoMapper.insertSelective(textbook);
        return count>0?true:false;
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