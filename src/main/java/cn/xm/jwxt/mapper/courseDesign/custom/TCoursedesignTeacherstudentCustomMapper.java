package cn.xm.jwxt.mapper.courseDesign.custom;

import java.util.List;
import java.util.Map;

public interface TCoursedesignTeacherstudentCustomMapper {

    /**
     *  上传课设报告
     * @param condition
     * @return
     */
    public boolean addCourseDesignFileInfo(Map<String,Object> condition);

    /**
     *  根据学生id查询需要上传课设报告的课设
     * @param condition
     * @return
     */
    public List<Map<String,Object>> findNeedUploadCoursedesignFile(Map<String,Object> condition);

}

