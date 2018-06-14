package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.ChooseProjectVo;
import cn.xm.jwxt.bean.graduateDesign.Gradesignstudenttitleinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface ChooseProjectMapper {

    /**
     * 初始化选择课题信息
     * @param gradesignstudenttitleinfo
     * @return
     */
    public ChooseProjectVo selectChooseFirstProjectInfo(Gradesignstudenttitleinfo gradesignstudenttitleinfo) throws SQLException;

    /**
     * 初始化选择课题信息
     * @param gradesignstudenttitleinfo
     * @return
     */
    public ChooseProjectVo selectChooseSecondProjectInfo(Gradesignstudenttitleinfo gradesignstudenttitleinfo) throws SQLException;


    /**
     * 保存选择课题
     * @param gradesignstudenttitleinfo
     * @return
     */
    public int insertChooseProject(Gradesignstudenttitleinfo gradesignstudenttitleinfo) throws SQLException;

    /**
     * 删除旧数据
     * @param studentID
     */
    public void deleteChooseProjectInfo(String studentID) throws SQLException;

    /**
     * 根据学号，获取专业
     * @param studentNum
     * @return
     * @throws SQLException
     */
    public String selectMajorIDByStudentNum(String studentNum) throws SQLException;

    /**
     * 查询课题选择界面，表格信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,String>> selectProjectInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 获取课题详细信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public TeachergredesigntitleDetailVo selectProjectInfoDetail(String teacherTitleID) throws SQLException;

    /**
     * 通过学生学号，查询学生ID
     * @param studentNum
     * @return
     * @throws SQLException
     */
    public String selectStudentIDByStudentNum(String studentNum) throws SQLException;

    /**
     * 通过学号，获取学生选题表信息
     * @param studentNum
     * @return
     * @throws SQLException
     */
    public Gradesignstudenttitleinfo selectChooseNum(String studentNum) throws SQLException;
}
