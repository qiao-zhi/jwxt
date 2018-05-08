package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;
import cn.xm.jwxt.mapper.trainScheme.TrainschemeinfoMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.TrainningcapacitybaseinfoCustomMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.TrainschemeinfoCustomMapper;
import cn.xm.jwxt.service.trainScheme.TrainschemeinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:42 2018/4/24
 */
@Service
public class TrainschemeinfoServiceImpl implements TrainschemeinfoService {
    @Autowired
    private TrainschemeinfoMapper trainschemeinfoMapper;
    @Autowired
    private TrainschemeinfoCustomMapper trainschemeinfoCustomMapper;
    @Autowired
    private TrainningcapacitybaseinfoCustomMapper trainningcapacitybaseinfoCustomMapper;
    @Override
    public List<Map<String, Object>> getMajorNameAndCode() throws SQLException {
        return trainschemeinfoCustomMapper.getMajorNameAndCode();
    }

    @Override
    public Map<String, Object> getMajorInfoByMajorCode(String majorCode) throws SQLException {
        return trainschemeinfoCustomMapper.getMajorInfoByMajorCode(majorCode);
    }

    @Override
    public boolean addTrainschemeinfo(Trainschemeinfo trainschemeinfo, List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos, Trainpicture trainpicture) throws SQLException {
        return false;
    }

    @Override
    public boolean addTrainschemeinfo(Trainschemeinfo trainschemeinfo, List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos) throws SQLException {
        //1.添加培养方案基本信息
        //如果主键为空，设置一个主键
        if(ValidateCheck.isNull(trainschemeinfo.getTrainingschemeid())){
            trainschemeinfo.setTrainingschemeid(UUIDUtil.getUUID2());//生成一个唯一的主键，添加成功后返回到前台
        }
        //设置正在使用
        if(ValidateCheck.isNull(trainschemeinfo.getIsuse())){
            trainschemeinfo.setIsuse(DefaultValue.IS_USE);
        }
        //设置默认状态是保存
        if(ValidateCheck.isNull(trainschemeinfo.getRemark1())){
            trainschemeinfo.setRemark1(DefaultValue.SAVE_STATUS);
        }

        int insert = trainschemeinfoMapper.insert(trainschemeinfo);
        //2.添加培养方案能力信息
        if(trainningcapacitybaseinfos !=null && trainningcapacitybaseinfos.size()>0){
            //2.1设置培养方案能力的培养方案主键
            for(Trainningcapacitybaseinfo tt : trainningcapacitybaseinfos){
                tt.setTrainingschemeid(trainschemeinfo.getTrainingschemeid());
            }
            int i = trainningcapacitybaseinfoCustomMapper.addTrainningcapacitybaseinfoBatch(trainningcapacitybaseinfos);
        }

        return true;
    }

    @Override
    public boolean updateTrainschemeinfo(Trainschemeinfo trainschemeinfo, List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos) throws SQLException {
        //1.修改培养方案基本信息
        //设置正在使用
        if(ValidateCheck.isNull(trainschemeinfo.getIsuse())){
            trainschemeinfo.setIsuse(DefaultValue.IS_USE);
        }
        //设置默认状态是保存
        if(ValidateCheck.isNull(trainschemeinfo.getRemark1())){
            trainschemeinfo.setRemark1(DefaultValue.SAVE_STATUS);
        }
        int i = trainschemeinfoMapper.updateByPrimaryKey(trainschemeinfo);//此方法原理是删掉重新添加
        //2.删掉培养方案能力后重新添加
        //2.1删除培养方案能力
        int i1 = trainningcapacitybaseinfoCustomMapper.deleteTrainningcapacityByTrainSchemeId(trainschemeinfo.getTrainingschemeid());
        //2.2重新添加培养方案能力
        if(trainningcapacitybaseinfos !=null && trainningcapacitybaseinfos.size()>0){
            //2.2.1设置培养方案能力的培养方案主键
            for(Trainningcapacitybaseinfo tt : trainningcapacitybaseinfos){
                tt.setTrainingschemeid(trainschemeinfo.getTrainingschemeid());
            }
            //2.2.2批量添加
            int i2 = trainningcapacitybaseinfoCustomMapper.addTrainningcapacitybaseinfoBatch(trainningcapacitybaseinfos);
        }

        return true;
    }

    @Override
    public boolean deleteTrainschemeinfoById(String trainschemeinfoId) throws SQLException {
        return trainschemeinfoCustomMapper.deleteTrainSchemeById(trainschemeinfoId)>0?true:false;
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
        return trainschemeinfoCustomMapper.getTrainschemeinfoById(trainschemeinfoId);
    }

    @Override
    public List<Map<String, Object>> getTrainschemeinfoByCondition(Map<String, Object> condition) throws SQLException {
        return trainschemeinfoCustomMapper.getTrainschemeinfoByCondition(condition);
    }
}
