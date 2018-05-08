package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.bean.trainScheme.TrainpictureExample;
import cn.xm.jwxt.mapper.trainScheme.TrainpictureMapper;
import cn.xm.jwxt.service.trainScheme.TrainPictureService;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:41 2018/4/24
 */
@Service
public class TrainPictureServiceImpl implements TrainPictureService {
    @Autowired
    private TrainpictureMapper trainpictureMapper;
    @Override
    public boolean addTrainPicture(Trainpicture trainpicture) throws SQLException {
        //1.先删除掉之前的课程结构图，重新添加数据库
        this.deleteTrainPictureByTrainSchemeId(trainpicture.getTrainningschemeid());
        //2.重新保存数据库
        return trainpictureMapper.insert(trainpicture)>0?true:false;
    }

    @Override
    public boolean deleteTrainPictureById(int trainpictureId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTrainPictureByTrainSchemeId(String trainSchemeId) throws SQLException {
        //1.查出所有的图片信息
        TrainpictureExample example = new TrainpictureExample();
        TrainpictureExample.Criteria crteria = example.createCriteria();
        crteria.andTrainningschemeidEqualTo(trainSchemeId);
        List<Trainpicture> trainpictures = trainpictureMapper.selectByExample(example);
        //2.删除磁盘文件
        if(trainpictures != null && trainpictures.size()>0){
            for(Trainpicture trainpicture:trainpictures){
                //2.1根据培养方案名称删除图片
                FileHandleUtil.deletePlainFile("path","trainPicture",trainpicture.getPicturenowname());
            }
        }
        //3.删除数据库信息
        return trainpictureMapper.deleteByExample(example)>0?true:false;
    }

    @Override
    public boolean updateTrainPictureById(Trainpicture trainpicture) throws SQLException {
        return false;
    }

    @Override
    public List<Trainpicture> getTrainPictureByTrainschemeId(String trainschemeId) throws SQLException {
        TrainpictureExample example = new TrainpictureExample();
        TrainpictureExample.Criteria crteria = example.createCriteria();
        crteria.andTrainningschemeidEqualTo(trainschemeId);
        return trainpictureMapper.selectByExample(example);
    }
}
