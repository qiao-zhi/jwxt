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
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ChooseProjectMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.Project_ACMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseProjectService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class ChooseProjectServiceImpl implements ChooseProjectService {

    @Autowired
    private Project_ACMapper project_ACMapper;
    @Autowired
    private ChooseProjectMapper chooseProjectMapper;

    @Override
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException{
        return chooseProjectMapper.selectProjectInfo(condition);
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception{
        TeachergredesigntitleDetailVo chooseProjectDetailVo = null;

        //获取申请课题信息
        Teachergredesigntitle gredesigntitle = project_ACMapper.selectGreDesignTitleInfo(teacherTitleID);

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
    public List<ChooseProjectVo> getChooseProjectInfo(String studentID) throws Exception{

        //根据学生id，查询学生选题表，再从表中获取数据，查课题信息和教师信息
        List<ChooseProjectVo> chooseProjectInfo = chooseProjectMapper.selectChooseProjectInfo(studentID);

        return chooseProjectInfo;
    }

    @Override
    public boolean saveChooseProject(String choose_titleIDstr)  throws Exception{
        //获取用户信息
        String studentID = "";

        //判断是否提交,如果已提交，直接返回false
        if(!findIsChoose()) {
            return false;
        }

        //删除旧数据，原来选择的课题信息
        chooseProjectMapper.deleteChooseProjectInfo(studentID);

        //生成随机ID
        String studentTitleID = UUIDUtil.getUUID2();

        //用，拆分字符串
        String[] choose_titleID = choose_titleIDstr.split(",");

        Gradesignstudenttitleinfo gradesignstudenttitleinfo = new Gradesignstudenttitleinfo(
                studentTitleID,studentID,choose_titleID[0],choose_titleID[1],"0","","0");

        int res = chooseProjectMapper.insertChooseProject(gradesignstudenttitleinfo);

        return res > 0 ? true : false;
    }

    @Override
    public boolean submitChooseProject(String choose_titleIDstr)  throws Exception{
        //获取用户信息
        String studentID = "";

        //判断是否提交,如果已提交，直接返回false
        if(!findIsChoose()) {
            return false;
        }

        //删除旧数据，原来选择的课题信息
        chooseProjectMapper.deleteChooseProjectInfo(studentID);

        //生成随机ID
        String studentTitleID = UUIDUtil.getUUID2();

        //用，拆分字符串
        String[] choose_titleID = choose_titleIDstr.split(",");

        Gradesignstudenttitleinfo gradesignstudenttitleinfo = new Gradesignstudenttitleinfo(
                studentTitleID,studentID,choose_titleID[0],choose_titleID[1],"0","","1");

        int res = chooseProjectMapper.insertChooseProject(gradesignstudenttitleinfo);

        return res > 0 ? true : false;
    }

    @Override
    public boolean findIsChoose() throws Exception {
        //获取用户信息
        String studentID = "";

        String res = chooseProjectMapper.selectIsChoose(studentID);

        return res.equals("0") ? true : false;
    }
}