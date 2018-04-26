package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignInfoArrangeCustomMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class TCoursedesignInfoArrangeServiceImpl implements TCoursedesignInfoArrangeService {

    @Autowired
    private TCoursedesignInfoArrangeCustomMapper csaCustomMapper;

    @Override
    public List<TCourseBaseInfo> findNeedArrangeCourseDesign(Map<String, Object> condition) {
        List<TCourseBaseInfo> list = new ArrayList<TCourseBaseInfo>();
        list = csaCustomMapper.findNeedArrangeCourseDesign(condition);
        return list;
    }

    @Override
    public boolean addCourseDesignerinfo(Map<String, Object> map) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteTCoursedesignInfo(String courseDesignArrangeID) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseDesigninfo(String courseDesignArrangeID, Map<String, Object> map) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> findAllTCoursedesignInfo(Map<String, Object> condition) throws SQLException {
        return null;
    }
}
