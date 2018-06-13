package cn.xm.jwxt.mapper.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.custom.ApArrangeCourseTaskCustom;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import org.apache.ibatis.annotations.Param;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：排课任务基本信息的自定义Mapper接口
 * 创建人：LL
 * 创建时间：2018/5/4 15:45
 */
public interface ApArrangeCourseTaskCustomMapper {
    /**
     * 根据排课任务ID修改任务状态
     * @param arrangeTaskId
     * @param taskStatus
     * @return
     * @throws SQLException
     */
    int updateTaskStatusById(@Param("arrangeTaskId") String arrangeTaskId, @Param("taskStatus") String taskStatus) throws SQLException;

    /**
     * 根据排课任务ID设置时间
     * @param arrangeTaskId
     * @param receiptTime
     * @return
     * @throws SQLException
     */
    int updateReceiptTimeById(@Param("arrangeTaskId") String arrangeTaskId,@Param("receiptTime") Date receiptTime) throws SQLException;

    /**
     * 根据排课任务ID修改是否删除字段
     * @param arrangeTaskId
     * @param value
     * @return
     * @throws SQLException
     */
    int updateIsDeleteById(@Param("arrangeTaskId") String arrangeTaskId,@Param("value") String value) throws SQLException;

    /**
     * 根据任务通知书ID修改是否删除字段
     * @param noticeBookId
     * @param value
     * @return
     * @throws SQLException
     */
    int updateIsDeleteByNoticeBookId(@Param("noticeBookId")String noticeBookId,@Param("value") String value) throws SQLException;

    /**
     * 组合条件查询排课任务信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */
    List<ApArrangeCourseTaskCustom> findArrangeCourseTaskByContion(CommonQueryVo condition) throws SQLException;
}

