package cn.xm.jwxt.mapper.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder;
import cn.xm.jwxt.bean.orderBooks.TextbookOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextbookOrderMapper {
    int countByExample(TextbookOrderExample example);

    int deleteByExample(TextbookOrderExample example);

    int deleteByPrimaryKey(String orderdetailid);

    int insert(TextbookOrder record);

    int insertSelective(TextbookOrder record);

    List<TextbookOrder> selectByExample(TextbookOrderExample example);

    TextbookOrder selectByPrimaryKey(String orderdetailid);

    int updateByExampleSelective(@Param("record") TextbookOrder record, @Param("example") TextbookOrderExample example);

    int updateByExample(@Param("record") TextbookOrder record, @Param("example") TextbookOrderExample example);

    int updateByPrimaryKeySelective(TextbookOrder record);

    int updateByPrimaryKey(TextbookOrder record);
}