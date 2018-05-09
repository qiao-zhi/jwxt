package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;
import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourseExample;
import cn.xm.jwxt.bean.arrangeCourse.custom.ApTeacherCourseCustom;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfoExample;
import cn.xm.jwxt.mapper.arrangeCourse.ApTeacherCourseMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApTeacherCourseCustomMapper;
import cn.xm.jwxt.mapper.baseInfo.TTeacherBaseInfoMapper;
import cn.xm.jwxt.service.arrangeCourse.ApClassTeacherService;
import cn.xm.jwxt.service.arrangeCourse.ApTeacherCourseService;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师课程信息的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:20
 */
@Service
@Transactional
public class ApTeacherCourseServiceImpl implements ApTeacherCourseService {

    @Resource
    private ApTeacherCourseMapper teacherCourseMapper;
    @Resource
    private ApTeacherCourseCustomMapper teacherCourseCustomMapper;
    @Resource
    private ApClassTeacherService classTeacherService;
    @Resource
    private TTeacherBaseInfoMapper teacherBaseInfoMapper;
    /**
     * 为安排课程添加教师课程信息
     * @param arrangeCourseId
     * @param teacherCourseInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addTeacherCourseInfo(String arrangeCourseId,ApTeacherCourse teacherCourseInfo) throws Exception {
        if(ValidateCheck.isNull(arrangeCourseId)){
            throw new IllegalArgumentException("任务安排课程编号不能为空!");
        }
        if(teacherCourseInfo==null){
            throw new IllegalArgumentException("教师课程信息不能为空!");
        }
        teacherCourseInfo.setTeacherCourseId(UUIDUtil.getUUID2());
        //设置任务安排课程ID
        teacherCourseInfo.setArrangeCourseId(arrangeCourseId);
        int count = teacherCourseMapper.insertSelective(teacherCourseInfo);
        return count>0?true:false;
    }

    /**
     * 根据任务安排课程ID删除对应的教师和班级信息
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteTeacherCourseInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception {
        if(ValidateCheck.isNull(taskArrangeCourseId)){
            throw new IllegalArgumentException("任务安排课程编号不能为空!");
        }
        //先将教师班级信息删除
        List<String> ids = teacherCourseCustomMapper.findTeacherCourseIdsByTaskArrangeCourseID(taskArrangeCourseId);
        classTeacherService.deleteClassTeacherListInfoByTeacherCourseIds(ids);
        //删除对应的教师课程信息
        ApTeacherCourseExample teacherCourseExample = new ApTeacherCourseExample();
        ApTeacherCourseExample.Criteria criteria = teacherCourseExample.createCriteria();
        criteria.andArrangeCourseIdEqualTo(taskArrangeCourseId);
        int count = teacherCourseMapper.deleteByExample(teacherCourseExample);
        return count>0?true:false;
    }

    /**
     * 根据任务安排课程ID查询这门课对应的教师和班级信息
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    @Override
    public List<ApTeacherCourseCustom> findTeacherCourseCustomInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception {
        if(ValidateCheck.isNull(taskArrangeCourseId)){
            throw new IllegalArgumentException("任务安排课程编号不能为空!");
        }
        List<ApTeacherCourseCustom> listInfo = teacherCourseCustomMapper.findTeacherCourseCustomInfoByTaskArrangeCourseId(taskArrangeCourseId);
        return listInfo;
    }

    /**
     * 根据学院ID查询教师信息(在职的)
     * @param academicId
     * @return
     * @throws Exception
     */
    @Override
    public List<TTeacherBaseInfo> findTeacherBaseInfoByAcademicId(String academicId) throws Exception {
        if(ValidateCheck.isNull(academicId)){
            throw new IllegalArgumentException("学院编号不能为空!");
        }
        TTeacherBaseInfoExample teacherBaseInfoExample = new TTeacherBaseInfoExample();
        TTeacherBaseInfoExample.Criteria criteria = teacherBaseInfoExample.createCriteria();
        criteria.andCollegeidEqualTo(academicId);
        criteria.andInpositionEqualTo("1");
        List<TTeacherBaseInfo> listInfo = teacherBaseInfoMapper.selectByExample(teacherBaseInfoExample);
        return listInfo;
    }
}
