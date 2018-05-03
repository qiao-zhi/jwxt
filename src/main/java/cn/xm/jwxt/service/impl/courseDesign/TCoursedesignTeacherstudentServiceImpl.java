package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherArrange;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudent;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignTeacherstudentExample;
import cn.xm.jwxt.mapper.courseDesign.TCoursedesignTeacherstudentMapper;
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
    private TCoursedesignTeacherstudentMapper cdtsMapper;
    @Autowired
    private TCoursedesignTeacherArrangeService tcdtas;

    @Override
    public boolean addCoursedesignteacherstudent(List<TCoursedesignTeacherstudent> list) throws SQLException {
        for (TCoursedesignTeacherstudent cdts:list) {
            int result = cdtsMapper.insert(cdts);
        }
        System.out.println("插入成功4");
        return true;
    }

    @Override
    public boolean deleteCoursedesignteacherstudent(String courseDesignArrangeID) throws SQLException {

        List<TCoursedesignTeacherArrange> list = new ArrayList<TCoursedesignTeacherArrange>();
        list = tcdtas.findTCoursedesignTeacherArrangeBycourseDesignArrangeID(courseDesignArrangeID);
        for (TCoursedesignTeacherArrange tdta: list) {
            TCoursedesignTeacherstudentExample cdtsExample = new TCoursedesignTeacherstudentExample();
            TCoursedesignTeacherstudentExample.Criteria criteria = cdtsExample.createCriteria();
            criteria.andCoursedesignteacherarrangeidEqualTo(tdta.getCoursedesignteacherarrangeid());
            int result = cdtsMapper.deleteByExample(cdtsExample);
        }
        System.out.println("删除成功4");
        return true;
    }

    @Override
    public List<TCoursedesignTeacherstudent> findNeedUploadCoursedesign(Map<String, Object> condition) throws SQLException {
        return null;
    }

    @Override
    public boolean uploadCoursedesign(TCoursedesignTeacherstudent cdts) throws SQLException {

        return false;
    }

    /**
     * 教师查看学生课设提交情况
     * @param cdts
     * @return
     * @throws SQLException
     */
    @Override
    public List<Map<String, Object>> findCourseDesignerSubmit(Map<String, Object> condition) throws SQLException {

        return null;
    }

    @Override
    public List<TCoursedesignTeacherstudent> findCourseDesignerSubmitByStudent(Map<String, Object> condition) throws SQLException {
        return null;
    }

    @Override
    public boolean updateCourseDesignFile(TCoursedesignTeacherstudent cdts) throws SQLException {
        return false;
    }

    @Override
    public boolean checkCourseDesiginFile(String studentID) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> findCourseDesignWorkload(Map<String, Object> condition) {
        return null;
    }
}
