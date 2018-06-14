package cn.xm.jwxt.controller.baseInfo;


import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.service.baseInfo.ClassinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：班级信息的controller
 * 创建人：bqq
 * 创建时间：2018/5/4
 */
@Controller
@RequestMapping("/classInfo")
public class ClassinfoController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ClassinfoController.class);
    @Resource
    private ClassinfoService classinfoService;
    /**
     * 添加班级基本信息
     * @param classBaseInfo
     * @return
     */
    @RequestMapping("/addClassInfo")
    public @ResponseBody
    String addClassInfo(TClassBaseInfo classBaseInfo){
        try {
            classinfoService.addClassInfo(classBaseInfo);
        } catch (Exception e) {
            logger.error("添加班级失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询班级信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findClassInfoList")
    public @ResponseBody PageInfo<Map<String,Object>> findClassInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<Map<String,Object>> pageInfo = null;
        try {
            pageInfo = classinfoService.findClassInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询班级失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据班级ID删除班级信息
     * @param classId
     * @return
     */
    @RequestMapping("/deleteClassInfo")
    public @ResponseBody String deleteClassInfo(String classId){
        try {
            classinfoService.deleteClassInfoById(classId);
        } catch (Exception e) {
            logger.error("删除班级信息失败",e);
            return "删除班级信息失败！";
        }
        return "删除班级信息成功！";
    }

    /**
     * 根据班级ID查询基本信息
     * @param classId
     * @return
     */
    @RequestMapping("/getClassInfo")
    public @ResponseBody TClassBaseInfo getClassInfo(String classId){
        TClassBaseInfo classinfo = null;
        try {
            classinfo = classinfoService.getClassInfoById(classId);
        } catch (Exception e) {
            logger.error("查询班级信息失败",e);
        }
        return classinfo;
    }

    /**
     * 修改班级基本信息
     * @param classInfo
     * @return
     */
    @RequestMapping("/updateClassInfo")
    public @ResponseBody String updateClassInfo(TClassBaseInfo classInfo){
        String classId = null;
        if(ValidateCheck.isNull(classInfo.getClassid())){
            return "修改失败！";
        }else{
            classId = classInfo.getClassid();
        }
        try {
            classinfoService.updateClassById(classId,classInfo);
        } catch (Exception e) {
            logger.error("修改班级信息失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询教学任务通知书的名称和ID用于下拉框显示
    @RequestMapping("/findClassNameAndId")
    public @ResponseBody
    List<Map<String,Object>> findClassNameAndId(){
        List<Map<String, Object>> classNameAndIdList = null;
        try {
            classNameAndIdList = classinfoService.findClassNameAndId();
        } catch (Exception e) {
            logger.error("查询班级失败",e);
        }
        return classNameAndIdList;
    }

    /****S QLQ*************/
    /**
     * 查询学院专业班级树
     * @param condition 可能用到的组合条件
     * @return
     */
    @RequestMapping("/getClassTree")
    public @ResponseBody List<Map<String, Object>> getClassTreesByCondition(@RequestParam Map condition){
        List<Map<String, Object>> classTrees = null;
        try {
            classTrees = classinfoService.getClassTrees(condition);
        } catch (SQLException e) {
            logger.error("查询学院、专业、班级树出错",e);
            return null;
        }
        return classTrees;
    }
    /****E QLQ*************/

}
