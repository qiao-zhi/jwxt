package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.courseDesign.ListVo;
import cn.xm.jwxt.bean.courseDesign.TCourseDesignVo;
import cn.xm.jwxt.bean.courseDesign.TCoursedesignInfoArrange;
import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.mapper.courseDesign.TCoursedesignInfoArrangeMapper;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignInfoArrangeCustomMapper;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignToolMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import cn.xm.jwxt.utils.UUIDUtil;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
@SuppressWarnings("all")
public class TCoursedesignInfoArrangeServiceImpl implements TCoursedesignInfoArrangeService {

    @Autowired
    private TCoursedesignInfoArrangeCustomMapper csaCustomMapper;
    @Autowired
    private  TCoursedesignToolMapper toolMapper;

    @Autowired
    private TCoursedesignToolService toolService;

    @Override
    public List<Map<String,Object>> findNeedArrangeCourseDesign(Map<String, Object> condition) {

        // 查询培养方案的课设
        List<Map<String,Object>> courseDesignList = new ArrayList<Map<String,Object>>();
        courseDesignList = csaCustomMapper.findNeedArrangeCourseDesign(condition);
        /*   */
        //封装
        for(int i=0;i<courseDesignList.size();i++){
            // 查询已安排的课设信息
           String trainCourseID =  courseDesignList.get(i).get("trainCourseID").toString();
           String majorID = courseDesignList.get(i).get("majorID").toString();
           String grade = courseDesignList.get(i).get("grade").toString();
            int nextyearNum =Integer.parseInt(grade) + (Integer.parseInt(courseDesignList.get(i).get("semester").toString()))/2 + (Integer.parseInt(courseDesignList.get(i).get("semester").toString()))%2;
            String yearNumStr = nextyearNum-1+"-"+nextyearNum;
           Map<String,Object> map = new HashMap<String,Object>();
                map.put("trainCourseID",trainCourseID);
                map.put("yearNum",yearNumStr);
                map.put("majorID",majorID);
                map.put("grade",grade);
            List<Map<String,Object>> arrangeList = new ArrayList<Map<String,Object>>();
          // arrangeMap = toolMapper.findCourseDesignArrangeInfoBytrainCourseID(trainCourseID);
            arrangeList =  toolService.findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(map);
            String CourseArrangeTime = "";
            String display = "";
            String teacherName = "";
            String yearNum = "";
            if(arrangeList.size()>0){
                for (int j=0;j<arrangeList.size();j++){
                    teacherName = teacherName + " / " + (String) arrangeList.get(j).get("teacherName");
                }
                CourseArrangeTime =arrangeList.get(0).get("CourseArrangeTime").toString();
                display = (String) arrangeList.get(0).get("display");
                yearNum = (String) arrangeList.get(0).get("yearNum");
            }
            courseDesignList.get(i).put("CourseArrangeTime",CourseArrangeTime);
            courseDesignList.get(i).put("display",display);
            courseDesignList.get(i).put("teacherName",teacherName);
            courseDesignList.get(i).put("yearNum",yearNum);
        }

        return courseDesignList;
    }

    @Override
    public boolean addCourseDesignerinfo(ListVo listVo){
        List<TCourseDesignVo> list = listVo.getTCourseDesignVos();
        // infoArrange的id
        String courseDesignArrangeID= UUIDUtil.getUUID2();
        // classArrange的id
        String courseDesignClassArrangeID = UUIDUtil.getUUID2();
        for(int i=0;i<list.size();i++){
            // 获取数据
            Map<String,Object> condition = new HashMap<String,Object>();
            String trainCourseID = list.get(i).getTrainCourseID();
            String majorID = list.get(i).getMajorID();
            String startTime = list.get(i).getStartTime();
            String endTime = list.get(i).getEndTime();
            String grade = list.get(i).getYear();
            String semester = (Integer.parseInt(list.get(i).getSemester()))%2+1+"";
            int nextyearNum = Integer.parseInt(list.get(i).getYear())+(Integer.parseInt(list.get(i).getSemester()))/2+(Integer.parseInt(list.get(i).getSemester()))%2;
            String yearNum = nextyearNum-1+"-"+nextyearNum;
            String courseDesignName = list.get(i).getCourseDesignName();
            String courseDesignNum = list.get(i).getCourseDesignNum();
            String CourseArrangeInfo = list.get(i).getCourseArrangeInfo();
            String CourseArrangeTeacher = "";
            String classNames = list.get(i).getClassNames();
            Date CourseArrangeTime =new Date();
            String isArrange = "0";
            String display = "-1";
            // 封装 infoArrange Map
            condition.put("courseDesignArrangeID",courseDesignArrangeID);
            condition.put("trainCourseID",trainCourseID);
            condition.put("majorID",majorID);
            condition.put("startTime",startTime);
            condition.put("endTime",endTime);
            condition.put("semester",semester);
            condition.put("yearNum",yearNum);
            condition.put("classNames",classNames);
            condition.put("courseDesignName",courseDesignName);
            condition.put("courseDesignNum",courseDesignNum);
            condition.put("CourseArrangeInfo",CourseArrangeInfo);
            condition.put("CourseArrangeTeacher",CourseArrangeTeacher);
            condition.put("CourseArrangeTime",CourseArrangeTime);
            condition.put("isArrange",isArrange);
            condition.put("display",display);
            condition.put("grade",grade);
            condition.put("uploadStatus","0");
            condition.put("checkStatus","0");
            condition.put("courseDesignClassArrangeID",courseDesignClassArrangeID);
            // 向infoArrange表中插入
            if(i==0){
                // 向infoArrange表插入
                csaCustomMapper.addCourseDesignerinfoArrange(condition);
                // 向classArrange表插入
                csaCustomMapper.addCourseDesignClassArrange(condition);
            }
            // 封装 teacherArrange Map
            String courseDesignTeacherArrangeID = UUIDUtil.getUUID2();
            String teacherNum = list.get(i).getTeacherNum();
            String teacherID = toolService.getTeacherID(teacherNum);
            condition.put("courseDesignTeacherArrangeID",courseDesignTeacherArrangeID);
            condition.put("teacherID",teacherID);
            // 向teacherArrange表插入
            csaCustomMapper.addCourseDesignTeacherArrange(condition);

            //  获取学生id
            String[] stuArr = list.get(i).getStuArr();
            // 向studetnTeacher表插数据
            for(int j = 0; j < stuArr.length; j++){
                String courseDesignTeacherStudentID = UUIDUtil.getUUID2();
                condition.put("courseDesignTeacherStudentID",courseDesignTeacherStudentID);
                String studentID = stuArr[j];
                condition.put("studentID",studentID);
                csaCustomMapper.addCourseDesignTeacherStudent(condition);
            }
        }
        return true;
    }

