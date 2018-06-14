package cn.xm.jwxt.mapper.arrangeCourse.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.jdbc.core.support.SqlLobValue;

import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.List;
import java.util.Map;

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

    /**
     * 根据教学任务通知书ID修改是否导入字段
     * @param noticeBookId
     * @param value
     * @return
     * @throws SQLException
     */
    int updateIsImportById(@Param("noticeBookId") String noticeBookId, @Param("value")String value) throws SQLException;
    /**
     * 组合条件查询教学任务通知书信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */
    List<ApTaskNoticeBaseInfo> findTaskNoticeInfoListByCondition(CommonQueryVo condition) throws SQLException;

    /**
     * 查询所有的任务通知书名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findNoticeNameAndId() throws SQLException;

    /**
     * 查询学院的名称、ID和编号
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findAllCollegeInfo() throws SQLException;
}
