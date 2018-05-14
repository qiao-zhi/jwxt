package cn.xm.jwxt.service.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TextbookRepositoryService {

    /**
     * 根据教材ID查找教材
     * @param textbookId
     * @return
     * @throws SQLException
     */
    public TTextbookBaseInfo findTextbookByTextbookId(String textbookId)throws SQLException;

    /**
     * by 教材名称&课程名称：一本教材对应一门课程，一门课程对应多本教材
     * @param findcondition
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> findTextbook(Map findcondition)throws SQLException;

    /**
     * 从课程基本信息表查找所有课程
     * @return
     * @throws SQLException
     */
    public List<Map> findAllCourse()throws SQLException;

    /**
     * 根据教材编号查找教材总数，判断是否存在相同编号的教材
     * @param textbookNum
     * @return
     * @throws SQLException
     */
    public int getCountByTextbookNum(String textbookNum)throws SQLException;

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
