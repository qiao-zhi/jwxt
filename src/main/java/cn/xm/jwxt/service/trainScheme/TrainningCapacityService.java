package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * 培养方案毕业生能力表service
 * @Author: qlq
 * @Description
 * @Date: 14:05 2018/4/3
 */
@SuppressWarnings("all")
public interface TrainningCapacityService {
    /**
     * 批量增加培养方案能力信息基本信息(添加完培养方案基本信息后增加这个)
     * @param trainningcapacitybaseinfo 培养方案能力信息集合
     * @return
     * @throws SQLException
     */
    public boolean addTrainningCapacity(List<Trainningcapacitybaseinfo> trainningcapacitybaseinfo)throws SQLException;

    /**
     * 删除培养方案能力(根据培养方案编号删除)
     * @param trainschemeinfoId 培养方案编号
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainningCapacityById(String trainschemeinfoId)throws SQLException;

    /**
     * 根据培养方案编号修改培养方案能力(1.根据培养方案编号删除能力。2.重新添加能力)
     * @param trainningcapacitybaseinfo
     * @return
     * @throws SQLException
     */
    public boolean updateTrainningCapacityByTrainschemeinfoId(String  trainschemeinfoId,List<Trainningcapacitybaseinfo> trainningcapacitybaseinfo)throws SQLException;

    /**
     * 根据培养方案编号查询培养方案能力(用于显示到大表格中)
     * @param trainningcapacitybaseinfoId
     * @return  一个培养方案对应的能力集合
     * @throws SQLException
     */
    public List<Trainningcapacitybaseinfo> getTrainningCapacityByTrainschemeinfoId(String  trainschemeinfoId)throws SQLException;
}
