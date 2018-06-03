package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.*;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface AssignmentManageMapper {


    /**
     * 删除系主任审核信息
     * @param teacherTitleID
     * @return
     */
    public void deleteAuditFisrtInfo(String teacherTitleID) throws SQLException;


    /**
     * 删除院长审核信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public void deleteAuditSecondInfo(String teacherTitleID) throws SQLException;

    /**
     * 修改任务书
     * 修改任务书内容
     *
     * @param assignmentVo
     * @return
     */
    public int updateTaskBookInfo(AssignmentVo assignmentVo) throws SQLException;

    /**
     * 获得系主任审核信息
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
    public int insertAuditSecondInfo(List<TaskBookSecondCheckInfo> taskBookSecondCheckInfo) throws SQLException;

    /**
     * 系主任审核
     *
     * @param taskBookCheckInfo
     * @return
     */
    public int insertAuditFirstInfo(List<TaskBookSecondCheckInfo> taskBookCheckInfo) throws SQLException;

    /**
     * 根据条件，初始化页面
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,String>> selectStudentInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 添加任务书 获取课题信息 初始化任务书表
     * @param teacherTitleID
     * @param studentID
     * @return
     * @throws SQLException
     */
    public AssignmentVo selectProjectInfoDetail(@Param("teacherTitleID") String teacherTitleID, @Param("studentID") String studentID) throws SQLException;

    /**
     * 查询同组人姓名
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public List<String> selectTeamworkStudentName(@Param("teacherTitleID") String teacherTitleID, @Param("studentID") String studentID) throws SQLException;

    /**
     * 保存任务书
     * @param assignmentVo
     * @return
     * @throws SQLException
     */
    public int insertAssignment(AssignmentVo assignmentVo) throws SQLException;

    /**
     * 修改任务书初始化任务书
     * @param teacherTitleID
     * @param studentID
     * @return
     * @throws SQLException
     */
    public AssignmentVo selectInitProjectInfoDetail(String teacherTitleID, String studentID) throws SQLException;
}
