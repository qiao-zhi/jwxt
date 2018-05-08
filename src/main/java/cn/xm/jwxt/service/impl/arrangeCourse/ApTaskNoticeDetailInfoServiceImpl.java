package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfoExample;
import cn.xm.jwxt.bean.arrangeCourse.custom.DistributeCourseSource;
import cn.xm.jwxt.mapper.arrangeCourse.ApTaskNoticeDetailInfoMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApTaskNoticeDetailInfoCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeBaseInfoService;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeDetailInfoService;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：教学任务通知书详细信息的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:20
 */
@Service
@Transactional
public class ApTaskNoticeDetailInfoServiceImpl implements ApTaskNoticeDetailInfoService {
    @Resource
    private ApTaskNoticeDetailInfoCustomMapper taskNoticeDetailInfoCustomMapper;
    @Resource
    private ApTaskNoticeDetailInfoMapper taskNoticeDetailInfoMapper;
    @Resource
    private ApTaskNoticeBaseInfoService taskNoticeBaseInfoService;
    /**
     * 根据任务通知书ID批量插入通知书中的课程信息
     *
     * @param noticeId
     * @param detailInfoList
     * @return
     * @throws Exception
     */
    @Override
    public boolean saveApTaskNoticeDetailInfoByNoticeId(String noticeId, List<ApTaskNoticeDetailInfo> detailInfoList) throws Exception {
        if(ValidateCheck.isNull(noticeId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        int total = detailInfoList.size();
        if(total <= 0){
            throw new IllegalArgumentException("明细集合参数传递错误!");
        }
        for (ApTaskNoticeDetailInfo detailInfo:detailInfoList) {
            //设置通知书ID
            detailInfo.setNoticeBookId(noticeId);
        }
        int count = taskNoticeDetailInfoCustomMapper.saveTaskNoticeDetailInfoList(detailInfoList);
        //修改是否上传参数
        taskNoticeBaseInfoService.updateIsInputStatus(noticeId);
        return count == total;
    }

    /**
     * 根据任务通知书ID,排课任务ID查询任务书中需要进行排课的课程，供教学秘书分配课程
     * 需要查询的信息：未分配课程的
     * 课程代码 课程名称 专业 班级 总人数 总学时 校区
     * @param condition
     * @return
     * @throws Exception
     */
    @Override
    public List<DistributeCourseSource> findUnarrangedCourseInfoByCondition(Map condition) throws Exception {
        if(condition==null){
            throw new IllegalArgumentException("查询条件传递错误！");
        }
        List<DistributeCourseSource> unarrangedCourseInfoList = taskNoticeDetailInfoCustomMapper.findUnarrangedCourseInfoByCondition(condition);
        return unarrangedCourseInfoList;
    }


    /**
     * 根据通知书ID查询通知书明细信息分页显示
     * @param noticeId
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<ApTaskNoticeDetailInfo> findApTaskNoticeDetailInfoByNoticeId(String noticeId, Integer currentPage, Integer pageSize) throws Exception {
        if(ValidateCheck.isNull(noticeId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"CONVERT(datail_sort,SIGNED)");
        ApTaskNoticeDetailInfoExample detailInfoExample = new ApTaskNoticeDetailInfoExample();
        ApTaskNoticeDetailInfoExample.Criteria detailInfoCriteria = detailInfoExample.createCriteria();
        detailInfoCriteria.andNoticeBookIdEqualTo(noticeId);
        List<ApTaskNoticeDetailInfo> apTaskNoticeDetailInfos = taskNoticeDetailInfoMapper.selectByExample(detailInfoExample);
        PageInfo<ApTaskNoticeDetailInfo> pageInfo = new PageInfo<ApTaskNoticeDetailInfo>(apTaskNoticeDetailInfos);
        return pageInfo;
    }
}
