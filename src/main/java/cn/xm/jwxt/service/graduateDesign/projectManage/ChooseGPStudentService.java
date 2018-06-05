package cn.xm.jwxt.service.graduateDesign.projectManage;

import java.util.List;
import java.util.Map;

public interface ChooseGPStudentService {
    /**
     * 查询选择了课题的学生信息
     * @param condition 课题名称、学年、
     * @return
     */
    public List<Map<String, Object>> getChooseProjectStudentInfo(Map<String, Object> condition);


}
