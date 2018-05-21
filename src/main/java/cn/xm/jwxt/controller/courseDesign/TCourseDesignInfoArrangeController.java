package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.bean.courseDesign.ListVo;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.*;

@Controller
@RequestMapping("/arrangeCourseDesign")
public class TCourseDesignInfoArrangeController {

    private Logger logger = Logger.getLogger(TCourseDesignInfoArrangeController.class);

    @Autowired
    private TCoursedesignToolService toolService;
    @Autowired
    private TCoursedesignInfoArrangeService infoArrangeService;

    /**
     *  返回教师信息和班级信息
     * @param majorID
     * @return
     */
    @ResponseBody
    @RequestMapping("/getTeacherInfoAndClassInfo.do")
    public Map<String,Object> getTeacherInfoAndClassInfo(String majorID,String year){
        List<Map<String,Object>> teacherList = null;
        try {
            teacherList = toolService.getTeacherNameid(majorID);
        } catch (SQLException e) {
            logger.error("用专业id查询教师信息失败",e);
        }
        Map<String,Object> condition = new HashMap<String,Object>();
            condition.put("majorID",majorID);
            condition.put("grade",year);
        List<Map<String,Object>> classList = null;
        try {
            classList = toolService.getClassNameByMajor(condition);
        } catch (SQLException e) {
            logger.error("根基专业查询班级名称失败",e);
        }
        Map<String,Object> infoMap = new HashMap<String,Object>();
        infoMap.put("teacherList",teacherList);
        infoMap.put("classList",classList);
        return  infoMap;
    }

    /**
     *  根据教师id获取教师编号
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/getTeacherNum.do")
    public String  getTeacherNum(@RequestParam Map<String,Object> condition){
        String teacherNum = null;
        try {
            teacherNum = toolService.getTeacherNum(condition);
        } catch (SQLException e) {
            logger.error("根据教师id查询教师编号失败",e);
        }
        System.out.println(teacherNum);
        return teacherNum;
    }

    /**
     * 获取班级学生列表
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/getSrudentList.do")
    public List<Map<String,Object>> getStudentList(@RequestParam Map<String,Object> condition){
        List<Map<String,Object>> studentList = new ArrayList<Map<String,Object>>();
        try {
            studentList = toolService.getStudentListByClassid(condition);
        } catch (SQLException e) {
            logger.error("根据班级id查询学生信息失败",e);
        }
        return  studentList;
    }

    /**
     *  添加安排课设信息
     * @param listVo
     * @return
     */
    @ResponseBody
    @RequestMapping("/arrangeCourseDesignInfo.do")
    public boolean arrangeCourseDesignInfo(ListVo listVo){
        try {
            infoArrangeService.addCourseDesignerinfo(listVo);
        } catch (SQLException e) {
            logger.error("添加课设安排信息出错",e);
        }
        return true;
    }

    /**
     *  改变课设显示状态（处理保存按钮）
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveCourseDesignInfo.do")
    public boolean saveInfoArrange(String str){
        boolean result = false;
        String Str = str.substring(1,str.length());
        List<String> list = Arrays.asList(Str.split(","));
        try {
            result = infoArrangeService.modifyInfoDisplay(list,"0");
        } catch (SQLException e) {
            logger.error("修改课设安排信息状态出错",e);
        }
        return result;
    }

    /**
     *  改变课设显示状态（处理提交按钮）
     * @return
     */
    @ResponseBody
    @RequestMapping("/submitCourseDesignInfo.do")
    public boolean submitInfoArrange(String str){
        boolean result = false;
        String Str = str.substring(1,str.length());
        List<String> list = Arrays.asList(Str.split(","));
        try {
            result = infoArrangeService.modifyInfoDisplay(list,"1");
        } catch (SQLException e) {
            logger.error("修改课设安排信息状态出错",e);
        }
        return result;
    }

    /**
     *  查看安排信息
    // @param trainCourseID ,majorID , yearNum
     *@param courseDesignArrangeID
     * @return
     */
    @ResponseBody
    @RequestMapping("/findArrangeInfoDetail.do")
    public List<Map<String,Object>> findArrangeInfoDetailByCondition(String courseDesignArrangeID){
//        Map<String,Object> condition = new HashMap<String,Object>();
//            condition.put("trainCourseID",trainCourseID);
//            condition.put("majorID",majorID);
//            condition.put("yearNum",yearNum);
//            condition.put("grade",grade);
        List<Map<String, Object>> infoList = new ArrayList<Map<String,Object>>();
        try {
            infoList = infoArrangeService.findArrangeInfoDetailByCondition(courseDesignArrangeID);
        } catch (SQLException e) {
            logger.error("查询课设详细安排信息出错",e);
        }
        return infoList;
    }

}
