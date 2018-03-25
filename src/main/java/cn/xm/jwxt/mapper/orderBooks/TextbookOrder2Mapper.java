package cn.xm.jwxt.mapper.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TextbookOrder2;
import cn.xm.jwxt.bean.orderBooks.TextbookOrder2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextbookOrder2Mapper {
    int countByExample(TextbookOrder2Example example);

    int deleteByExample(TextbookOrder2Example example);

    int deleteByPrimaryKey(String orderdetailid2);

    int insert(TextbookOrder2 record);

    int insertSelective(TextbookOrder2 record);

    List<TextbookOrder2> selectByExample(TextbookOrder2Example example);

    TextbookOrder2 selectByPrimaryKey(String orderdetailid2);

    int updateByExampleSelective(@Param("record") TextbookOrder2 record, @Param("example") TextbookOrder2Example example);

    int updateByExample(@Param("record") TextbookOrder2 record, @Param("example") TextbookOrder2Example example);

    int updateByPrimaryKeySelective(TextbookOrder2 record);

    int updateByPrimaryKey(TextbookOrder2 record);
}