package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.TrainningcapacitybaseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 培养方案能力要求mapper
 */
public interface TrainningcapacitybaseinfoCustomMapper {

    /**
     * 批量添加培养方案能力
     * @param trainningcapacitybaseinfos    能力集合
     * @return  影响的行数
     * @throws SQLException
     */
    public int addTrainningcapacitybaseinfoBatch(List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos)throws SQLException;

    /**
     * 根据培养方案编号批量删除培养方案能力
     * @param trainSchemeId 培养方案编号
     * @return  影响的行数
     * @throws SQLException
     */
    public int deleteTrainningcapacityByTrainSchemeId(@Param("trainSchemeId")String trainSchemeId)throws SQLException;



}