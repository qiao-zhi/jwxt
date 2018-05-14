package cn.xm.jwxt.mapper.courseDesign.custom;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignTeacherstudentCustomMapper {

    /**
     * 查询课设报告（储存名称）  和 学生姓名
     * @param courseDesignTeacherStudentID
     * @return
     */
    public Map<String,Object> getCourseDesignFileInfo(String courseDesignTeacherStudentID) throws SQLException;

    /**
     * 查询课设的审核信息
     * @param courseDesignTeacherStudentID
     * @return
     */
    public Map<String,Object> getCourseDesignCheckResult(String courseDesignTeacherStudentID) throws SQLException;

    /**
     * 查询需要上传报告的课设信息   teacherName  teacherNum  courseDesignName/Num
     * @param courseDesignTeacherStudentID
     * @return
     */
    public Map<String, Object> findUploadCourseDesignInfo(String courseDesignTeacherStudentID) throws SQLException;

    /**
     *  上传课设报告
     * @param condition
     * @return
     */
    public boolean addCourseDesignFileInfo(Map<String,Object> condition) throws SQLException;



    /**
     *  根据学生id查询需要上传课设报告的课设
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findNeedUploadCoursedesignFile(Map<String,Object> condition) throws SQLException;


}

