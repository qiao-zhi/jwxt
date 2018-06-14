package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.Project_ACMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
@Transactional
@SuppressWarnings("all")
public class Project_ACServiceImpl implements Project_ACService {

    @Autowired
    private Project_ACMapper project_ACMapper;

    @Override
    public List<Map<String, String>> getProjectInfoByCondition(Map<String, String> condition) throws Exception{
        return project_ACMapper.selectProject_ACInfoByCondition(condition);
    }

    @Override
    public boolean addAuditFirstInfo(TeachertitleFirstcheckinfo firstCheckInfo) throws Exception {

        List<TeachertitleFirstcheckinfo> firstCheckInfos = new ArrayList<TeachertitleFirstcheckinfo>();

        //遍历教师题目ID
        String teachertitleids = firstCheckInfo.getTeacherTitleID();
        String[] teachertitleidsArray = teachertitleids.split(",");

        for (String t : teachertitleidsArray) {
            TeachertitleFirstcheckinfo teachertitleFirstcheckinfo = new TeachertitleFirstcheckinfo();
            //设置主键
            teachertitleFirstcheckinfo.setCheckID(UUIDUtil.getUUID2());
            teachertitleFirstcheckinfo.setCheckResult(firstCheckInfo.getCheckResult());
            teachertitleFirstcheckinfo.setCheckPerson(firstCheckInfo.getCheckPerson());
            teachertitleFirstcheckinfo.setCheckTime(firstCheckInfo.getCheckTime());
            teachertitleFirstcheckinfo.setCheckDesc(firstCheckInfo.getCheckDesc());
            teachertitleFirstcheckinfo.setTeacherTitleID(t);

            firstCheckInfos.add(teachertitleFirstcheckinfo);
        }

        //添加审核信息
        int insertCount = project_ACMapper.insertAuditFirstInfo(firstCheckInfos);

        //更新教师毕业课题题目申请表的审核状态
        String checkStatus = "";
        if(firstCheckInfo.getCheckResult().equals("同意")){
            checkStatus = "1";
        } else {
            checkStatus = "3";
        }
        int updateCount = project_ACMapper.updateAuditStatus(teachertitleidsArray,checkStatus);

        //判断是否审核成功
        if (insertCount == teachertitleidsArray.length &&  updateCount == teachertitleidsArray.length) {
            return true;
        }

        return false;
    }
    @Override
    public boolean addAuditSecondInfo(TeachertitleSecondcheckinfo secondCheckInfo) throws Exception {

        List<TeachertitleSecondcheckinfo> secondCheckInfos = new ArrayList<TeachertitleSecondcheckinfo>();

        //遍历教师题目ID
        String teachertitleids = secondCheckInfo.getTeacherTitleID();
        String[] teachertitleidsArray = teachertitleids.split(",");

        for (String t : teachertitleidsArray) {
            TeachertitleSecondcheckinfo teachertitleSecondcheckinfo = new TeachertitleSecondcheckinfo();
            //设置主键
            teachertitleSecondcheckinfo.setCheckID(UUIDUtil.getUUID2());
            teachertitleSecondcheckinfo.setCheckResult(secondCheckInfo.getCheckResult());
            teachertitleSecondcheckinfo.setCheckPerson(secondCheckInfo.getCheckPerson());
            teachertitleSecondcheckinfo.setCheckTime(secondCheckInfo.getCheckTime());
            teachertitleSecondcheckinfo.setCheckDesc(secondCheckInfo.getCheckDesc());
            teachertitleSecondcheckinfo.setTeacherTitleID(t);

            secondCheckInfos.add(teachertitleSecondcheckinfo);
        }

        //添加审核信息
        int insertCount = project_ACMapper.insertAuditSecondInfo(secondCheckInfos);

        //更新教师毕业课题题目申请表的审核状态
        String checkStatus = "";
        if(secondCheckInfo.getCheckResult().equals("同意")){
            checkStatus = "2";
        } else {
            checkStatus = "3";
        }
        int updateCount = project_ACMapper.updateAuditStatus(teachertitleidsArray,checkStatus);

        if (insertCount == teachertitleidsArray.length &&  updateCount == teachertitleidsArray.length) {
            return true;
        }

        return false;
    }

