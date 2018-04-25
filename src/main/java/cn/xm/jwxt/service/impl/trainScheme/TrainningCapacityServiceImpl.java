package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.service.trainScheme.TrainningCapacityService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:40 2018/4/24
 */
public class TrainningCapacityServiceImpl implements TrainningCapacityService {
    @Override
    public boolean addTrainningCapacity(List<Trainningcapacitybaseinfo> trainningcapacitybaseinfo) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainningCapacityById(String trainschemeinfoId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTrainningCapacityByTrainschemeinfoId(String trainschemeinfoId, List<Trainningcapacitybaseinfo> trainningcapacitybaseinfo) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> getTrainningCapacityByTrainschemeinfoId(String trainschemeinfoId) throws SQLException {
        return null;
    }
}
