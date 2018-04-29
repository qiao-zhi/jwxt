package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeDetailInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return false;
    }

    /**
     * 根据任务通知书ID查询任务书中需要进行排课的课程，供教学秘书分配课程
     * 需要查询的信息：未分配课程的
     * 课程代码 课程名称 专业 班级 总人数 总学时 校区
     *
     * @param noticeId
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findUnarrangedCourseInfoByNoticeId(String noticeId) throws Exception {
        return null;
    }

    /**
     * 根据通知书ID查询通知书明细信息分页显示
     *
     * @param noticeId
     * @return
     * @throws Exception
     */
    @Override
    public List<ApTaskNoticeDetailInfo> findApTaskNoticeDetailInfoByNoticeId(String noticeId) throws Exception {
        return null;
    }
}
