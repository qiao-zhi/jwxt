package cn.xm.jwxt.service.impl.workLoad;

import cn.xm.jwxt.mapper.workLoad.CourseDesignWorkLoadMapper;
import cn.xm.jwxt.mapper.workLoad.CourseWorkLoadMapper;
import cn.xm.jwxt.service.workLoad.CourseWorkLoadService;
import cn.xm.jwxt.service.workLoad.GrduateDesignWorkLoadService;
import cn.xm.jwxt.service.workLoad.WorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class WorkLoadServiceImpl implements WorkLoadService {

    @Autowired
    private CourseWorkLoadMapper courseMapper;
    @Autowired
    private CourseDesignWorkLoadMapper courseDesignMapper;
    @Autowired
    private CourseWorkLoadService courseService;
    @Autowired
    private GrduateDesignWorkLoadService grduateService;

    /**
     * 查询所有课程，课设，毕设
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findAllWorkLoad(Map<String, Object> condition) throws SQLException {
        // 查询课程
       // List<Map<String,Object>> courseList = courseMapper.findCourseWorkLoad(condition);
        List<Map<String,Object>> courseList = courseService.findCourseWorkLoad(condition);
        // 查询课设
        List<Map<String,Object>> courseDesignList = courseDesignMapper.findCourseDesignWorload(condition);
        // 查询毕设
        List<Map<String,Object>> grduateDesignList = grduateService.findGrduateDesignWorkLoad(condition);

        // 用于存储所有查询结果, 各表重新设定字段名
        List<Map<String,Object>> allList = new ArrayList<Map<String,Object>>();
            // 存储课程信息
            for(int i=0;i<courseList.size();i++){
                String typeCN ="课程";
                String teacher_course_id = (String) courseList.get(i).get("teacher_course_id");
                String teacher_number = (String) courseList.get(i).get("teacher_number");
                String teacher_name = (String) courseList.get(i).get("teacher_name");
                String academic_year = (String) courseList.get(i).get("academic_year");
                String term = (String) courseList.get(i).get("term");
                String course_name = (String) courseList.get(i).get("course_name");
                String classNames = (String) courseList.get(i).get("classNames");
                String stuNum = (String) courseList.get(i).get("stuNum");
                // 添加到map
                Map<String,Object> map = new HashMap<String,Object>();
                    map.put("typeCN",typeCN);
                    map.put("detailKey",teacher_course_id);
                    map.put("teacherNum",teacher_number);
                    map.put("teacherName",teacher_name);
                    map.put("yearNum",academic_year);
                    map.put("semester",term);
                    map.put("workName",course_name);
                    map.put("classNames",classNames);
                    map.put("stuCount",stuNum);
                // 添加map到allList
                allList.add(map);

            }
            // 存储课设信息
            for(int j=0;j<courseDesignList.size();j++){
                String typeCN ="课设";
                String courseDesignTeacherArrangeID = (String) courseDesignList.get(j).get("courseDesignTeacherArrangeID");
                String teacherNum = (String) courseDesignList.get(j).get("teacherNum");
                String teacherName = (String) courseDesignList.get(j).get("teacherName");
                String yearNum = (String) courseDesignList.get(j).get("yearNum");
                String semester = (String) courseDesignList.get(j).get("semester");
                String courseDesignName = (String) courseDesignList.get(j).get("courseDesignName");
                String classNames = (String) courseDesignList.get(j).get("classNames");
                String stuCount = (String) courseDesignList.get(j).get("stuCount");
                // 把数据添加到map中
                Map<String,Object> map = new HashMap<String,Object>();
                    map.put("typeCN",typeCN);
                    map.put("detailKey",courseDesignTeacherArrangeID);
                    map.put("teacherNum",teacherNum);
                    map.put("teacherName",teacherName);
                    map.put("yearNum",yearNum);
                    map.put("semester",semester);
                    map.put("workName",courseDesignName);
                    map.put("classNames",classNames);
                    map.put("stuCount",stuCount);
                // allList加数据
                allList.add(map);
            }
            // 储存毕设信息
            for(int z=0;z<grduateDesignList.size();z++){
                String typeCN = "毕设";
                String teacherNum = (String) grduateDesignList.get(z).get("teacherNum");
                String teacherName = (String) grduateDesignList.get(z).get("teacherName");
                String yearNum = (String) grduateDesignList.get(z).get("yearNum");
                String semesterNum = (String) grduateDesignList.get(z).get("semesterNum");
                String graduateDesignName = (String) grduateDesignList.get(z).get("graduateDesignName");
                String teacherTitleID = (String) grduateDesignList.get(z).get("teacherTitleID");
                String classNames = "----";
                String stuNum = (String) grduateDesignList.get(z).get("stuNum");
                // 把数据添加到map中
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("typeCN",typeCN);
                map.put("detailKey",teacherTitleID);
                map.put("teacherNum",teacherNum);
                map.put("teacherName",teacherName);
                map.put("yearNum",yearNum);
                map.put("semester",semesterNum);
                map.put("workName",graduateDesignName);
                map.put("classNames",classNames);
                map.put("stuCount",stuNum);
                // allList加数据
                allList.add(map);
            }

        return allList;
    }
}
