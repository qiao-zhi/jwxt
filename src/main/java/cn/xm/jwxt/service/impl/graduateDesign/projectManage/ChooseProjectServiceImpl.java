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
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Service
public class ChooseProjectServiceImpl implements ChooseProjectService {

    @Autowired
    private Project_ACMapper project_ACMapper;
    @Autowired
    private ChooseProjectMapper chooseProjectMapper;



    @Override
    public List<Map<String, String>> getProjectInfoByCondition(Map<String, String> condition, String userCode) throws SQLException{

        //通过学生学号，查询学生的专业
        String majorID = chooseProjectMapper.selectMajorIDByStudentNum(userCode);

        //获取当前学年
        String yearNum = DateHandler.getCurrentYearNum();

        condition.put("majorID",majorID);
        condition.put("yearNum",yearNum);

        return chooseProjectMapper.selectProjectInfoByCondition(condition);
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception{
        //获取申请课题信息
        return chooseProjectMapper.selectProjectInfoDetail(teacherTitleID);
    }

    @Override
    public List<ChooseProjectVo> getChooseProjectInfo(String studentID) throws Exception{
        return chooseProjectMapper.selectChooseProjectInfo(studentID);
    }

    @Override
    public boolean saveChooseProject(Gradesignstudenttitleinfo gradesignstudenttitleinfo)  throws Exception{

        //删除旧数据，原来选择的课题信息
        chooseProjectMapper.deleteChooseProjectInfo(gradesignstudenttitleinfo.getStudentid());

        int res = chooseProjectMapper.insertChooseProject(gradesignstudenttitleinfo);

        return res > 0 ? true : false;
    }

    @Override
    public boolean submitChooseTeacher() throws Exception {

        //获取用户信息
        String studentID = "";

        Boolean res = chooseProjectMapper.insertChooseTeacher(studentID);

        return res;
    }
}