package cn.xm.jwxt.service.graduateDesign.fileManage;

import java.util.List;
import java.util.Map;

public interface GDFileManageService {
    public List<Map<String, Object>> getFileCheckInfo(Map<String,Object> condition);
}
