package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.courseDesign.Coursedesignteacherstudent;
import java.util.List;

import java.sql.SQLException;
import java.util.Map;

public interface CoursedesignteacherstudentService {

    /**
     *  在课设安排表安排的时候需要再学生教师课设表中批量插入学生id，教师id，学生编号的信息
     * @param list
     * @return
     * @throws SQLException
     */
    public boolean addCoursedesignteacherstudent(List<Coursedesignteacherstudent> list) throws SQLException;

    /**
     *  根据课设安排表的courseDesignArrangeID删除信息
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public boolean deleteCoursedesignteacherstudent(String courseDesignArrangeID) throws SQLException;

//    public boolean updateCoursedesignteacherstudent(Coursedesignteacherstudent cdts)throws SQLException;

    /**
     *  学生上传课设，因为在课设安排的时候已插入课设教师安排id，学生id，课设安排编号。所以现在只需要插入剩下的信息
     * @param cdts
     * @return
     * @throws SQLException
     */
    public boolean uploadCoursedesign(Coursedesignteacherstudent cdts) throws SQLException;

    /**
     * 教师从学生教师课设表查提交情况
     * @param map
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> findCourseDesignerSubmit(Map<String, Object> map) throws SQLException;

//    /**
//     * 学生查看自己的提交情况
//     * @param studentID
//     * @return
//     * @throws SQLException
//     */
//    public Coursedesignteacherstudent findCourseDesignerSubmitByStudentId(String studentID) throws SQLException;

    /**
     *  学生修改重新上传课设
     * @param cdts
     * @return
     * @throws SQLException
     */
    public boolean updateCourseDesignFile(Coursedesignteacherstudent cdts) throws SQLException;
}
