package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.mapper.trainScheme.custom.TraincourseCoursetypeCourseCustomMapper;
import cn.xm.jwxt.service.trainScheme.TraincourseCoursetypeCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 16:51 2018/5/16
 */
@Service
@Transactional
public class TraincourseCoursetypeCourseServiceImpl implements TraincourseCoursetypeCourseService {
    @Autowired
    private TraincourseCoursetypeCourseCustomMapper traincourseCoursetypeCourseCustomMapper;
    @Override
    public List<Map<String, Object>> getCreditCoursehourAllocateInfo(String trainSchemeId) throws SQLException {
        return traincourseCoursetypeCourseCustomMapper.getCreditCoursehourAllocateInfo(trainSchemeId);
    }

    @Override
    public List<Map<String, Object>> getCourseNatureAllocateInfoByTrainSchemeId(String courseNature, String trainSchemeId) throws SQLException {
        return traincourseCoursetypeCourseCustomMapper.getCourseNatureAllocateInfoByTrainSchemeId(courseNature,trainSchemeId);
    }

    @Override
    public List<Map<String, Object>> getSemesterStaticsInfo(String trainSchemeId) throws SQLException {
        return traincourseCoursetypeCourseCustomMapper.getSemesterStaticsInfo(trainSchemeId);
    }
}
