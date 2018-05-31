package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleSecondcheckinfo;
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
    public List<Map<String, String>> selectProject_ACInfoByCondition(Map<String,String> condition) throws SQLException;

    /**
     * 添加教研室审核信息
     * @param firstCheckInfo
     * @return
     */
    public int insertAuditFirstInfo(List<TeachertitleFirstcheckinfo> firstCheckInfo) throws SQLException;

    /**
     * 添加院长审核信息
     * @param secondCheckInfo
     * @return
     */
    public int insertAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) throws SQLException;

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
     */
    public int deleteAuditSecondInfo(String teacherTitleID) throws SQLException;

    /**
     * 查询教研室审核信息
     * @param teacherTitleID
     * @return
     */
    public TeachertitleFirstcheckinfo selectAuditFisrtInfo(String teacherTitleID) throws SQLException;

    /**
     * * 查询院长审核信息
     * @param teacherTitleID
     * @return
     */
    public TeachertitleSecondcheckinfo selectAuditSecondInfo(String teacherTitleID) throws SQLException;

    /**
     * * 查询审核表信息
     * @param teacherTitleID
     * @return
     */
    public Teachergredesigntitle selectGreDesignTitleInfo(String teacherTitleID) throws SQLException;

    /**
     * 获取专业名称
     * @param majorid
     * @return
     */
    public String selectMajorInfo(String majorid) throws SQLException;
}
