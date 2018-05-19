package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface ChooseGPStudentMapper {

    /**
     * 查询课题申请管理界面，表格信息
     *
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 根据教师题目id获取学生信息
     * @param teacherTitleID 教师题目id.如果isconfirm为null、“” 至为-1
     * @return
     * @throws SQLException
     */
    public StudentInfoVo selectStudentInfo(String teacherTitleID) throws SQLException;

    /**
     *
     * @param teacherTitleID
     * @return
     */
    public TeachergredesigntitleDetailVo selectProjectInfo(String teacherTitleID) throws SQLException;
}
