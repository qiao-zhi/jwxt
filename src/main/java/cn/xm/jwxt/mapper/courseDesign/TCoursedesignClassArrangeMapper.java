package cn.xm.jwxt.mapper.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignClassArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignClassArrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoursedesignClassArrangeMapper {
    int countByExample(TCoursedesignClassArrangeExample example);

    int deleteByExample(TCoursedesignClassArrangeExample example);

    int deleteByPrimaryKey(String coursedesignclassarrangeid);

    int insert(TCoursedesignClassArrange record);

    int insertSelective(TCoursedesignClassArrange record);

    List<TCoursedesignClassArrange> selectByExample(TCoursedesignClassArrangeExample example);

    TCoursedesignClassArrange selectByPrimaryKey(String coursedesignclassarrangeid);

    int updateByExampleSelective(@Param("record") TCoursedesignClassArrange record, @Param("example") TCoursedesignClassArrangeExample example);

    int updateByExample(@Param("record") TCoursedesignClassArrange record, @Param("example") TCoursedesignClassArrangeExample example);

    int updateByPrimaryKeySelective(TCoursedesignClassArrange record);

    int updateByPrimaryKey(TCoursedesignClassArrange record);
}