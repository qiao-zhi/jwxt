package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;
import cn.xm.jwxt.bean.arrangeCourse.custom.ApTeacherCourseCustom;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师课程信息的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:10
 */
public interface ApTeacherCourseService {
    /**
     * 为安排课程添加教师课程信息
     * @param arrangeCourseId
     * @param teacherCourseInfo
     * @return
     * @throws Exception
     */
    boolean addTeacherCourseInfo(String arrangeCourseId, ApTeacherCourse teacherCourseInfo) throws Exception;

    /**
     * 根据任务安排课程ID删除对应的教师和班级信息
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    boolean deleteTeacherCourseInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception;

    /**
     * 根据任务安排课程ID查询这门课对应的教师信息
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    List<ApTeacherCourseCustom> findTeacherCourseCustomInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception;

    /**
     * 根据学院ID查询教师信息（在职的）
     * @param academicId
     * @return
     * @throws Exception
     */
    List<TTeacherBaseInfo> findTeacherBaseInfoByAcademicId(String academicId) throws Exception;
}
