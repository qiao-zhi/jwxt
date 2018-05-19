package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;

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
    public Taskbookinfo insertTaskBookInfo(Taskbookinfo taskbookinfo) throws SQLException;

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
     * @param teacherTitleID 教师题目id.如果isconfirm为null、“” 至为-1
     * @return
     * @throws SQLException
     */
    public StudentInfoVo selectStudentInfo(String teacherTitleID) throws SQLException;
}
