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
import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleSecondcheckinfo;
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

    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException{
        return project_ACMapper.selectProject_ACInfo(condition);
    }

    public boolean addAuditFirstInfo(TeachertitleFirstcheckinfo firstCheckInfo) throws SQLException {
        if(firstCheckInfo==null){
            throw new IllegalArgumentException("审核信息不能为空!");
        }

        List<TeachertitleFirstcheckinfo> firstCheckInfos = new ArrayList<TeachertitleFirstcheckinfo>();

        //遍历教师题目ID
        String teathertitleids = firstCheckInfo.getTeathertitleid();
        String[] teathertitleidsArray = teathertitleids.split(",");

        for (String t : teathertitleidsArray) {
            TeachertitleFirstcheckinfo teachertitleFirstcheckinfo = new TeachertitleFirstcheckinfo();
            //设置主键
            teachertitleFirstcheckinfo.setCheckid(UUIDUtil.getUUID2());
            teachertitleFirstcheckinfo.setCheckresult(firstCheckInfo.getCheckresult());
            teachertitleFirstcheckinfo.setCheckperson(firstCheckInfo.getCheckperson());
            teachertitleFirstcheckinfo.setChecktime(firstCheckInfo.getChecktime());
            teachertitleFirstcheckinfo.setCheckdesc(firstCheckInfo.getCheckdesc());
            teachertitleFirstcheckinfo.setTeathertitleid(t);

            firstCheckInfos.add(teachertitleFirstcheckinfo);
        }

        //添加审核信息
        int insertCount = project_ACMapper.insertAuditFirstInfo(firstCheckInfos);

        //更新教师毕业课题题目申请表的审核状态
        String checkStatus = "";
        if(firstCheckInfo.getCheckresult().equals("同意")){
            checkStatus = "1";
        } else {
            checkStatus = "3";
        }
        int updateCount = project_ACMapper.updateAuditStatus(teathertitleidsArray,checkStatus);

        if (insertCount == teathertitleidsArray.length &&  updateCount == teathertitleidsArray.length) {
            return true;
        }

        return false;
    }

    public boolean addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) throws SQLException {
        if(secondCheckInfo == null){
            throw new IllegalArgumentException("审核信息不能为空!");
        }

        TeachertitleSecondcheckinfo teachertitleSecondcheckinfo = new TeachertitleSecondcheckinfo();

        teachertitleSecondcheckinfo.setCheckid(UUIDUtil.getUUID2());
        teachertitleSecondcheckinfo.setCheckresult(secondCheckInfo.getCheckresult());
        teachertitleSecondcheckinfo.setCheckperson(secondCheckInfo.getCheckperson());
        teachertitleSecondcheckinfo.setChecktime(secondCheckInfo.getChecktime());
        teachertitleSecondcheckinfo.setCheckdesc(secondCheckInfo.getCheckdesc());

        //遍历教师题目ID
        String teathertitleid = secondCheckInfo.getTeathertitleid();

        //添加审核信息
        int insertCount = project_ACMapper.insertAuditSecondInfo(teachertitleSecondcheckinfo);

        //更新教师毕业课题题目申请表的审核状态
        String checkStatus = "";
        if(secondCheckInfo.getCheckresult().equals("同意")){
            checkStatus = "2";
        } else {
            checkStatus = "3";
        }
        int updateCount = project_ACMapper.updateOneAuditStatus(teathertitleid,checkStatus);

        if (insertCount == 1 &&  updateCount == 1) {
            return true;
        }

        return false;
    }

    @Override
    public Boolean addProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {

        //看一下传过来的队形，再操作

        //设置主键
//        taskInfo.setArrangeTaskId(UUIDUtil.getUUID2());

        int count = project_ACMapper.insertProjectInfo(teachergredesigntitle);

        return count > 0 ? true : false;
    }

    @Override
    public Boolean modifyProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {

        //删除审核信息。

        /**
         * 修改课题申请信息的同时，同时把审核信息至为0
         */
        int count = project_ACMapper.updateProjectInfo(teachergredesigntitle);

        return count > 0 ? true : false;
    }

    @Override
    public TTeacherBaseInfo getProjectTeacherInfo(String teacherID) throws Exception {

        return project_ACMapper.selectProjectTeacherInfo(teacherID);
    }

    @Override
    public Teachergredesigntitle initProjectInfo(String teacherTitleID) throws Exception {

        //查询课题申请表信息、教师信息
        return project_ACMapper.selectProjectInfo(teacherTitleID);
    }

    @Override
    public Boolean removeProjectInfo(String teacherTitleID) throws Exception {
        //删除申请表的同时也要删除审核表。
        project_ACMapper.deleteAuditFisrtInfo(teacherTitleID);
        project_ACMapper.deleteAuditSecondInfo(teacherTitleID);

        int resProjectNum = project_ACMapper.deleteProjectInfo(teacherTitleID);

        return resProjectNum > 0 ? true : false;
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) {

        //获取教研室审核信息
        TeachertitleFirstcheckinfo firstcheckinfo = getTeachertitleFirstcheckinfo(teacherTitleID);
        //获取院长审核信息
        TeachertitleSecondcheckinfo secondcheckinfo = project_ACMapper.selectAuditSecondInfo(teacherTitleID);
        //获取申请课题信息
        Teachergredesigntitle gredesigntitle = project_ACMapper.selectGreDesignTitleInfo(teacherTitleID);
        //获取教师信息
        TTeacherBaseInfo tTeacherBaseInfo = project_ACMapper.selectProjectTeacherInfo(gredesigntitle.getTeacherid());

        TeachergredesigntitleDetailVo titleDetailVo = null;

        //审核信息
        titleDetailVo.setCheckFirstDesc(firstcheckinfo.getCheckdesc());
        titleDetailVo.setCheckFirstResult(firstcheckinfo.getCheckresult());
        titleDetailVo.setCheckSecondDesc(secondcheckinfo.getCheckdesc());
        titleDetailVo.setCheckSecondResult(secondcheckinfo.getCheckresult());

        titleDetailVo.setTitlename(gredesigntitle.getTitlename());//课题名称
        titleDetailVo.setProjecttype(gredesigntitle.getProjecttype());//课题类型
        titleDetailVo.setTitletype(gredesigntitle.getTitletype());//题目类别
        titleDetailVo.setTitleorigin(gredesigntitle.getTitleorigin());//课题来源
        titleDetailVo.setResulttype(gredesigntitle.getResulttype());//成果形式
        titleDetailVo.setGdTime(gredesigntitle.getGdTime());//设计时间

        titleDetailVo.setTeacherName(tTeacherBaseInfo.getTeachername());//教师名称
        titleDetailVo.setPositionalTitle(tTeacherBaseInfo.getPositionaltitle());//教师职称
        titleDetailVo.setDegree(tTeacherBaseInfo.getDegree());//教师学位

        //根据专业id，获取专业名称
        titleDetailVo.setMajorName(project_ACMapper.selectMajorInfo(tTeacherBaseInfo.getMajorid()));
        titleDetailVo.setReqirestudentnum(gredesigntitle.getReqirestudentnum());//学生人数
        titleDetailVo.setApplyTime(gredesigntitle.getApplyTime());//申请时间
        titleDetailVo.setTargetrequire(gredesigntitle.getTargetrequire());//目标要求
        titleDetailVo.setResearchcontent(gredesigntitle.getResearchcontent());//研究内容

        return titleDetailVo;
    }

    @Override
    public TeachertitleFirstcheckinfo getTeachertitleFirstcheckinfo(String teacherTitleID) {
        return project_ACMapper.selectAuditFisrtInfo(teacherTitleID);
    }


}