package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrangeExample;
import cn.xm.jwxt.mapper.courseDesign.TCoursedesignTeacherArrangeMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherArrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class TCoursedesignTeacherArrangeServiceImpl implements TCoursedesignTeacherArrangeService {

    @Autowired
    private TCoursedesignTeacherArrangeMapper tcdtaMapper;

    @Override
    public boolean addTCoursedesignTeacherArrange(List<TCoursedesignTeacherArrange> list) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTCoursedesignTeacherArrange(String courseDesignArrangeID) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> findCourseDesignerByTeacherId(Map<String, Object> condition) throws SQLException {
        return null;
    }

    @Override
    public List<TCoursedesignTeacherArrange> findTCoursedesignTeacherArrangeBycourseDesignArrangeID(String courseDesignArrangeID) throws SQLException {
        List<TCoursedesignTeacherArrange> list = new ArrayList<TCoursedesignTeacherArrange>();
        TCoursedesignTeacherArrangeExample tcdtae = new TCoursedesignTeacherArrangeExample();
        TCoursedesignTeacherArrangeExample.Criteria criteria = tcdtae.createCriteria();
        criteria.andCoursedesignarrangeidEqualTo(courseDesignArrangeID);
        list = tcdtaMapper.selectByExample(tcdtae);
        return list;
    }
}
