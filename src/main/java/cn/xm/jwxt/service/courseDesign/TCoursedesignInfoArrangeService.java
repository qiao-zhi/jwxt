package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.courseDesign.ListVo;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCoursedesignInfoArrangeService {

    /**
     *  查询需要安排的课设  √
     * @param condition
     * @return
     */
    List<Map<String,Object>> findNeedArrangeCourseDesign(Map<String, Object> condition) throws SQLException;


    /**
     *  从培养方案中查询出来，在课设安排表安排课设 √
     * @param listVo
     *
     *         插入完成后再向其他三个表插入
     *         courseDesignInfo 中存有三个表要插入的信息
     *
     *
     * @return
     * @throws SQLException
     */
    public boolean addCourseDesignerinfo(ListVo listVo,String arrangeTeacher) throws SQLException;



    /**
     *  根据课设安排表中trainCourseID ,yearNum majorid删除安排及其相关信息  √
     *      首先删除学生教师课设表，再删除教师课设安排表，然后班级课设安排表，最后删除TCoursedesignInfo
     * @param courseDesignArrangeID
     * @return
     * @throws SQLException
     */
    public boolean deleteTCoursedesignInfo(String courseDesignArrangeID) throws SQLException;

    /**
     *  修改显示状态  √
     *  @param display  初始状态，通过该值查询id集合
     *  @param display 一个是要修改的display的最终值
     * @return
     */
    public boolean modifyInfoDisplay(List<String> list,String display) throws SQLException;

    /**
     *  查询详细的课设安排信息   √
     * @param courseDesignArrangeID
     * @return
     */
    public List<Map<String,Object>> findArrangeInfoDetailByCondition(String courseDesignArrangeID) throws SQLException;


}

