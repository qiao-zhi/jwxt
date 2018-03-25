package cn.xm.jwxt.mapper.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.bean.trainScheme.TrainpictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainpictureMapper {
    int countByExample(TrainpictureExample example);

    int deleteByExample(TrainpictureExample example);

    int deleteByPrimaryKey(Integer pictureid);

    int insert(Trainpicture record);

    int insertSelective(Trainpicture record);

    List<Trainpicture> selectByExample(TrainpictureExample example);

    Trainpicture selectByPrimaryKey(Integer pictureid);

    int updateByExampleSelective(@Param("record") Trainpicture record, @Param("example") TrainpictureExample example);

    int updateByExample(@Param("record") Trainpicture record, @Param("example") TrainpictureExample example);

    int updateByPrimaryKeySelective(Trainpicture record);

    int updateByPrimaryKey(Trainpicture record);
}