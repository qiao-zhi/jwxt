package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursecapacityrequireinfo;
import cn.xm.jwxt.queryVo.ListVo;
import cn.xm.jwxt.service.trainScheme.CourseCapacityRequireInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @Author: qlq
 * @Description 培养方案课程能力控制器
 * @Date: 10:26 2018/5/10
 */
@RestController
@RequestMapping("/TrainCourseCapacity")
public class TrainCourseCapacityController {
    private Logger logger = Logger.getLogger(TrainCourseCapacityController.class);
    @Autowired
    private CourseCapacityRequireInfoService courseCapacityRequireInfoService ;

    /**
     * 根据培养方案课程ID集合查询培养方案课程能力集合
     * @param ids
     * @return
     */
    @RequestMapping("/getTrainCourseByTrainCourseIds")
    public List<Coursecapacityrequireinfo> getTrainCourseCapacityByTrainCourseIds(@RequestParam(defaultValue = "100000,1000000") String ids){
        String[] split = ids.split(",");//逗号分隔形成数组
        List<Integer> ids_int = new ArrayList<>();
        for(String id_str : split){
            ids_int.add(Integer.parseInt(id_str));
          }
        List<Coursecapacityrequireinfo> trainCourseCapacitys = null;
        try {
            trainCourseCapacitys  = courseCapacityRequireInfoService.getTrainCourseCapacityByTrainCourseIds(ids_int);
        } catch (SQLException e) {
            logger.error("查询培养方案课程信息出错",e);
            return null;
        }
        return trainCourseCapacitys;
    }

    /**
     * 批量添加培养方案课程能力集合
     * 1.根据培养方案课程先删除，2.重新添加
     * @param listVo    需要添加的能力集合
     * @param trainCourseIds    需要删除的能力集合
     * @return
     */
    @RequestMapping("/addTrainCapacityBatch")
    public String addTrainCapacityBatch(ListVo listVo,@RequestParam(defaultValue = "0,0") String trainCourseIds){
        if(listVo == null || listVo.getCoursecapacityrequireinfos()==null || listVo.getCoursecapacityrequireinfos().size()==0){
            return "没有数据可以添加";
        }
        String result = null;
        String[] trainCourseIds_str = trainCourseIds.split(",");
        List <Integer> trainCourseIds_int = new ArrayList<>();
        for(String id :trainCourseIds_str){
            trainCourseIds_int.add(Integer.parseInt(id));
        }
        try {
            result = courseCapacityRequireInfoService.addCoursecapacityrequireinfoBatch(listVo.getCoursecapacityrequireinfos(),trainCourseIds_int)?"添加成功":"添加失败";
        } catch (SQLException e) {
            logger.error("添加培养方案课程能力出错",e);
            return "添加失败";
        }
        return result;
    }


    @RequestMapping("/getTrainCourseCapacityByTrainCourseId")
    public List<Map<String,Object>> getTrainCourseCapacityByTrainCourseId(@RequestParam(defaultValue = "0")Integer trainCourseID){
        List<Map<String, Object>> capacityByTrainCourseId = null;
        try {
            capacityByTrainCourseId =    courseCapacityRequireInfoService.getCapacityByTrainCourseId(trainCourseID);
        } catch (SQLException e) {
            logger.error("查询培养方案课程能力集合出错",e);
            return null;
        }
        return capacityByTrainCourseId;
    }





}
