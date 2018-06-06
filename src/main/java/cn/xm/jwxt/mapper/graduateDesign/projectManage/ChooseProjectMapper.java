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
     * @param studentID
     * @return
     */
    public List<ChooseProjectVo> selectChooseProjectInfo(String studentID) throws SQLException;

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
     * 提交学生选择校外毕设的指导老师
     * @param studentID
     * @return
     */
    public Boolean insertChooseTeacher(String studentID) throws SQLException;

    /**
     * 根据学号，获取专业
     * @param userCode
     * @return
     * @throws SQLException
     */
    public String selectMajorIDByStudentNum(String userCode) throws SQLException;

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
     * 通过学号，
     * @param studentNum
     * @return
     * @throws SQLException
     */
    public String selectStudentIDByStudentNum(String studentNum)throws SQLException;

}
