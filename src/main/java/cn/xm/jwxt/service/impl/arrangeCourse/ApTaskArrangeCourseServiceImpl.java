package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.service.arrangeCourse.ApTaskArrangeCourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课任务分配课程的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:20
 */
@Service
@Transactional
public class ApTaskArrangeCourseServiceImpl implements ApTaskArrangeCourseService {
    /**
     * 根据排课任务ID批量插入排课任务安排的课程信息
     *
     * @param arrangeTaskId
     * @param courseList
     * @return
     * @throws Exception
     */
    @Override
    public boolean saveTaskArrangeCourseListByArrangeId(String arrangeTaskId, List<ApTaskArrangeCourse> courseList) throws Exception {
        return false;
    }

    /**
     * 根据排课任务ID批量修改排课任务安排的课程信息
     * 先根据排课任务ID将原来的信息删除，然后调用批量插入的方法将课程集合保存到数据库中
     *
     * @param arrangeTaskId
     * @param courseList
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateTaskArrangeCourseListByArrangeId(String arrangeTaskId, List<ApTaskArrangeCourse> courseList) throws Exception {
        return false;
    }

    /**
     * 根据任务安排课程ID（主键）修改任务安排课程基本信息
     *
     * @param taskArrangeCourseId
     * @param taskArrangeCourse
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateTaskArrangeCourseInfoById(String taskArrangeCourseId, ApTaskArrangeCourse taskArrangeCourse) throws Exception {
        return false;
    }

    /**
     * 根据排课任务ID批量删除排课任务课程信息
     *
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteTaskArrangeCourseListByArrangeId(String arrangeTaskId) throws Exception {
        return false;
    }

    /**
     * 根据排课任务ID查询相关的课程信息及教师信息分页显示
     *
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findTaskArrangeCourseListByArrangeId(String arrangeTaskId) throws Exception {
        return null;
    }
}
