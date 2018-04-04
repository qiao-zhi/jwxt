package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 培养方案毕业生能力表service
 * @Author: qlq
 * @Description
 * @Date: 14:05 2018/4/3
 */
public interface TrainningCapacityService {
    /**
     * 增加培养方案能力信息基本信息
     * @param trainningcapacitybaseinfo 培养方案能力信息
     * @return
     * @throws SQLException
     */
    public boolean addTrainningCapacity(Trainningcapacitybaseinfo trainningcapacitybaseinfo)throws SQLException;

    /**
     * 删除培养方案能力
     * @param trainningcapacitybaseinfoId
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainningCapacityById(int trainningcapacitybaseinfoId)throws SQLException;

    /**
     * 根据ID修改培养方案能力
     * @param trainningcapacitybaseinfo
     * @return
     * @throws SQLException
     */
    public boolean updateTrainningCapacityById(Trainningcapacitybaseinfo trainningcapacitybaseinfo)throws SQLException;

    /**
     * 根据ID查询培养方案能力
     * @param trainningcapacitybaseinfoId
     * @return
     * @throws SQLException
     */
    public Trainningcapacitybaseinfo getTrainningCapacity(int trainningcapacitybaseinfoId)throws SQLException;

    /**
     * 分页查询培养方案能力信息
     * @param condition 条件
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getTrainningCapacityInfos(Map condition)throws SQLException;

}
