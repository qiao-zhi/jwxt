package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.custom.ArrangeCourseTaskStatusEnum;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.mapper.arrangeCourse.ApArrangeCourseTaskMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApArrangeCourseTaskCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseTaskService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
    @Resource
    private ApArrangeCourseTaskMapper arrangeCourseTaskMapper;
    @Resource
    private ApArrangeCourseTaskCustomMapper arrangeCourseTaskCustomMapper;
    /**
     * 添加一个排课任务，需要关联一个教学任务通知书ID
     * @param noticeId
     * @param taskInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addApArrangeCourseTaskByNoticeId(String noticeId, ApArrangeCourseTask taskInfo) throws Exception {
        if(ValidateCheck.isNull(noticeId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        if(taskInfo==null){
            throw new IllegalArgumentException("排课任务基本信息不能为空!");
        }
        //设置主键
        taskInfo.setArrangeTaskId(UUIDUtil.getUUID2());
        //设置任务通知书ID
        taskInfo.setNoticeBookId(noticeId);
        //是否删除字段默认使用
        taskInfo.setIsDelete(DefaultValue.IS_USE);
        //任务状态
        taskInfo.setTaskStatus(ArrangeCourseTaskStatusEnum.NOT_MANAGE.getStatus());
        int count = arrangeCourseTaskMapper.insertSelective(taskInfo);
        return count>0?true:false;
    }

    /**
     * 根据排课任务ID修改排课任务状态
     * 1未分配； 2未发送； 3未接收； 4待排课； 5待审核； 6审核通过； 7审核不通过
     * @param arrangeTaskId
     * @param taskStatus
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateArrangeCourseTaskStatus(String arrangeTaskId, String taskStatus) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        if(ValidateCheck.isNull(taskStatus)){
            throw new IllegalArgumentException("状态码不能为空!");
        }
        int count = arrangeCourseTaskCustomMapper.updateTaskStatusById(arrangeTaskId, taskStatus);
        return count>0?true:false;
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
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        if(taskInfo==null){
            throw new IllegalArgumentException("排课任务基本信息不能为空!");
        }
        //设置排课任务ID
        taskInfo.setArrangeTaskId(arrangeTaskId);
        int count = arrangeCourseTaskMapper.updateByPrimaryKeySelective(taskInfo);
        return count>0?true:false;
    }

    /**
     * 根据排课任务ID删除排课任务信息
     * 修改是否删除字段
     * 0 表示删除 1 表示未删除
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteArrangeCourseTaskById(String arrangeTaskId) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        int count = arrangeCourseTaskCustomMapper.updateIsDeleteById(arrangeTaskId, DefaultValue.IS_NOT_USE);
        return count>0?true:false;
    }

    /**
     * 根据排课任务Id查询排课任务基本信息
     *
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public ApArrangeCourseTask getArrangeCourseTaskById(String arrangeTaskId) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        ApArrangeCourseTask arrangeCourseTask = arrangeCourseTaskMapper.selectByPrimaryKey(arrangeTaskId);
        return arrangeCourseTask;
    }

    /**
     * 组合条件查询排课任务信息分页显示
     * 过滤掉删除标记为0的排课任务信息
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<ApArrangeCourseTask> findApArrangeCourseTaskInfoByCondition(CommonQueryVo condition, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        String statusValue;
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"task_create_time DESC");
        List<ApArrangeCourseTask> arrangeCourseTasks = arrangeCourseTaskCustomMapper.findArrangeCourseTaskByContion(condition);
        //设置任务通知书状态
        for(ApArrangeCourseTask taskInfo:arrangeCourseTasks){
            statusValue = ArrangeCourseTaskStatusEnum.getStatusValue(taskInfo.getTaskStatus());
            taskInfo.setTaskStatus(statusValue);
        }
        PageInfo<ApArrangeCourseTask> pageInfo = new PageInfo<ApArrangeCourseTask>(arrangeCourseTasks);
        return pageInfo;
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
