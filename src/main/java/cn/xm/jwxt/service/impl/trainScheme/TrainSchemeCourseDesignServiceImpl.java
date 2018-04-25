package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemecoursedesign;
import cn.xm.jwxt.service.trainScheme.TrainSchemeCourseDesignService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:41 2018/4/24
 */
public class TrainSchemeCourseDesignServiceImpl implements TrainSchemeCourseDesignService {
    @Override
    public boolean addTrainSchemeCourseDesign(List<Trainschemecoursedesign> trainSchemeCourseDesigns) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainSchemeCourseDesignById(String trainschemecoursedesignId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainSchemeCourseDesignByTrainSchemeId(String trainschemeId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTrainSchemeCourseDesignById(String trainschemeId, List<Trainschemecoursedesign> trainSchemeCourseDesigns) throws SQLException {
        return false;
    }

    @Override
    public Map<String, Object> getTrainschemecoursedesignById(String trainschemecoursedesignId) throws SQLException {
        return null;
    }

    @Override
    public List<Trainschemecoursedesign> getTrainschemecoursedesignByCondition(Map condition) throws SQLException {
        return null;
    }
}
