package cn.xm.jwxt.service.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CourseDesignWorkLoadService {

    /**
     *  获得学年列表
     * @return
     */
    public List<String> getYearNumList() throws SQLException;

    /**
     * 查询课设工作量
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findCourseDesignWorload(Map<String,Object> condition) throws SQLException;

    /**
     * 查询一个教师的课设工作量详细信息
     * @param courseDesignTeacherArrangeID
     * @return
     */
    public Map<String,Object> findOneTeacherCourseDesignInfo(String courseDesignTeacherArrangeID) throws SQLException;

}
