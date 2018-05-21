package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CountInfoService {
    /**
     * 根据用户ID和学年返回该用户所属学院的所有班级信息
     * @param map userID，year
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> countMajorClass(Map<String,Object> map)throws SQLException;

    /**
     * 统计一个班级中校外人数以及向下信息
     * @param classID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> countMajorClassOGDStudentInfo(String classID)throws SQLException;
}
