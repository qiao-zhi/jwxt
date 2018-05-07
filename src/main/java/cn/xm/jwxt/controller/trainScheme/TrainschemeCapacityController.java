package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.service.trainScheme.TrainningCapacityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;


/**
 * @Author: qlq
 * @Description 培养方案能力Controller
 * @Date: 22:39 2018/5/3
 */
@RestController
@RequestMapping("/TrainSchemeCapacity")
public class TrainschemeCapacityController {

    private Logger logger = Logger.getLogger(TrainschemeCapacityController.class);//日志记录器
    @Autowired
    private TrainningCapacityService trainningCapacityService;

    @RequestMapping("/getCapacitysByTrainId")
    public List<Trainningcapacitybaseinfo> getCapacitybaseinfosByTrainSchemeId(@RequestParam(defaultValue = "1")String trainSchemeId){
        List<Trainningcapacitybaseinfo> trainningCapacitys = null;
        try {
            trainningCapacitys = trainningCapacityService.getTrainningCapacityByTrainschemeinfoId(trainSchemeId);
        } catch (SQLException e) {
            logger.error("根据培养方案编号查询能力出错",e);
        }
        return trainningCapacitys;
    }



}
