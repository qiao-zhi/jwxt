package cn.xm.jwxt.service.graduateDesign.projectManage;

import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface ProjectManageService {
    /**
     * 查询当前登录系统的教师负责的学生
     * @param condition
     * @return
     */
    public List<Map<String, Object>> getSelfStudentInfo(Map<String, Object> condition) throws Exception;

    /**
     * 查询当前登录系统的教师负责的学生数量
     * @param year 默认当前年份
     * @param teacherId  教师id
     * @return 学生数量
     */
    public int getSelfStudentNum(String year, String teacherId) throws Exception;
}
