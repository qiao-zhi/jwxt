package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.bean.trainScheme.Coursecapacityrequireinfo;
import cn.xm.jwxt.bean.trainScheme.CoursecapacityrequireinfoExample;
import cn.xm.jwxt.mapper.trainScheme.CoursecapacityrequireinfoMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.CoursecapacityrequireinfoCustomMapper;
import cn.xm.jwxt.service.trainScheme.CourseCapacityRequireInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:38 2018/4/24
 */
@Service
@Transactional
public class CourseCapacityRequireInfoServiceImpl implements CourseCapacityRequireInfoService {
    @Autowired
    private CoursecapacityrequireinfoCustomMapper coursecapacityrequireinfoCustomMapper;
    @Autowired
    private CoursecapacityrequireinfoMapper coursecapacityrequireinfoMapper;
    @MyLogAnnotation(operateDescription = "批量添加课程能力")
    @Override
    public boolean addCoursecapacityrequireinfoBatch(List<Coursecapacityrequireinfo> coursecapacityrequireinfos,List<Integer> trainCourseIds) throws SQLException {
        //1.根据培养方案课程编号删除培养方案能力
        if(trainCourseIds != null && trainCourseIds.size()>0){
            coursecapacityrequireinfoCustomMapper.deleteCoursecapacitByTrainCourseId(trainCourseIds);
        }
        //2.重新添加
        return coursecapacityrequireinfoCustomMapper.addCoursecapacitBatch(coursecapacityrequireinfos)>0?true:false;
    }

    @Override
    public boolean addCoursecapacityrequireinfo() throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCoursecapacitysByTrainSchemeId(String trainSchemeId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCourseCapacityByTrainCourseId(int trainCourseId) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCourseCapacityByCourseCapacityId(int courseCapacityId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseCapacityByTrainSchemeId(String trainSchemeId, List<Coursecapacityrequireinfo> coursecapacityrequireinfos) throws SQLException {
        return false;
    }

    @Override
    public List<Coursecapacityrequireinfo> getCourseCapacityByTrainSchemeId(String trainSchemeId) throws SQLException {
        CoursecapacityrequireinfoExample example = new CoursecapacityrequireinfoExample();
        CoursecapacityrequireinfoExample.Criteria criteria = example.createCriteria();
        criteria.andTrainningschemeidEqualTo(trainSchemeId);
        return coursecapacityrequireinfoMapper.selectByExample(example);
    }

    @Override
    public List<Coursecapacityrequireinfo> getTrainCourseCapacityByTrainCourseIds(List<Integer> trainCourseIds) throws SQLException {
        return coursecapacityrequireinfoCustomMapper.getTrainCourseCapacityByTrainCourseIds(trainCourseIds);
    }

    @Override
    public List<Map<String, Object>> getCapacityByTrainCourseId(Integer trainCourseId) throws SQLException {
        return coursecapacityrequireinfoCustomMapper.getCapacityByTrainCourseId(trainCourseId);
    }
}
