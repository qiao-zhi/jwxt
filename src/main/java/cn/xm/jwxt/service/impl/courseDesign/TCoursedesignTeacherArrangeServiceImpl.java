package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignTeacherArrangeCustomMapper;
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
        private TCoursedesignTeacherArrangeCustomMapper taCustomMapper;
    /**
     * 获得专业id 班级信息
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> getClassInfo(Map<String, Object> condition)  throws SQLException {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            list = taCustomMapper.getClassInfo(condition);
        return list;
    }

    /**
     * 获得课设信息
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> getCourseDesignInfo(Map<String, Object> condition) throws SQLException {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            list = taCustomMapper.getCourseDesignInfo(condition);
        return list;
    }

    /**
     * 查询学生报告上传情况
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findStudentReportUploadStatus(Map<String, Object> condition) throws SQLException {
        List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
            list = taCustomMapper.findStudentReportUploadStatus(condition);
        return list;
    }

    /**
     * （预览）查看学生报告
     * @param courseDesignTeacherStudentID
     * @return
     */
    @Override
    public Map<String, Object> checkCourseDesignReport(String courseDesignTeacherStudentID)  throws SQLException{
        Map<String, Object> map = taCustomMapper.checkCourseDesignReport(courseDesignTeacherStudentID);
        return map;
    }

    /**
     * 保存课设报告审核结果
     * @param condition
     * @return
     */
    @Override
    public boolean saveCourseDesignReportCheckResult(Map<String,Object> condition)  throws SQLException{
        boolean result = false;
        Object tsids = condition.get("courseDesignTeacherStudentIDs");
        result = taCustomMapper.saveCourseDesignReportCheckResult(condition);
        return result;
    }
}
