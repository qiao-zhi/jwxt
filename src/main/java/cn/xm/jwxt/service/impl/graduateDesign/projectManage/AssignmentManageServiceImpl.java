package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.AssignmentManageMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ChooseGPStudentMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.AssignmentManageService;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseGPStudentService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class AssignmentManageServiceImpl implements AssignmentManageService {

    @Autowired
    private AssignmentManageMapper assignmentManageMapper;

    @Override
    public List<Map<String, String>> getStudentInfoByCondition(Map<String, String> condition) throws Exception {
        return null;
    }

    @Override
    public StudentInfoVo getStudentInfo(String teacherTitleID) throws Exception {
        //根据教师题目id获取学生信息和任务书填写情况
        //1、根据教师题目id查询学生选题最终表.获取学生id，结果id
        //2、学生id，查询学生信息和班级信息
        StudentInfoVo studentInfoVo = assignmentManageMapper.selectStudentInfo(teacherTitleID);
        // 教师题目id.如果isconfirm为null、“” 至为-1
        if (studentInfoVo.getFillStatus().equals("") || studentInfoVo.getFillStatus() == null) {
            studentInfoVo.setFillStatus("-1");
        }

        return studentInfoVo;
    }

    @Override
    public AssignmentVo getAssignmentInfo(String teacherTitleID, String studentID) throws Exception {

        //1、查询必须初始化的信息
        AssignmentVo assignmentVo2 = assignmentManageMapper.selectAssignmentInitInfo(teacherTitleID, studentID);

        //2、查询保存的初始化信息
        AssignmentVo assignmentVo = assignmentManageMapper.selectAssignmentSaveInfo(studentID);

        if (assignmentVo != null) {
            assignmentVo.setStudentID(assignmentVo2.getStudentID());
            assignmentVo.setStudentName(assignmentVo2.getStudentName());
            assignmentVo.setClassName(assignmentVo2.getClassName());
            assignmentVo.setTeamworkStudentName(assignmentVo2.getTeamworkStudentName());

            return assignmentVo;
        }
        return assignmentVo2;
    }

    //获取任务书对象
    public Taskbookinfo getTaskbookinfo(AssignmentVo assignmentVo) throws Exception  {
        Taskbookinfo taskbookinfo = new Taskbookinfo();

        taskbookinfo.setBookid(UUIDUtil.getUUID2());
        taskbookinfo.setStudenttitleresultid(assignmentVo.getStudenttitleresultid());
        taskbookinfo.setTaskcontent(assignmentVo.getTaskcontent());
        taskbookinfo.setTaskedittime(assignmentVo.getTaskedittime());
        taskbookinfo.setTasksendtime(assignmentVo.getTasksendtime());
        taskbookinfo.setTaskcompletetime(assignmentVo.getTaskcompletetime());
        taskbookinfo.setThesistitle(assignmentVo.getThesistitle());
        taskbookinfo.setDesigntargetrequire(assignmentVo.getDesigntargetrequire());
        taskbookinfo.setDesigncontent(assignmentVo.getDesigncontent());
        taskbookinfo.setDesignsubmitfile(assignmentVo.getDesignsubmitfile());
        taskbookinfo.setGdTitle(assignmentVo.getGdTitle());
        taskbookinfo.setFillStatus(assignmentVo.getFillStatus());
        taskbookinfo.setCheckStatus(assignmentVo.getCheckStatus());
        taskbookinfo.setIsStudentSign(assignmentVo.getIsStudentSign());

        return taskbookinfo;
    }

    //获取毕业基本信息对象
    public Gradeuatebaseinfo getGradeuatebaseinfo(AssignmentVo assignmentVo) throws Exception  {
        Gradeuatebaseinfo gradeuatebaseinfo = new Gradeuatebaseinfo();

        gradeuatebaseinfo.setGradesignid(UUIDUtil.getUUID2());
        gradeuatebaseinfo.setGraduatedesignname(assignmentVo.getGdTitle());
        gradeuatebaseinfo.setGraduatedesc("");

        //计算学期和学年
        String yearnum = "";
        String semesternum = "一";//学期
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = df.format(date);
        String[] dateArray = dateStr.split("-");
        yearnum = dateArray[0];
        Integer month = Integer.valueOf(dateArray[1]) + 1;
        Integer day = Integer.valueOf(dateArray[2]);
        if (month <= 7 && day < 15) {
            semesternum = "二";
        }
        gradeuatebaseinfo.setYearnum(yearnum);
        gradeuatebaseinfo.setSemesternum(semesternum);

        //获取专业id
        String majorid = assignmentManageMapper.selectMajorID(assignmentVo.getStudentID());
        gradeuatebaseinfo.setMajorid(majorid);

        return gradeuatebaseinfo;
    }

    @Override
    public Boolean saveAssignment(AssignmentVo assignmentVo) throws Exception {
        //1、保存任务表信息
        Taskbookinfo taskbookinfo = getTaskbookinfo(assignmentVo);
        int res1 = assignmentManageMapper.insertTaskBookInfo(taskbookinfo);

        //2、给毕业基本信息表添加数据
        Gradeuatebaseinfo gradeuatebaseinfo = getGradeuatebaseinfo(assignmentVo);
        int res2 = assignmentManageMapper.insertGradeuatebaseinfo(gradeuatebaseinfo);

        return false;
    }

    @Override
    public Boolean modifyAssignment(AssignmentVo assignmentVo) throws Exception {

        //1、修改任务书信息
        Taskbookinfo taskbookinfo = getTaskbookinfo(assignmentVo);
        taskbookinfo.setCheckStatus("0");    //更新审核状态，置为未审核
        int res1 = assignmentManageMapper.updateTaskBookInfo(taskbookinfo);

        //2、更新毕业基本信息
        Gradeuatebaseinfo gradeuatebaseinfo = getGradeuatebaseinfo(assignmentVo);
        int res2 = assignmentManageMapper.updateGradeuatebaseinfo(gradeuatebaseinfo);

        return false;
    }

    @Override
    public TaskBooktFirstCheckInfo getAuditFirstInfo(String bookID) throws Exception {
        return assignmentManageMapper.selectAuditFirstInfo(bookID);
    }

    @Override
    public Boolean addAuditSecondInfo(TaskBookSecondCheckInfo taskBookCheckInfo) throws Exception {

        taskBookCheckInfo.setCheckID(UUIDUtil.getUUID2());

        int res = assignmentManageMapper.insertAuditSecondInfo(taskBookCheckInfo);

        return res >= 1 ? true : false;
    }

    @Override
    public Boolean addAuditFirstInfo(TaskBookSecondCheckInfo taskBookCheckInfo) throws Exception {

        taskBookCheckInfo.setCheckID(UUIDUtil.getUUID2());

        int res = assignmentManageMapper.insertAuditFirstInfo(taskBookCheckInfo);

        return res >= 1 ? true : false;
    }

}
