package cn.xm.jwxt.mapper.orderBooks.custom;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：
 * 创建人：yy
 * 创建时间：2018/5/10 10:11
 */
public interface TTextbookBaseInfoCustomMapper {

    /**
     * 据教材编号查找教材总数，判断是否存在相同编号的教材
     * @param textbookNum
     * @return 查找到的教材总数
     * @throws SQLException
     */
    @Select("select count(textbookID) from t_textbook_base_info where textbookNUM=#{textbookNum}")
    public int getCountByTextbookNum(@Param("textbookNum") String textbookNum)throws SQLException;

    @Select(("select courseId,courseNameCN from t_course_base_info order by CONVERT(courseNameCN USING gbk)"))
    public List<Map> findAllCourse();
}
