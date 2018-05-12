package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacher;
import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacherExample;
import cn.xm.jwxt.mapper.arrangeCourse.ApClassTeacherMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApClassTeacherCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApClassTeacherService;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师所带班级信息的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:19
 */
@Service
@Transactional
public class ApClassTeacherServiceImpl implements ApClassTeacherService {

    @Resource
    private ApClassTeacherCustomMapper classTeacherCustomMapper;
    @Resource
    private ApClassTeacherMapper classTeacherMapper;
    /**
     * 根据教师课程ID批量插入班级教师信息
     * @param teacherCourseId
     * @param listInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean saveClassTeacherListInfoByTeacherCourseId(String teacherCourseId, List<ApClassTeacher> listInfo) throws Exception {
        if(ValidateCheck.isNull(teacherCourseId)){
            throw new IllegalArgumentException("教师课程编号不能为空!");
        }
        if(listInfo == null || listInfo.size() <= 0){
            throw new IllegalArgumentException("班级教师信息集合参数传递错误!");
        }
        int total = listInfo.size();
        for(ApClassTeacher classTeacher:listInfo){
            classTeacher.setClassTeacherId(UUIDUtil.getUUID2());
            classTeacher.setTeacherCourseId(teacherCourseId);
        }
        int count = classTeacherCustomMapper.saveClassTeacherListInfo(listInfo);
        return count==total;
    }

    /**
     * 根据教师课程ID删除教师班级信息
     * @param teacherCourseId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteClassTeacherListInfoByTeacherCourseId(String teacherCourseId) throws Exception {
        if(ValidateCheck.isNull(teacherCourseId)){
            throw new IllegalArgumentException("教师课程编号不能为空!");
        }
        ApClassTeacherExample classTeacherExample = new ApClassTeacherExample();
        ApClassTeacherExample.Criteria criteria = classTeacherExample.createCriteria();
        criteria.andTeacherCourseIdEqualTo(teacherCourseId);
        int count = classTeacherMapper.deleteByExample(classTeacherExample);
        return count>0?true:false;
    }

    /**
     * 根据教师课程ID集合删除教师班级信息
     *
     * @param teacherCourseIds
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteClassTeacherListInfoByTeacherCourseIds(List<String> teacherCourseIds) throws Exception {
        if(teacherCourseIds == null){
            throw new IllegalArgumentException("教师课程编号不能为空!");
        }
        if(teacherCourseIds.size()<=0){
            return true;
        }
        ApClassTeacherExample classTeacherExample = new ApClassTeacherExample();
        ApClassTeacherExample.Criteria criteria = classTeacherExample.createCriteria();
        criteria.andTeacherCourseIdIn(teacherCourseIds);
        int count = classTeacherMapper.deleteByExample(classTeacherExample);
        return count>0?true:false;
    }
}
