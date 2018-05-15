package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignTeacherstudentCustomMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
@SuppressWarnings("all")
public  class TCoursedesignTeacherstudentServiceImpl implements TCoursedesignTeacherstudentService {

    @Autowired
    public TCoursedesignTeacherstudentCustomMapper tsCustomMapper;

    /**
     * 查询课设报告（系统生成名称） 与学生姓名
     * @param courseDesignTeacherStudentID
     * @return
     */
    @Override
    public Map<String, Object> getCourseDesignFileInfo(String courseDesignTeacherStudentID)  throws SQLException{
        Map<String, Object> map = new HashMap<String,Object>();
            map = tsCustomMapper.getCourseDesignFileInfo(courseDesignTeacherStudentID);
        return map;
    }

    /**
     * 查询课设的审核信息
     * @param courseDesignTeacherStudentID
     * @return
     */
    @Override
    public Map<String,Object> getCourseDesignCheckResult(String courseDesignTeacherStudentID)  throws SQLException{
        Map<String,Object> map = new HashMap<String,Object>();
            map = tsCustomMapper.getCourseDesignCheckResult(courseDesignTeacherStudentID);
        return map;
    }

    /**
     * 查询要上传报告的课设信息
     *
     * @param courseDesignTeacherStudentID
     * @return
     */
    @Override
    public Map<String, Object> findUploadCourseDesignInfo(String courseDesignTeacherStudentID) throws SQLException {
        Map<String, Object> map = new HashMap<String,Object>();
            map = tsCustomMapper.findUploadCourseDesignInfo(courseDesignTeacherStudentID);
        return map;
    }

    /**
     * 上传课设报告
     * @param condition
     * @return
     */
    @Override
    public boolean addCourseDesignFileInfo(Map<String,Object> condition) throws SQLException {
        boolean result = false;
        Date uploadTime = new Date();
            condition.put("uploadTime",uploadTime);
        String uploadStatus = "1";
            condition.put("uploadStatus",uploadStatus);
            result = tsCustomMapper.addCourseDesignFileInfo(condition);
        return result;
    }

    /**
     * 查询需要上传课设报告的课设
     * @param condition studentID uploadStatus display
     * @return
     */
    @Override
    public List<Map<String, Object>> findNeedUploadCoursedesignFile(Map<String, Object> condition)  throws SQLException{
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            list = tsCustomMapper.findNeedUploadCoursedesignFile(condition);
        return list;
    }
}
