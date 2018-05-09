package cn.xm.jwxt.service.graduateDesign.fileManage;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 毕设文件管理
 */
public interface GDFileManageService {
    /**
     * 获取毕设文件上传管理的基本信息
     * @param condition
     * @return
     */
    public List<Map<String, String>> getFileCheckInfoByCondition(Map<String,String> condition) throws SQLException;
}
