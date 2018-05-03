package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;
import cn.xm.jwxt.service.arrangeCourse.ApTeacherCourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    /**
     * 添加教师课程信息
     *
     * @param teacherCourseInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addTeacherCourseInfo(ApTeacherCourse teacherCourseInfo) throws Exception {
        return false;
    }

    /**
     * 根据任务安排课程ID删除对应的教师和班级信息
     *
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteTeacherCourseInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception {
        return false;
    }

    /**
     * 根据任务安排课程ID查询这门课对应的教师和班级信息
     *
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> getTeacherAndClassInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception {
        return null;
    }
}
