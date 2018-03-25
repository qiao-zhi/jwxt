package cn.xm.jwxt.mapper.orderBooks;

import cn.xm.jwxt.bean.orderBooks.Textbookorderinfo;
import cn.xm.jwxt.bean.orderBooks.TextbookorderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextbookorderinfoMapper {
    int countByExample(TextbookorderinfoExample example);

    int deleteByExample(TextbookorderinfoExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Textbookorderinfo record);

    int insertSelective(Textbookorderinfo record);

    List<Textbookorderinfo> selectByExample(TextbookorderinfoExample example);

    Textbookorderinfo selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Textbookorderinfo record, @Param("example") TextbookorderinfoExample example);

    int updateByExample(@Param("record") Textbookorderinfo record, @Param("example") TextbookorderinfoExample example);

    int updateByPrimaryKeySelective(Textbookorderinfo record);

    int updateByPrimaryKey(Textbookorderinfo record);
}