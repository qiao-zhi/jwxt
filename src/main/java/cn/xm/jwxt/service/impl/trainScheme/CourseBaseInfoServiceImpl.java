package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.mapper.trainScheme.TCourseBaseInfoMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.TCourseBaseInfoCustomMapper;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * CourseBaseInfoService实现类
 */
@Service//service层
@SuppressWarnings("all")//压制警告
public class CourseBaseInfoServiceImpl implements CourseBaseInfoService {
    @Autowired
    private TCourseBaseInfoMapper tCourseBaseInfoMapper;
    @Autowired
    private TCourseBaseInfoCustomMapper tCourseBaseInfoCustomMapper;
    @Override
    public boolean addCourseBaseInfo(TCourseBaseInfo courseBaseInfo) throws SQLException {
        //如果传下来的课程信息的id为空，就用UUID生成一个ID
        if(ValidateCheck.isNull(courseBaseInfo.getCourseid())){
            courseBaseInfo.setCourseid(UUIDUtil.getUUID2());
        }
        // remark1用于标记是否正在使用，1代表正在使用，0代表已经删除。
        if(ValidateCheck.isNull(courseBaseInfo.getRemark1())){
            courseBaseInfo.setRemark1("1");
        }
        return tCourseBaseInfoMapper.insert(courseBaseInfo)>0?true:false;
    }

    @Override
    public boolean deleteCourseBaseInfoById(String courseId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseBaseInfoById(TCourseBaseInfo courseBaseInfo) throws SQLException {
        return false;
    }

    @Override
    public TCourseBaseInfo getCourseBaseInfoById(String courseId) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, Object>> getCourseBaseInfosByCondition(Map condition) throws SQLException {
        return null;
    }
}
