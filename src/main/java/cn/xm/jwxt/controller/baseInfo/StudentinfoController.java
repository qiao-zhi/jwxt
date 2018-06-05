package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.service.baseInfo.StudentinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：学生信息的controller
 * 创建人：bqq
 * 创建时间：2018/5/4
 */
@Controller
@RequestMapping("/studentInfo")
public class StudentinfoController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(StudentinfoController.class);
    @Resource
    private StudentinfoService studentinfoService;
    /**
     * 添加任务通知书基本信息
     * @param studentInfo
     * @return
     */
    @RequestMapping("/addStudentInfo")
    public @ResponseBody
    String addStudentInfo(TStudentBaseInfo studentInfo){
        try {
            studentinfoService.addStudentInfo(studentInfo);
        } catch (Exception e) {
            logger.error("添加学生失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询学生信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findStudentInfoList")
    public @ResponseBody PageInfo<StudentClassInfo> findStudentInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<StudentClassInfo> pageInfo = null;
        try {
            pageInfo = studentinfoService.findStudentInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询学生失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据学生ID删除学生
     * @param studentId
     * @return
     */
    @RequestMapping("/deleteStudentInfo")
    public @ResponseBody String deleteStudentInfo(String studentId){
        try {
            studentinfoService.deleteStudentInfoById(studentId);
        } catch (Exception e) {
            logger.error("删除学生信息失败",e);
            return "删除学生信息失败！";
        }
        return "删除学生信息成功！";
    }

    /**
     * 根据学生ID查询基本信息
     * @param studentId
     * @return
     */
    @RequestMapping("/getStudentInfo")
    public @ResponseBody TStudentBaseInfo getStudentInfo(String studentId){
        TStudentBaseInfo studentinfo = null;
        try {
            studentinfo = studentinfoService.getStudentInfoById(studentId);
        } catch (Exception e) {
            logger.error("查询学生信息失败",e);
        }
        return studentinfo;
    }

    /**
     * 修改学生基本信息
     * @param studentInfo
     * @return
     */
    @RequestMapping("/updateStudentInfo")
    public @ResponseBody String updateStudentInfo(TStudentBaseInfo studentInfo){
        String studentId = null;
        if(ValidateCheck.isNull(studentInfo.getStudentid())){
            return "修改失败！";
        }else{
            studentId = studentInfo.getStudentid();
        }
        try {
            studentinfoService.updateStudentInfoById(studentId,studentInfo);
        } catch (Exception e) {
            logger.error("修改学生信息失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询学生的名称和ID用于下拉框显示
    @RequestMapping("/findStudentNameAndId")
    public @ResponseBody
    List<Map<String,Object>> findStudentNameAndId(){
        List<Map<String, Object>> studentNameAndIdList = null;
        try {
            studentNameAndIdList = studentinfoService.findStudentNameAndId();
        } catch (Exception e) {
            logger.error("查询学生失败",e);
        }
        return studentNameAndIdList;
    }
}
