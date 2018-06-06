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

import cn.xm.jwxt.bean.graduateDesign.ChooseProjectVo;
import cn.xm.jwxt.bean.graduateDesign.Gradesignstudenttitleinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ChooseProjectMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.Project_ACMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseProjectService;
import cn.xm.jwxt.utils.DateHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class ChooseProjectServiceImpl implements ChooseProjectService {

    @Autowired
    private Project_ACMapper project_ACMapper;
    @Autowired
    private ChooseProjectMapper chooseProjectMapper;



    @Override
    public List<Map<String, String>> getProjectInfoByCondition(Map<String, String> condition) throws SQLException{

        //获取当前学年
        String yearNum = DateHandler.getCurrentYearNum();
        condition.put("yearNum",yearNum);

        return chooseProjectMapper.selectProjectInfoByCondition(condition);
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception{
        //获取申请课题信息
        return chooseProjectMapper.selectProjectInfoDetail(teacherTitleID);
    }

    @Override
    public List<ChooseProjectVo> getChooseProjectInfo(String studentNum) throws Exception{
        return chooseProjectMapper.selectChooseProjectInfo(studentNum);
    }

    @Override
    public boolean saveChooseProject(Gradesignstudenttitleinfo gradesignstudenttitleinfo)  throws Exception{

        //删除旧数据，原来选择的课题信息
        chooseProjectMapper.deleteChooseProjectInfo(gradesignstudenttitleinfo.getStudentid());

        int res = chooseProjectMapper.insertChooseProject(gradesignstudenttitleinfo);

        return res > 0 ? true : false;
    }

    @Override
    public String getStudentIDByStudentNum(String studentNum) throws Exception {
        return chooseProjectMapper.selectStudentIDByStudentNum(studentNum);
    }

    @Override
    public String getMajorIDByStudentNum(String studentNum) throws Exception {
        return chooseProjectMapper.selectStudentIDByStudentNum(studentNum);
    }
}