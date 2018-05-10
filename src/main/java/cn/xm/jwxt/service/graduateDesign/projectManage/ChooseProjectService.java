package cn.xm.jwxt.service.graduateDesign.projectManage;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ChooseProjectService {
    /**
     * 查询选择了课题的学生信息
     * @param condition 课题名称、学年、
     * @return
     */
    List<Map<String,String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException;
}
