package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfoExample;
import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.StudenttitleresultExample;
import cn.xm.jwxt.bean.outGraduateDesignApply.*;
import cn.xm.jwxt.mapper.baseInfo.TStudentBaseInfoMapper;
import cn.xm.jwxt.mapper.graduateDesign.StudenttitleresultMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.*;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.BaseInfoCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraduateDesignApplyService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.*;

@Service
@SuppressWarnings("ALL")
@Transactional
public class OutGraDesignApplyServiceImpl implements OutGraduateDesignApplyService{

    @Autowired
    private BaseInfoCustomMapper baseInfoCustomMapper;
    @Autowired
    private OgdResultTitleapplyTeacherinfoMapper ogdResultTitleapplyTeacherinfoMapper;
    @Autowired
    private OutgradesigninfoMapper oGDInfoMapper;
    @Autowired
    private OutgradesigntitleapplyMapper oGDTitleApplyMapper;
    @Autowired
    private GradesignleaveapplyMapper gDLeaveApplyMapper;
    @Autowired
    private OutsidegradesignagreemenMapper oGDAgreementMapper;
    @Autowired
    private OutsidegradesignattachmentMapper oGDAttachmentMapper;
    @Autowired
    private OutgradesignsurebookMapper oGDSureBookMapper;
    @Autowired
    private CancelleaveMapper cLMapper;
    @Autowired
    private CheckleaveMapper checkleaveMapper;
    @Autowired
    private CheckoutgradesigninfoMapper cOGDInfoMApper;
    @Autowired
    private ProjectcheckMapper projectcheckMapper;
    @Autowired
    private OutattachmentcontentMapper outattachmentcontentMapper;


    @Override
    public boolean isFinishTitleResult(String studentID) throws SQLException {
        Studenttitleresult studenttitleresult = baseInfoCustomMapper.isFinishTitleResult(studentID);
        if(studenttitleresult==null){
            return false;
        }
        return true;
    }

    @Override
    public boolean applyOGD(String studentID) throws SQLException {
        return false;
    }

