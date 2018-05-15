package cn.xm.jwxt.service.courseDesign;

import java.sql.SQLException;
import java.util.List;

import java.util.Map;

public interface TCoursedesignTeacherArrangeService {

    /**
     *  获得班级信息
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getClassInfo(Map<String,Object> condition) throws SQLException;

    /**
     *      获得课设信息
     * @param condition
     * @return
     */
    public List<Map<String,Object>> getCourseDesignInfo(Map<String,Object> condition) throws SQLException;

    /**
     *  查询学生报告上传情况
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findStudentReportUploadStatus(Map<String,Object> condition) throws SQLException;

    /**
     *  （预览）查看学生报告
     * @param courseDesignTeacherStudentID
     * @return
     */
    public Map<String,Object> checkCourseDesignReport(String courseDesignTeacherStudentID) throws SQLException;

    /**
     *  保存课设报告审核结果
     * @param condition
     * @return
     */
    public boolean saveCourseDesignReportCheckResult(Map<String,Object> condition) throws SQLException;
}
