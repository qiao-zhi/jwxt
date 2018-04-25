package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.TextbookOrderExample;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TextbookRepositoryService {

    /**
     * 通过教材名称和课程名称查找教材，可同时查找，也可单独查找
     * @param textbook
     * @return
     * @throws SQLException
     */
    public List<TTextbookBaseInfo> findTextbook(Map textbook)throws SQLException;

    /**
     * 根据教材基本信息表添加教材
     * @param textbook
     * @return
     * @throws SQLException
     */
    public boolean addTextbook(TTextbookBaseInfo textbook)throws SQLException;

    /**
     * 根据教材基本信息表修改教材
     * @param textbook
     * @return
     * @throws SQLException
     */
    public boolean updateTextbook(TTextbookBaseInfo textbook)throws SQLException;

    /**
     * 根据教材编号删除教材
     * @param textbooknum
     * @return
     * @throws SQLException
     */
    public boolean deleteTextbook(String textbooknum)throws SQLException;
}