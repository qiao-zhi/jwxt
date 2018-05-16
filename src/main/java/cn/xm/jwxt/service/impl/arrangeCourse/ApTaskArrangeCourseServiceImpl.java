package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourseExample;
import cn.xm.jwxt.bean.arrangeCourse.custom.*;
import cn.xm.jwxt.mapper.arrangeCourse.ApTaskArrangeCourseMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApTaskArrangeCourseCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApArrangeCourseTaskService;
import cn.xm.jwxt.service.arrangeCourse.ApTaskArrangeCourseService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.HashMap;
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
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<ApTaskArrangeCourseCustom> findTaskArrangeCourseAndTeacherListByArrangeId(String arrangeTaskId, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        PageHelper.startPage(currentPage,pageSize,"CONVERT (course_name USING gbk)");
        List<ApTaskArrangeCourseCustom> arrangeCourseAndTeacherList = taskArrangeCourseCustomMapper.findTaskArrangeCourseAndTeacherListByArrangeId(arrangeTaskId);
        PageInfo<ApTaskArrangeCourseCustom> pageInfo = new PageInfo<ApTaskArrangeCourseCustom>(arrangeCourseAndTeacherList);
        return pageInfo;
    }

    /**
     * 根据排课任务ID和学年学期查询历史排课记录
     * @param condition
     * @return
     * @throws Exception
     */
    @Override
    public List<ApTaskArrangeCourseCustom> findHistroyTeacherCourseByCodition(HistoryArrangeCourseQueryVo condition) throws Exception {
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        //学年
        String academicYear = condition.getAcademicYear();
        //处理学年条件，查询他的上一学年的信息
        String[] years = academicYear.split("-");
        Integer year = Integer.valueOf(years[0]);
        condition.setAcademicYear(String.valueOf(year-1));
        List<ApTaskArrangeCourseCustom> historyArrangeCourseList = taskArrangeCourseCustomMapper.findHistoryArrangeCourseInfoByCondition(condition);
        //将学年学期设置到集合中返回到页面上
        for(ApTaskArrangeCourseCustom taskArrangeCourseCustom:historyArrangeCourseList){
            taskArrangeCourseCustom.setAcademicYear(academicYear);
            taskArrangeCourseCustom.setTerm(condition.getTerm());
        }
        return historyArrangeCourseList;
    }

    /**
     * 根据安排课程ID查询查询每一门课程对应的教师课程信息
     * @param arrangeCourseId
     * @return
     * @throws Exception
     */
    @Override
    public ApTaskArrangeCourseCustom getTaskArrangeCourseAndTeacherClassInfo(String arrangeCourseId) throws Exception {
        if(ValidateCheck.isNull(arrangeCourseId)){
            throw new IllegalArgumentException("安排课程编号不能为空!");
        }
        ApTaskArrangeCourseCustom taskArrangeCourseAndTeacherClassInfo = taskArrangeCourseCustomMapper.getTaskArrangeCourseAndTeacherClassInfo(arrangeCourseId);
        return taskArrangeCourseAndTeacherClassInfo;
    }

    /**
     * 根据安排课程ID查询课程的基本信息包括学年学期
     * @param arrangeCourseId
     * @return
     * @throws Exception
     */
    @Override
    public ApTaskArrangeCourseCustom getTaskArrangeCourseInfoById(String arrangeCourseId) throws Exception {
        if(ValidateCheck.isNull(arrangeCourseId)){
            throw new IllegalArgumentException("安排课程编号不能为空!");
        }
        ApTaskArrangeCourseCustom taskArrangeCourseAndYearTermInfo = taskArrangeCourseCustomMapper.getTaskArrangeCourseAndYearTermInfo(arrangeCourseId);
        return taskArrangeCourseAndYearTermInfo;
    }

    /**
     * 根据排课任务ID查询有关排课任务的所有信息用于Excel文件的导出
     * @param arrangeCourseTaskId
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, List<ApTaskArrangeCourseCustom>> getArrangeCourseAllInfoByArrangeCourseTaskId(String arrangeCourseTaskId) throws Exception {
        if(ValidateCheck.isNull(arrangeCourseTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        //主校区教师信息
        List<ApTaskArrangeCourseCustom> courseAndTeacherListMainCampus = taskArrangeCourseCustomMapper.findTaskArrangeCourseAndTeacherListForExport(arrangeCourseTaskId, CampusCodeEnum.MAIN_CAMPUS.getStatus());
        //华科学院教师信息
        List<ApTaskArrangeCourseCustom> courseAndTeacherListHuaKeCampus = taskArrangeCourseCustomMapper.findTaskArrangeCourseAndTeacherListForExport(arrangeCourseTaskId, CampusCodeEnum.HUAKE_CAMPUS.getStatus());
        //晋城校区教师信息
        List<ApTaskArrangeCourseCustom> courseAndTeacherListJinChengCampus = taskArrangeCourseCustomMapper.findTaskArrangeCourseAndTeacherListForExport(arrangeCourseTaskId, CampusCodeEnum.JINCHENG_CAMPUS.getStatus());
        Map<String,List<ApTaskArrangeCourseCustom>> mapInfo = new HashMap<String, List<ApTaskArrangeCourseCustom>>();
        mapInfo.put(CampusCodeEnum.MAIN_CAMPUS.getStatus(),courseAndTeacherListMainCampus);
        mapInfo.put(CampusCodeEnum.HUAKE_CAMPUS.getStatus(),courseAndTeacherListHuaKeCampus);
        mapInfo.put(CampusCodeEnum.JINCHENG_CAMPUS.getStatus(),courseAndTeacherListJinChengCampus);
        return mapInfo;
    }

    /**
     * 根据排课任务ID统计还未排课的数量
     * @param arrangeTaskId
     * @return
     * @throws Exception
     */
    @Override
    public int getNotArrangeCourseCount(String arrangeTaskId) throws Exception {
        if(ValidateCheck.isNull(arrangeTaskId)){
            throw new IllegalArgumentException("排课任务编号不能为空!");
        }
        int count = taskArrangeCourseCustomMapper.selectNotArrangeCourseCount(arrangeTaskId);
        return count;
    }
}
