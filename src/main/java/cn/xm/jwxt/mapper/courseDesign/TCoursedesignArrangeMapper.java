package cn.xm.jwxt.mapper.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignArrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoursedesignArrangeMapper {
    int countByExample(TCoursedesignArrangeExample example);

    int deleteByExample(TCoursedesignArrangeExample example);

    int deleteByPrimaryKey(String coursedesignclassarrangeid);

    int insert(TCoursedesignArrange record);

    int insertSelective(TCoursedesignArrange record);

    List<TCoursedesignArrange> selectByExample(TCoursedesignArrangeExample example);

    TCoursedesignArrange selectByPrimaryKey(String coursedesignclassarrangeid);

    int updateByExampleSelective(@Param("record") TCoursedesignArrange record, @Param("example") TCoursedesignArrangeExample example);

    int updateByExample(@Param("record") TCoursedesignArrange record, @Param("example") TCoursedesignArrangeExample example);

    int updateByPrimaryKeySelective(TCoursedesignArrange record);

    int updateByPrimaryKey(TCoursedesignArrange record);
}