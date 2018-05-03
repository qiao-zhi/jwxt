package cn.xm.jwxt.mapper.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignInfoArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignInfoArrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoursedesignInfoArrangeMapper {
    int countByExample(TCoursedesignInfoArrangeExample example);

    int deleteByExample(TCoursedesignInfoArrangeExample example);

    int deleteByPrimaryKey(String coursedesignarrangeid);

    int insert(TCoursedesignInfoArrange record);

    int insertSelective(TCoursedesignInfoArrange record);

    List<TCoursedesignInfoArrange> selectByExample(TCoursedesignInfoArrangeExample example);

    TCoursedesignInfoArrange selectByPrimaryKey(String coursedesignarrangeid);

    int updateByExampleSelective(@Param("record") TCoursedesignInfoArrange record, @Param("example") TCoursedesignInfoArrangeExample example);

    int updateByExample(@Param("record") TCoursedesignInfoArrange record, @Param("example") TCoursedesignInfoArrangeExample example);

    int updateByPrimaryKeySelective(TCoursedesignInfoArrange record);

    int updateByPrimaryKey(TCoursedesignInfoArrange record);
}