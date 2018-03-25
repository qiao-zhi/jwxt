package cn.xm.jwxt.mapper.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTextbookBaseInfoMapper {
    int countByExample(TTextbookBaseInfoExample example);

    int deleteByExample(TTextbookBaseInfoExample example);

    int deleteByPrimaryKey(String textbookid);

    int insert(TTextbookBaseInfo record);

    int insertSelective(TTextbookBaseInfo record);

    List<TTextbookBaseInfo> selectByExample(TTextbookBaseInfoExample example);

    TTextbookBaseInfo selectByPrimaryKey(String textbookid);

    int updateByExampleSelective(@Param("record") TTextbookBaseInfo record, @Param("example") TTextbookBaseInfoExample example);

    int updateByExample(@Param("record") TTextbookBaseInfo record, @Param("example") TTextbookBaseInfoExample example);

    int updateByPrimaryKeySelective(TTextbookBaseInfo record);

    int updateByPrimaryKey(TTextbookBaseInfo record);
}