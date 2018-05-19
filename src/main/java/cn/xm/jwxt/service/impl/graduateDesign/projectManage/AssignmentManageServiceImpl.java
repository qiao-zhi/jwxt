package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.StudentInfoVo;
import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.AssignmentManageMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ChooseGPStudentMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.AssignmentManageService;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseGPStudentService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AssignmentManageServiceImpl implements AssignmentManageService {

    @Autowired
    private AssignmentManageMapper assignmentManageMapper;

    @Override
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws Exception {
        return assignmentManageMapper.getprojectInfoByCondition(condition);
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
    public Taskbookinfo getTaskBookInfo(String studentID) throws Exception {
        return assignmentManageMapper.selectAssignmentInfo(studentID);
    }

    @Override
    public Taskbookinfo modifyTaskBookInfo(Taskbookinfo taskbookinfo) throws Exception {
        return assignmentManageMapper.updateAssignmentInfo(taskbookinfo);
    }

    @Override
    public Taskbookinfo addTaskBookInfo(Taskbookinfo taskbookinfo) throws Exception {
        taskbookinfo.setBookid(UUIDUtil.getUUID2());
        return assignmentManageMapper.insertTaskBookInfo(taskbookinfo);
    }
}
