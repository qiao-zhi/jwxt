package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TextbookRepositoryService {

    /**
     * by 教材名称&课程名称：一本教材对应一门课程，一门课程对应多本教材
     * @param findcondition
     * @return
     * @throws SQLException
     */
    public List<TTextbookBaseInfo> findTextbook(Map findcondition)throws SQLException;

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
     * 根据教材ID删除
     * @param textbookid
     * @return
     * @throws SQLException
     */
    public boolean deleteTextbook(String textbookid)throws SQLException;
}
