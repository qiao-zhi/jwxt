package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudent;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudentExample;
import cn.xm.jwxt.mapper.courseDesign.TCoursedesignTeacherstudentMapper;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignTeacherstudentCustomMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherArrangeService;
import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public  class TCoursedesignTeacherstudentServiceImpl implements TCoursedesignTeacherstudentService {

    @Autowired
    public TCoursedesignTeacherstudentCustomMapper tsCustomMapper;

    /**
     * 上传课设报告
     * @param condition
     * @return
     */
    @Override
    public boolean addCourseDesignFileInfo(Map<String, Object> condition) {
        boolean resutl = tsCustomMapper.addCourseDesignFileInfo(condition);
        return true;
    }

    /**
     * 查询需要上传课设报告的课设
     * @param condition studentID uploadStatus display
     * @return
     */
    @Override
    public List<Map<String, Object>> findNeedUploadCoursedesignFile(Map<String, Object> condition) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            list = tsCustomMapper.findNeedUploadCoursedesignFile(condition);
        return list;
    }
}
