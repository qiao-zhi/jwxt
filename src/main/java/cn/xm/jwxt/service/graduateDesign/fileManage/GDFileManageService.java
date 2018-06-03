package cn.xm.jwxt.service.graduateDesign.fileManage;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.GdFileCheck;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 毕设文件管理
 */
public interface GDFileManageService {
    /**
     * 获取审核学生信息
     * @param condition
     * @return
     */
    public List<Map<String, String>> getFileCheckInfoByCondition(Map<String, String> condition) throws Exception;

    /**
     * 文件提交审核
     * @param gdFileChecks
     * @return
     * @throws Exception
     */
    public boolean addAuditInfo(GdFileCheck gdFileChecks) throws Exception;
}
