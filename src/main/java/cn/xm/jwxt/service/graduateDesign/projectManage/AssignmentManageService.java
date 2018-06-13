package cn.xm.jwxt.service.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.AssignmentVo;

import java.util.List;
import java.util.Map;

public interface AssignmentManageService {

    /**
     * 分页组合条件查询学生基本信息
     * @param condition
     * @return
     */
    public List<Map<String,String>> getStudentInfoByCondition(Map<String, String> condition) throws Exception;

    /**
     * 保存任务书
     * @param assignmentVo
     * @return
     */
    public Boolean saveAssignment(AssignmentVo assignmentVo) throws Exception;

    /**
     * 修改任务书
     * @param assignmentVo
     * @return
     */
    public Boolean modifyAssignment(AssignmentVo assignmentVo) throws Exception;

    /**
     * 添加任务书 获取课题信息 初始化任务书表
     * @param teacherTitleID
     * @param studentID
     * @return
     * @throws Exception
     */
    public AssignmentVo getProjectInfoDetail(String teacherTitleID, String studentID) throws Exception;

    /**
     * 修改任务书初始化任务书
     * @param teacherTitleID
     * @param studentID
     * @return
     * @throws Exception
     */
    public AssignmentVo getInitProjectInfoDetail(String teacherTitleID, String studentID) throws Exception;
}
