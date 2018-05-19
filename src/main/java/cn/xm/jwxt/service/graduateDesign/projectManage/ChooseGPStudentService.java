package cn.xm.jwxt.service.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;

import java.util.List;
import java.util.Map;

public interface ChooseGPStudentService {

    /**
     * 查询课题信息
     *
     * @param condition 课题名称、学年、
     * @return
     */
    List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws Exception;

    /**
     * 根据教师题目id 获取课题信息。调用课题添加中的方法
     *
     * @param teacherTitleID 教师题目id.如果isconfirm为null、“” 至为-1
     * @return
     */
    public TeachergredesigntitleDetailVo getProjectInfo(String teacherTitleID) throws Exception;

    /**
     * 根据教师题目id获取学生信息和任务书填写情况。
     *
     * @param teacherTitleID 教师题目id.如果isconfirm为null、“” 至为-1
     * @return
     */
    public StudentInfoVo getStudentInfo(String teacherTitleID) throws Exception;

    /**
     * 提交确定的学生。
     *
     * @param teacherTitleID
     * @param studentIDs
     * @return
     */
    public Boolean submitChooseStudent(String teacherTitleID, String studentIDs) throws Exception;
}
