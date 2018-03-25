package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.TrainningcapacitybaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainningcapacitybaseinfoMapper {
    int countByExample(TrainningcapacitybaseinfoExample example);

    int deleteByExample(TrainningcapacitybaseinfoExample example);

    int deleteByPrimaryKey(Integer capacityid);

    int insert(Trainningcapacitybaseinfo record);

    int insertSelective(Trainningcapacitybaseinfo record);

    List<Trainningcapacitybaseinfo> selectByExample(TrainningcapacitybaseinfoExample example);

    Trainningcapacitybaseinfo selectByPrimaryKey(Integer capacityid);

    int updateByExampleSelective(@Param("record") Trainningcapacitybaseinfo record, @Param("example") TrainningcapacitybaseinfoExample example);

    int updateByExample(@Param("record") Trainningcapacitybaseinfo record, @Param("example") TrainningcapacitybaseinfoExample example);

    int updateByPrimaryKeySelective(Trainningcapacitybaseinfo record);

    int updateByPrimaryKey(Trainningcapacitybaseinfo record);
}