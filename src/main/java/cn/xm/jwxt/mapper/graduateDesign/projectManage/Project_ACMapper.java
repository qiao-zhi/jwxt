package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface Project_ACMapper {

    /**
     * 查询课题申请管理界面，表格信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> selectProject_ACInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 添加教研室审核信息
     * @param firstCheckInfo
     * @return
     */
    public int insertAuditFirstInfo(List<TeachertitleFirstcheckinfo> firstCheckInfo) throws SQLException;

    /**
     * 添加院长审核信息
     * @param secondCheckInfos
     * @return
     */
    public int insertAuditSecondInfo(List<TeachertitleSecondcheckinfo> secondCheckInfos) throws SQLException;

    /**
     * 更新多个教师毕业课题题目申请表的审核状态
     * @param teachertitleidsArray
     * @param checkStatus
     * @return
     */
    public int updateAuditStatus(@Param("teachertitleidsArray") String[] teachertitleidsArray, @Param("checkStatus") String checkStatus) throws SQLException;

    /**
     * 更新一个教师毕业课题题目申请表的审核状态
     * @param teachertitleid
     * @param checkStatus
     * @return
     */
    public int updateOneAuditStatus(@Param("teachertitleids") String teachertitleid, @Param("checkStatus") String checkStatus) throws SQLException;

    /**
     * 添加课题信息
     * @param teachergredesigntitle
     * @return
     */
    public int insertProjectInfo(Teachergredesigntitle teachergredesigntitle) throws SQLException;

    /**
     * 在添加课题前，要先获取教师信息，初始化申请表
     * @param teacherNum
     * @return
     */
    public TTeacherBaseInfo selectProjectTeacherInfo(String teacherNum) throws SQLException;

    /**
     * 修改申请表之前，初始化页面
     * @param teacherTitleID
     * @return
     */
    public TeachergredesigntitleDetailVo selectProjectInfo(String teacherTitleID) throws SQLException;

    /**
     * 修改申请表
     * @param teachergredesigntitle
     * @return
     */
    public int updateProjectInfo(Teachergredesigntitle teachergredesigntitle) throws SQLException;

    /**
     * 删除课题信息
     * @param teacherTitleID
     * @return
     */
    public int deleteProjectInfo(String teacherTitleID) throws SQLException;

    /**
     * 删除教研室审核信息
     * @param teacherTitleID
     * @return
     */
    public int deleteAuditFisrtInfo(String teacherTitleID) throws SQLException;


    /**
     * 删除院长审核信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public int deleteAuditSecondInfo(String teacherTitleID) throws SQLException;

    /**
     * 查询教研室审核信息
     * @param teachertitleidsArray
     * @return
     */
    public List<TeachertitleFirstCheckVo> selectAuditFisrtInfo(String[] teachertitleidsArray) throws SQLException;

    /**
     * 在添加课题前，判断是否有本学期的毕业设计基本信息
     * @param yearNum
     * @param semesterNum
     * @return
     * @throws SQLException
     */
    public String selectGraDesignIDByCurrentYear(@Param("yearNum") String yearNum, @Param("semesterNum") String semesterNum) throws SQLException;

    /**
     * 初始化学院信息
     * @param teacherNum
     * @return
     * @throws SQLException
     */
    public String selectCollege(String teacherNum) throws SQLException;

    /**
     * 获得课题详细信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public TeachergredesigntitleDetailVo selectProjectInfoDetail(@Param("teacherTitleID") String teacherTitleID,@Param("checkValue") String checkValue) throws SQLException;

    /**
     * 根据教师编号，获取教师id
     * @param teacherNum
     * @return
     * @throws SQLException
     */
    public String selectTeacherIDByTeacherNum(String teacherNum) throws SQLException;

    /**
     * 根据课题id，查询审核状态
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public String selectCheckStatusByTeacherTitleID(String teacherTitleID) throws SQLException;
}
