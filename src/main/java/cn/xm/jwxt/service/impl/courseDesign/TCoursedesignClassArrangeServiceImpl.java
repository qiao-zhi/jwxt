package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignClassArrange;
import cn.xm.jwxt.service.courseDesign.TCoursedesignClassArrangeService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TCoursedesignClassArrangeServiceImpl implements TCoursedesignClassArrangeService {
    @Override
    public boolean addTCoursedesignArrange(List<TCoursedesignClassArrange> list) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTCoursedesignArrange(String courseDesignArrangeID) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> findCourseDesignerByStudentId(Map<String, Object> condition) throws SQLException {
        return null;
    }
}
