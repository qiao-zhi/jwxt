package cn.xm.jwxt.mapper.baseInfo.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TTeacherBaseInfoCustomMapper {


    /**
     * 组合条件查询教师信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */

    List<TTeacherBaseInfo> findTeacherInfoListByCondition(CommonQuery condition) throws SQLException;


    /**
     * 查询所有的教师名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findTeacherNameAndId() throws SQLException;

    /**
     * 批量插入通知书明细信息
     * @param list
     * @return
     * @throws SQLException
     */
    int saveTeacherInfoList(List<TeacherMajorInfo> list) throws SQLException;

}
