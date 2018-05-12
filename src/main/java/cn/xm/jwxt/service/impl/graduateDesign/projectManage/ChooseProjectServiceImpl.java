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
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseProjectService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class ChooseProjectServiceImpl implements ChooseProjectService {

    private Project_ACMapper project_ACMapper;
    @Override
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException{
        return project_ACMapper.selectProject_ACInfo(condition);
    }

    @Override
    public boolean addAuditFirstInfo(TeachertitleFirstcheckinfo firstCheckInfo) throws SQLException {
        return false;
    }

    @Override
    public boolean addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) throws Exception {
        return false;
    }

    @Override
    public Boolean addProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {
        return null;
    }

    @Override
    public TTeacherBaseInfo getProjectTeacherInfo(String teacherID) throws Exception {
        return null;
    }

    @Override
    public Teachergredesigntitle initProjectInfo(String teacherTitleID) throws Exception {
        return null;
    }

    @Override
    public Boolean modifyProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {
        return null;
    }

    @Override
    public Boolean removeProjectInfo(String teacherTitleID) throws Exception {
        return null;
    }

    @Override
    public ChooseProjectDetailVo getProjectInfoDetail(String teacherTitleID) {
        ChooseProjectDetailVo chooseProjectDetailVo = null;

        //获取申请课题信息
        Teachergredesigntitle gredesigntitle = chooseProjectMapper.selectGreDesignTitleInfo(teacherTitleID);

        chooseProjectDetailVo.setTitlename(gredesigntitle.getTitlename());//课题名称
        chooseProjectDetailVo.setProjecttype(gredesigntitle.getProjecttype());//课题类型
        chooseProjectDetailVo.setTitletype(gredesigntitle.getTitletype());//题目类别
        chooseProjectDetailVo.setTitleorigin(gredesigntitle.getTitleorigin());//课题来源
        chooseProjectDetailVo.setResulttype(gredesigntitle.getResulttype());//成果形式
        chooseProjectDetailVo.setGdTime(gredesigntitle.getGdTime());//设计时间
        chooseProjectDetailVo.setReqirestudentnum(gredesigntitle.getReqirestudentnum());//学生人数
        chooseProjectDetailVo.setTargetrequire(gredesigntitle.getTargetrequire());//目标要求
        chooseProjectDetailVo.setResearchcontent(gredesigntitle.getResearchcontent());//研究内容

        return chooseProjectDetailVo;
    }

    @Override
    public TeachertitleFirstcheckinfo getTeachertitleFirstcheckinfo(String teacherTitleID) {
        return null;
    }
}