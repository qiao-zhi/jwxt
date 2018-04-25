package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;

import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师课程信息的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:10
 */
public interface ApTeacherCourseService {
    /**
     * 添加教师课程信息
     * @param teacherCourseInfo
     * @return
     * @throws Exception
     */
    boolean addTeacherCourseInfo(ApTeacherCourse teacherCourseInfo) throws Exception;

    /**
     * 根据任务安排课程ID删除对应的教师和班级信息
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    boolean deleteTeacherCourseInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception;

    /**
     * 根据任务安排课程ID查询这门课对应的教师和班级信息
     * @param taskArrangeCourseId
     * @return
     * @throws Exception
     */
    Map<String,Object> getTeacherAndClassInfoByTaskArrangeCourseId(String taskArrangeCourseId) throws Exception;
}
