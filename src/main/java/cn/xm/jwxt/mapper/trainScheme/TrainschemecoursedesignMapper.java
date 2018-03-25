package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemecoursedesign;
import cn.xm.jwxt.bean.trainScheme.TrainschemecoursedesignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainschemecoursedesignMapper {
    int countByExample(TrainschemecoursedesignExample example);

    int deleteByExample(TrainschemecoursedesignExample example);

    int deleteByPrimaryKey(String traincoursedesignid);

    int insert(Trainschemecoursedesign record);

    int insertSelective(Trainschemecoursedesign record);

    List<Trainschemecoursedesign> selectByExample(TrainschemecoursedesignExample example);

    Trainschemecoursedesign selectByPrimaryKey(String traincoursedesignid);

    int updateByExampleSelective(@Param("record") Trainschemecoursedesign record, @Param("example") TrainschemecoursedesignExample example);

    int updateByExample(@Param("record") Trainschemecoursedesign record, @Param("example") TrainschemecoursedesignExample example);

    int updateByPrimaryKeySelective(Trainschemecoursedesign record);

    int updateByPrimaryKey(Trainschemecoursedesign record);
}