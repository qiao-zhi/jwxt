package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTeacherCourse;
import cn.xm.jwxt.bean.arrangeCourse.custom.ApTaskArrangeCourseCustom;
import cn.xm.jwxt.bean.arrangeCourse.custom.ApTeacherCourseCustom;
import cn.xm.jwxt.bean.arrangeCourse.custom.HistoryArrangeCourseQueryVo;
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
    boolean addTeacherCourseInfo(String arrangeCourseId, ApTeacherCourseCustom teacherCourseInfo) throws Exception;

    /**
     * 根据任务安排课程ID批量插入教师信息
     * @param arrangeCourseId
     * @param listInfo
     * @return
     * @throws Exception
     */
    boolean saveTeacherCourseInfoList(String arrangeCourseId,List<ApTeacherCourseCustom> listInfo) throws Exception;

    /**
     * 批量设置课程教师班级信息用于根据历史记录排课,一门课对应一个老师
     * @param listInfo
     * @return
     * @throws Exception
     */
    boolean saveTeacherCourseInfoList(List<ApTaskArrangeCourseCustom> listInfo) throws Exception;

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

    /**
     * 根据课程编号查询历史任课教师
     * @param courseNumber
     * @return
     * @throws Exception
     */
    List<Map<String,Object>> findHistoryTeacherInfoByNumber(String courseNumber) throws Exception;
}
