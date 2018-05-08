package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.TrainningcapacitybaseinfoExample;
import cn.xm.jwxt.mapper.trainScheme.TrainningcapacitybaseinfoMapper;
import cn.xm.jwxt.service.trainScheme.TrainningCapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:40 2018/4/24
 */
@Service
public class TrainningCapacityServiceImpl implements TrainningCapacityService {
   @Autowired
    private TrainningcapacitybaseinfoMapper trainningcapacitybaseinfoMapper;
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
    public List<Trainningcapacitybaseinfo> getTrainningCapacityByTrainschemeinfoId(String trainschemeinfoId) throws SQLException {
        TrainningcapacitybaseinfoExample example = new TrainningcapacitybaseinfoExample();
        TrainningcapacitybaseinfoExample.Criteria criteria = example.createCriteria();
        criteria.andTrainingschemeidEqualTo(trainschemeinfoId);
        example.setOrderByClause("SUBSTRING(capacitySort,2)+0");//按G1，G2.....排序
        return trainningcapacitybaseinfoMapper.selectByExample(example);
    }
}
