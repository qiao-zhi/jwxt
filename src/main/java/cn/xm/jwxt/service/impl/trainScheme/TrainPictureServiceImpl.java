package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.service.trainScheme.TrainPictureService;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:41 2018/4/24
 */
public class TrainPictureServiceImpl implements TrainPictureService {
    @Override
    public boolean addTrainPicture(Trainpicture trainpicture) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainPictureById(int trainpictureId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTrainPictureById(Trainpicture trainpicture) throws SQLException {
        return false;
    }

    @Override
    public List<Trainpicture> getTrainPictureByTrainschemeId(String trainschemeId) throws SQLException {
        return null;
    }
}
