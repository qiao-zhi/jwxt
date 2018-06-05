package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.mapper.courseDesign.custom.LookCourseDesignArrangeInfoMapper;
import cn.xm.jwxt.service.courseDesign.LookCourseDesignArrangeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class LookCourseDesignArrangeInfoServiceImpl implements LookCourseDesignArrangeInfoService {

    @Autowired
    private LookCourseDesignArrangeInfoMapper lookCDInfoMapper;

    /**
     * 学生查看课设安排情况
     *
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findCourseDesignArrangeByStudent(Map<String, Object> condition) throws SQLException {
        List<Map<String,Object>> list = lookCDInfoMapper.findCourseDesignArrangeByStudent(condition);
        return list;
    }

    /**
     * 教师查看课设安排情况
     *
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findCourseDesignArrangeByTeacher(Map<String, Object> condition)  throws SQLException {
        List<Map<String,Object>> list = lookCDInfoMapper.findCourseDesignArrangeByTeacher(condition);
        return list;
    }

    /**
     * 教师查看详细安排
     *
     * @param courseDesignTeacherArrangeID
     * @return
     * @throws SQLException
     */
    @Override
    public Map<String, Object> findCourseDesignDetailArrangeInfoByTeacher(String courseDesignTeacherArrangeID) throws SQLException {
        Map<String, Object> map = lookCDInfoMapper.findCourseDesignDetailArrangeInfoByTeacher(courseDesignTeacherArrangeID);
        // 查询学生列表
        List<Map<String,Object>> stuList = lookCDInfoMapper.findStuList(courseDesignTeacherArrangeID);
        int num = stuList.size();
        // 添加学生信息到map
        map.put("stuList",stuList);
        map.put("num",num);
        return map;
    }
}
