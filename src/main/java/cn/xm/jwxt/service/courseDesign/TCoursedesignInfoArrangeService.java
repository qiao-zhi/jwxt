package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignInfoArrangeService {

    /**
     *  查询需要安排的课设
     * @param condition
     * @return
     */
    List<TCourseBaseInfo> findNeedArrangeCourseDesign(Map<String, Object> condition);


    /**
     *  从培养方案中查询出来，在课设安排表安排课设
     * @param map  map中应该包含一个TCoursedesignInfo，
     *                                List<t_courseDesign_teacher_arrange>,
     *                                List<t_courseDesign_arrange>,
     *                                List<t_courseDesignTeacherStudent>
     * @return
     * @throws SQLException
     */
    public boolean addCourseDesignerinfo(Map<String, Object> map) throws SQLException;

    /**
     *  根据课设安排表中courseDesignArrangeID 删除安排及其相关信息
     *      首先删除学生教师课设表，再删除教师课设安排表，然后班级课设安排表，最后删除TCoursedesignInfo
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public boolean deleteTCoursedesignInfo(String courseDesignArrangeID) throws SQLException;
    /**
     * 修改课设安排  ,先删除(需要删除的id为courseDesignArrangeID，从课设安排表，课设教师安排报表，课设班级安排表，课设教师学生表中删除)
     *                   再添加（添加的内容存在map中）
     * @param courseDesignArrangeID
     * @param map
     * @return
     * @throws SQLException
     */
    public boolean updateCourseDesigninfo(String courseDesignArrangeID, Map<String, Object> map) throws SQLException;

    /**
     * 查询安排过的课设的详细信息
     * @param condition  存多个参数
     * @return  返回t_courseDesign_info，trainSchemeCourseDesign的组合
     * @throws SQLException
     */
    public List<Map<String,Object>> findAllTCoursedesignInfo(Map<String, Object> condition) throws SQLException;

}

