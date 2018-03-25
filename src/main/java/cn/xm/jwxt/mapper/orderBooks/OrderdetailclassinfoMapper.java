package cn.xm.jwxt.mapper.orderBooks;

import cn.xm.jwxt.bean.orderBooks.Orderdetailclassinfo;
import cn.xm.jwxt.bean.orderBooks.OrderdetailclassinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailclassinfoMapper {
    int countByExample(OrderdetailclassinfoExample example);

    int deleteByExample(OrderdetailclassinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orderdetailclassinfo record);

    int insertSelective(Orderdetailclassinfo record);

    List<Orderdetailclassinfo> selectByExample(OrderdetailclassinfoExample example);

    Orderdetailclassinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orderdetailclassinfo record, @Param("example") OrderdetailclassinfoExample example);

    int updateByExample(@Param("record") Orderdetailclassinfo record, @Param("example") OrderdetailclassinfoExample example);

    int updateByPrimaryKeySelective(Orderdetailclassinfo record);

    int updateByPrimaryKey(Orderdetailclassinfo record);
}