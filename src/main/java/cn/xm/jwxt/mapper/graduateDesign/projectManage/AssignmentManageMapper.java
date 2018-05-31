package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface AssignmentManageMapper {

    /**
     * 查询课题申请管理界面，表格信息
     *
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 添加任务书信息
     *
     * @param taskbookinfo
     * @return
     * @throws SQLException
     */
    public int insertTaskBookInfo(Taskbookinfo taskbookinfo) throws SQLException;

    /**
     * 修改任务书信息
     *
     * @param taskbookinfo
     * @return
     * @throws SQLException
     */
    public Taskbookinfo updateAssignmentInfo(Taskbookinfo taskbookinfo) throws SQLException;

    /**
     * 获取任务书信息
     *
     * @param studentID
     * @return
     * @throws SQLException
     */
    public Taskbookinfo selectAssignmentInfo(String studentID) throws SQLException;

    /**
     * 根据教师题目id获取学生信息和任务书填写情况。
     *
     * @param teacherTitleID 教师题目id.如果isconfirm为null、“” 至为-1
     * @return
     * @throws SQLException
     */
    public StudentInfoVo selectStudentInfo(String teacherTitleID) throws SQLException;

    /**
     * 查询任务书初始化必备信息
     * 查询结果：studentID、studentName、studentNum、className、teamworkStudentName
     * 通过学生id，查询前四个字段
     * 通过teacherTitleID查询结果表，获取同一个课题的同学姓名
     *
     * @param teacherTitleID
     * @param studentID
     * @return
     */
    public AssignmentVo selectAssignmentInitInfo(String teacherTitleID, String studentID) throws SQLException;

    /**
     * 查询任务书保存的信息
     * 根据学生id，查询任务书表
     *
     * @param studentID
     * @return
     */
    public AssignmentVo selectAssignmentSaveInfo(String studentID) throws SQLException;

    public int insertGradeuatebaseinfo(Gradeuatebaseinfo gradeuatebaseinfo) throws SQLException;

    /**
     * \通过学生id，查询学生专业
     *
     * @param studentID
     * @return
     */
    public String selectMajorID(String studentID) throws SQLException;

    /**
     * 修改任务书
     * 修改任务书内容
     *
     * @param taskbookinfo
     * @return
     */
    public int updateTaskBookInfo(Taskbookinfo taskbookinfo) throws SQLException;

    /**
     * 修改任务书
     * 修改毕业基本信息
     *
     * @param gradeuatebaseinfo
     * @return
     */
    public int updateGradeuatebaseinfo(Gradeuatebaseinfo gradeuatebaseinfo) throws SQLException;

    /**
     * 获得系主任审核信息
     * 获取最新的信息。根据时间排序
     *
     * @param bookID
     * @return
     */
    public TaskBooktFirstCheckInfo selectAuditFirstInfo(String bookID) throws SQLException;

    /**
     * 院长审核
     *
     * @param taskBookSecondCheckInfo
     * @return
     */
    public int insertAuditSecondInfo(TaskBookSecondCheckInfo taskBookSecondCheckInfo) throws SQLException;

    /**
     * 系主任审核
     *
     * @param taskBookCheckInfo
     * @return
     */
    public int insertAuditFirstInfo(TaskBookSecondCheckInfo taskBookCheckInfo) throws SQLException;
}
