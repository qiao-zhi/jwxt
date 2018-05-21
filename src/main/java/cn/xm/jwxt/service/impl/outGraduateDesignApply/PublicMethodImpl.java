package cn.xm.jwxt.service.impl.outGraduateDesignApply;


import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.*;
import cn.xm.jwxt.mapper.baseInfo.SigninfoMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.*;
import cn.xm.jwxt.service.outGraduateDesignApply.PublicMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Service
@SuppressWarnings("all")
@Transactional
public class PublicMethodImpl implements PublicMethod{
    @Autowired
    private SigninfoMapper signinfoMapper;
    @Autowired
    private OutgradesigninfoMapper infoMapper;
    @Autowired
    private OutgradesigntitleapplyMapper titleMapper;
    @Autowired
    private GradesignleaveapplyMapper leaveMapper;
    @Autowired
    private OutgradesignsurebookMapper sureBookMapper;
    @Autowired
    private OutsidegradesignagreemenMapper aggreementMapper;
    @Autowired
    private OutsidegradesignattachmentMapper attachmentMapper;
    @Autowired
    private OutgraduateassignmentMapper assignmentMapper;



    @Override
    public Map<String,Object> sureStudentSign(String userID, String signPassword) throws SQLException {
        Map<String,Object> map = new HashMap<String,Object>();
        Signinfo signInfo = signinfoMapper.selectByPrimaryKey(userID);
        if(signInfo!=null){
            String password = signInfo.getSignpassword();
            if(signPassword.equals(password)){
                map.put("status","1");
                map.put("signInfo",signInfo);
                return map;
            } else {
                map.put("status","0");
                return map;
            }
        }
        map.put("status","2");
        return map;
    }

    /**
     * 初始化表
     * @param map
     * @return
     * @throws SQLException
     */
    @Override
    public Boolean initializationApplyInfo(Map<String, Object> map) throws SQLException {
        String outsideApplyID = (String)map.get("outsideApplyID");
        String leaveID = (String)map.get("leaveID");
        String titleID = (String)map.get("titleID");
        String agreementID = (String)map.get("agreementID");
        String attachmentID = (String)map.get("attachmentID");
        String sureID = (String)map.get("sureID");
        String assignmentID = (String)map.get("assignmentID");
        /*创建所有表的对象*/
        Outgradesigninfo info = new Outgradesigninfo();
        info.setOutsideapplyid(outsideApplyID);
        info.setIscommit("20");
        int num = infoMapper.updateByPrimaryKeySelective(info);
        Outgradesigntitleapply title = new Outgradesigntitleapply();
        title.setOutgradesignapplyid(titleID);
        title.setIsok("00");
        int num1 = titleMapper.updateByPrimaryKeySelective(title);
        Gradesignleaveapply leave = new Gradesignleaveapply();
        leave.setLeaveid(leaveID);
        leave.setIsok("00");
        int num2 = leaveMapper.updateByPrimaryKeySelective(leave);
        Outgradesignsurebook sureBook = new Outgradesignsurebook();
        sureBook.setSureid(sureID);
        sureBook.setIscommit("00");
        int num3 = sureBookMapper.updateByPrimaryKeySelective(sureBook);
        Outsidegradesignagreemen aggreement = new Outsidegradesignagreemen();
        aggreement.setAgreementid(agreementID);
        aggreement.setRemark("00");
        int num4 = aggreementMapper.updateByPrimaryKeySelective(aggreement);
        Outsidegradesignattachment attachement = new Outsidegradesignattachment();
        attachement.setAttachmentid(attachmentID);
        attachement.setIscommit("00");
        int num5 = attachmentMapper.updateByPrimaryKeySelective(attachement);
        Outgraduateassignment assignment = new Outgraduateassignment();
        assignment.setAssignmentid(assignmentID);
        assignment.setIsok("00");
        int num6 = assignmentMapper.updateByPrimaryKeySelective(assignment);
        if(num==1&&num1==1&&num2==1&&num3==1&&num4==1&&num5==1&&num6==1){
            return true;
        }
        return false;
    }

    /**
     * 修改基本信息表中的状态字段
     * @param id
     * @param status
     * @return
     * @throws SQLException
     */
    @Override
    public Boolean updateStatusInInfoApply(String id, String status) throws SQLException {
        Outgradesigninfo info = new Outgradesigninfo();
        info.setOutsideapplyid(id);
        info.setStatus(status);
        int num = infoMapper.updateByPrimaryKeySelective(info);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateStatusInInfoApply(String id, String status, String commit) throws SQLException {
        Outgradesigninfo info = new Outgradesigninfo();
        info.setOutsideapplyid(id);
        info.setIscommit(commit);
        info.setStatus(status);
        int num = infoMapper.updateByPrimaryKeySelective(info);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateStatusIntitleApply(String id, String status) throws SQLException {
        Outgradesigntitleapply title = new Outgradesigntitleapply();
        title.setOutgradesignapplyid(id);
        title.setCheckstatus(status);
        int num = titleMapper.updateByPrimaryKeySelective(title);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateStatusInleaveApply(String id, String status) throws SQLException {
        Gradesignleaveapply leave = new Gradesignleaveapply();
        leave.setLeaveid(id);
        leave.setCheckstatus(status);
        int num = leaveMapper.updateByPrimaryKeySelective(leave);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateStatusInAggreementApply(String id, String status) throws SQLException {
        Outsidegradesignagreemen aggreement = new Outsidegradesignagreemen();
        aggreement.setAgreementid(id);
        aggreement.setApplystatus(status);
        int num = aggreementMapper.updateByPrimaryKeySelective(aggreement);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateStatusInAssignmentApply(String id, String status) throws SQLException {
        Outgraduateassignment assignment = new Outgraduateassignment();
        assignment.setAssignmentid(id);
        assignment.setCheckstatus(status);
        int num = assignmentMapper.updateByPrimaryKeySelective(assignment);
        if(num==1){
            return true;
        }
        return false;
    }
}
