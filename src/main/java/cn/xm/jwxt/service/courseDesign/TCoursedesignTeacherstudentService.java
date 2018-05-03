package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudent;

import java.util.List;

import java.sql.SQLException;
import java.util.Map;

public interface TCoursedesignTeacherstudentService {

    /**
     *  在课设安排表安排的时候需要在学生教师课设表中批量插入学生id，教师id，学生编号的信息
     * @param list
     * @return
     * @throws SQLException
     */
    public boolean addCoursedesignteacherstudent(List<TCoursedesignTeacherstudent> list) throws SQLException;

    /**
     *  根据课设安排表的courseDesignArrangeID删除信息
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public boolean deleteCoursedesignteacherstudent(String courseDesignArrangeID) throws SQLException;

//    public boolean updateCoursedesignteacherstudent(Coursedesignteacherstudent cdts)throws SQLException;

    /**
     *  查询还没有上传报告得课设
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<TCoursedesignTeacherstudent> findNeedUploadCoursedesign(Map<String,Object> condition)throws SQLException;

    /**
     *  学生上传课设，因为在课设安排的时候已插入课设教师安排id，学生id，课设安排编号。所以现在只需要插入剩下的信息
     * @param cdts
     * @return
     * @throws SQLException
     */
    public boolean uploadCoursedesign(TCoursedesignTeacherstudent cdts) throws SQLException;

    /**
     * 教师从学生教师课设表查提交情况
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> findCourseDesignerSubmit(Map<String, Object> condition) throws SQLException;

    /**
     * 学生查看自己的提交情况
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<TCoursedesignTeacherstudent> findCourseDesignerSubmitByStudent(Map<String, Object> condition) throws SQLException;

    /**
     *  学生修改重新上传课设
     * @param cdts
     * @return
     * @throws SQLException
     */
    public boolean updateCourseDesignFile(TCoursedesignTeacherstudent cdts) throws SQLException;

    /**
     *  教师审核学生上传的课设报告( 即：审核状态 和 审核意见)
     * @param studentID
     * @return
     * @throws SQLException
     */
    public boolean checkCourseDesiginFile(String studentID) throws SQLException;

    /**
     *  教师课设教学工作量查询
     * @param condition
     * @return
     */

    public List<Map<String,Object>> findCourseDesignWorkload(Map<String,Object> condition);
}
