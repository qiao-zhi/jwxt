package cn.xm.jwxt.service.impl.workLoad;

import cn.xm.jwxt.mapper.workLoad.CourseDesignWorkLoadMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import cn.xm.jwxt.service.workLoad.CourseDesignWorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
@SuppressWarnings("all")
public class CourseDesignWorkLoadServiceImpl implements CourseDesignWorkLoadService {

    @Autowired
    private TCoursedesignToolService toolService;
    @Autowired
    private CourseDesignWorkLoadMapper courseDesignMapper;
    /**
     * 获得学年列表
     * @return
     */
    @Override
    public List<String> getYearNumList() throws SQLException {
       // 获取年列表
        List<String> yearList = toolService.getYearList();
        // 用于储存学年列表
        List<String> yearNumList = new ArrayList<String>();
        for(String year : yearList){
            String nextYear = Integer.parseInt(year)+1+"";
            String yearNum = year + "-" + nextYear;
            yearNumList.add(yearNum);
        }
        return yearNumList;
    }

    /**
     * 查询课设工作量
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findCourseDesignWorload(Map<String, Object> condition)  throws SQLException{
//        int courseType = Integer.parseInt((String) condition.get("courseType"));
//        if(courseType == 2 || courseType == 3){
//            return null;
//        }
        List<Map<String,Object>> courseDesignlist = courseDesignMapper.findCourseDesignWorload(condition);

        Collections.sort(courseDesignlist, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                String bxn1 = ((String)o1.get("yearNum")).substring(0,4);
                int intBxn1 = Integer.parseInt(bxn1);
                String bxn2 = ((String)o2.get("yearNum")).substring(0,4);
                int intBxn2 = Integer.parseInt(bxn2);
                int i = intBxn2 - intBxn1;
                if(i==0){
                    String xq1 = (String) o1.get("semester");
                    int intXq1 = Integer.parseInt(xq1);
                    String xq2 = (String) o1.get("semester");
                    int intXq2 = Integer.parseInt(xq2);
                    i = intXq1 - intXq2;
                }
                return i;
            }
        });

        return courseDesignlist;
    }

    /**
     * 查询一个教师的课设工作量详细信息
     * @param courseDesignTeacherArrangeID
     * @return
     */
    @Override
    public Map<String, Object> findOneTeacherCourseDesignInfo(String courseDesignTeacherArrangeID) throws SQLException {
        Map<String,Object> map = new HashMap<String,Object>();
            map = courseDesignMapper.findOneTeacherCourseDesignInfo(courseDesignTeacherArrangeID);
        List<Map<String,Object>> stuList = new ArrayList<Map<String,Object>>();
        stuList = courseDesignMapper.findStuInfoBycourseDesignTeacherArrangeID(courseDesignTeacherArrangeID);
        map.put("stuList",stuList);
        return map;
    }
}
