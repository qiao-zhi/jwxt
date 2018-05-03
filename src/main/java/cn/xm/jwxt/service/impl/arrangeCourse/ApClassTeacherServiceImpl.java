package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacher;
import cn.xm.jwxt.service.arrangeCourse.ApClassTeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    /**
     * 根据教师课程ID批量插入班级教师信息
     *
     * @param teacherCourseId
     * @param listInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean saveClassTeacherListInfoByTeacherCourseId(String teacherCourseId, List<ApClassTeacher> listInfo) throws Exception {
        return false;
    }

    /**
     * 根据教师课程ID删除教师班级信息
     *
     * @param teacherCourseId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteClassTeacherListInfoByTeacherCourseId(String teacherCourseId) throws Exception {
        return false;
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
        return false;
    }
}
