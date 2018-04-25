package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApClassTeacher;

import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课的教师所带班级信息的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:12
 */
public interface ApClassTeacherService {
    /**
     * 根据教师课程ID批量插入班级教师信息
     * @param teacherCourseId
     * @param listInfo
     * @return
     * @throws Exception
     */
    boolean saveClassTeacherListInfoByTeacherCourseId(String teacherCourseId, List<ApClassTeacher> listInfo) throws Exception;

    /**
     * 根据教师课程ID删除教师班级信息
     * @param teacherCourseId
     * @return
     * @throws Exception
     */
    boolean deleteClassTeacherListInfoByTeacherCourseId(String teacherCourseId) throws Exception;

    /**
     * 根据教师课程ID集合删除教师班级信息
     * @param teacherCourseIds
     * @return
     * @throws Exception
     */
    boolean deleteClassTeacherListInfoByTeacherCourseIds(List<String> teacherCourseIds) throws Exception;
}
