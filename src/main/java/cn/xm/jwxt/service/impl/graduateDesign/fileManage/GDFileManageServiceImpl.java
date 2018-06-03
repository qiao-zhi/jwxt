package cn.xm.jwxt.service.impl.graduateDesign.fileManage;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.GdFileCheck;
import cn.xm.jwxt.mapper.graduateDesign.fileManage.GDFileManageMapper;
import cn.xm.jwxt.service.graduateDesign.fileManage.GDFileManageService;
import cn.xm.jwxt.utils.UUIDUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.*;

@Service
@Transactional
public class GDFileManageServiceImpl implements GDFileManageService {

    @Resource
    private GDFileManageMapper gDFileManageMapper;

    /**
     * 获取审核学生息
     * @param condition
     * @return
     */
    public List<Map<String, String>> getFileCheckInfoByCondition(Map<String,String> condition) throws Exception{

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);

        int enrollmentYear = 0;
        if (month < 8) { //下学期
            enrollmentYear = year - 4;
        } else { //上学期
            enrollmentYear = year - 3;
        }

        String enrollmenttimeMin = enrollmentYear + "-01-01";
        String enrollmenttimeMax = enrollmentYear + 1 + "-01-01";

        condition.put("enrollmenttimeMin",enrollmenttimeMin);
        condition.put("enrollmenttimeMax",enrollmenttimeMax);

        List<Map<String, String>> fileCheckInfos = gDFileManageMapper.selectFileCheckinfoByCondition(condition);

        if (condition.get("auditResult").equals("-1")) { //没获取到审核数据

            for (int i = 0; i < fileCheckInfos.size(); i ++) {
                fileCheckInfos.get(i).put("auditResult","");
                fileCheckInfos.get(i).put("auditContent","");
                fileCheckInfos.get(i).put("auditTime","");
            }
        }

       /* List<String> studentIDList = new ArrayList<String>();
        for (TStudentBaseInfo student : students) {
            Map<String, String> fileCheckInfo = new HashMap<String, String>();

            String studentID = student.getStudentid();

            studentIDList.add(student.getStudentid());

            fileCheckInfo.put("studentName",student.getStudentname());
            fileCheckInfo.put("studentNum",student.getStudentnum());
            fileCheckInfo.put("studentName",student.getStudentname());
            fileCheckInfo.put("studentName",student.getStudentname());
        }*/

        for (Map<String, String> fileCheckInfo : fileCheckInfos) {

        }

        return fileCheckInfos;
    }

    @Override
    public boolean addAuditInfo(GdFileCheck gdFileCheck) throws Exception {
        //结果id，获取到的一个或者多个
        String resultIDs =  gdFileCheck.getStudentTitleresultID();
        String[] studentTitleresultIDs = resultIDs.split(",");

        List<GdFileCheck> gdFileChecks = new ArrayList<GdFileCheck>();

        for(String getStudentTitleresultID : studentTitleresultIDs) {
            GdFileCheck fc = new GdFileCheck();

            fc.setId(UUIDUtil.getUUID2());
            fc.setAuditCesult(gdFileCheck.getAuditCesult());
            fc.setAuditContent(gdFileCheck.getAuditContent());
            fc.setStudentTitleresultID(gdFileCheck.getStudentTitleresultID());
            fc.setAuditTime(gdFileCheck.getAuditTime());

            gdFileChecks.add(fc);
        }
        //删除审核过
        gDFileManageMapper.deleteHasAuditInfo(studentTitleresultIDs);

        return gDFileManageMapper.insertAuditInfo(gdFileChecks);
    }

}
