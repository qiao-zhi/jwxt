package cn.xm.jwxt.mapper.arrangeCourse.custom;

import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.core.support.SqlLobValue;

import java.sql.SQLException;

/**
 * 项目名称：jwxt
 * 类描述：教学任务通知书基本信息的自定义mapper接口
 * 创建人：LL
 * 创建时间：2018/4/25 17:20
 */
public interface ApTaskNoticeBaseInfoCustomMapper {
    /**
     * 根据教学任务通知书ID修改是否删除字段
     * @param taskNoticeBaseInfo
     * @param value 修改的值
     * @return
     * @throws SQLException
     */
    int updateIsDeleteById(@Param("taskNoticeBaseInfo") String taskNoticeBaseInfo, @Param("value")String value) throws SQLException;
}