    @Override
    public Boolean addProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {

        //主键
        teachergredesigntitle.setTeachertitleid(UUIDUtil.getUUID2());
        //审核状态置为0，待审核
        teachergredesigntitle.setCheckstatus("0");

        int count = project_ACMapper.insertProjectInfo(teachergredesigntitle);

        return count > 0 ? true : false;
    }

    @Override
    public Boolean modifyProjectInfo(Teachergredesigntitle teachergredesigntitle) throws Exception {

        //删除审核信息
        String teacherTitleID = teachergredesigntitle.getTeachertitleid();
        project_ACMapper.deleteAuditFisrtInfo(teacherTitleID);
        project_ACMapper.deleteAuditSecondInfo(teacherTitleID);

        //修改课题申请信息的同时，同时把审核信息至为0
        teachergredesigntitle.setCheckstatus("0");

        int count = project_ACMapper.updateProjectInfo(teachergredesigntitle);

        return count > 0 ? true : false;
    }

    @Override
    public TTeacherBaseInfo getProjectTeacherInfo(String teacherNum) throws Exception {
        return project_ACMapper.selectProjectTeacherInfo(teacherNum);
    }

    @Override
    public TeachergredesigntitleDetailVo initProjectInfo(String teacherTitleID) throws Exception {
        return project_ACMapper.selectProjectInfo(teacherTitleID);
    }

    @Override
    public Boolean removeProjectInfo(String teacherTitleID, String isSubmit) throws Exception {
        if (isSubmit.equals("已提交")) {
             //判断是否是提交的数据。删除申请表的同时也要删除审核表。
            project_ACMapper.deleteAuditFisrtInfo(teacherTitleID);
            project_ACMapper.deleteAuditSecondInfo(teacherTitleID);
        }

        int resProjectNum = project_ACMapper.deleteProjectInfo(teacherTitleID);

        return resProjectNum > 0 ? true : false;
    }

    @Override
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception {
        //先判断该课题是否审核。若没有审核。则不查审核表。若审核了，则查   审核了一半也不查
        String checkStatus = project_ACMapper.selectCheckStatusByTeacherTitleID(teacherTitleID);
        String checkValue;
        if (checkStatus.equals("0") || checkStatus.equals("1")) { //不用查
            checkValue = "0";
        } else {
            checkValue = "1";
        }

        return project_ACMapper.selectProjectInfoDetail(teacherTitleID,checkValue);
    }

    @Override
    public List<TeachertitleFirstCheckVo>  getTeachertitleFirstcheckinfo(String teacherTitleID) throws Exception {

        //遍历教师题目ID
        String[] teachertitleidsArray = teacherTitleID.split(",");
        return project_ACMapper.selectAuditFisrtInfo(teachertitleidsArray);
    }

    @Override
    public String getGraDesignIDByCurrentYear(String currentYearNum, String currentSemesterNum) throws Exception {
        return project_ACMapper.selectGraDesignIDByCurrentYear(currentYearNum, currentSemesterNum);
    }

    @Override
    public String getCollege(String teacherNum) throws Exception {
        return project_ACMapper.selectCollege(teacherNum);
    }

    @Override
    public String getTeacherIDByTeacherNum(String teacherNum) throws Exception {
        return project_ACMapper.selectTeacherIDByTeacherNum(teacherNum);
    }

    @Override
    public Teachergredesigntitle c_getProjectInfo(String teacherTitleID) throws Exception {
        return null;
    }

    @Override
    public Boolean releaseProject(String yearNum) throws Exception {

        return null;
    }

}