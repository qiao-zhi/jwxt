package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.courseDesign.ListVo;
import cn.xm.jwxt.bean.courseDesign.TCourseDesignVo;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/arrangeCourseDesign")
public class TCourseDesignInfoArrangeController {

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
        List<String> teacherList = toolService.getTeacheName(majorID);
        Map<String,Object> condition = new HashMap<String,Object>();
            condition.put("majorID",majorID);
            condition.put("grade",year);
        List<String> classList = toolService.getClassNameByMajor(condition);
        Map<String,Object> infoMap = new HashMap<String,Object>();
        infoMap.put("teacherList",teacherList);
        infoMap.put("classList",classList);
        return  infoMap;
    }

    /**
     *  根据专业和姓名获取教师编号
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/getTeacherNum.do")
    public String  getTeacherNum(@RequestParam Map<String,Object> condition){
        String teacherNum = toolService.getTeacherNum(condition);
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
        studentList = toolService.getStudentListByClassNameAndMajorid(condition);
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
        infoArrangeService.addCourseDesignerinfo(listVo);
        return true;
    }

    /**
     *  改变课设显示状态（处理保存按钮）
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveCourseDesignInfo.do")
    public boolean saveInfoArrange(){
        boolean result = infoArrangeService.modifyInfoDisplay("-1","0");
        return result;
    }

    /**
     *  改变课设显示状态（处理提交按钮）
     * @return
     */
    @ResponseBody
    @RequestMapping("/submitCourseDesignInfo.do")
    public boolean submitInfoArrange(){
        boolean result = infoArrangeService.modifyInfoDisplay("0","1");
        return result;
    }

    /**
     *  查看安排信息
     * @param trainCourseID ,majorID , yearNum
     * @return
     */
    @ResponseBody
    @RequestMapping("/findArrangeInfoDetail.do")
    public List<Map<String,Object>> findArrangeInfoDetailByCondition(String trainCourseID,String majorID,String yearNum,String grade){
        Map<String,Object> condition = new HashMap<String,Object>();
            condition.put("trainCourseID",trainCourseID);
            condition.put("majorID",majorID);
            condition.put("yearNum",yearNum);
            condition.put("grade",grade);
        List<Map<String, Object>> infoList = new ArrayList<Map<String,Object>>();
            infoList = infoArrangeService.findArrangeInfoDetailByCondition(condition);
        return infoList;
    }

}
