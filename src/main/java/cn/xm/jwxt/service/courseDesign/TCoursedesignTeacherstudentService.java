package cn.xm.jwxt.service.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudent;

import java.util.List;

import java.sql.SQLException;
import java.util.Map;

public interface TCoursedesignTeacherstudentService {

    /**
     *  上传课设报告
     * @param condition
     * @return
     */
    public boolean addCourseDesignFileInfo(Map<String,Object> condition);

    /**
     *  查询需要上传课设报告的课设
     * @param condition   studentID uploadStatus display
     * @return
     */
    public List<Map<String,Object>> findNeedUploadCoursedesignFile(Map<String,Object> condition);
}
