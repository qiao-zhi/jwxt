package cn.xm.jwxt.service.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface AssignmentManageService {

    /**
     * 查询课题信息
     *
     * @param condition 课题名称、学年、
     * @return
     */
    List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException, Exception;


    /**
     * 根据教师题目id获取学生信息和任务书填写情况。
     *
     * @param teacherTitleID 教师题目id.如果isconfirm为null、“” 至为-1
     * @return
     */
    public StudentInfoVo getStudentInfo(String teacherTitleID) throws Exception;

    /**
     * 获取任务书信息
     *
     * @param studentID
     * @return
     */
    public Taskbookinfo getTaskBookInfo(String studentID) throws Exception;

    /**
     * 修改任务书信息
     *
     * @param taskbookinfo
     * @return
     */
    public Taskbookinfo modifyTaskBookInfo(Taskbookinfo taskbookinfo) throws Exception;

    /**
     * 添加任务书信息
     *
     * @param taskbookinfo
     * @return
     */
    public Taskbookinfo addTaskBookInfo(Taskbookinfo taskbookinfo) throws Exception;
}
