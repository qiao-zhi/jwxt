package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.mapper.trainScheme.TCourseBaseInfoMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.TCourseBaseInfoCustomMapper;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
    public int getCountByCourseNum(String courseNum) throws SQLException {
        return tCourseBaseInfoCustomMapper.getCountByCourseNum(courseNum);
    }

    @CacheEvict(value = "coursesFy",allEntries =true )//清掉分页的redis缓存
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

    @CacheEvict(value = "courseBaseInfo" , key = "'courseBaseInfo_'+#courseBaseInfo.courseid.toString()")//清除对应的缓存
    @Override
    public boolean updateCourseBaseInfoById(TCourseBaseInfo courseBaseInfo) throws SQLException {
        return tCourseBaseInfoMapper.updateByPrimaryKeySelective(courseBaseInfo)>0?true:false;
    }

    @Cacheable(value = "courseBaseInfo",key = "'courseBaseInfo_'+#courseId.toString()")//添加缓存到redis缓存中
    @Override
    public TCourseBaseInfo getCourseBaseInfoById(String courseId) throws SQLException {
        return tCourseBaseInfoMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public List<Map<String, Object>> getCourseBaseInfosByCondition(Map<String,Object> condition) throws SQLException {
        if(ValidateCheck.isNotNull((String) condition.get("credit"))){//拆分学分段,分成最小值和最大值
            String creditStr = (String) condition.get("credit");
            String[] creditStrs = creditStr.split("-");
            condition.put("startcredit",creditStrs[0]);
            condition.put("endcredit",creditStrs[1]);
        }
        return tCourseBaseInfoCustomMapper.getCourseBaseInfosByCondition(condition);
    }
}
