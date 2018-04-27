package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseTaskService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课任务基本信息的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:19
 */
@Service
@Transactional
public class ApArrangeCourseTaskServiceImpl implements ApArrangeCourseTaskService {
    /**
     * 添加一个排课任务，需要关联一个教学任务通知书ID
     *
     * @param noticeId
     * @param taskInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addApArrangeCourseTaskByNoticeId(String noticeId, ApArrangeCourseTask taskInfo) throws Exception {
        return false;
    }

    /**
     * 根据排课任务ID修改排课任务状态
     * 1未分配； 2未发送； 3未接收； 4待排课； 5待审核； 6审核通过； 7审核不通过
     *
     * @param arrangeTaskId
     * @param taskStatus
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateArrangeCourseTaskStatus(String arrangeTaskId, String taskStatus) throws Exception {
        return false;
    }

    /**
     * 根据排课任务ID修改排课任务基本信息
     *
     * @param arrangeTaskId
     * @param taskInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateArrangeCourseTaskById(String arrangeTaskId, ApArrangeCourseTask taskInfo) throws Exception {
        return false;
    }

    /**
     * 根据排课任务ID删除排课任务信息
     * 修改是否删除字段
     * 0 表示删除 1 表示未删除
     *
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteArrangeCourseTaskById(String arrangeTaskId) throws Exception {
        return false;
    }

    /**
     * 组合条件查询排课任务信息分页显示
     * 过滤掉删除标记为0的排课任务信息
     *
     * @param condition
     * @return
     * @throws Exception
     */
    @Override
    public List<ApArrangeCourseTask> findApArrangeCourseTaskInfoByCondition(Map condition) throws Exception {
        return null;
    }

    /**
     * 根据排课任务ID查询有关排课任务的所有信息用于Excel文件的导出
     *
     * @param arrangeCourseTaskId
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> getArrangeCourseAllInfoByArrangeCourseTaskId(String arrangeCourseTaskId) throws Exception {
        return null;
    }
}
