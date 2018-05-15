package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.mapper.trainScheme.TCourseBaseInfoMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.TCourseBaseInfoCustomMapper;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * CourseBaseInfoService实现类
 */
@Service//service层
@Transactional
@SuppressWarnings("all")//压制警告
public class   CourseBaseInfoServiceImpl implements CourseBaseInfoService {
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
            courseBaseInfo.setRemark1(DefaultValue.IS_USE);
        }
        return tCourseBaseInfoMapper.insert(courseBaseInfo)>0?true:false;
    }

    @Override
    public List<String> addCourseBaseInfoBatch(List<TCourseBaseInfo> courseBaseInfos) throws SQLException {
        //1.遍历集合进行添加。
        //1.1如果已经存在相同的课程编号，将该课程的编号加到返回的集合中，用于提示哪些编号重复了
        List<String> repeatCourseNums = new ArrayList<String>();
        for(TCourseBaseInfo tCourseBaseInfo :courseBaseInfos){
            //如果课程编号为空结束本次循环开始下一次
            if(ValidateCheck.isNull(tCourseBaseInfo.getCoursenum())){
                continue;
            }
            //根据数据库是否已经存在相同的课程编号决定是否可以保存课程信息
            int result = this.getCountByCourseNum(tCourseBaseInfo.getCoursenum());
            if(result >= 1){//如果存在就不添加并保存到重复的元素集合
                repeatCourseNums.add(tCourseBaseInfo.getCoursenum());
            }else {//不存在就可以添加
                this.addCourseBaseInfo(tCourseBaseInfo);
            }
        }
        return repeatCourseNums;
    }

    @CacheEvict(value = "coursesFy",allEntries =true )//清掉分页的redis缓存
    @Override
    public boolean deleteCourseBaseInfoById(String courseId) throws SQLException {
        TCourseBaseInfo tCourseBaseInfo = new TCourseBaseInfo();
        tCourseBaseInfo.setCourseid(courseId);
        tCourseBaseInfo.setRemark1(DefaultValue.IS_NOT_USE);
        return tCourseBaseInfoMapper.updateByPrimaryKeySelective(tCourseBaseInfo)>0?true:false;
    }



//    @CacheEvict(value = {"courseBaseInfo","coursesFy"} , key = "'courseBaseInfo_'+#courseBaseInfo.courseid.toString()")//清除对应的缓存
    @CacheEvict(value = {"courseBaseInfo","coursesFy"} , allEntries = true)//清除对应的缓存
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