    /**
     * 根据学生ID先从毕设结果表中查询出该学生的毕设结果信息，然后从校外申请表中查询
     * 该学生是否申请校外毕设,
     * 如果没有创建创建学生申请校外毕设所需要的表并初始化（附件表、基本信息表、课题表、协议书、请假表）并返回结果集
     * @param studentID
     * @return list
     * @throws SQLException
     */
    @Override
    public Map<String, Object> checkFile(String studentID) throws SQLException {
        String outsideApplyID = UUIDUtil.getUUID2();
        String agreementID = UUIDUtil.getUUID2();
        String attachmentID = UUIDUtil.getUUID2();
        String leaveID = UUIDUtil.getUUID2();
        String cancelLeaveID = UUIDUtil.getUUID2();
        String sureBookID = UUIDUtil.getUUID2();
        //创建课题申请表ID
        String outGraDesignApplyID = UUIDUtil.getUUID2();

        Map<String,Object> resultList = new HashMap<String,Object>();     //返回结果集

        Outgradesigninfo outgradesigninfo = baseInfoCustomMapper.selectIsApplyByStudentID(studentID);
        //未查询到校外毕设申请信息，初始化各个表
        if(outgradesigninfo==null){
            //通过视图查询学生毕设得基本信息
            OgdResultTitleapplyTeacherinfoExample oGDRTTIExample = new OgdResultTitleapplyTeacherinfoExample();
            OgdResultTitleapplyTeacherinfoExample.Criteria criteria1 = oGDRTTIExample.createCriteria();
            criteria1.andStudentidEqualTo(studentID);
            List<OgdResultTitleapplyTeacherinfo> studentAllInfos = ogdResultTitleapplyTeacherinfoMapper.selectByExample(oGDRTTIExample);
            if(studentAllInfos!=null){
                OgdResultTitleapplyTeacherinfo studentAllInfo = studentAllInfos.get(0);
                //获取学生信息
                String studentName = studentAllInfo.getStudentname();
                String studentSex = studentAllInfo.getStudentsex();
                String studentNum = studentAllInfo.getStudentnum();
                String teacherName = studentAllInfo.getTeachername();
                String studentCollege = studentAllInfo.getCollegename();
                String studentMajorClass = studentAllInfo.getClassname();
                String studentMajor = studentAllInfo.getMajorname();
                String studentIdCard = studentAllInfo.getIdnum();
                String collegeName = studentAllInfo.getCollegename();
                String resultId = studentAllInfo.getStudenttitleresultid();   //结果ID
                //向校外毕设基本信息表创建对象并插入数据库
                Outgradesigninfo info = new Outgradesigninfo();
                info.setOutsideapplyid(outsideApplyID);
                info.setStudenttitleresultid(resultId);
                info.setTablename("校外毕业设计申请");
                info.setStudentname(studentName);
                info.setSex(studentSex);
                info.setMajorclass(studentMajorClass);
                info.setInteachername(teacherName);
                info.setStatus("00");
                info.setIscommit("00");
                int infoResult = oGDInfoMapper.insertSelective(info);
                //向题目申请表中插入数据
                Outgradesigntitleapply title = new Outgradesigntitleapply();
                title.setOutgradesignapplyid(outGraDesignApplyID);
                title.setOutsideapplyid(outsideApplyID);
                title.setTablename("校外实践课题申请");
                title.setInteachername(teacherName);
                title.setCheckstatus("00");
                title.setIsok("00");
                int titleResult = oGDTitleApplyMapper.insertSelective(title);
                //向请假表插入数据
                Gradesignleaveapply leave = new Gradesignleaveapply();
                leave.setLeaveid(leaveID);
                leave.setOutsideapplyid(outsideApplyID);
                leave.setTablename("毕业生请假申请");
                leave.setStudentname(studentName);
                leave.setStudentnum(studentNum);
                leave.setMajor(studentMajor);
                leave.setCheckstatus("00");
                leave.setIsok("00");
                leave.setIscancel("00");
                int leaveResult = gDLeaveApplyMapper.insertSelective(leave);
                //向附件表中插入初始化数据
                Outsidegradesignattachment attachment = new Outsidegradesignattachment();
                attachment.setAttachmentid(attachmentID);
                attachment.setOutsideapplyid(outsideApplyID);
                attachment.setAttachmentname("附件信息");
                attachment.setIscommit("0");
                int attachmentResult = oGDAttachmentMapper.insertSelective(attachment);
                //向自我管理协议中插入初始化数据
                Outsidegradesignagreemen agreement = new Outsidegradesignagreemen();
                agreement.setAgreementid(agreementID);
                agreement.setOutsideapplyid(outsideApplyID);
                agreement.setAgreementname("自我管理协议书");
                agreement.setStudentidcard(studentIdCard);
                agreement.setCollegename(collegeName);
                agreement.setApplystatus("00");
                agreement.setRemark("00");
                int agreementResult = oGDAgreementMapper.insertSelective(agreement);
                //向保证书插入初始化数据
                Outgradesignsurebook sureBook = new Outgradesignsurebook();
                sureBook.setSureid(sureBookID);
                sureBook.setOutsideapplyid(outsideApplyID);
                sureBook.setSurename("保证书");
                sureBook.setIscommit("00");
                int sureBookResult = oGDSureBookMapper.insertSelective(sureBook);
                //
                Cancelleave cancelleave = new Cancelleave();
                cancelleave.setCancelleaveid(UUIDUtil.getUUID2());
                cancelleave.setLeaveid(leaveID);
                int cancleLeaveResult = cLMapper.insertSelective(cancelleave);
                //
                Checkleave checkleave = new Checkleave();
                checkleave.setCheckleaveid(UUIDUtil.getUUID2());
                checkleave.setLeaveid(leaveID);
                int checkleaveResult = checkleaveMapper.insertSelective(checkleave);
                //
                Checkoutgradesigninfo checkoutgradesigninfo = new Checkoutgradesigninfo();
                checkoutgradesigninfo.setCheckoutapplyid(UUIDUtil.getUUID2());
                checkoutgradesigninfo.setOutsideapplyid(outsideApplyID);
                int checkInfoResult = cOGDInfoMApper.insertSelective(checkoutgradesigninfo);
                //
                Projectcheck projectcheck = new Projectcheck();
                projectcheck.setCheckId(UUIDUtil.getUUID2());
                projectcheck.setOutgradesignapplyid(outGraDesignApplyID);
                int projectResult = projectcheckMapper.insertSelective(projectcheck);
                //
                Outattachmentcontent outattachmentcontent = new Outattachmentcontent();
                outattachmentcontent.setContentid(UUIDUtil.getUUID2());
                outattachmentcontent.setAttachmentid(attachmentID);
                int conteneresult = outattachmentcontentMapper.insertSelective(outattachmentcontent);

            }

        }
        //否则查询申请文件详细信息
        else{
            outsideApplyID = outgradesigninfo.getOutsideapplyid();
        }
        resultList = baseInfoCustomMapper.selectFileStatus(outsideApplyID);

        return resultList;
    }

    @Override
    public List<Map<String, Object>> selectWaitCheck(String checkState) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectStudentByExample(Map<String, String> map) throws SQLException {
        return null;
    }
}
