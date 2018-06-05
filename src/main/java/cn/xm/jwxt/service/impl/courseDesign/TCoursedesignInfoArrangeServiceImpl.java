package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.bean.courseDesign.ListVo;
import cn.xm.jwxt.bean.courseDesign.TCourseDesignVo;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignInfoArrangeCustomMapper;
import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignToolMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import cn.xm.jwxt.utils.UUIDUtil;
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
    public List<Map<String,Object>> findNeedArrangeCourseDesign(Map<String, Object> condition)  throws SQLException{

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
           String nowSemester = (Integer.parseInt(courseDesignList.get(i).get("semester").toString())%2) ==0?"2":"1";
           Map<String,Object> map = new HashMap<String,Object>();
                map.put("trainCourseID",trainCourseID);
                map.put("yearNum",yearNumStr);
                map.put("majorID",majorID);
                map.put("grade",grade);
                map.put("semester",nowSemester);
            List<Map<String,Object>> arrangeList = new ArrayList<Map<String,Object>>();
          // arrangeMap = toolMapper.findCourseDesignArrangeInfoBytrainCourseID(trainCourseID);
            arrangeList =  toolService.findCourseDesignArrangeInfoBytrainCourseIDAndYearNumAndMajorID(map);
            String CourseArrangeTime = "";
            String display = "";
            String teacherName = "";
            String yearNum = "";
            String courseDesignArrangeID = "";
            if(arrangeList.size()>0){
                for (int j=0;j<arrangeList.size();j++){
                    teacherName = teacherName + " / " + (String) arrangeList.get(j).get("teacherName");
                }
                CourseArrangeTime = arrangeList.get(0).get("CourseArrangeTime").toString();
                display = (String) arrangeList.get(0).get("display");
                yearNum = (String) arrangeList.get(0).get("yearNum");
                courseDesignArrangeID = (String)arrangeList.get(0).get("courseDesignArrangeID");
            }
            courseDesignList.get(i).put("CourseArrangeTime",CourseArrangeTime);
            courseDesignList.get(i).put("display",display);
            courseDesignList.get(i).put("teacherName",teacherName);
            courseDesignList.get(i).put("yearNum",yearNum);
            courseDesignList.get(i).put("courseDesignArrangeID",courseDesignArrangeID);
        }

        return courseDesignList;
    }

    @Override
    public boolean addCourseDesignerinfo(ListVo listVo,String arrangeTeacher) throws SQLException{
        boolean result = false;
        List<TCourseDesignVo> list = listVo.getTCourseDesignVos();
        // infoArrange的id
        String courseDesignArrangeID= UUIDUtil.getUUID2();
        for(int i=0;i<list.size();i++){
            // 获取数据
            Map<String,Object> condition = new HashMap<String,Object>();
            String trainCourseID = list.get(i).getTrainCourseID();
            String majorID = list.get(i).getMajorID();
            String startTime = list.get(i).getStartTime();
            String endTime = list.get(i).getEndTime();
            String grade = list.get(i).getYear();
          //  String semester = (Integer.parseInt(list.get(i).getSemester()))%2+1+"";
            String semester = (Integer.parseInt(list.get(i).getSemester()))%2==0?"2":"1";
            int nextyearNum = Integer.parseInt(list.get(i).getYear())+(Integer.parseInt(list.get(i).getSemester()))/2+(Integer.parseInt(list.get(i).getSemester()))%2;
            String yearNum = nextyearNum-1+"-"+nextyearNum;
            String courseDesignName = list.get(i).getCourseDesignName();
            String courseDesignNum = list.get(i).getCourseDesignNum();
            String CourseArrangeInfo = list.get(i).getCourseArrangeInfo();
            String CourseArrangeTeacher = "";
            String classNames = list.get(i).getClassNames();
            Date CourseArrangeTime =new Date();
            String isArrange = "0";
            String display = "0";
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
            condition.put("CourseArrangeTeacher",arrangeTeacher);
            // 向infoArrange表中插入
            if(i==0){
                // 向infoArrange表插入
                result = csaCustomMapper.addCourseDesignerinfoArrange(condition);
            }
            // 封装 teacherArrange Map
            String courseDesignTeacherArrangeID = UUIDUtil.getUUID2();
            String teacherNum = list.get(i).getTeacherNum();
           // String teacherID = toolService.getTeacherID(teacherNum);
            String teacherID = list.get(i).getTeacherID();
            condition.put("courseDesignTeacherArrangeID",courseDesignTeacherArrangeID);
            condition.put("teacherID",teacherID);
            //获取学生id数组
            String[] stuArr = list.get(i).getStuArr();
            //得到学生人数
            String stuCount = stuArr.length+"";
            condition.put("stuCount",stuCount);
            // 向teacherArrange表插入
            result = csaCustomMapper.addCourseDesignTeacherArrange(condition);

            //获取班级id
            String[] classArr = list.get(i).getClassArr();
            for(int z = 0; z < classArr.length; z++){
                // classArrange的id
                String courseDesignClassArrangeID = UUIDUtil.getUUID2();
                condition.put("courseDesignClassArrangeID",courseDesignClassArrangeID);
                String classID = classArr[z];
                condition.put("classID",classID);
                result = csaCustomMapper.addCourseDesignClassArrange(condition);
            }

            //  获取学生id
            // 向studetnTeacher表插数据
            for(int j = 0; j < stuArr.length; j++){
                String courseDesignTeacherStudentID = UUIDUtil.getUUID2();
                condition.put("courseDesignTeacherStudentID",courseDesignTeacherStudentID);
                String studentID = stuArr[j];
                condition.put("studentID",studentID);
                result = csaCustomMapper.addCourseDesignTeacherStudent(condition);
            }
        }
        return result;
    }

    @Override
    public boolean deleteTCoursedesignInfo(String courseDesignArrangeID) throws SQLException{    // trainCourseID yearNum majorid grade

             //先删除 studentTeacher表的信息
             List<String> courseDesignTeacherArrangeIDList = new ArrayList<String>();
                 courseDesignTeacherArrangeIDList = toolService.getcourseDesignTeacherArrangeID(courseDesignArrangeID);
            boolean result1= false;
            for (String courseDesignTeacherArrangeID : courseDesignTeacherArrangeIDList ){
                 result1 = csaCustomMapper.deleteCourseDesignTeacherStudent(courseDesignTeacherArrangeID);
             }
             // 再删除 teacherArrange表的信息
            boolean result2 = csaCustomMapper.deleteCourseDesignTeacherArrange(courseDesignArrangeID);
            // 再删除 CourseDesignClassArrange信息
            boolean result3 = csaCustomMapper.deleteCourseDesignClassArrange(courseDesignArrangeID);
             // 最后删除 infoArrange表的信息
            boolean result4 = csaCustomMapper.deleteCourseDesignerinfoArrange(courseDesignArrangeID);
            boolean result =false;
            if(result1&&result2&&result3&&result4){
                result = true;
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
    public boolean modifyInfoDisplay(List<String> list,String display)  throws SQLException{

      //  Map<String,Object> imap = new HashMap<String,Object>();
        // 获取infoArrange表的id集合
        //List<String> ilist = toolService.getcourseDesignArrangeIDByDisplay(display);

//            imap.put("ilist",ilist);
//            imap.put("display",finallyDisplay);
        Map<String,Object> imap = new HashMap<String,Object>();
            imap.put("display",display);
            imap.put("list",list);
            csaCustomMapper.modifyCourseDesignerinfoArrange(imap);
        for(int i = 0;i<list.size();i++){
            Map<String,Object> tmap = new HashMap<String,Object>();
            // 获取teacherArrange表的id集合
            List<String> tlist = toolService.getcourseDesignTeacherArrangeIDByDisplay((String)list.get(i));
            tmap.put("tlist",tlist);
            tmap.put("display",display);
            csaCustomMapper.modifyCourseDesignTeacherArrange(tmap);
        }
        for(int i = 0;i<list.size();i++){
            Map<String,Object> cmap = new HashMap<String,Object>();
            //获取classArrange表的id集合
            List<String> clist = toolService.getcourseDesignClassArrangeIDByDisplay((String)list.get(i));
            cmap.put("clist",clist);
            cmap.put("display",display);
            csaCustomMapper.modifyCourseDesignClassArrange(cmap);
        }
        for(int i=0;i<list.size();i++){
            Map<String,Object> tsmap = new HashMap<String,Object>();
            // 获取teacherStudent表的id集合
            List<String> tslist = toolService.getcourseDesignTeacherStudentIDByDisplay((String)list.get(i));
            tsmap.put("tslist",tslist);
            tsmap.put("display",display);
            csaCustomMapper.modifyCourseDesignTeacherStudent(tsmap);
        }
        return true;
    }

    /**
     * 查询详细的课设安排信息
     * @param condition
     * @return
     */
    @Override
    public List<Map<String, Object>> findArrangeInfoDetailByCondition(String courseDesignArrangeID) throws SQLException {
        List<Map<String, Object>> infoList = new ArrayList<Map<String,Object>>();
        infoList = csaCustomMapper.findArrangeInfoDetailByCondition(courseDesignArrangeID);
        for(int i=0;i<infoList.size();i++){
            List<String> stuList = new ArrayList<String>(); // 用于存放学生列表
            String courseDesignTeacherArrangeID = (String) infoList.get(i).get("courseDesignTeacherArrangeID");
                stuList = csaCustomMapper.findStudentListBycourseDesignTeacherArrangeID(courseDesignTeacherArrangeID);
            infoList.get(i).put("stuList",stuList);
        }
        return infoList;
    }


}
