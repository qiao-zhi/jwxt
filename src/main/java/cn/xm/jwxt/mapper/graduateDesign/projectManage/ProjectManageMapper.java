package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentChooseProjectInfo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
    public int selectCountSelfStudent(@Param("record") String year, @Param("teacherId") String teacherId) throws SQLException;

    /**
     * 分页组合条件查询课题添加基本信息
     * 查询的内容，是需要教师确认的学生。既，选完课题的学生
     * @param condition 教师名称、课题名称、学年、是否需要分配
     * @return
     */
    public List<Map<String,String>> selectProjectInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 初始化学生信息
     * 查询结果：    学生，学号，班级志愿情况（教师和课题）
     *          1、先查询 teacherGreDesignTitle 课题表
     *          2、查询没有已经选择了课题，但是没有被老师确认的学生，老师确认学生后，会吧学生信息保存到结果表中。
     *              查询graDesignStudentTitleInfo选题表有的学生，studentTitleResult结果表没有的学生
     * @return
     */
    public StudentChooseProjectInfo getStudentInfo() throws SQLException;

    /**
     * 分配学生时，保存分配结果
     * @param teacherTitleID
     * @param studentArray
     * @return
     */
    public Boolean insertAllocate(String teacherTitleID, String[] studentArray) throws SQLException;
}
