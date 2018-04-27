package cn.xm.jwxt.service.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：教学任务通知书基本信息的Service接口
 * 创建人：LL
 * 创建时间：2018/4/24 12:03
 */
public interface ApTaskNoticeBaseInfoService {

    /**
     * 添加教学任务通知书基本信息
     * @param noticeBaseInfo
     * @return
     * @throws Exception
     */
    boolean addApTaskNoticeBaseInfo(ApTaskNoticeBaseInfo noticeBaseInfo) throws Exception;

    /**
     * 根据任务通知书ID修改教学任务通知书基本信息
     * @param noticeBookId
     * @param noticeBaseInfo
     * @return
     * @throws Exception
     */
    boolean updateApTaskNoticeBaseInfoById(String noticeBookId,ApTaskNoticeBaseInfo noticeBaseInfo) throws Exception;

    /**
     * 根据任务通知书ID删除教学任务通知书
     * 修改是否删除字段 0 表示删除 1 表示未删除
     * 需要修改教学任务通知书和排课任务表的是否删除字段
     * @param noticeBookId
     * @return
     * @throws Exception
     */
    boolean deleteApTaskNoticeBaseInfoById(String noticeBookId) throws Exception;

    /**
     * 组合条件查询任务通知书基本信息分页显示
     * 过滤掉删除标记为0的通知书信息
     * @param condition
     * @return
     * @throws Exception
     */
    List<ApTaskNoticeBaseInfo> findApTaskNoticeBaseInfoByCondition(Map condition,Integer currentPage,Integer pageSize) throws Exception;
}
