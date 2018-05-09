package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.bean.arrangeCourse.custom.ApTaskArrangeCourseCustom;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课任务分配课程的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:08
 */
public interface ApTaskArrangeCourseService {
    /**
     * 根据排课任务ID批量插入排课任务安排的课程信息
     * @param arrangeTaskId
     * @param courseList
     * @return
     * @throws Exception
     */
    boolean saveTaskArrangeCourseListByArrangeId(String arrangeTaskId, List<ApTaskArrangeCourse> courseList) throws Exception;

    /**
     * 根据排课任务ID批量修改排课任务安排的课程信息
     * 先根据排课任务ID将原来的信息删除，然后调用批量插入的方法将课程集合保存到数据库中
     * @param arrangeTaskId
     * @param courseList
     * @return
     * @throws Exception
     */
    boolean updateTaskArrangeCourseListByArrangeId(String arrangeTaskId,List<ApTaskArrangeCourse> courseList) throws Exception;

    /**
     * 根据任务安排课程ID（主键）修改任务安排课程基本信息
     * @param taskArrangeCourseId
     * @param taskArrangeCourse
     * @return
     * @throws Exception
     */
    boolean  updateTaskArrangeCourseInfoById(String taskArrangeCourseId,ApTaskArrangeCourse taskArrangeCourse) throws Exception;
    /**
     * 根据排课任务ID批量删除排课任务课程信息
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    boolean deleteTaskArrangeCourseListByArrangeId(String arrangeTaskId) throws Exception;

    /**
     *根据排课任务ID查询相关的课程信息用于排课任务详情的显示
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    List<ApTaskArrangeCourse> findTaskArrangeCourseListInfoByArrangeId(String arrangeTaskId) throws Exception;

    /**
     * 根据排课任务ID查询相关的课程信息及教师信息分页显示
     * @param arrangeTaskId
     * @retur @throws Exception
     */
    PageInfo<ApTaskArrangeCourseCustom> findTaskArrangeCourseAndTeacherListByArrangeId(String arrangeTaskId, Integer currentPage, Integer pageSize) throws Exception;

    /**
     * 根据安排课程ID查询查询每一门课程对应的教师课程信息
     * @param arrangeCourseId
     * @return
     * @throws Exception
     */
    ApTaskArrangeCourseCustom getTaskArrangeCourseAndTeacherClassInfo(String arrangeCourseId) throws Exception;
}
