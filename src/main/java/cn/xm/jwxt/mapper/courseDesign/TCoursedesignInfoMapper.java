package cn.xm.jwxt.mapper.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignInfo;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoursedesignInfoMapper {
    int countByExample(TCoursedesignInfoExample example);

    int deleteByExample(TCoursedesignInfoExample example);

    int deleteByPrimaryKey(String coursedesignarrangeid);

    int insert(TCoursedesignInfo record);

    int insertSelective(TCoursedesignInfo record);

    List<TCoursedesignInfo> selectByExample(TCoursedesignInfoExample example);

    TCoursedesignInfo selectByPrimaryKey(String coursedesignarrangeid);

    int updateByExampleSelective(@Param("record") TCoursedesignInfo record, @Param("example") TCoursedesignInfoExample example);

    int updateByExample(@Param("record") TCoursedesignInfo record, @Param("example") TCoursedesignInfoExample example);

    int updateByPrimaryKeySelective(TCoursedesignInfo record);

    int updateByPrimaryKey(TCoursedesignInfo record);
}