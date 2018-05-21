package cn.xm.jwxt.service.impl.outGraduateDesignApply;


import cn.xm.jwxt.bean.outGraduateDesignApply.*;
import cn.xm.jwxt.mapper.outGraduateDesignApply.*;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.OGDApplyResultCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.PublicMethod;
import cn.xm.jwxt.service.outGraduateDesignApply.SignService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

@Service
@SuppressWarnings("all")
@Transactional
public class SignServiceImpl implements SignService {
    @Autowired
    private CheckleaveMapper checkleaveMapper;
    @Autowired
    private CheckoutgradesigninfoMapper checkInfoMapper;
    @Autowired
    private ProjectcheckMapper checkTitleMapper;
    @Autowired
    private OutsidegradesignagreemenMapper checkAggreementMapper;
    @Autowired
    private OGDApplyResultCustomMapper resultMapper;
    @Autowired
    private PublicMethod publicMethod;
    @Autowired
    private CheckassignmentMapper checkAssignmentMapper;


    @Override
    public Boolean addfudaoyuanSign(Map<String, Object> map) throws SQLException {
        /*获取map中的数据*/
        String identify = (String)map.get("identify");
        String outsideApplyId = (String)map.get("outsideApplyID");
        String leaveID = (String)map.get("leaveID");
        String titleID = (String)map.get("titleID");
        String assignmentID = (String)map.get("assignmentID");
        String agreementID = (String)map.get("agreementID");
        String result = (String)map.get("result");
        String advice = (String)map.get("advice");
        String teacherSign = (String)map.get("signUrl");
//        String signPassword = (String)map.get("signPassword");
//        String inTeacherName = (String)map.get("inTeacherName");
//        String userId = (String)map.get("userId");
        /*对数据分装成对象*/
        //分装为基本信息对象checkinfo
        Checkoutgradesigninfo checkinfo = new Checkoutgradesigninfo();
        checkinfo.setCheckoutapplyid(UUIDUtil.getUUID2());
        checkinfo.setOutsideapplyid(outsideApplyId);
        checkinfo.setCheckpeople(identify);
        checkinfo.setCheckadvice(advice);
        checkinfo.setTeachersign(teacherSign);
        checkinfo.setResult(result);
        checkinfo.setApplytime(new Date());
        //封装为审核请假对象
        Checkleave checkleave = new Checkleave();
        checkleave.setCheckleaveid(UUIDUtil.getUUID2());
        checkleave.setLeaveid(leaveID);
        checkleave.setCheckpeople(identify);
        checkleave.setCheckopinion(advice);
        checkleave.setTeachersign(teacherSign);
        checkleave.setResult(result);
        checkleave.setApplytime(new Date());
        //分装为审核题目对象
        Projectcheck checkTitle = new Projectcheck();
        checkTitle.setCheckId(UUIDUtil.getUUID2());
        checkTitle.setOutgradesignapplyid(titleID);
        checkTitle.setCheckpeople(identify);
        checkTitle.setCheckopinion(advice);
        checkTitle.setTeachersign(teacherSign);
        checkTitle.setCheckresult(result);
        checkTitle.setApplytime(new Date());
        //封装为审核任务书对象
        Checkassignment checkassignment = new Checkassignment();
        checkassignment.setCheckId(UUIDUtil.getUUID2());
        checkassignment.setAssignmentid(assignmentID);
        checkassignment.setTeachersign(teacherSign);
        checkassignment.setCheckpeople(identify);
        //封装自我管理协议书
        Outsidegradesignagreemen aggrreement = new Outsidegradesignagreemen();
        aggrreement.setAgreementid(agreementID);
        aggrreement.setSchoolsign(teacherSign);
        aggrreement.setSchoolsigndate(new Date());

        /*对用户审核的结果进行判断*/
        if(result!=null&&result.equals("0")){
            /*用户拒绝了本学生申请，初始话表*/
            boolean init = publicMethod.initializationApplyInfo(map);
            if(!init){
               return false;
            }
        }
        if(identify!=null&&!identify.equals("")){
            /*对用户所选择的身份进行确认*/
            if(identify.equals("辅导员")){
                /*辅导员只需要在请假表中审核*/
                int num = checkleaveMapper.insertSelective(checkleave);
                if(num!=1){
                    return false;
                }
                /*判断教师审核结果,将审核状态记录到审核表中*/
                if(result!=null&&result.equals("1")){
                    /*同意，修改字段为下级待状态*/
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"11");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"11");
                    if(success){
                        return true;
                    }
                } else{
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"10");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"10");
                    if(success){
                        return true;
                    }
                }
            }else if(identify.equals("副书记")){
                    /*需要在学生基本表，请假表中签字*/
                int infonum = checkInfoMapper.insertSelective(checkinfo);
                int leavenum = checkleaveMapper.insertSelective(checkleave);
                if(!(infonum==1&&leavenum==1)){
                    return false;
                }
                /*判断教师审核结果,将审核状态记录到审核表中*/
                if(result!=null&&result.equals("1")){
                    /*同意，修改字段为下级待状态*/
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"21");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"21");
                    if(success){
                        return true;
                    }
                } else{
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"20");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"20");
                    if(success){
                        return true;
                    }
                }
            }else if(identify.equals("指导教师")){
                /*指导教师需要在三个表中分别签字*/
                int infonum = checkInfoMapper.insertSelective(checkinfo);
                int titlenum = checkTitleMapper.insertSelective(checkTitle);
                int leavenum = checkleaveMapper.insertSelective(checkleave);
                int assignmentNum = checkAssignmentMapper.insertSelective(checkassignment);
                if(!(infonum==1&&titlenum==1&&leavenum==1&&assignmentNum==1)){
                    return false;
                }
                 /*判断教师审核结果,将审核状态记录到审核表中*/
                if(result!=null&&result.equals("1")){
                    /*同意，修改字段为下级待状态*/
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"31");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"31");
                    boolean success2 = publicMethod.updateStatusIntitleApply(titleID,"31");
                    boolean success3 = publicMethod.updateStatusInAssignmentApply(assignmentID,"31");
                    if(success){
                        return true;
                    }
                } else{
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"30");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"30");
                    boolean success2 = publicMethod.updateStatusIntitleApply(titleID,"30");
                    boolean success3 = publicMethod.updateStatusInAssignmentApply(assignmentID,"30");
                    if(success){
                        return true;
                    }
                }

            }else if(identify.equals("教研室主任")){
                /*教研室主任需要到三个表中签字*/
                int infonum = checkInfoMapper.insertSelective(checkinfo);
                int titlenum = checkTitleMapper.insertSelective(checkTitle);
                int leavenum = checkleaveMapper.insertSelective(checkleave);
                if(!(infonum==1&&titlenum==1&&leavenum==1)){
                    return false;
                }
                 /*判断教师审核结果,将审核状态记录到审核表中*/
                if(result!=null&&result.equals("1")){
                    /*同意，修改字段为下级待状态*/
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"41");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"41");
                    boolean success2 = publicMethod.updateStatusIntitleApply(titleID,"41");
                    if(success){
                        return true;
                    }
                } else{
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"40");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"40");
                    boolean success2 = publicMethod.updateStatusIntitleApply(titleID,"40");
                    if(success){
                        return true;
                    }
                }
            }else if(identify.equals("系主任")){
                /*请假表*/
                int leavenum = checkleaveMapper.insertSelective(checkleave);
                int assignmentNum = checkAssignmentMapper.insertSelective(checkassignment);
                if(leavenum!=1){
                    return false;
                }
                 /*判断教师审核结果,将审核状态记录到审核表中*/
                if(result!=null&&result.equals("1")){
                    /*同意，修改字段为下级待状态*/
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"51");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"51");
                    boolean success3 = publicMethod.updateStatusInAssignmentApply(assignmentID,"51");
                    if(success){
                        return true;
                    }
                } else{
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"50");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"50");
                    boolean success3 = publicMethod.updateStatusInAssignmentApply(assignmentID,"50");

                    if(success){
                        return true;
                    }
                }

            }else if(identify.equals("主管院长")){
                /*基本表、请假表、自我管理协议书*/
                int infonum = checkInfoMapper.insertSelective(checkinfo);
                int leavenum = checkleaveMapper.insertSelective(checkleave);
                int aggreementnum = checkAggreementMapper.updateByPrimaryKeySelective(aggrreement);
                int assignmentNum = checkAssignmentMapper.insertSelective(checkassignment);
                if(!(infonum==1&&leavenum==1&&aggreementnum==1&&assignmentNum==1)){
                    return false;
                }
                /*判断教师审核结果,将审核状态记录到审核表中*/
                if(result!=null&&result.equals("1")){
                    /*同意，修改字段为下级待状态*/
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"61","21");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"61");
                    boolean success2 = publicMethod.updateStatusIntitleApply(titleID,"61");
                    boolean success3 = publicMethod.updateStatusInAggreementApply(agreementID,"61");
                    boolean success4 = publicMethod.updateStatusInAssignmentApply(assignmentID,"61");


                    if(success){
                        /*最后该学生校外毕设申请成功，修改毕设结果表中的字段为校外*/
                        int num = resultMapper.updateStudentTitleResultToOutSchool(outsideApplyId);
                        if(num==1){
                            return true;
                        }
                        return false;
                    }
                } else{
                    boolean success = publicMethod.updateStatusInInfoApply(outsideApplyId,"60");
                    boolean success1 = publicMethod.updateStatusInleaveApply(leaveID,"60");
                    boolean success3 = publicMethod.updateStatusInAggreementApply(agreementID,"60");
                    boolean success4 = publicMethod.updateStatusInAssignmentApply(assignmentID,"60");
                    if(success){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
