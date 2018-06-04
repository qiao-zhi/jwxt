package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;
import cn.xm.jwxt.controller.arrangeCourse.ReadNoticeExcelData;
import cn.xm.jwxt.service.baseInfo.TeacherinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
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
     * 导入教师文件
     * @param session
     * @param teacherId
     * @param file
     * @return
     */
    @RequestMapping("/addTeacherInfoList")
    public @ResponseBody
    ResposeResult addTeacherList(HttpSession session, String teacherId, MultipartFile file){
        ServletContext servletContext = session.getServletContext();
        //获取上传文件的绝对路径
        String realPath = servletContext.getRealPath(file.getOriginalFilename());
        File noticeFile = new File(realPath);
        //返回ajax请求的工具类
        ResposeResult resposeResult = new ResposeResult();
        String result;
        try {
            file.transferTo(noticeFile);
        } catch (IOException e) {
            logger.error("上传文件出错！",e);
            result = "保存失败";
            resposeResult.setSuccess(false);
            resposeResult.setMsg(result);
            return resposeResult;
        }
        List<TeacherMajorInfo> teacherDetailInfos = ReadTeacherInfoExcel.readTeacherData(realPath);
        try {
            teacherinfoService.saveTeacherInfoById(teacherId,teacherDetailInfos);
        } catch (Exception e) {
            logger.error("保存教师信息出错！",e);
            result = "保存失败";
            resposeResult.setSuccess(false);
            resposeResult.setMsg(result);
            return resposeResult;
        }
        //将上传的文件删除
        File fileDelete = new File(realPath);
        boolean delete = fileDelete.delete();
        result = "上传成功！";
        resposeResult.setMsg(result);
        return resposeResult;
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
            logger.error("删除教师信息失败",e);
            return "删除教师信息失败！";
        }
        return "删除教师信息成功！";
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
            logger.error("查询教师失败",e);
        }
        return teacherNameAndIdList;
    }
}
