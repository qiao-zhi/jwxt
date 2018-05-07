package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TClassBaseInfoExample;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfoExample;
import cn.xm.jwxt.mapper.baseInfo.TClassBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.TTeacherBaseInfoMapper;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignToolMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
    public List<String> getYearList() {
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
    public List<String> getMajorList(String collegeID) {
        List<String> list = new ArrayList<String>();
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
    public List<Map<String,Object>> findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) {
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
    public List<String> getTeacheName(String majorID) {
        List<String> teaherNameList = new ArrayList<String>();
        teaherNameList = cdToolMapper.getTeacherName(majorID);
        return teaherNameList;
    }

    /**
     * 根据专业id获,grade取班级名称列表
     *
     * @param condition
     * @return
     */
    @Override
    public List<String> getClassNameByMajor(Map<String,Object> condition) {
        List<String> classNameList = new ArrayList<String>();
               classNameList = cdToolMapper.getClassNameByMajor(condition);
        return classNameList;
    }


    /**
     * 根据班级名称，专业id获取学生列表
     *
     * @param className
     * @return
     */
    @Override
    public List<Map<String,Object>> getStudentListByClassNameAndMajorid(Map<String,Object> condition) {
        List<Map<String,Object>> studentlist = new ArrayList<Map<String,Object>>();
        studentlist = cdToolMapper.getStudentListByClassNameAndMajorId(condition);
        return studentlist;
    }

    @Override
    public String getTeacherNum(Map<String, Object> condition) {
        String teacherNum = cdToolMapper.getTeacherNum(condition);
        return teacherNum;
    }

    /**
     * 根据老师编号获取老师id
     *
     * @param teacherNum
     * @return
     */
    @Override
    public String getTeacherID(String teacherNum) {
        String teacherID = cdToolMapper.getTeacherID(teacherNum);
        return teacherID;
    }

    /**
     * 从infoArrange表中根据display查询id
     *
     * @param display
     * @return
     */
    @Override
    public List<String> getcourseDesignArrangeIDByDisplay(String display) {
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
    public List<String> getcourseDesignTeacherArrangeIDByDisplay(String display) {
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
    public List<String> getcourseDesignClassArrangeIDByDisplay(String display) {
        List<String> list = new ArrayList<String>();
        list = cdToolMapper.getcourseDesignClassArrangeIDByDisplay(display);
        return list;
    }

    /**
     *
     * @param courseDesignArrangeID
     * @return
     */
    public List<String> getcourseDesignTeacherArrangeID(String courseDesignArrangeID){
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
    public List<String> getcourseDesignTeacherStudentIDByDisplay(String display) {
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
    public List<String> findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(Map<String,Object> condition) {
        List<String> list = cdToolMapper.findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(condition);
        return list;
    }

}