    @Override
    public boolean deleteTCoursedesignInfo(Map<String,Object> condition ){    // trainCourseID yearNum majorid grade
        List<String> courseDesignArrangeIDList = new ArrayList<String>();
         courseDesignArrangeIDList = toolService.findcourseDesignArrangeIDBytrainCourseIDAndYearNumAndMajorID(condition);
         for(String courseDesignArrangeID:courseDesignArrangeIDList){
             //先删除 studentTeacher表的信息
             List<String> courseDesignTeacherArrangeIDList = new ArrayList<String>();
                 courseDesignTeacherArrangeIDList = toolService.getcourseDesignTeacherArrangeID(courseDesignArrangeID);
             for (String courseDesignTeacherArrangeID : courseDesignTeacherArrangeIDList ){
                 csaCustomMapper.deleteCourseDesignTeacherStudent(courseDesignTeacherArrangeID);
             }
             // 再删除 teacherArrange表的信息
             csaCustomMapper.deleteCourseDesignTeacherArrange(courseDesignArrangeID);
             csaCustomMapper.deleteCourseDesignClassArrange(courseDesignArrangeID);
             // 最后删除 infoArrange表的信息
             csaCustomMapper.deleteCourseDesignerinfoArrange(courseDesignArrangeID);
         }

        return true;
    }

    /**
     * 修改显示状态
     *  @param display  初始状态，通过该值查询id集合
     *  @param finallyDisplay 一个是要修改的display的最终值
     * @return
     */
    @Override
    public boolean modifyInfoDisplay(String display,String finallyDisplay) {
        Map<String,Object> imap = new HashMap<String,Object>();
        // 获取infoArrange表的id集合
        List<String> ilist = new ArrayList<String>();
            ilist = toolService.getcourseDesignArrangeIDByDisplay(display);
            imap.put("ilist",ilist);
            imap.put("display",finallyDisplay);
        csaCustomMapper.modifyCourseDesignerinfoArrange(imap);

        Map<String,Object> tmap = new HashMap<String,Object>();
        // 获取teacherArrange表的id集合
        List<String> tlist = new ArrayList<String>();
            tlist = toolService.getcourseDesignTeacherArrangeIDByDisplay(display);
            tmap.put("tlist",tlist);
            tmap.put("display",finallyDisplay);
        csaCustomMapper.modifyCourseDesignTeacherArrange(tmap);

        Map<String,Object> cmap = new HashMap<String,Object>();
        // 获取classArrange表的id集合
        List<String> clist = new ArrayList<String>();
        clist = toolService.getcourseDesignClassArrangeIDByDisplay(display);
        cmap.put("clist",clist);
        cmap.put("display",finallyDisplay);
        csaCustomMapper.modifyCourseDesignClassArrange(cmap);

        Map<String,Object> tsmap = new HashMap<String,Object>();
        // 获取teacherStudent表的id集合
        List<String> tslist = new ArrayList<String>();
            tslist = toolService.getcourseDesignTeacherStudentIDByDisplay(display);
            tsmap.put("tslist",tslist);
            tsmap.put("display",finallyDisplay);
        csaCustomMapper.modifyCourseDesignTeacherStudent(tsmap);

        return true;
    }

    /**
     * 查询详细的课设安排信息
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findArrangeInfoDetailByCondition(Map<String, Object> condition) {
        List<Map<String, Object>> infoList = new ArrayList<Map<String,Object>>();
        infoList = csaCustomMapper.findArrangeInfoDetailByCondition(condition);
        for(int i=0;i<infoList.size();i++){
            List<String> stuList = new ArrayList<String>(); // 用于存放学生列表
            String courseDesignTeacherArrangeID = (String) infoList.get(i).get("courseDesignTeacherArrangeID");
                stuList = csaCustomMapper.findStudentListBycourseDesignTeacherArrangeID(courseDesignTeacherArrangeID);
            infoList.get(i).put("stuList",stuList);
        }
        return infoList;
    }


    @Override
    public boolean updateCourseDesigninfo(String courseDesignArrangeID, Map<String, Object> map) throws SQLException {
        return false;
    }

    @Override
    public List<Map<String, Object>> findAllTCoursedesignInfo(Map<String, Object> condition) throws SQLException {
        return null;
    }
}
