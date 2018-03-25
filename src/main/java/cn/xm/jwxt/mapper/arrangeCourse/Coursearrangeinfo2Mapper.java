package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.Coursearrangeinfo2;
import cn.xm.jwxt.bean.arrangeCourse.Coursearrangeinfo2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Coursearrangeinfo2Mapper {
    int countByExample(Coursearrangeinfo2Example example);

    int deleteByExample(Coursearrangeinfo2Example example);

    int deleteByPrimaryKey(Integer arrangeoutid);

    int insert(Coursearrangeinfo2 record);

    int insertSelective(Coursearrangeinfo2 record);

    List<Coursearrangeinfo2> selectByExample(Coursearrangeinfo2Example example);

    Coursearrangeinfo2 selectByPrimaryKey(Integer arrangeoutid);

    int updateByExampleSelective(@Param("record") Coursearrangeinfo2 record, @Param("example") Coursearrangeinfo2Example example);

    int updateByExample(@Param("record") Coursearrangeinfo2 record, @Param("example") Coursearrangeinfo2Example example);

    int updateByPrimaryKeySelective(Coursearrangeinfo2 record);

    int updateByPrimaryKey(Coursearrangeinfo2 record);
}