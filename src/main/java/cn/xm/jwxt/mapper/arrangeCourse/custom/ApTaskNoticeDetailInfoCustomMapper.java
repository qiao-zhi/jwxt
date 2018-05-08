package cn.xm.jwxt.mapper.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.DistributeCourseSource;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：通知书明细ｍapper接口
 * 创建人：LL
 * 创建时间：2018/5/2 17:15
 */
public interface ApTaskNoticeDetailInfoCustomMapper {
    /**
     * 批量插入通知书明细信息
     * @param list
     * @return
     * @throws SQLException
     */
    int saveTaskNoticeDetailInfoList(List<ApTaskNoticeDetailInfo> list) throws SQLException;

    /**
     * 根据任务通知书ID,排课任务ID查询任务书中需要进行排课的课程
     * @param condition
     * @return
     * @throws SQLException
     */
    List<DistributeCourseSource> findUnarrangedCourseInfoByCondition(Map condition) throws SQLException;
}
