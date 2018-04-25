package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;
import cn.xm.jwxt.service.trainScheme.TrainschemeinfoService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:42 2018/4/24
 */
public class TrainschemeinfoServiceImpl implements TrainschemeinfoService {
    @Override
    public List<Map<String, Object>> getMajorNameAndCode() throws SQLException {
        return null;
    }

    @Override
    public Map<String, Object> getMajorInfoByMajorCode(String majorCode) throws SQLException {
        return null;
    }

    @Override
    public boolean addTrainschemeinfo(Trainschemeinfo trainschemeinfo, List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos, Trainpicture trainpicture) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainschemeinfoById(String trainschemeinfoId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTrainschemeinfoById(Trainschemeinfo trainschemeinfo) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTrainschemeinfoStatusById(String status, String trainSchemeinfoId) throws SQLException {
        return false;
    }

    @Override
    public Map<String, Object> getTrainschemeinfoById(String trainschemeinfoId) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, Object>> getTrainschemeinfoByCondition(Map<String, Object> condition) throws SQLException {
        return null;
    }
}
