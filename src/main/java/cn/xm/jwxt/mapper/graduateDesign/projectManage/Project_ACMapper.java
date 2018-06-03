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
     * @param teathertitleidsArray
     * @param checkStatus
     * @return
     */
    public int updateAuditStatus(@Param("teathertitleidsArray") String[] teathertitleidsArray, @Param("checkStatus") String checkStatus) throws SQLException;

    /**
     * 更新一个教师毕业课题题目申请表的审核状态
     * @param teathertitleid
     * @param checkStatus
     * @return
     */
    public int updateOneAuditStatus(@Param("teathertitleids") String teathertitleid, @Param("checkStatus") String checkStatus) throws SQLException;

    /**
     * 添加课题信息
     * @param teachergredesigntitle
     * @return
     */
    public int insertProjectInfo(Teachergredesigntitle teachergredesigntitle) throws SQLException;

    /**
     * 在添加课题前，要先获取教师信息，初始化申请表
     * @param teacherID
     * @return
     */
    public TTeacherBaseInfo selectProjectTeacherInfo(String teacherID) throws SQLException;

    /**
     * 修改申请表之前，初始化页面
     * @param teacherTitleID
     * @return
     */
    public Teachergredesigntitle selectProjectInfo(String teacherTitleID) throws SQLException;

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
     * @param teacherTitleID
     * @return
     */
    public List<TeachertitleFirstCheckVo> selectAuditFisrtInfo(String[] teacherTitleID) throws SQLException;

    /**
     * 在添加课题前，判断是否有本学期的毕业设计基本信息
     * @param currentYearNum
     * @return graDesignID
     * @throws SQLException
     */
    public String selectGraDesignIDByCurrentYear(@Param("currentYearNum") String currentYearNum, @Param("currentSemesterNum") String currentSemesterNum) throws SQLException;

    /**
     * 初始化学院信息
     * @param teacherID
     * @return
     * @throws SQLException
     */
    public String selectCollege(String teacherID) throws SQLException;

    /**
     * 获得课题详细信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public TeachergredesigntitleDetailVo selectProjectInfoDetail(String teacherTitleID) throws SQLException;
}
