/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckarrangeinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 20:50
 * Description: 毕设中期检查实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.Project_ACMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class Project_ACServiceImpl implements Project_ACService {

    @Autowired
    private Project_ACMapper project_ACMapper;

    @Override
    public List<Map<String, String>> getProjectInfoByCondition(Map<String, String> condition) throws Exception{
        return project_ACMapper.selectProject_ACInfoByCondition(condition);
    }

    @Override
    public boolean addAuditFirstInfo(TeachertitleFirstcheckinfo firstCheckInfo) throws Exception {

        List<TeachertitleFirstcheckinfo> firstCheckInfos = new ArrayList<TeachertitleFirstcheckinfo>();

        //遍历教师题目ID
        String teathertitleids = firstCheckInfo.getTeatherTitleID();
        String[] teathertitleidsArray = teathertitleids.split(",");

        for (String t : teathertitleidsArray) {
            TeachertitleFirstcheckinfo teachertitleFirstcheckinfo = new TeachertitleFirstcheckinfo();
            //设置主键
            teachertitleFirstcheckinfo.setCheckID(UUIDUtil.getUUID2());
            teachertitleFirstcheckinfo.setCheckResult(firstCheckInfo.getCheckResult());
            teachertitleFirstcheckinfo.setCheckPerson(firstCheckInfo.getCheckPerson());
            teachertitleFirstcheckinfo.setCheckTime(firstCheckInfo.getCheckTime());
            teachertitleFirstcheckinfo.setCheckDesc(firstCheckInfo.getCheckDesc());
            teachertitleFirstcheckinfo.setTeatherTitleID(t);

            firstCheckInfos.add(teachertitleFirstcheckinfo);
        }

        //添加审核信息
        int insertCount = project_ACMapper.insertAuditFirstInfo(firstCheckInfos);

        //更新教师毕业课题题目申请表的审核状态
        String checkStatus = "";
        if(firstCheckInfo.getCheckResult().equals("同意")){
            checkStatus = "1";
        } else {
            checkStatus = "3";
        }
        int updateCount = project_ACMapper.updateAuditStatus(teathertitleidsArray,checkStatus);

        //判断是否审核成功
        if (insertCount == teathertitleidsArray.length &&  updateCount == teathertitleidsArray.length) {
            return true;
        }

        return false;
    }
    @Override
    public boolean addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) throws Exception {

        List<TeachertitleSecondcheckinfo> secondCheckInfos = new ArrayList<TeachertitleSecondcheckinfo>();

        //遍历教师题目ID
        String teathertitleids = secondCheckInfo.getTeatherTitleID();
        String[] teathertitleidsArray = teathertitleids.split(",");

        for (String t : teathertitleidsArray) {
            TeachertitleSecondcheckinfo teachertitleSecondcheckinfo = new TeachertitleSecondcheckinfo();
            //设置主键
            teachertitleSecondcheckinfo.setCheckID(UUIDUtil.getUUID2());
            teachertitleSecondcheckinfo.setCheckResult(secondCheckInfo.getCheckResult());
            teachertitleSecondcheckinfo.setCheckPerson(secondCheckInfo.getCheckPerson());
            teachertitleSecondcheckinfo.setCheckTime(secondCheckInfo.getCheckTime());
            teachertitleSecondcheckinfo.setCheckDesc(secondCheckInfo.getCheckDesc());
            teachertitleSecondcheckinfo.setTeatherTitleID(t);

            secondCheckInfos.add(teachertitleSecondcheckinfo);
        }

        //添加审核信息
        int insertCount = project_ACMapper.insertAuditSecondInfo(secondCheckInfos);

        //更新教师毕业课题题目申请表的审核状态
        String checkStatus = "";
        if(secondCheckInfo.getCheckResult().equals("同意")){
            checkStatus = "2";
        } else {
            checkStatus = "3";
        }
        int updateCount = project_ACMapper.updateAuditStatus(teathertitleidsArray,checkStatus);

        if (insertCount == teathertitleidsArray.length &&  updateCount == teathertitleidsArray.length) {
            return true;
        }

        return false;
    }

    @Override
    public Boolean addProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {

        //主键
        teachergredesigntitle.setTeachertitleid(UUIDUtil.getUUID2());
        //审核状态置为0，待审核
        teachergredesigntitle.setCheckstatus("0");

        int count = project_ACMapper.insertProjectInfo(teachergredesigntitle);

        return count > 0 ? true : false;
    }

    @Override
    public Boolean modifyProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {

        //删除审核信息
        String teacherTitleID = teachergredesigntitle.getTeachertitleid();
        project_ACMapper.deleteAuditFisrtInfo(teacherTitleID);
        project_ACMapper.deleteAuditSecondInfo(teacherTitleID);

        //修改课题申请信息的同时，同时把审核信息至为0
        teachergredesigntitle.setCheckstatus("0");

        int count = project_ACMapper.updateProjectInfo(teachergredesigntitle);

        return count > 0 ? true : false;
    }

    @Override
    public TTeacherBaseInfo getProjectTeacherInfo(String teacherID) throws Exception {
        return project_ACMapper.selectProjectTeacherInfo(teacherID);
    }

    @Override
    public Teachergredesigntitle initProjectInfo(String teacherTitleID) throws Exception {
        return project_ACMapper.selectProjectInfo(teacherTitleID);
    }

    @Override
    public Boolean removeProjectInfo(String teacherTitleID, String isSubmit) throws Exception {
        if (isSubmit.equals("已提交")) {
             //判断是否是提交的数据。删除申请表的同时也要删除审核表。
            project_ACMapper.deleteAuditFisrtInfo(teacherTitleID);
            project_ACMapper.deleteAuditSecondInfo(teacherTitleID);
        }

        int resProjectNum = project_ACMapper.deleteProjectInfo(teacherTitleID);

        return resProjectNum > 0 ? true : false;
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception {
        return project_ACMapper.selectProjectInfoDetail(teacherTitleID);
    }

    @Override
    public List<TeachertitleFirstCheckVo>  getTeachertitleFirstcheckinfo(String teacherTitleID) throws Exception {

        //遍历教师题目ID
        String[] teathertitleidsArray = teacherTitleID.split(",");

        return project_ACMapper.selectAuditFisrtInfo(teathertitleidsArray);
    }

    @Override
    public String getGraDesignIDByCurrentYear(String currentYearNum, String currentSemesterNum) throws Exception {
        return project_ACMapper.selectGraDesignIDByCurrentYear(currentYearNum, currentSemesterNum);
    }

    @Override
    public String getCollege(String teacherID) throws Exception {
        return project_ACMapper.selectCollege(teacherID);
    }

}