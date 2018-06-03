package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentChooseProjectInfo;
import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.mapper.arrangeCourse.ApArrangeCourseTaskMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ProjectManageMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Date;

@Service
public class ProjectManageServiceImpl implements ProjectManageService {

    @Resource
    private ProjectManageMapper projectManageMapper;

    @Override
    public List<Map<String, Object>> getSelfStudentInfo(Map<String, Object> condition) throws Exception {
        return null;
    }

    /**
     * 查询当前登录系统的教师负责的学生数量
     * @param year 默认当前年份
     * @param teacherId  教师id
     * @return 学生数量
     */
    public int getSelfStudentNum(String year, String teacherId)  throws Exception {

        //判断年份是否为空，若为空，获取当前年份
        if(ValidateCheck.isNull(year)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            Date date = new Date();
            year = sdf.format(date);
        }

        if(ValidateCheck.isNull(teacherId)) {
            throw new IllegalArgumentException("教师id不能为空!");
        }

        int count = projectManageMapper.selectCountSelfStudent(year, teacherId);

        return count;
    }

    @Override
    public List<Map<String, String>> getProjectInfo(Map<String, String> condition) throws Exception {
        return projectManageMapper.selectProjectInfo(condition);
    }

    @Override
    public StudentChooseProjectInfo getStudentInfo()  throws Exception {
        //查询课题申请表信息、教师信息
        return projectManageMapper.getStudentInfo();
    }

    @Override
    public Boolean saveAllocate(String teacherTitleID, String[] studentArray) throws Exception {
        return projectManageMapper.insertAllocate(teacherTitleID, studentArray);
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
