package cn.xm.jwxt.service.impl.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.mapper.orderBooks.TTextbookBaseInfoMapper;
import cn.xm.jwxt.mapper.orderBooks.custom.TTextbookBaseInfoCustomMapper;
import cn.xm.jwxt.service.orderBooks.TextbookRepositoryService;

import cn.xm.jwxt.utils.DefaultValue;
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

    @Autowired
    private TTextbookBaseInfoMapper tTextbookBaseInfoMapper;
    @Autowired
    private TTextbookBaseInfoCustomMapper tTextbookBaseInfoCustomMapper;
//    @Autowired
//    private  TTextbookBaseInfo tTextbookBaseInfo;//实体类上没有@Service，所以应该用new创建

    @Override
    public TTextbookBaseInfo findTextbookByTextbookId(String textbookId)throws SQLException{
        return tTextbookBaseInfoMapper.selectByPrimaryKey(textbookId);
    }

    @Override
    public List<Map<String,Object>> findTextbook(Map findcondition)throws SQLException {
        return tTextbookBaseInfoCustomMapper.findTextbook(findcondition);
    }

    @Override
    public List<Map> findAllCourse() throws SQLException {
        return tTextbookBaseInfoCustomMapper.findAllCourse();
    }

    @Override
    public int getCountByTextbookNum(String textbookNum)throws SQLException{
        return tTextbookBaseInfoCustomMapper.getCountByTextbookNum(textbookNum);
    }

    @Override
    public boolean addTextbook(TTextbookBaseInfo textbook)throws SQLException  {
        if(textbook==null){
            throw new IllegalArgumentException("教材基本信息不能为空!");
        }
        //设置主键
        textbook.setTextbookid(UUIDUtil.getUUID2());
        textbook.setRemark(DefaultValue.IS_USE);
        int count = tTextbookBaseInfoMapper.insertSelective(textbook);
        return count>0?true:false;
    }

    @Override
    public boolean updateTextbook(TTextbookBaseInfo textbook)throws SQLException {
        return tTextbookBaseInfoMapper.updateByPrimaryKeySelective(textbook)>0?true:false;
    }

    @Override
    public boolean deleteTextbook(String textbookId)throws SQLException {
        TTextbookBaseInfo tTextbookBaseInfo=new TTextbookBaseInfo();
        tTextbookBaseInfo.setTextbookid(textbookId);
        tTextbookBaseInfo.setRemark(DefaultValue.IS_NOT_USE);
        return tTextbookBaseInfoMapper.updateByPrimaryKeySelective(tTextbookBaseInfo)>0?true:false;
    }
}