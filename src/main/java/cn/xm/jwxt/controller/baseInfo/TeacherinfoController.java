package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.service.baseInfo.TeacherinfoService;
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
 * 类描述：教师信息的controller
 * 创建人：bqq
 * 创建时间：2018/5/4
 */
@Controller
@RequestMapping("/teacherInfo")
public class TeacherinfoController {


    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(TeacherinfoController.class);
    @Resource
    private TeacherinfoService teacherinfoService;
    /**
     * 添加教师基本信息
     * @param teacherInfo
     * @return
     */
    @RequestMapping("/addTeacherInfo")
    public @ResponseBody
    String addTeacherInfo(TTeacherBaseInfo teacherInfo){
        try {
            teacherinfoService.addTeacherInfo(teacherInfo);
        } catch (Exception e) {
            logger.error("添加教师失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询教师信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findTeacherInfoList")
    public @ResponseBody PageInfo<TTeacherBaseInfo> findTeacherInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<TTeacherBaseInfo> pageInfo = null;
        try {
            pageInfo = teacherinfoService.findTeacherInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询教师失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据教师ID删除教师
     * @param teacherId
     * @return
     */
    @RequestMapping("/deleteTeacherInfo")
    public @ResponseBody String deleteTeacherInfo(String teacherId){
        try {
            teacherinfoService.deleteTeacherInfoById(teacherId);
        } catch (Exception e) {
            logger.error("删除学生信息失败",e);
            return "删除学生信息失败！";
        }
        return "删除学生信息成功！";
    }

    /**
     * 根据教师ID查询基本信息
     * @param teacherId
     * @return
     */
    @RequestMapping("/getTeacherInfo")
    public @ResponseBody TTeacherBaseInfo getTeacherInfo(String teacherId){
        TTeacherBaseInfo teacherinfo = null;
        try {
            teacherinfo = teacherinfoService.getTeacherInfoById(teacherId);
        } catch (Exception e) {
            logger.error("查询教师信息失败",e);
        }
        return teacherinfo;
    }

    /**
     * 修改学生基本信息
     * @param teacherInfo
     * @return
     */
    @RequestMapping("/updateTeacherInfo")
    public @ResponseBody String updateTeacherInfo(TTeacherBaseInfo teacherInfo){
        String teachertId = null;
        if(ValidateCheck.isNull(teacherInfo.getTeacherid())){
            return "修改失败！";
        }else{
            teachertId = teacherInfo.getTeacherid();
        }
        try {
            teacherinfoService.updateTeacherInfoById(teachertId,teacherInfo);
        } catch (Exception e) {
            logger.error("修改教师信息失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询教师的名称和ID用于下拉框显示
    @RequestMapping("/findTeacherNameAndId")
    public @ResponseBody
    List<Map<String,Object>> findTeacherNameAndId(){
        List<Map<String, Object>> teacherNameAndIdList = null;
        try {
            teacherNameAndIdList = teacherinfoService.findTeacherNameAndId();
        } catch (Exception e) {
            logger.error("查询任务通知书失败",e);
        }
        return teacherNameAndIdList;
    }
}
