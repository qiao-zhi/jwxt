package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.mapper.baseInfo.TClassBaseInfoMapper;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignToolMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class TCoursedesignToolServiceImpl implements TCoursedesignToolService {

    @Autowired
    private TCoursedesignToolMapper cdToolMapper;
    @Autowired
    private TClassBaseInfoMapper classInfoMapper;


    /**
     * 从数据库获取当前 年,生成年级列表
     *
     * @return
     */
    @Override
    public List<String> getYearList()  throws SQLException {
        String nowYear = cdToolMapper.getNowYear();
        int maxYear = Integer.parseInt(nowYear);
        List<String> yearList = new ArrayList<String>();
        while (maxYear>=1952){
            yearList.add(maxYear+"");
            maxYear-=1;
        }
        return yearList;
    }

    /**
     * 根据学院id查询专业
     *
     * @param  collegeID
     * @return
     */
    @Override
    public List<Map<String,Object>> getMajorList(String collegeID) throws SQLException{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
            list = cdToolMapper.getMajorList("1");
        return list;
    }

    /**
     * 根据培养方案课程编号查询已安排的课设信息
     *
     * @param condition  trainCourseID  ,yearNum
     * @return
     */
    @Override
    public List<Map<String,Object>> findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) throws SQLException {
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list = cdToolMapper.findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(condition);
        return list;
    }

    /**
     * 根据专业id获取教师姓名
     *
     * @param majorID
     * @return
     */
    @Override
    public List<Map<String,Object>> getTeacherNameid(String majorID)  throws SQLException{
        List<Map<String,Object>> teaherNameList = new ArrayList<Map<String,Object>>();
        teaherNameList = cdToolMapper.getTeacherNameid(majorID);
        return teaherNameList;
    }

    /**
     * 根据专业id获,grade取班级名称列表
     *
     * @param condition
     * @return
     */
    @Override
    public List<Map<String,Object>> getClassNameByMajor(Map<String,Object> condition)  throws SQLException{
        List<Map<String,Object>> classNameList = new ArrayList<Map<String,Object>>();
               classNameList = cdToolMapper.getClassNameByMajor(condition);
        return classNameList;
    }


    /**
     * 根据班级id获取学生列表
     *
     * @param className
     * @return
     */
    @Override
    public List<Map<String,Object>> getStudentListByClassid(Map<String,Object> condition)  throws SQLException{
        List<Map<String,Object>> studentlist = new ArrayList<Map<String,Object>>();
        studentlist = cdToolMapper.getStudentListByClassId(condition);
        return studentlist;
    }

    @Override
    public String getTeacherNum(Map<String, Object> condition)  throws SQLException{
        String teacherNum = cdToolMapper.getTeacherNum(condition);
        return teacherNum;
    }

    /**
     * 从infoArrange表中根据display查询id
     *
     * @param display
     * @return
     */
    @Override
    public List<String> getcourseDesignArrangeIDByDisplay(String display) throws SQLException {
        List<String> list = new ArrayList<String>();
        list = cdToolMapper.getcourseDesignArrangeIDByDisplay(display);
        return list;
    }

    /**
     * teacherArrange表 根据display查询id
     *
     * @param display
     * @return
     */
    @Override
    public List<String> getcourseDesignTeacherArrangeIDByDisplay(String display)  throws SQLException{
        List<String> list = new ArrayList<String>();
        list = cdToolMapper.getcourseDesignTeacherArrangeIDByDisplay(display);
        return list;
    }
    /**
     * classArrange 根据display查询id
     * @param display
     * @return
     */
    @Override
    public List<String> getcourseDesignClassArrangeIDByDisplay(String display)  throws SQLException{
        List<String> list = new ArrayList<String>();
        list = cdToolMapper.getcourseDesignClassArrangeIDByDisplay(display);
        return list;
    }

    /**
     *
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeID(String courseDesignArrangeID) throws SQLException{
        List<String> courseDesignTeacherArrangeIDList = new ArrayList<String>();
        courseDesignTeacherArrangeIDList = cdToolMapper.getcourseDesignTeacherArrangeID(courseDesignArrangeID);
        return courseDesignTeacherArrangeIDList;
    }

    /**
     * teacherStudent表根据display查询id
     * @param display
     * @return
     */
    @Override
    public List<String> getcourseDesignTeacherStudentIDByDisplay(String display) throws SQLException {
        List<String> list = new ArrayList<String>();
        list = cdToolMapper.getcourseDesignTeacherStudentIDByDisplay(display);
        return list;
    }

    /**
     * 通过培养方案课程编号，grade ,学年,专业 查询课设安排id
     * @param condition
     * @return
     */
    @Override
    public List<String> findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) throws SQLException {
        List<String> list = cdToolMapper.findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(condition);
        return list;
    }

}
