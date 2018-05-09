package cn.xm.jwxt.mapper.graduateDesign.projectManage;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface ChooseProjectMapper {

    /**
     * 查询课题申请管理界面，表格信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> selectProject_ACInfo(Map<String, String> condition) throws SQLException;
}
