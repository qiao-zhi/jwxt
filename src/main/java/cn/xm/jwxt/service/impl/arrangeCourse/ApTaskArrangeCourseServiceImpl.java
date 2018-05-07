package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourseExample;
import cn.xm.jwxt.bean.arrangeCourse.custom.ArrangeCourseTaskStatusEnum;
import cn.xm.jwxt.mapper.arrangeCourse.ApTaskArrangeCourseMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApTaskArrangeCourseCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseTaskService;
import cn.xm.jwxt.service.arrangeCourse.ApTaskArrangeCourseService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
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
    @Resource
    private ApTaskArrangeCourseCustomMapper taskArrangeCourseCustomMapper;
    @Resource
    private ApTaskArrangeCourseMapper taskArrangeCourseMapper;
    @Resource
    private ApArrangeCourseTaskService  arrangeCourseTaskService;
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
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        int total = courseList.size();
        if(total <= 0){
            throw new IllegalArgumentException("排课任务安排的课程信息集合参数传递错误!");
        }
        for(ApTaskArrangeCourse arrangeCourse:courseList){
            //设置主键
            arrangeCourse.setArrangeCourseId(UUIDUtil.getUUID2());
            //排课任务编号
            arrangeCourse.setArrangeTaskId(arrangeTaskId);
            //使用多媒体
            arrangeCourse.setIsUseMultimedia(DefaultValue.IS_USE);
        }
        int count = taskArrangeCourseCustomMapper.saveTaskArrangeCourseInfoList(courseList);
        //修改排课任务状态
        arrangeCourseTaskService.updateArrangeCourseTaskStatus(arrangeTaskId, ArrangeCourseTaskStatusEnum.NOT_SEND.getStatus());
        return count==total;
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
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        int total = courseList.size();
        if(total <= 0){
            throw new IllegalArgumentException("排课任务安排的课程信息集合参数传递错误!");
        }
        //根据排课任务ID将原来的信息删除
        deleteTaskArrangeCourseListByArrangeId(arrangeTaskId);
        return saveTaskArrangeCourseListByArrangeId(arrangeTaskId, courseList);
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
        if(ValidateCheck.isNull(taskArrangeCourseId)){
            throw new IllegalArgumentException("任务安排课程编号不能为空!");
        }
        if(taskArrangeCourse==null){
            throw new IllegalArgumentException("任务安排课程基本信息不能为空!");
        }
        taskArrangeCourse.setArrangeCourseId(taskArrangeCourseId);
        int count = taskArrangeCourseMapper.updateByPrimaryKeySelective(taskArrangeCourse);
        return count>0?true:false;
    }

    /**
     * 根据排课任务ID批量删除排课任务课程信息
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteTaskArrangeCourseListByArrangeId(String arrangeTaskId) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        ApTaskArrangeCourseExample taskArrangeCourseExample = new ApTaskArrangeCourseExample();
        ApTaskArrangeCourseExample.Criteria taskArrangeCourseCriteria = taskArrangeCourseExample.createCriteria();
        taskArrangeCourseCriteria.andArrangeTaskIdEqualTo(arrangeTaskId);
        int count = taskArrangeCourseMapper.deleteByExample(taskArrangeCourseExample);
        return count>0?true:false;
    }

    /**
     * 根据排课任务ID查询相关的课程信息用于排课任务详情的显示
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public List<ApTaskArrangeCourse> findTaskArrangeCourseListInfoByArrangeId(String arrangeTaskId) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        ApTaskArrangeCourseExample taskArrangeCourseExample = new ApTaskArrangeCourseExample();
        ApTaskArrangeCourseExample.Criteria taskArrangeCourseCriteria = taskArrangeCourseExample.createCriteria();
        taskArrangeCourseCriteria.andArrangeTaskIdEqualTo(arrangeTaskId);
        List<ApTaskArrangeCourse> taskArrangeCourses = taskArrangeCourseMapper.selectByExample(taskArrangeCourseExample);
        return taskArrangeCourses;
    }

    /**
     * 根据排课任务ID查询相关的课程信息及教师信息分页显示
     *
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findTaskArrangeCourseAndTeacherListByArrangeId(String arrangeTaskId) throws Exception {
        return null;
    }
}
