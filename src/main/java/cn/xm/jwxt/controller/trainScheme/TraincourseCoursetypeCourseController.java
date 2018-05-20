package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.service.trainScheme.TraincourseCoursetypeCourseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 用于最后培养方案大表单查询的controller
 * @Date: 16:53 2018/5/16
 */
@RestController
@RequestMapping("/trainSchemeDetail")
public class TraincourseCoursetypeCourseController {
    private Logger logger = Logger.getLogger(TraincourseCoursetypeCourseController.class);
    @Autowired
    private TraincourseCoursetypeCourseService traincourseCoursetypeCourseService;
    @RequestMapping("/getCourseCreditAllocate")
    public List<Map<String, Object>> getCreditCoursehourAllocateInfo(@RequestParam(defaultValue = "1")String trainSchemeId) {
        try {
            return traincourseCoursetypeCourseService.getCreditCoursehourAllocateInfo(trainSchemeId);
        } catch (SQLException e) {
            logger.error("查询培养方案课程统计信息出错",e);
            return null;
        }
    }

    /**
     * 根据培养方案编号与课程性质统计课程性质，用于生成第(14项)
     * @param courseNature  课程性质
     * @param trainSchemeId 培养方案编号
     * @return
     */
    @RequestMapping("/getCourseNatureAllocateInfoByTrainSchemeId")
    public List<Map<String, Object>> getCourseNatureAllocateInfoByTrainSchemeId(@RequestParam(defaultValue = "1") String courseNature,@RequestParam(defaultValue = "1") String trainSchemeId){
        try {
            return traincourseCoursetypeCourseService.getCourseNatureAllocateInfoByTrainSchemeId(courseNature,trainSchemeId);
        } catch (SQLException e) {
            logger.error("根据培养方案编号按课程性质统计信息出错",e);
            return null;
        }
    }

    @RequestMapping("/getSemesterStaticsInfo")
    public List<Map<String, Object>> getSemesterStaticsInfo(@RequestParam(defaultValue = "1")String trainSchemeId){
        try {
            return traincourseCoursetypeCourseService.getSemesterStaticsInfo(trainSchemeId);
        } catch (SQLException e) {
            logger.error("按学期查询培养方案信息出错",e);
            return null;
        }
    }

    }
