package cn.xm.jwxt.service.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentChooseProjectInfo;

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

    /**
     * 分页组合条件查询课题添加基本信息
     * @param condition
     * @return
     */
    public List<Map<String,String>> getProjectInfo(Map<String, String> condition) throws Exception;

    /**
     * 初始化学生信息
     * @return
     */
    public StudentChooseProjectInfo getStudentInfo() throws Exception;

    /**
     * 分配学生时，保存分配结果
     * @return
     * @param teacherTitleID
     * @param studentArray
     */
    public Boolean saveAllocate(String teacherTitleID, String[] studentArray) throws Exception;


    /**
     * 提交确定的学生。
     *
     * @param teacherTitleID
     * @param studentIDs
     * @return
     */
    public Boolean submitChooseStudent(String teacherTitleID, String studentIDs) throws Exception;
}
