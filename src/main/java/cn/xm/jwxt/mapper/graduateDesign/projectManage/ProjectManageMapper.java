package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.CencheckarrangeinfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 课题管理
 */
public interface ProjectManageMapper {

    /**
     * 查询当前登录系统的教师负责的学生数量
     * @param year 默认当前年份
     * @param teacherId  教师id
     * @return 学生数量
     */
    int selectCountSelfStudent(@Param("record") String year, @Param("teacherId") String teacherId);
}
