package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课任务基本信息的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:07
 */
public interface ApArrangeCourseTaskService {
    /**
     * 添加一个排课任务，需要关联一个教学任务通知书ID
     * @param noticeId
     * @param taskInfo
     * @return
     * @throws Exception
     */
    boolean addApArrangeCourseTaskByNoticeId(String noticeId, ApArrangeCourseTask taskInfo) throws Exception;

    /**
     * 根据排课任务ID修改排课任务状态
     * 1未分配； 2未发送； 3未接收； 4待排课； 5待审核； 6审核通过； 7审核不通过
     * @param arrangeTaskId
     * @param taskStatus
     * @return
     * @throws Exception
     */
    boolean updateArrangeCourseTaskStatus(String arrangeTaskId,String taskStatus) throws Exception;

    /**
     * 根据排课任务ID修改排课任务基本信息
     * @param arrangeTaskId
     * @param taskInfo
     * @return
     * @throws Exception
     */
    boolean updateArrangeCourseTaskById(String arrangeTaskId,ApArrangeCourseTask taskInfo) throws Exception;

    /**
     * 根据排课任务ID删除排课任务信息
     * 修改是否删除字段
     * 0 表示删除 1 表示未删除
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    boolean deleteArrangeCourseTaskById(String arrangeTaskId) throws Exception;

    /**
     * 根据排课任务Id查询排课任务基本信息
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    ApArrangeCourseTask getArrangeCourseTaskById(String arrangeTaskId) throws Exception;

    /**
     * 组合条件查询排课任务信息分页显示
     * 过滤掉删除标记为0的排课任务信息
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    PageInfo<ApArrangeCourseTask> findApArrangeCourseTaskInfoByCondition(CommonQueryVo condition, Integer currentPage, Integer pageSize) throws Exception;
}
