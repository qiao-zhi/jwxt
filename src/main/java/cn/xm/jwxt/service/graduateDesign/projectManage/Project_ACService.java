package cn.xm.jwxt.service.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleSecondcheckinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface Project_ACService {
    /**
     * 查询选择了课题的学生信息
     * @param condition 课题名称、学年、
     * @return
     */
    List<Map<String,String>> getprojectInfoByCondition(Map<String, String> condition) throws Exception;

    /**
     * 添加教研室审核信息
     * @param firstCheckInfo
     * @return
     */
    public boolean addAuditFirstInfo(TeachertitleFirstcheckinfo firstCheckInfo) throws Exception;

    /**
     * 添加院长审核信息
     * @param secondCheckInfo
     * @return
     */
    public boolean addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) throws Exception;

    /**
     * 添加课题申请信息
     * @param teachergredesigntitle
     * @return
     */
    public Boolean addProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception;

    /**
     * 在添加课题前，要先获取教师信息，初始化申请表
     * @param teacherID
     * @return
     */
    public TTeacherBaseInfo getProjectTeacherInfo(String teacherID) throws Exception;

    /**
     * 修改申请表是，初始化页面
     * @param teacherTitleID
     * @return
     */
    public Teachergredesigntitle initProjectInfo(String teacherTitleID) throws Exception;

    /**
     * 修改申请表
     * @param teachergredesigntitle
     * @return
     */
    public Boolean modifyProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception;

    /**
     * 删除课题信息
     * @param teacherTitleID
     * @return
     */
    public Boolean removeProjectInfo(String teacherTitleID) throws Exception;

    /**
     * 获取课题申请详细信息
     * @param teacherTitleID
     * @return
     */
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception;

    /**
     * 获取教研室审核信息
     * @param teacherTitleID
     * @return
     */
    public TeachertitleFirstcheckinfo getTeachertitleFirstcheckinfo(String teacherTitleID) throws Exception;
}
