package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.AssignmentVo;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.AssignmentManageMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.AssignmentManageService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@SuppressWarnings("all")
public class AssignmentManageServiceImpl implements AssignmentManageService {

    @Resource
    private AssignmentManageMapper assignmentManageMapper;

    @Override
    public List<Map<String, String>> getStudentInfoByCondition(Map<String, String> condition) throws Exception {
        //1、查询必须初始化的信息
        return assignmentManageMapper.selectStudentInfoByCondition(condition);
    }

    @Override
    public Boolean saveAssignment(AssignmentVo assignmentVo) throws Exception {

        assignmentVo.setBookid(UUIDUtil.getUUID2());//任务书id
        assignmentVo.setIsStudentSign("0");//学生签字为未签字
        int res = assignmentManageMapper.insertAssignment(assignmentVo);

        return res > 0 ? true : false;
    }

    @Override
    public Boolean modifyAssignment(AssignmentVo assignmentVo) throws Exception {

        //删除审核信息
        String bookid = assignmentVo.getBookid();

        assignmentVo.setIsStudentSign("0");//学生签字为未签字

        int res = assignmentManageMapper.updateTaskBookInfo(assignmentVo);

        return res > 0 ? true : false;
    }

    @Override
    public AssignmentVo getProjectInfoDetail(String teacherTitleID, String studentID) throws Exception {

        AssignmentVo assignmentVo = assignmentManageMapper.selectProjectInfoDetail(teacherTitleID, studentID);
        //查询同组人姓名,要排除已有的学生。
        List<String> teamworkStudentNames = assignmentManageMapper.selectTeamworkStudentName(teacherTitleID, studentID);

        String teamworkStudentName = "";
        for (String str : teamworkStudentNames) {
            teamworkStudentName = teamworkStudentName + str + ",";
        }
        teamworkStudentName.substring(0,teamworkStudentName.length() - 1);

        assignmentVo.setTeamworkStudentName(teamworkStudentName);

        return assignmentVo;
    }

    @Override
    public AssignmentVo getInitProjectInfoDetail(String teacherTitleID, String studentID) throws Exception {
        AssignmentVo assignmentVo = assignmentManageMapper.selectInitProjectInfoDetail(teacherTitleID, studentID);
        //查询同组人姓名,要排除已有的学生。
        List<String> teamworkStudentNames = assignmentManageMapper.selectTeamworkStudentName(teacherTitleID, studentID);

        String teamworkStudentName = "";
        for (String str : teamworkStudentNames) {
            teamworkStudentName = teamworkStudentName + str + ",";
        }
        teamworkStudentName.substring(0,teamworkStudentName.length() - 1);

        assignmentVo.setTeamworkStudentName(teamworkStudentName);

        return assignmentVo;
    }

}
