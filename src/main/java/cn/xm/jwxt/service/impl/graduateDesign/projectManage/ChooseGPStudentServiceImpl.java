package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ChooseGPStudentMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ProjectManageMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.Project_ACMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseGPStudentService;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ChooseGPStudentServiceImpl implements ChooseGPStudentService {

    @Autowired
    private ChooseGPStudentMapper chooseGPStudentMapper;

    @Override
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws Exception {
        return chooseGPStudentMapper.getprojectInfoByCondition(condition);
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfo(String teacherTitleID) throws Exception {
        return chooseGPStudentMapper.selectProjectInfo(teacherTitleID);
    }

    @Override
    public StudentInfoVo getStudentInfo(String teacherTitleID) throws Exception {
        return chooseGPStudentMapper.selectStudentInfo(teacherTitleID);
    }

    @Override
    public Boolean submitChooseStudent(String teacherTitleID, String studentIDs) throws Exception {

        List<Studenttitleresult> studenttitleresultList = new ArrayList<Studenttitleresult>();

        String[] studentIDArray = studentIDs.split(",");
        for (String studentID : studentIDArray) {
            Studenttitleresult studenttitleresult = new Studenttitleresult();
            studenttitleresult.setStudenttitleresultid(UUIDUtil.getUUID2()); //id
            studenttitleresult.setStudentid(studentID); //studentId
            studenttitleresult.setTeachertitleid(teacherTitleID); //teacherTitleID
            studenttitleresult.setFinallyname("");

            //查询学生是否校外


        }

        //taskbookinfo.setBookid(UUIDUtil.getUUID2());
        return null;
    }
}
